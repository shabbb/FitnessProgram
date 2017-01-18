//***********************************************************
// Name: Shabab Siddique
// Title: HonorsContractProject.java
// Description: Calculate calories burned
// Time spent: 6 hours
// Date: 10/1/2016
//**************************************************************

//Give a menu to the user
//User can select from different exercises
//After selecting exercise, they must input total time exercised and distance
//Equations will calculate how many calories were burned
//Come up with a general meal plan, which will also depend on gender
//User will input gender and how many calories they want to consume that day
//Calculate how many calories should be lost by inputting weight if user wants to lose 1 pound a week
//Compute everything in both pounds and kilograms
//Calculate basal metabolic rate (how many calories are burned at rest) with weight, height, age, and gender
//Calculate how many more calories should be taken if wanting to gain muscle (add around 250-500)

import java.util.Scanner;
import java.io.*;

public class FitnessProgram {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in); //new Scanner object
		int choice = 1; //initializes choice integer
		String answer = ""; //initializes answer String
		do {
			if (choice<10 || choice>10) //if choice is anything but 10
			{
			System.out.println("Please select from one of the following options (Type 1, 2, 3, or 4): "); //directions
			System.out.println("1. Calculate calories burned with average heartrate (inaccurate)."); //prompt
			System.out.println("2. Find METS value for an exercise or activity."); //prompt
			System.out.println("3. Calculate calories burned with METS value (accurate)."); //prompt
			System.out.println("4. Find nutrition information on fruit."); //prompt
			System.out.println("5. Find nutrition information on vegetables."); //prompt
			System.out.println("6. Find nutrition information on seafood."); //prompt
			System.out.println("7. Find nutrition information on meat."); //prompt
			System.out.println("8. Calculate basal metabolic rate."); //prompt
			System.out.println("9. Calculate total calories consumed."); //prompt
			System.out.println("10. Quit."); //prompt
			choice = in.nextInt(); //user inputs choice

			switch (choice) {
			case 1:

				int weight; //declares weight integer
				int distance; //declares distance integer
				int age; //declares age integer
				int heartRate; //declares heartRate integer
				double caloriesBurned = 0; //initializes caloriesBurned double
				String gender = ""; //initializes gender String
				int time; //declares time integer
				
				System.out.println("Please enter your weight in pounds. Round to the nearest whole number."); //prompt
				weight = in.nextInt(); //user inputs weight
				
				System.out.println("Please enter distance you exercised in meters"); //prompt
				distance = in.nextInt(); //user inputs distance

				System.out.println("Please enter your age."); //prompt
				age = in.nextInt(); //user inputs age

				System.out.println("Please enter your average heartrate during the exercise"); //prompt
				heartRate = in.nextInt(); //user inputs heartRate

				System.out.println("Please enter the amount of time you exercised in minutes."); //prompt
				time = in.nextInt(); //user inputs time

				System.out.println("Please enter your gender as either male or female."); //prompt
				in.nextLine();
				gender = in.nextLine(); //user inputs gender
				while(!gender.equals("male") && !gender.equals("Male") && !gender.equals("female") && !gender.equals("Female"))
				{
					System.out.println("Please enter your gender as either male or female."); //reprints if input doesn't match
					gender = in.nextLine();
				}

				CalorieCalculator caloriesCalculated = new CalorieCalculator(weight, gender, distance, age, heartRate, caloriesBurned, time); //new CalorieCalculator object

				System.out.println("The number of calories you burned is " + caloriesCalculated.CaloriesBurned() + "kCal"); //outputs calories burned
				
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				answer = in.nextLine(); 
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				
				break;
				
			case 2:
				
				
				FileInputStream input = new FileInputStream("METS.txt"); //new FileInputStream object
				DataInputStream console = new DataInputStream(input); //new DataInputStream object
		        BufferedReader br = new BufferedReader(new InputStreamReader(console)); //new BufferedReader object
				String output; //declares output String

				while ((output = br.readLine()) != null) 	
				{
					System.out.println(output); //prints textfile
				}
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				in.nextLine();
				answer = in.nextLine(); 
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				break;
				
			case 3:
				
				double met; //declares met double
				double weightMet; //declares weightMet double
				int minutes; //declares minutes integer
				double metBurned; //declares metBurned double
				
				System.out.println("Please enter METS value for exercise you did."); //prompt
				met = in.nextDouble(); //user inputs met
				
				System.out.println("Please enter your weight in kilograms (Divide pounds by 2.2)."); //prompt
				weightMet = in.nextDouble(); //user inputs weightMet
				
				System.out.println("Please enter the number of minutes you exercised for."); //prompt
				minutes = in.nextInt(); //user inputs minutes
				
				MetCalculator metCalculated = new MetCalculator (met, weightMet, minutes); //new MetCalculator object
				
				System.out.println("The number of calories you burned is " + metCalculated.MetBurned() + "kCal."); //outputs calories burned
				
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				in.nextLine();
				answer = in.nextLine(); 
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}

				break;
				
			case 4:
				
				String fruit; //declares fruit String
				String fruitInfo = ""; //initializes fruitInfo String
				System.out.println("Please enter fruit name: "); //prompt
				in.nextLine();
				fruit = in.nextLine(); //user inputs fruit
				
				
				while (!fruit.equals("mango") && !fruit.equals("pomegranate") && !fruit.equals("guava") && !fruit.equals("raspberries") && !fruit.equals("orange") && !fruit.equals("avocado") && !fruit.equals("apple") && !fruit.equals("banana") && !fruit.equals("cantaloupe") && !fruit.equals("grapefruit") && !fruit.equals("grapes") && !fruit.equals("honeydew melon") && !fruit.equals("kiwi") && !fruit.equals("lemon") && !fruit.equals("lime") && !fruit.equals("nectarine") && !fruit.equals("peach") && !fruit.equals("pear") && !fruit.equals("pineapple") && !fruit.equals("plum") && !fruit.equals("strawberries") && !fruit.equals("cherries") && !fruit.equals("tangerine") && !fruit.equals("watermelon"))
				{
					System.out.println("Try typing the plural form if you entered the singular form, or type the singular form if you entered the plural form. If you capitalized it, please make it lowercase. Try making your input more general. If the fruit still can't be found, we don't have it in our directory.");
					System.out.println("Please enter fruit name: "); //reprints if input doesn't match
					fruit = in.nextLine();
				}
				
				FruitNutrition fruitNutrition = new FruitNutrition(fruit, fruitInfo); //new FruitNutrition object
				System.out.println(fruitNutrition.getFruitInfo()); //prints fruit info
				
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				answer = in.nextLine(); 
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				
				break;
				
			case 5:
				String vegetable; //declares vegetable String
				String vegetableInfo = ""; //initializes vegetableInfo String
				System.out.println("Please enter vegetable name: "); //prompt
				in.nextLine();
				vegetable = in.nextLine(); //user inputs vegetable
				
				while (!vegetable.equals("asparagus") && !vegetable.equals("bell pepper") && !vegetable.equals("broccoli") && !vegetable.equals("carrot") && !vegetable.equals("cauliflower") && !vegetable.equals("celery") && !vegetable.equals("cucumber") && !vegetable.equals("green beans") && !vegetable.equals("cabbage") && !vegetable.equals("green onion") && !vegetable.equals("iceberg lettuce") && !vegetable.equals("leaf lettuce") && !vegetable.equals("mushrooms") && !vegetable.equals("onion") && !vegetable.equals("potato") && !vegetable.equals("radish") && !vegetable.equals("squash") && !vegetable.equals("corn") && !vegetable.equals("sweet potato") && !vegetable.equals("tomato"))
				{
					System.out.println("Try typing the plural form if you entered the singular form, or type the singular form if you entered the plural form. If you capitalized it, please make it lowercase. Try making your input more general. If the vegetable still can't be found, we don't have it in our directory.");
					System.out.println("Please enter vegetable name: "); //reprints if input doesn't match
					vegetable = in.nextLine();
				}
				VegetableNutrition vegetableNutrition = new VegetableNutrition(vegetable, vegetableInfo); //new VegetableNutrition object
				System.out.println(vegetableNutrition.getVegetableInfo()); //prints vegetable info
				
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				answer = in.nextLine(); 
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				
				break;
				
			case 6:
				String seafood; //declares seafood String
				String seafoodInfo = ""; //declares seafoodInfo String
				System.out.println("Please enter seafood name: "); //prompt
				in.nextLine();
				seafood = in.nextLine(); //user inputs seafood
				
				while (!seafood.equals("crab") && !seafood.equals("catfish") && !seafood.equals("clams") && !seafood.equals("cod") && !seafood.equals("flounder") && !seafood.equals("sole") && !seafood.equals("haddock") && !seafood.equals("halibut") && !seafood.equals("lobster") && !seafood.equals("perch") && !seafood.equals("roughy") && !seafood.equals("oysters") && !seafood.equals("pollock") && !seafood.equals("trout") && !seafood.equals("rockfish") && !seafood.equals("salmon") && !seafood.equals("scallops") && !seafood.equals("shrimp") && !seafood.equals("swordfish") && !seafood.equals("tilapia") && !seafood.equals("tuna"))
				{
					System.out.println("Try typing the plural form if you entered the singular form, or type the singular form if you entered the plural form. If you capitalized it, please make it lowercase. Try making your input more general. If the seafood still can't be found, we don't have it in our directory.");
					System.out.println("Please enter seafood name: "); //reprints if input doesn't match
					seafood = in.nextLine();
				}
				
				SeafoodNutrition seafoodNutrition = new SeafoodNutrition(seafood, seafoodInfo); //new SeafoodNutrition object
				System.out.println(seafoodNutrition.getSeafoodInfo()); //prints seafood info
				
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				answer = in.nextLine(); 
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				
				break;
				
			case 7:
				String meat; //declares meat String
				String meatInfo = ""; //declares meatInfo String
				System.out.println("Please enter chicken, turkey, pork, lamb, beef, or veal: "); //prompt
				in.nextLine();
				meat = in.nextLine(); //user inputs meat
				
				while (!meat.equals("chicken") && !meat.equals("turkey") && !meat.equals("pork") && !meat.equals("lamb") && !meat.equals("beef") && !meat.equals("veal"))
				{
					System.out.println("Please make sure your input is lowercase. Only enter chicken, turkey, pork, lamb, beef or veal.");
					System.out.println("Please enter chicken, turkey, pork, lamb, beef, or veal: "); //reprints if input doesn't match
					meat = in.nextLine(); 
				}
				
				MeatNutrition meatNutrition = new MeatNutrition(meat, meatInfo); //new MeatNutrition object
				System.out.println(meatNutrition.getMeatInfo()); //prints meat info
				
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				answer = in.nextLine(); 
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				
				break;
				
			case 8:
				
				double weightBmr; //declares weightBmr double
				String genderBmr = ""; //initializes genderBmr String
				int ageBmr; //declares ageBmr integer
				double heightBmr; //declares heightBmr double
				double basalMetabolicRate; //declares basalMetabolicRate double
				int amountOfExercise = 1; //declares amountOfExercise integer
				
				System.out.println("Please enter gender as either male or female."); //prompt
				in.nextLine();
				genderBmr = in.nextLine(); //user inputs gender
				while(!genderBmr.equals("male") && !genderBmr.equals("Male") && !genderBmr.equals("female") && !genderBmr.equals("Female"))
				{
					System.out.println("Please enter your gender as either male or female."); //reprints if input doesn't match
					genderBmr = in.nextLine();
				}
				
				System.out.println("Please enter weight in kilograms (Divide pounts by 2.2)"); //prompt
				weightBmr = in.nextDouble(); //user inputs weight
				
				System.out.println("Please enter height in centimeters."); //prompt
				heightBmr = in.nextDouble(); //user inputs height
				
				System.out.println("Please enter your age."); //prompt
				ageBmr = in.nextInt(); //user inputs age
				
				BasalMetabolicRate bmrCalculated = new BasalMetabolicRate (weightBmr, genderBmr, ageBmr, heightBmr); //new BasalMetabolicRate object
				
				System.out.println("Your Basal Metabolic Rate is " + bmrCalculated.getBasalRate() + "kcal/day."); //prints BMR
				
				do{
					
				if (amountOfExercise<6 || amountOfExercise>6)
				{
				System.out.println("How much exercise do you perform?"); //prompt
				System.out.println("1. Little to no exercise"); //prompt
				System.out.println("2. Light exercise (1-3 days per week)"); //prompt
				System.out.println("3. Moderate exercise (3-5 days per week)"); //prompt
				System.out.println("4. Heavy exercise (6-7 days per week)"); //prompt
				System.out.println("5. Very heavy exercise (twice per day, extra heavy workouts)"); //prompt
				System.out.println("6. Go back to main menu"); //prompt
				amountOfExercise = in.nextInt(); //user inputs amountOfExercise option
				
				
				switch (amountOfExercise) {
				
				case 1:
					
					System.out.println("Your daily kilocalorie intake should be " + bmrCalculated.RecommendedIntake(amountOfExercise) + " to maintain your current weight."); //recommended intake if option 1
					
					break ;
					
				case 2: 
					
					System.out.println("Your daily kilocalorie intake should be " + bmrCalculated.RecommendedIntake(amountOfExercise) + " to maintain your current weight."); //recommended intake if option 2
					
					break;
					
				case 3: 
					
					System.out.println("Your daily kilocalorie intake should be " + bmrCalculated.RecommendedIntake(amountOfExercise) + " to maintain your current weight."); //recommended intake if option 3
					break;
					
				case 4: 
					
					System.out.println("Your daily kilocalorie intake should be " + bmrCalculated.RecommendedIntake(amountOfExercise) + " to maintain your current weight."); //recommended intake if option 4
					
					break;
					
				case 5:
					
					System.out.println("Your daily kilocalorie intake should be " + bmrCalculated.RecommendedIntake(amountOfExercise) + " to maintain your current weight."); //recommended intake if option 5
					
					break;
					
				default:
					break;
				
				}
				}
				
			}while(amountOfExercise != 6);
				
					
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				in.nextLine();
				answer = in.nextLine(); 
				
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				
				break;
				
			case 9:
				int size; //declares size integer
				double element;  //declares element double
				double sum = 0; //initializes sum double
				System.out.println("How many types of food did you eat?"); //prompt
				size = in.nextInt(); //user inputs size
				
				double[] array = new double[size];  //array created
				
				System.out.println("One by one, please enter the number of calories in each food you consumed."); //prompt
				
				for (int i= 0; i < size; i++) 
				{
					System.out.println("Please enter the number of calories: "); 
					element = in.nextDouble(); //user enters number of calories for each food they ate
					array[i] = element; 	
				}
				
				for (int i = 0; i < size; i++) 
				{
					sum += array[i]; //calories added together
				}
				
				System.out.println("\n" + "The total number of calories you consumed is: " + sum); //total calories printed
				
				System.out.println("\nDo you want to continue? (Yes/No)"); // Does the user want to continue and select another menu option?
				in.nextLine();
				answer = in.nextLine(); 
				
				while(!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
				{
					System.out.println("Do you want to continue? (Yes/No)"); //reprints if input doesn't match
					answer = in.nextLine();
				}
				if (answer.equals("Yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("yes")) 
				{
					choice = 1; 
				}
				if (answer.equals("No")) 
				{
					choice = 10; 
				}
				if (answer.equals("no")) 
				{
					choice = 10;
				}
				
				break;
				
			default:
				
				break;
					
			}

			} //end of if statement
		} while (choice != 10); //end of do loop
	} //end of main method
	} //end of class

