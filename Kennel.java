import java.util.ArrayList;

public class Kennel {

	private ArrayList<Pet> petList;

	/**
	 * Postcondition: for each Pet in the kennel, its name followed by the result of
	 * a call to its speak method has been printed, one line per Pet
	 */
	public void allSpeak() {
		for (Pet p:petList) {
			System.out.println(p.getName()+" "+p.speak());
		}
	}
	
	// Constructor implementation not shown to student
	public Kennel() {
		petList = new ArrayList<Pet>();
	}
	
	// Main method not shown to students
	public static void main(String[] args) {
		// main is static method but petList is an instance variable --
		// cannot use instance variables from within a static method!
		// create an instance of a kennel and work with that
		Kennel k = new Kennel();
		k.petList.add(new Dog("Ricky"));
		k.petList.add(new Cat("Charlemagne"));
		k.petList.add(new LoudDog("Christina"));
		k.allSpeak();
	}

}
