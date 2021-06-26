package HW17;

public class Person {
    private int id;
    private String name;
    private int count;

    public Person(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;

    }
}
