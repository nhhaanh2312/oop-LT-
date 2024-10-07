public class Duck extends Animal{
    public Duck() {
        super();
    }

    public Duck(String id) {
        super();
        this.id = id;
    }

    public void move() {
        System.out.println("Duck can swim and walk");
    }
}
