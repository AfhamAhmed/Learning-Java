public class Main 
{
	
	public static void main(String[] args) 
	{
		Cars audi = new Cars();
		Cars lexus = new Cars();
		
		audi.setModel("A4");
		audi.setColor("Blue");
		audi.setDoors(2);
		
		System.out.println(
				"The car's model is " + audi.getModel() + ", the color is " 
				+ audi.getColor() + " and the # of doors are " + audi.getDoors()
				+ "."
		);
	}
}
