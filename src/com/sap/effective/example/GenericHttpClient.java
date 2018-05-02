package com.sap.effective.example;

import com.sap.effective.example.dummyclasses.HttpClient;
import com.sap.effective.example.dummyclasses.HttpResponse;
import com.sap.effective.example.dummyclasses.HttpServletResponse;

public class GenericHttpClient {

	private HttpClientError clientError;
	private HttpServerError serverError;
	private HttpSuccess sucessHandler;

	private GenericHttpClient(HttpSuccess sucessHandler, HttpClientError clientError, HttpServerError serverError) {
		this.sucessHandler = sucessHandler;
		this.clientError = clientError;
		this.serverError = serverError;
	}

	@FunctionalInterface
	public interface HttpClientError {
		String process(HttpResponse response);
	}

	@FunctionalInterface
	public interface HttpServerError {
		String process(HttpResponse response);
	}

	@FunctionalInterface
	public interface HttpSuccess {
		String onSucess(HttpResponse response);
	}

	public String processRequest() {

		HttpClient httpClient = new HttpClient();
		HttpResponse response = httpClient.execute();

		switch (response.getStatusCode()) {

		case HttpServletResponse.SC_OK:
			return sucessHandler.onSucess(response);

		case HttpServletResponse.SC_BAD_REQUEST:
			throw new IllegalArgumentException(clientError.process(response));

		case HttpServletResponse.SC_INTERNAL_SERVER_ERROR:
			throw new IllegalArgumentException(serverError.process(response));

		default:
			throw new IllegalArgumentException("Generic error");
		}
	}

	public static class Builder {
		private HttpClientError clientErrorHandler;
		private HttpServerError serverErrorHandler;
		private HttpSuccess sucessHandler;

		public Builder withSucessHandler(HttpSuccess sucessHandler) {
			this.sucessHandler = sucessHandler;
			return this;
		}

		public Builder withServerErrorHandler(HttpServerError serverErrorHandler) {
			this.serverErrorHandler = serverErrorHandler;
			return this;
		}

		public Builder withClientErrorHandler(HttpClientError clientErrorHandler) {
			this.clientErrorHandler = clientErrorHandler;
			return this;
		}

		public GenericHttpClient build() {
			return new GenericHttpClient(this.sucessHandler, this.clientErrorHandler, this.serverErrorHandler);
		}

	}

}
