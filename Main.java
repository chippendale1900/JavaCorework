public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal(name: "rabbit", jumpHeight: 2, runSpeed: 90);
        Animal animal2 = new Animal(name: "zebra", jumpHeight: 3, runSpeed: 130);
        Animal animal3 = new Animal(name: "capybara", jumpHeight: 0, runSpeed: 10);
        Team team = new Team (name: "Herbivorous", animal1, animal2, animal3);
        Course course = new Course(1,100);

        course.finishing(team);

        team.printInfoAnimal();
        System.out.println();

        team.printInfoAnimalFinishing();


    }
}
