package Java2Lesson1.obstacle;

import Java2Lesson1.Obstacle;
import Java2Lesson1.abilities.Swimable;
import Java2Lesson1.animal.Animal;

public class Water implements Obstacle {
    private float length;

    public Water(float length) {
        this.length = length;
    }

    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Swimable) {
            ((Swimable) animal).swim(length);
            return animal.isOnDistance();
        } else return false;
    }
}
