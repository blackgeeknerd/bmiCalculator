public class BMI_Calulator
{
	private double weight;
	private double height;
	private double BMI;

	public BMI_Calulator(double weight, double height)
	{
		this.weight = weight;
		this.height = height;
	}
	
	public double getBMI()
	{
		this.BMI = ((height * height) / weight);
		BMI = Math.round(BMI * 10.0) / 10.0;
		return BMI;
	}
	
	public void evaluateBMI()
	{
		if (BMI < 18.5)
		{
			System.out.println("Under Weight");
		}
		else if ((BMI >=  18.5 ) && (BMI < 25))
		{
			System.out.println("Normal");
		}
		else if ((BMI >=  25 ) && (BMI < 30))
		{
			System.out.println("Overweight");
		}
		
		else 
		{
			System.out.println("Obese");
		}
	}
}