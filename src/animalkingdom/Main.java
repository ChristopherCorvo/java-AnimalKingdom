package animalkingdom;

// imported java libraries
import java.util.List;
import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{

		// Add code here	
		// -------- Instances of Mammals -------
		Mammals panda = new Mammals("Panda", "1869");
		Mammals zebra = new Mammals("Zebra", "1778");
		Mammals koala = new Mammals("Koala", "1816");
		Mammals sloth = new Mammals("Sloth", "1804");
		Mammals armadillo = new Mammals("Armadillo", "1758");
		Mammals raccoon = new Mammals("Raccoon", "1758");
		Mammals bigfoot = new Mammals("Bigfoot", "2021");

		//------ Instances of Birds --------
		Birds pigeon = new Birds("Pigeon","1837");
		Birds peacock = new Birds("Peacock","1821");
		Birds toucan = new Birds("Toucan","1758");
		Birds parrot = new Birds("Parrot","1824");
		Birds swan = new Birds("Swan","1758");

		// ------- Instances of Fish --------
		Fish salmon = new Fish("Salmon", "1758");
		Fish catfish = new Fish("Catfish", "1817");
		Fish perch = new Fish("Perch", "1758");

		// ----- Create a list(collection) to hold all animals
		List<Animals> myList = new ArrayList<>();

		// -------- Add animals to myList -------
		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

		// ----- Sort and display contents of myList --------

		//  List all the animals in descending order by year named
		System.out.println();
		System.out.println("List of Animals in descending order by Year Named:");
		System.out.println();
		myList.sort((a1, a2) -> a2.getYearNamed().compareToIgnoreCase(a1.getYearNamed()));
		myList.forEach((a)-> System.out.println(a));

		// List all the animals alphabetically

		System.out.println();
		System.out.println("List of Animals in alphabetical order:");
		System.out.println();
		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		myList.forEach((a)-> System.out.println(a));


		//  List all the animals order by how they move
		System.out.println();
		System.out.println("List of Animals by how they move:");
		System.out.println();
		myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		myList.forEach((a)-> System.out.println(a));

		//  List only those animals that breath with lungs
		System.out.println();
		System.out.println("List of Animals who breath with lungs:");
		System.out.println();
		List<Animals> filteredList = filterAnimals(myList, (v) -> v.breath() < 0);
		filteredList.forEach((v)-> System.out.println(v));

		// List only those animals that breath with lungs and were named in 1758

		// List only those animals that lay eggs and breath with lungs

		// List alphabetically only those animals that were named in 1758




	}



}