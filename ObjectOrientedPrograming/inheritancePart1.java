import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;

public class inheritancePart1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("animal1", 1, 1, 1, 5);
        dog dog1 = new dog("dog1 ", 1, 1, 8, 45, 2, "ong furry");
        System.out.println(dog1.getName());
        dog dog2 = new dog("dog2", 1, 1, 3, 24, 2, "nofur");
        dog2.move(dog2.getName());
        dog1.eat();
        fish katla = new fish("katla", 1, 1, 2, 1, 6, 2, 2);
        // katla.eat();
        katla.about();

    }
}

class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void swims(int speed) {

    }

    public void move(String NAME) {
        System.out.println(NAME + "MOVES 1 STEP");
    }

    public void eat() {
        System.out.println("animal.eat() called");
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}

// dog class
class dog extends Animal {
    int eyes;
    String coat;

    public dog(String name, int brain, int body, int size, int weight, int eyes, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.coat = coat;
    }

    public String getCoat() {
        return coat;
    }

    public int getEyes() {
        return eyes;
    }

    private void chew() {
        System.out.println(this.getName() + "chewessss shesssss");
    }

    @Override
    public void eat() {
        // TODO overridden the animal eat methode..
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

}

/**
 * InnerinheritancePart1
 */
class fish extends Animal {

    private int fins;
    private int gills;
    private int eyes;

    public fish(String name, int brain, int body, int size, int weight, int fins, int gills, int eyes) {
        super(name, brain, body, size, weight);
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
    }

    public void about() {
        System.out.println("it is a fish");
        super.eat();
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("fist.eat() is called");
        super.eat();
    }

}
