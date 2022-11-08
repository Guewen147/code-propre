package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", Types.MAMMIFERE , Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", Types.MAMMIFERE , Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Types.MAMMIFERE , Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", Types.MAMMIFERE , Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Types.POISSON , Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", Types.POISSON , Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", Types.SERPENT , Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Python", Types.SERPENT , Comportement.CARNIVORE));
		
		System.out.println(Zoo.afficherListeAnimaux());
	}

}
