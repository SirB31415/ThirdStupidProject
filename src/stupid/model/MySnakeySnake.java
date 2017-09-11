package stupid.model;

public class MySnakeySnake
{
	//DeclarationSection
	//Data member section
	private int slithery;
	public MySnakeySnake()
	{
		this.slithery = 9000;
	}
	public String toString()
	{
		String description = "I am a slithery snake, my slithery level is " + slithery;
		return description;
	}
}
