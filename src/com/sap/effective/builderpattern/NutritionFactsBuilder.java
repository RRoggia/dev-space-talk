package com.sap.effective.builderpattern;

public class NutritionFactsBuilder {

	private final int servingSize; // required
	private final int servings; // required
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	private NutritionFactsBuilder(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}

	public static class Builder {

		private final int servingSize; // required
		private final int servings; // required

		private int calories;
		private int fat;
		private int sodium;
		private int carbohydrate;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}

		public NutritionFactsBuilder build() {
			return new NutritionFactsBuilder(this);
		}

	}

}
