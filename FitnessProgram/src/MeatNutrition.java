
public class MeatNutrition {

	private String meat; //declares meat String
	private String meatInfo; //declares meatInfo String
	
	public MeatNutrition (String meat, String meatInfo)
	{
		this.meat = meat; //initializes meat
		this.meatInfo = meatInfo; //initializes meatInfo
	}
	
	public String getMeatInfo() //returns info for different meat if meat String matches that name
	{
		if (meat.equals("chicken"))
		{
			meatInfo = ("Roasted Whole Chicken: \nServing size: 84g or 3 oz \nCalories: 200 \nTotal fat: 11g \nCholesterol: 75mg \nSodium: 70mg \nProtein: 23g \n\nRoasted Chicken Breast: \nServing size: 84g or 3 oz \nCalories: 170 \nTotal fat: 7g \nCholesterol: 70mg \nSodium: 60mg \nProtein: 25g \n\nRoasted Chicken Wing: \nServing size: 84g or 3 oz \nCalories: 240 \nTotal fat: 16g \nCholesterol: 70mg \nSodium: 70mg \nProtein: 23g \n\nRoasted Chicken Drumstick: \nServing size: 84g or 3 oz \nCalories: 180 \nTotal fat: 9g \nCholesterol: 75mg \nSodium: 75mg \nProtein: 23g \n\nRoasted Chicken Thigh: \nServing size: 84g or 3 oz \nCalories: 210 \nTotal fat: 13g \nCholesterol: 80mg \nSodium: 70mg \nProtein: 21g");
		}
		
		if (meat.equals("turkey"))
		{
			meatInfo = ("Roasted Whole Turkey: \nServing size: 84g or 3 oz \nCalories: 170 \nTotal fat: 8g \nCholesterol: 70mg \nSodium: 55mg \nProtein: 24g \n\nRoasted Turkey Breast: \nServing size: 84g or 3 oz \nCalories: 160 \nTotal fat: 6g \nCholesterol: 60mg \nSodium: 55mg \nProtein: 24g \n\nRoasted Turkey Wing: \nServing size: 84g or 3 oz \nCalories: 190 \nTotal fat: 10g \nCholesterol: 70mg \nSodium: 50mg \nProtein: 23g \n\nRoasted Turkey Drunstick: \nServing size: 84g or 3 oz \nCalories: 170 \nTotal fat: 8g \nCholesterol: 70mg \nSodium: 65mg \nProtein: 23g \n\nRoasted Turkey Thigh: \nServing size: 84g or 3 oz \nCalories: 190 \nTotal fat: 10g \nCholesterol: 75mg \nSodium: 65mg \nProtein: 23g");
		}
		
		if (meat.equals("pork"))
		{
			meatInfo = ("Broiled Loin Chop: \nServing size: 84g or 3 oz \nCalories: 180 \nTotal fat: 9g \nCholesterol: 70mg \nSodium: 45mg \nProtein: 22g \n\nRoasted Lion Country Style Ribs: \nServing size: 84g or 3 oz \nCalories: 280 \nTotal fat: 21g \nCholesterol: 75mg \nSodium: 45mg \nProtein: 20g \n\nBroiled Loin Top Loin Chop Boneless: \nServing size: 84g or 3 oz \nCalories: 160 \nTotal fat: 8g \nCholesterol: 60mg \nSodium: 35mg \nProtein: 22g \n\nBroiled Loin Rib Chop: \nServing size: 84g or 3 oz \nCalories: 190 \nTotal fat: 11g \nCholesterol: 55mg \nSodium: 45mg \nProtein: 21g \n\nBraised Spareribs: \nServing size: 84g or 3 oz \nCalories: 330 \nTotal fat: 25g \nCholesterol: 100 \nSodium: 80mg \nProtein: 24g \n\nRoasted Loin Tenderloin: \nServing size: 84g or 3 oz \nCalories: 120 \nTotal fat: 3.5g \nCholesterol: 60mg \nSodium: 45mg \nProtein: 22g \n\nBraised Shoulder Blade Steak: \nServing size: 84g or 3 oz \nCalories: 220 \nTotal fat: 15g \nCholesterol: 80mg \nSodium: 50mg \nProtein: 21g \n\nRoasted Loin Top Roast Boneless: \nCalories: 160 \nTotal fat: 7g \nCholesterol: 65mg \nSodium: 40mg \nProtein: 22g \n\nRoasted Sirloin Roast: \nServing size: 84g or 3 oz \nCalories: 190 \nTotal fat: 11g \nCholesterol: 75mg \nSodium: 50mg \nProtein: 22g");
		}
		
		if (meat.equals("lamb"))
		{
			meatInfo = ("Roasted Shank: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 180 \nTotal fat: 10g \nCholesterol: 75mg \nSodium: 55mg \nProtein: 22g \n\nBraised Shoulder Arm Chop: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 280 \nTotal fat: 19g \nCholesterol: 100mg \nSodium: 60mg \nProtein: 26g \n\nBraised Shoulder Blade Chop: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 280 \nTotal fat: 20g \nCholesterol: 95mg \nSodium: 65mg \nProtein: 24g \n\nRoasted Rib Roast: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 290 \nTotal fat: 23g \nCholesterol: 80mg \nSodium: 60mg \nProtein: 18g \n\nBroiled Loin Chop: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 250 \nTotal fat: 17g \nCholesterol: 85mg \nSodium: 65mg \nProtein: 22g \n\nRoasted Whole Leg: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 200 \nTotal fat: 12g \nCholesterol: 75mg \nSodium: 55mg \nProtein: 22g");
		}
		
		if (meat.equals("beef"))
		{
			meatInfo = ("Braised Chuck Blade Roast: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 290 \nTotal fat: 21g \nCholesterol: 90mg \nSodium: 55mg \nProtein: 22g \n\nBroiled Loin Top Loin Steak: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 220 \nTotal fat: 14g \nCholesterol: 80mg \nSodium: 45mg \nProtein: 22g \n\nRoasted Rib Roast Large End: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 300 \nTotal fat: 24g \nCholesterol: 70mg \nSodium: 55mg \nProtein: 19g \n\nRoasted Round Eye Round Steak: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 170 \nTotal fat: 8g \nCholesterol: 70mg \nSodium: 30mg \nProtein: 24g \n\nBroiled Round Top Round Steak: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 170 \nTotal fat: 8g \nCholesterol: 75mg \nSodium: 35mg \nProtein: 26g \n\nRoasted Round Tip Roast: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 180 \nTotal fat: 10g \nCholesterol: 70mg \nSodium: 55mg \nProtein: 23g \n\nnBroiled Loin Sirloin Steak: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 200 \nTotal fat: 12g \nCholesterol: 75mg \nSodium: 45mg \nProtein: 23g \n\nBraised Round Bottom Round Steak: Serving size: 84g or 3 oz (1/8\" fat trim) \nCalories: 210 \nTotal fat: 10g \nCholesterol: 85mg \nSodium: 35mg \nProtein: 28g \n\nBraised Whole Brisket: Serving size: 84g or 3 oz (1/8\" fat trim) \nCalories: 280 \nTotal fat: 21g \nCholesterol: 80mg \nSodium: 55mg \nProtein: 22g \n\nBroiled Rib Steak Small End: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 240 \nTotal fat: 17g \nCholesterol: 80mg \nSodium: 45mg \nProtein: 22g \n\nBroiled Loin Tenderloin Steak: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 220 \nTotal fat: 14g or \nCholesterol: 80mg \nSodium: 45mg \nProtein: 22g \n\nBraised Chuck Arm Pot Roast: \nServing size: 84g or 3 oz (1/8\" fat trim) \nCalories: 250 \nTotal fat: 16g \nCholesterol: 100mg \nSodium: 40mg \nProtein: 25g");
		}
		
		if (meat.equals("veal"))
		{
			meatInfo = ("Braised Shoulder Arm Steak: \nServing size: 84g or 3 oz \nCalories: 200 \nTotal fat: 9g \nCholesterol: 125mg \nSodium: 75mg \nProtein: 28g \n\nBraised Shoulder Blade Steak: \nServing size: 84g or 3 oz \nCalories: 190 \nTotal fat: 8g \nCholesterol: 130mg \nSodium: 80mg \nProtein: 26g \n\nRoasted Rib Roast: \nServing size: 84g or 3 oz \nCalories: 190 \nTotal fat: 12g \nCholesterol: 90mg \nSodium: 80mg \nProtein: 20g \n\nBraised Loin Chop: Serving size: 84g or 3 oz \nCalories: 240 \nTotal fat: 14g \nCholesterol: 100mg \nSodium: 65mg \nProtein: 25g \n\nPan-Fried Cutlets \nServing size: 84g or 3 oz \nCalories: 180 \nTotal fat: 7g \nCholesterol: 90mg \nSodium: 65mg \nProtein: 27g");
		}
		
		return meatInfo;
	}
}
