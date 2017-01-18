
public class MetCalculator {

	private double met; //declares met double
	private double weightMet; //declares weightMet double
	private int minutes; //declares minutes integer
	private double metBurned; //declares metBurned double
	
	public MetCalculator (double met, double weightMet, int minutes)
	{
		this.met = met; //initializes met
		this.weightMet = weightMet; //initializes weightMet
		this.minutes = minutes; //initializes minutes
	}
	
	public double getMet()
	{
		return met; //return met
	}
	
	public double getWeightMet()
	{
		return weightMet; //return weightMet
	}
	
	public int getMinutes()
	{
		return minutes; //return minutes
	}
	
	public double MetBurned()
	{
		double temp;
		temp = ((met*3.5*weightMet)/200)*minutes; //equation for calories burned with METS
		metBurned = Math.round(temp*100.0)/100.0;
		return metBurned;
	}
}
