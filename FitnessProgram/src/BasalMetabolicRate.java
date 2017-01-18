
public class BasalMetabolicRate {

	private double weightBmr; //declares weightBmr double
	private String genderBmr; //weight genderBmr String
	private int ageBmr; //declares ageBmr integer
	private double heightBmr; //declares heightBmr double
	private int amountOfExercise; //declares amountOfExercise integer
	private double basalMetabolicRate; //declares basalMetabolicRate double
	
	public BasalMetabolicRate (double weightBmr, String genderBmr, int ageBmr, double heightBmr)
	{
		this.weightBmr = weightBmr; //initializes weightBmr
		this.genderBmr = genderBmr; //initializes genderBmr
		this.ageBmr = ageBmr; //initializes ageBmr
		this.heightBmr = heightBmr; //initializes heightBmr
	}
	
	public double getWeightBmr()
	{
		return weightBmr; // return weightBmr
	}
	
	public String getGenderBmr()
	{
		return genderBmr; //return genderBmr
	}
	
	public int getAgeBmr()
	{
		return ageBmr; //return ageBmr
	}
	
	public double getHeightBmr()
	{
		return heightBmr; //return heightBmr
	}
	
	public double getBasalRate()
	{		
		double temp;
		if (genderBmr.equals("male")) 
		{
		temp = (10*weightBmr) + (6.25*heightBmr) - (5*ageBmr) + 5; //equation for BMR if male
		basalMetabolicRate = Math.round(temp*100.0)/100.0;
		}
		
		if (genderBmr.equals("Male"))
		{	
			temp = (10*weightBmr) + (6.25*heightBmr) - (5*ageBmr) + 5; //equation for BMR if male
			basalMetabolicRate = Math.round(temp*100.0)/100.0;
			}
		
		if (genderBmr.equals("female"))
		{
		temp = (10*weightBmr) + (6.25*heightBmr) - (5*ageBmr) - 161; //equation for BMR if female
		basalMetabolicRate = Math.round(temp*100.0)/100.0;
		}
		
		if (genderBmr.equals("Female"))
		{	
			temp = (10*weightBmr) + (6.25*heightBmr) - (5*ageBmr) - 161; //equation for BMR if female
			basalMetabolicRate = Math.round(temp*100.0)/100.0;
			}
		
		return basalMetabolicRate;
		
	}
	
	
	public double RecommendedIntake(int amountOfExercise)
	{
		double recommendedIntake = 0.0;
		
		if (amountOfExercise == 1)
		{
			recommendedIntake = basalMetabolicRate*1.2; //recommended intake if amount of exercise is option 1
		}
		
		if (amountOfExercise == 2)
		{
			recommendedIntake = basalMetabolicRate*1.375; //recommended intake if amount of exercise is option 2
		}
		
		if (amountOfExercise == 3)
		{
			recommendedIntake = basalMetabolicRate*1.55; //recommended intake if amount of exercise is option 3
		}
		
		if (amountOfExercise == 4)
		{
			recommendedIntake = basalMetabolicRate*1.725; //recommended intake if amount of exercise is option 4
		}
		
		if (amountOfExercise == 5)
		{
			recommendedIntake = basalMetabolicRate*1.9; //recommended intake if amount of exercise is option 5
		}
		
		return recommendedIntake;

}
}
