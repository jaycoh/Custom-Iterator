public class WineBottle {

    private String type;
    private int age;

    public WineBottle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String toString() {
        return type + " wine that is " + age + " years old";
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WineBottle)) return false;
        return (((WineBottle) o).type.equals(this.type) && ((WineBottle) o).age == this.age);
    }
}
