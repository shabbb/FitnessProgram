
public class SeafoodNutrition {
	
	private String seafood; //declares seafood String
	private String seafoodInfo; //declares seafoodInfo String
	
	public SeafoodNutrition(String seafood, String seafoodInfo)
	{
		this.seafood = seafood; //initializes seafood
		this.seafoodInfo = seafoodInfo; //initializes seafoodInfo
	}
	
	public String getSeafoodInfo() //returns info for different seafood if seafood String matches that name
	{
		if (seafood.equals("crab"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 100 \nTotal fat: 1g \nCholesterol: 95mg \nSodium: 330mg \nPotassium: 300mg \nProtein: 20g");
		}
		
		if (seafood.equals("catfish"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 130 \nTotalfat: 6g \nCholesterol: 50mg \nSodium: 40mg \nPotassium: 230mg \nProtein: 17g");
		}
		
		if (seafood.equals("clams"))
		{
			seafoodInfo = ("Serving size: About 12 small \nCalories: 110 \nTotal fat: 1.5g \nCholesterol: 80mg \nSodium: 95mg \nPotassium: 470mg \nProtein: 17g");
		}
		
		if (seafood.equals("cod"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 90 \nTotal fat: 1g \nCholesterol: 50mg \nSodium: 65mg \nPotassium: 460mg \nProtein: 20g");
		}
		
		if (seafood.equals("flounder"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 100 \nTotal fat: 1.5g \nCholesterol: 55mg \nSodium: 100mg \nPotassium: 390mg \nProtein: 19g");
		}
		
		if (seafood.equals("sole"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 100 \nTotal fat: 1.5g \nCholesterol: 55mg \nSodium: 100mg \nPotassium: 390mg \nProtein: 19g");
		}
		
		if (seafood.equals("haddock"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 100 \nTotal fat: 1g \nCholesterol: 70mg \nSodium: 85mg \nPotassium: 340mg \nProtein: 21g");
		}
		
		if (seafood.equals("halibut"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 120 \nTotal fat: 2g \nCholesterol: 40mg \nSodium: 60mg \nPotassium: 500mg \nProtein: 23g");
		}

		if (seafood.equals("lobster"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 80 \nTotal fat: 0.5g \nCholesterol: 60mg \nSodium: 320mg \nPotassium: 300mg \nProtein: 17g");
		}
		
		if (seafood.equals("perch"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 110 \nTotal fat: 2g \nCholesterol: 45mg \nSodium: 95mg \nPotassium: 290mg \nProtein: 21g");
		}

		if (seafood.equals("roughy"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 80 \nTotal fat: 1g \nCholesterol: 20mg \nSodium: 70mg \nPotassium: 340mg \nProtein: 16g");
		}

		
		if (seafood.equals("oysters"))
		{
			seafoodInfo = ("Serving size: about 12 medium \nCalories: 100 \nTotal fat: 4g \nCholesterol: 80mg \nSodium: 300mg \nPotassium: 220mg \nProtein: 10g");

		}
		
		if (seafood.equals("pollock"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 90 \nTotal fat: 1g \nCholesterol: 80mg \nSodium: 110mg \nPotassium: 370mg \nProtein: 20g");
		}

		
		if (seafood.equals("trout"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 140 \nTotal fat: 6g \nCholesterol: 55mg \nSodium: 35mg \nPotassium: 370mg \nProtein: 20g");
		}
		
		if (seafood.equals("rockfish"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 110 \nTotal fat: 2g \nCholesterol: 40mg \nSodium: 70mg \nPotassium: 440mg \nProtein: 21g");
		}
		
		if (seafood.equals("salmon"))
		{
			seafoodInfo = ("Atlantic/Coho/Sockeye/Chinook \nServing size: 84g or 3 oz \nCalories: 200 \nTotal fat: 10g \nCholesterol: 70mg \nSodium: 65mg \nPotassium: 430mg \nProtein: 24g \n\nChum/Pink \nServing size: 84g or 3 oz \nCalories: 130 \nTotal fat: 4g \nCholesterol: 70mg \nSodium: 65mg \nPotassium: 420mg \nProtein: 22g");
		}
		
		if (seafood.equals("scallops"))
		{
			seafoodInfo = ("Serving size: about 6 large or 14 small \nCalories: 140 \nTotal fat: 1g \nCholesterol: 65mg \nSodium: 310mg \nPotassium: 430 \nProtein: 27g");
		}
		
		if (seafood.equals("shrimp"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 100 \nTotal fat: 1.5g \nCholesterol: 170mg \nSodium: 240mg \nPotassium: 220mg \nProtein: 21g");
		}
		
		if (seafood.equals("swordfish"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 120 \nTotal fat: 6g \nCholesterol: 40mg \nSodium: 100mg \nPotassium: 310mg \nProtein: 16g");
		}
		
		if (seafood.equals("tilapia"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 110 \nTotal fat: 2.5g \nCholesterol: 75mg \nSodium: 30mg \nPotassium: 360mg \nProtein: 22g");
		}
		
		if (seafood.equals("tuna"))
		{
			seafoodInfo = ("Serving size: 84g or 3 oz \nCalories: 130 \nTotal fat: 1.5g \nCholesterol: 50mg \nSodium: 40mg \nPotassium: 480mg \nProtein: 26g");
		}
			
		return seafoodInfo;
	}
	
	}

