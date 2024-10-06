public class StudentManagement extends PersonManagement {
    private String id;

    public StudentManagement() {
        super();
    }

    public StudentManagement(String name, String birthDate) {
        super();
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
