package hw6Q3Inheritance;

/* Now create a class "TestAnimal". Under the main method 
 * create an object from each class 
 * and call their own method by their own object. 
 * 
 * Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class, for example:( bulldog -- dog -- mammal --Animal,)( Cobra -- snake--reptile--Animal,)( Robin -- Bird -- Animal) etc. 
 * 
 * An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. Also, show by java comments who is Parent class and who is child class.
 * 
 *  Organize the code. Push the code in Github. Paste your github link below.
 */

public class TestAnimal {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();// Single Inheritance & Animal Parent & Mammal child class

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();// Single Inheritance & Animal Parent & Reptile child class

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();// Single Inheritance & Animal Parent & Birds child class

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();// Mammal Parent & Dog Child
		dog.animalInfo();// Hierarchical inheritance Animal Parent & Mammal Child

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();// Reptile Parent & Snake Child
		snake.animalInfo();// Hierarchical inheritance Animal Parent & Reptile Child

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();// Birds Parent & Robin Child
		robin.animalInfo();// Hierarchical inheritance Animal Parent & Birds Child

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();// Dog Parent & BullDog child
		bullDog.mammalInfo();// Mammal Parent & Dog Child
		bullDog.animalInfo();// Multilevel Inheritance Animal Parent & Mammal Child

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();// Snake Parent & Cobra Child
		cobra.reptileInfo();// Reptile Parent & Snake Child
		cobra.animalInfo();// Multilevel Inheritance Animal Parent & Reptile Child

	}

}
