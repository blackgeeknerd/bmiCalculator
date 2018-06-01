import java.util.Scanner;

public class BMI_Driver
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		double weight;
		double height;
		
		//Prompt the user for the weight
		System.out.print("Enter your weight(kg): ");
		weight = input.nextDouble();
		
		//Prompt the user for the height
		System.out.print("Enter your height(meters): ");
		height = input.nextDouble();
		
		//Create a new BMI calculator class
		BMI_Calulator bmiclass = new BMI_Calulator(weight, height);
		
		System.out.println(bmiclass.getBMI());
		
		bmiclass.evaluateBMI();
	}
}