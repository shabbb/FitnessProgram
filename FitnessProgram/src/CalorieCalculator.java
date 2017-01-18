
public class CalorieCalculator {

	private int weight; //declares weight integer
	private String gender; //declares gender String
	private int distance; //declares distance integer
	private int age; //declares age integer
	private int heartRate; //declares heartRate integer
	private double caloriesBurned; //declares caloriesBurned double
	private int time; //declares time integer
	private int height; //declares height integer

	public CalorieCalculator(int weight, String gender, int distance, int age, int heartRate, double caloriesBurned,int time) 
	{
		this.weight = weight; //initializes weight
		this.gender = gender; //initializes gender
		this.distance = distance; //initializes distance
		this.age = age; //initializes age
		this.heartRate = heartRate; //initializes heartRate
		this.caloriesBurned = caloriesBurned; //initializes caloriesBurned
		this.time = time; //initializes time
	}

	public int getWeight() {
		return weight; //return weight
	}

	public String getGender() {
		return gender; //return gender
	}

	public int getDistance() {
		return distance; //return distance
	}

	public int getAge() {
		return age; //return age
	}

	public int getHeartRate() {
		return heartRate; //return heartRate
	}

	public double CaloriesBurned() {
		double temp;
		if (gender.equals("male")) {
			temp = (((age * 0.2017) + (weight * 0.1988) + (heartRate * 0.6309) - 55.0969)) * time / 4.184; //equation for calories burned if male
			caloriesBurned = Math.round(temp*100.0)/100.0;
		}

		if (gender.equals("Male")) {
			temp = (((age * 0.2017) + (weight * 0.1988) + (heartRate * 0.6309) - 55.0969)) * time / 4.184; //equation for calories burned if male
			caloriesBurned = Math.round(temp*100.0)/100.0;
			}

		if (gender.equals("female")) {
			temp = (((age * 0.074) + (weight * 0.1263) + (heartRate * 0.4472) - 20.4022)) * time / 4.184; //equation for calories burned if female
			caloriesBurned = Math.round(temp*100.0)/100.0;
		}

		if (gender.equals("Female")) {
			temp = (((age * 0.074) + (weight * 0.1263) + (heartRate * 0.4472) - 20.4022)) * time / 4.184; //equation for calories burned if female
			caloriesBurned = Math.round(temp*100.0)/100.0;
			}
		return caloriesBurned;
	}

}
