
public class FruitNutrition {

	private String fruit; //declares fruit String
	private String fruitInfo; //dec;ares fruitInfo String
	
		public FruitNutrition(String fruit, String fruitInfo)
		{
			this.fruit = fruit; //initializes fruit
			this.fruitInfo = fruitInfo; //initializes fruitInfo
		}
		
		public String getFruitInfo() //returns info for different fruit if fruit String matches that name
		{
			if (fruit.equals("mango"))
			{
				fruitInfo = ("Serving size: 1 mango \nCalories: 201 \nFat: 0.8g \nCarbs: 32.3g \nProtein: 1.7g");
			}
			
			if (fruit.equals("pomegranate"))
			{
				fruitInfo = ("Serving size: 1/2 cup pomegranate seeds \nCalories: 72 \nFat: 1g \nCarbs: 16g \nProtein: 1.4g");
			}
			
			if (fruit.equals("guava"))
			{
				fruitInfo = ("Serving size: 1 guava \nCalories: 112 \nFat: 1.6g \nCarbs: 23.6g \nProtein: 4.2g");
			}
			
			if (fruit.equals("raspberries"))
			{
				fruitInfo = ("Serving size: 1 cup raspberries \nCalories: 64 \nFat: 0.8g \nCarbs: 14.7g \nProtein: 1.5g");
			}
			
			if (fruit.equals("orange"))
			{
				fruitInfo = ("Serving size: 1 medium(154g or 5.5 ounces) \nCalories: 80 \nFat: 0g \nCarbs: 19g \nProtein: 1g");
			}
			
			if (fruit.equals("avocado"))
			{
				fruitInfo = ("Serving size: 1/5 medium(30g or 1.1 ounces) \nCalories: 50 \nFat: 4.5g \nCarbs: 3g \nProtein: 1g");
			}
			
			if(fruit.equals("apple"))
			{
				fruitInfo = ("Serving size: 1 large(242 g or 8 ounces) \nCalories: 130 \nFat: 0g \nCarbs: 34g \nProtein: 1g");
			}
			
			if (fruit.equals("banana"))
			{
				fruitInfo = ("Serving size: 1 medium(126g or 4.5 ounces) \nCalories: 110 \nFat: 0g \nCarbs: 30g \nProtein: 1g");
			}
			
			if (fruit.equals("cantaloupe"))
			{
				fruitInfo = ("Serving size: 1/4 medium(134g or 4.8 ounces) \nCalories: 50 \nFat: 0g \nCarbs: 12g \nProtein: 1g");
			}
			
			if (fruit.equals("grapefruit"))
			{
				fruitInfo = ("Serving size: 1/2 medium(154g or 5.5 ounces) \nCalories: 60 nFat: 0g \nCarbs: 15g \nProtein: 1g");
			}
			
			if (fruit.equals("grapes"))
			{
				fruitInfo = ("Serving size: 3/4 cup (126g or 4.5 ounces) \nCalories: 90 \nFat: 0g \nCarbs: 23g \nProtein: 0g");
			}
			
			if (fruit.equals("honeydew melon"))
			{
				fruitInfo = ("Serving size: 1/10 medium melon(134g or 4.8 ounces) \nCalories: 50 \nFat: 0g \nCarbs: 12g \nProtein: 1g");
			}
			
			if (fruit.equals("kiwi"))
			{
				fruitInfo = ("Serving size: 2 medium(148g or 5.3 ounces) \nCalories: 90 \nFat: 1g \nCarbs: 20g \nProtein: 1g");
			}
			
			if (fruit.equals("lemon"))
			{
				fruitInfo = ("Serving size: 1 medium(58g or 2.1 ounces) \nCalories: 15 \nFat: 0g \nCarbs: 5g \nProtein: 0g");
			}
			
			if (fruit.equals("lime"))
			{
				fruitInfo = ("Serving size: 1 medium(67g or 2.4 ounces) \nCalories: 20 \nFat: 0g \nCarbs: 7g \nProtein: 0g");
			}
			
			if (fruit.equals("nectarine"))
			{
				fruitInfo = ("Seving size: 1 medium(140g or 5.0 ounces) \nCalories: 60 \nFat: 0.5g \nCarbs: 15g \nProtein: 1g");
			}
			
			if (fruit.equals("peach"))
			{
				fruitInfo = ("Serving size: 1 medium(147g or 5.3 ounces) \nCalories: 60 \nFat: 0.5g \nCarbs: 15g \nProtein: 1g");
			}
			
			if (fruit.equals("pear"))
			{
				fruitInfo = ("Serving size: 2 medium(151g or 5.4 ounces) \nCalories: 100 \nFat: 0g \nCarbs: 26g \nProtein: 1g");
			}
			
			if (fruit.equals("pineapple"))
			{
				fruitInfo = ("Serving size: 2 slices of 3 inches in diameter and 3/4 inches thick(112g or 4 ounces) \nCalories: 50 \nFat 0g \nCarbs: 13g \nProtein: 1g");
			}
			
			if (fruit.equals("plum"))
			{
				fruitInfo = ("Serving size: 2 medium(151g or 5.4 ounces) \nCalories: 70 \nFat: 0 \nCarbs: 19g \nProtein: 1g");
			}
			
			if (fruit.equals("strawberries"))
			{
				fruitInfo = ("Serving size: 8 medium(147g or 5.3 ounces) \nCalories 50 \nFat: 0g \nCarbs: 11g \nProtein: 1g");
			}
			
			if (fruit.equals("cherries"))
			{
				fruitInfo = ("Serving size: 21 cherries or 1 cup(140g or 5.0 ounces) \nCalories: 100 \nFat: 0g \nCarbs: 26g \nProtein: 1g");
			}
			
			if (fruit.equals("tangerine"))
			{
				fruitInfo = ("Serving size: 1 medium(109g or 3.9 ounces) \nCalories: 50 \nFat: 0g \nCarbs: 13g \nProtein: 1g");
			}
			
			if (fruit.equals("watermelon"))
			{
				fruitInfo = ("Serving size: 1/18 medium melon or 2 cups of diced pieces(280g or 10.0 ounces) \nCalories: 80 \nFat: 0g \nCarbs: 21g \nProtein: 1g");
			}
			
			return fruitInfo;
		}
}
