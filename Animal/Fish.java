public class Fish extends Animal{
    public Fish() {
        super();
    }

    public Fish(String id) {
        super();
        this.id = id;
    }

    public void move() {
        System.out.println("Fish can swim");
    }
}
