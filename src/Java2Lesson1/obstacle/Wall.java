package Java2Lesson1.obstacle;

import Java2Lesson1.Obstacle;
import Java2Lesson1.abilities.Jumpable;
import Java2Lesson1.animal.Animal;

public class Wall implements Obstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable) {
            ((Jumpable) animal).jump(height);
            return animal.isOnDistance();
        } else return false;
    }
}