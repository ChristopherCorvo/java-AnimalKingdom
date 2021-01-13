package animalkingdom;

public class Birds extends Animals
{

	// ------ Constructor -------
	public Birds(String name, String yearNamed)
	{
		super(name, yearNamed);
	}

	// -------- Animals Methods --------
	@Override
	public String move()
	{
		return "Fly";
	}

	@Override
	public String breath()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}
}