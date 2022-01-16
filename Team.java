public class Team {
    String name;
    Animal[] animals;

    public Team(String name, Animal animal1, Animal animal2, Animal animal3) {
        animals = new Animal[]{animal1, animal2, animal3};
        this.name = name;
    }
    public void printInfoAnimal() {
        for (Animal animal: animals) {
            animal.info();
        }
    }

    public void printInfoAnimalFinishing() {
        for (Animal animal: animals) {
            if (animal.finished) {
                animal.info();
            }
        }
    }

}
