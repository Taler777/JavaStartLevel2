package Java2Lesson1;


import Java2Lesson1.animal.*;

/**
 * 2. Добавить класс Team, который будет содержать: название команды,
 * массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать),
 * метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации
 * обо всех членах команды.
 */
public class Team {
    private String nameTeam;
    protected Animal member[] = new Animal[4];
    protected Animal winners[] = new Animal[member.length];

    Team(String name) {
        nameTeam = name;
        member[0] = new Cat("Garry");
        member[1] = new Dog("Puppy");
        member[2] = new Duck("Ruby");
        member[3] = new Horse("Bella");
    }

    // метод для вывода информации о членах команды прошедших дистанцию
    public void showResults() {
        System.out.println("\nПрошли полосу препятствий:");
        for (int i = 0; i < winners.length && winners[i] != null; i++) {
            winners[i].info();
        }
    }

    // метод вывода информации обо всех членах команды
    public void showInfoAboutTeam() {
        for (Animal m : member) {
            m.info();
        }
    }
}

