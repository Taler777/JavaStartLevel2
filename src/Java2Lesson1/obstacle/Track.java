package Java2Lesson1.obstacle;

import Java2Lesson1.Obstacle;
import Java2Lesson1.animal.Animal;

public class Track implements Obstacle {
    private float distance;

    public Track(float distance) {
        this.distance = distance;
    }

    @Override
    public boolean doIt(Animal animal) {
        animal.cross(distance);
        return animal.isOnDistance();
    }
}
