public class WineBottle {

    public enum Type {
        red,
        white;
    }
    
    private Type type;
    private int age;

    public WineBottle(Type type, int age) {
        this.type = type;
        this.age = age;
    }

    public String toString() {
        return type + " wine that is " + age + " years old";
    }

    public Type getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WineBottle)) return false;
        return (((WineBottle) o).type.equals(this.type) && ((WineBottle) o).age == this.age);
    }
}
