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
}
