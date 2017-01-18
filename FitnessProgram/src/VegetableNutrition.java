
public class VegetableNutrition {

	private String vegetable; //declares vegetable String
	private String vegetableInfo; //declares vegetableInfo String
	
		public VegetableNutrition(String vegetable, String vegetableInfo)
		{
			this.vegetable = vegetable; //initializes vegetable
			this.vegetableInfo = vegetableInfo; //initializes vegetableInfo
		}
		
		public String getVegetableInfo() //returns info for different vegetable if vegetable String matches that name
		{
			if (vegetable.equals("asparagus"))
			{
				vegetableInfo = ("Serving size 5 spears (93g or 3.3 ounces) \nCalories: 20 \nFat: 0g \nCarbs: 4g \nProtein: 2g");
			}
			
			if (vegetable.equals("bell pepper"))
			{
				vegetableInfo = ("Serving size: 1 medium(148g or 5.3 ounces) \nCalories: 25 \nFat: 0g \nCarbs: 6g \nProtein: 1g");
			}
			
			if (vegetable.equals("broccoli"))
			{
				vegetableInfo = ("Serving size: 1 medium stalk(148g or 5.3 ounces) \nCalories: 45 \nFat: 0.5g \nCarbs: 8g \nProtein: 4g");
			}
			
			
			if (vegetable.equals("carrot"))
			{
				vegetableInfo = ("Serving size: 1 carrot 7 inches long and 1 1/4 inches in diameter(78g or 2.8 ounces) \nCalories: 30 \nFat: 0g \nCarbs: 7g \nProtein: 1g");
			}
			
			if (vegetable.equals("cauliflower"))
			{
				vegetableInfo = ("Serving size: 1/6 medium head(99g or 3.5 ounces) \nCalories: 25 \nFat: 0g \nCarbs: 5g \nProtein: 2g");
			}
			
			if (vegetable.equals("celery"))
			{
				vegetableInfo = ("Serving size: 2 medium stalks(110g or 3.9 ounces) \nCalories: 15 \nFat: 0g \nCarbs: 4g \nProtein: 0g");
			}
			
			if (vegetable.equals("cucumber"))
			{
				vegetableInfo = ("Serving size: 1/3 medium(99g or 3.5 ounces) \nCalories: 10 \nFat: 0g \nCarbs: 2g \nProtein: 1g");
			}
			
			if (vegetable.equals("green beans"))
			{
				vegetableInfo = ("Serving size: 3/4 cup cut(83g or 3.0 ounces) \nCalories: 20 \nFat: 0g \nCarbs: 5g \nProtein: 1g");
			}
			
			if (vegetable.equals("cabbage"))
			{
				vegetableInfo = ("Serving size: 1/12m medium head(84g or 3.0 ounces) \nCalories: 25 \nFat: 0g \nCarbs: 5g \nProtein: 1g");
			}
			
			if (vegetable.equals("green onion"))
			{
				vegetableInfo = ("Serving size: 1/4 cup chopped(25g or 0.9 ounces) \nCalories: 10 \nFat: 0g \nCarbs: 2g \nProtein: 0g");
			}
			
			if (vegetable.equals("iceberg lettuce"))
			{
				vegetableInfo = ("Serving size: 1/6 medium head(89g or 3.2 ounces) \nCalories: 10 \nFat: 0g \nCarbs: 2g \nProtein: 1g");
			}
			
			if (vegetable.equals("leaf lettuce"))
			{
				vegetableInfo = ("Serving size: 1 1/2 cups shredded(85g or 3.0 ounces) \nCalories: 15 \nFat: 0g \nCarbs: 2g \nProtein: 1g");
			}
			
			if (vegetable.equals("mushrooms"))
			{
				vegetableInfo = ("Serving size: 5 medium(84g or 3.0 ounces) \nCaloriesL 20 \nFat: 0g \nCarbs: 3g \nProtein: 3g");
			}
			
			if (vegetable.equals("onion"))
			{
				vegetableInfo = ("Serving size: 1 medium(148g or 5.3 ounces) \nCalories: 45 \nFat: 0g \nCarbs: 11g \nProtein: 1g");
			}
			
			if (vegetable.equals("potato"))
			{
				vegetableInfo = ("Serving size: 1 medium(148g or 5.3 ounces) \nCalories: 110 \nFat: 0g \nCarbs: 26g \nProtein: 3g");
			}
			
			if (vegetable.equals("radish"))
			{
				vegetableInfo = ("Serving size: 7 radishes(85g or 3.0 ounces) \nCalories: 10 \nFat: 0g \nCarbs: 3g \nProtein: 0g");
			}
			
			if (vegetable.equals("squash"))
			{
				vegetableInfo = ("Serving size: 1/2 medium(98g or 3.5 ounces) \nCalories: 20 \nFat: 0g \nCarbs: 4g \nProtein: 1g");
			}
			
			if (vegetable.equals("corn"))
			{
				vegetableInfo = ("Serving size: kernels from 1 medium ear(90g or 3.2 ounces) \nCalories: 90g \nFat: 2.5g \nCarbs: 18g \nProtein: 4g");
			}
			
			if (vegetable.equals("sweet potato"))
			{
				vegetableInfo = ("Serving size: 1 medium 5 inches long and 2 inches in diameter(130g or 4.6 ounces) \nCalories: 100 \nFat: 0g \nCarbs: 23g \nProtein: 2g");
			}
			
			if (vegetable.equals("tomato"))
			{
				vegetableInfo = ("Serving size: 1 medium(148g or 5.3 ounces) \nCalories: 25 \nFat: 0g \nCarbs: 5g \nProtein: 1g");
			}
			return vegetableInfo;
		}
}
