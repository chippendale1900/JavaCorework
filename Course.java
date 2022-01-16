public class Course {
    int[] obstacles;

    public Course(int jumping, int running){
       obstacles = new int[]{jumping, running};
    }
    public void finishing(Team team){
        for (Animal animal: team.animals) {
            for (int obstacle: obstacles) {
                if (animal.jumpHeight >= obstacle) {
                    System.out.println(animal.name + " finished");
                    animal.finished = true;
                }
                else {
                    animal.finished = false;
                }
            }
        }
    }

}
