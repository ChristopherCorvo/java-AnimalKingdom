package animalkingdom;

abstract class Animals
{
	// ------- Class fields -------
	private static long maxId = 0;
	protected long id;
	protected String name;
	protected String yearNamed;

	// ------ Constructor --------
	public Animals(String name, String yearNamed)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.yearNamed = yearNamed;
	}

	// ---- These are method headers that will be defined in the child class
	abstract String move();
	abstract String breath();
	abstract String reproduce();

	// -------- Getters and Setters --------
	public String getName()
	{
		return name;
	}

	public String getYearNamed()
	{
		return yearNamed;
	}

	// ------- Method ------------

	public static String eat()
	{
		return "Eat";
	}

	@Override
	public String toString()
	{
		return "Animal name: " + name + " Id#: " + id + ", year named: " + yearNamed + ".";
	}

}