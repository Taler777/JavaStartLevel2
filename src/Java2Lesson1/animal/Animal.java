package Java2Lesson1.animal;

public abstract class Animal {
    protected String name;
    protected String animType;
    protected boolean onDistance;
    protected float maxRunDistance;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = "Animal";
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void getOutFromDistance(String reason) {
        System.out.println(animType + " " + name + " " + reason + " fail");
        onDistance = false;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(animType + " " + name);
    }

    public void cross(float dist) {
        if (dist < maxRunDistance) {
            System.out.println(animType + " cross ok");
        } else {
            getOutFromDistance("cross");
        }
    }
}
