package Java2Lesson1.animal;

import Java2Lesson1.abilities.Jumpable;

import java.io.Serializable;
import java.util.Random;

public class Cat extends Animal implements Jumpable, Serializable {

    public Cat(String name) {
        super(name);
        onDistance = true;
        animType = "Cat";
        maxRunDistance = 500;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void jump(float height) {
        if (height < 1.5f) {
            System.out.println(animType + " jump ok");
        } else {
            float doubleJump = (new Random()).nextFloat();
            if (height < 1.5f + doubleJump) {
                System.out.println(animType + " double jump ok");
            } else
                getOutFromDistance("jump");
        }
    }
}
