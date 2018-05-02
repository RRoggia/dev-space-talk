package com.sap.effective;

import com.sap.effective.builderpattern.NutritionFacts;
import com.sap.effective.builderpattern.NutritionFactsJavaBean;

public class Main2 {

	public Main2() {
		new NutritionFacts(10, 10);

		NutritionFactsJavaBean nutritionFacts = new NutritionFactsJavaBean();
		nutritionFacts.setServings(10);
		nutritionFacts.setServingSize(10);
	}

}
