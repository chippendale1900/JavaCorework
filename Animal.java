public class Animal {
    String name;
    int jumpHeight;
    int runDistance;
    boolean finished;

    public Animal(String name, int jumpHeight, int runSpeed){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        finished = false;
    }


    public void info() {
        System.out.println(name + " " + jumpHeight);
        System.out.println(name + " " + runDistance);
    }
}
