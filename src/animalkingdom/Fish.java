package animalkingdom;

public class Fish extends Animals
{

	// ------ Constructor -------
	public Fish(String name, String yearNamed)
	{
		super(name, yearNamed);
	}

	// -------- Animals Methods --------
	@Override
	public String move()
	{
		return "Swim";
	}

	@Override
	public String breath()
	{
		return "Gills";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}
}