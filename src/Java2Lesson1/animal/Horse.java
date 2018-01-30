package Java2Lesson1.animal;

import Java2Lesson1.abilities.Jumpable;
import Java2Lesson1.abilities.Swimable;

public class Horse extends Animal implements Swimable, Jumpable {
    public Horse(String name) {
        this.name = name;
        animType = "Horse";
        onDistance = true;
        maxRunDistance = 10000;
    }

    public void swim(float dist) {
        if (dist < 10) {
            System.out.println(animType + " water ok");
        } else {
            getOutFromDistance("swim");
        }
    }

    @Override
    public void jump(float height) {
        if (height < 1.0f) {
            System.out.println(animType + " jump ok");
        } else {
            getOutFromDistance("jump");
        }
    }

    @Override
    public String toString() {
        return "Horse " + name;
    }
}
