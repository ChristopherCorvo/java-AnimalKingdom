package animalkingdom;

public class Mammals extends Animals
{
	// ------ Constructor -------
	public Mammals(String name, String yearNamed)
	{
		super(name, yearNamed);
	}
	// -------- Animals Methods --------
	@Override
	public String move()
	{
		return "Walk";
	}

	@Override
	public String breath()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Live Birth";
	}
}

	
	