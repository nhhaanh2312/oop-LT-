public class Animal {
    protected String id;

    public Animal() {

    }

    public Animal(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.move();
        Fish f = new Fish();
        f.move();
        Pig p = new Pig();
        p.move();
    }
}
