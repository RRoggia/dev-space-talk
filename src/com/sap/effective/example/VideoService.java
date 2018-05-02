package com.sap.effective.example;

import com.sap.effective.example.dummyclasses.HttpResponse;

public class VideoService {

	public void getVideo() {
		GenericHttpClient httpClient = new GenericHttpClient.Builder().withSucessHandler(VideoService::onSuccess)
				.build();

		httpClient.processRequest();

	}

	private static void logImportantInformation(String log) {
		// do stuff here
	}

	private static String onSuccess(HttpResponse response) {
		logImportantInformation(response.getSecretInformationAboutHttp());
		return response.getBody();
	}

}
