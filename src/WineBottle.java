public class WineBottle {

    public String type;
    public int age;

    public WineBottle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String toString() {
        return type + " wine that is " + age + " years old";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WineBottle)) return false;
        return (((WineBottle) o).type == this.type && ((WineBottle) o).age == this.age);
    }
}
