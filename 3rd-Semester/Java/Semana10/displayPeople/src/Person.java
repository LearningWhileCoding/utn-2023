import java.util.StringJoiner;

public class Person {
    private int id;
    private String name;
    private String phone;
    private String email;
    private static int personCounter = 0;

    public Person() {
        this.id = ++Person.personCounter;
    }

    public Person(String name, String phone, String email) {
        this();
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    public static void setPersonCounter(int personCounter) {
        Person.personCounter = personCounter;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("phone='" + phone + "'")
                .add("email='" + email + "'")
                .toString();
    }
}
