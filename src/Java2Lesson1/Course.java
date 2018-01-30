package Java2Lesson1;

/*Добавить класс Course (полоса препятствий), в котором будут находиться: массив
препятствий, метод который будет просить команду пройти всю полосу;
*/

import Java2Lesson1.animal.Animal;
import Java2Lesson1.obstacle.*;

public class Course {
    Obstacle[] obstacle;

    public Course(Track track, Wall wall, Water water) {
        obstacle = new Obstacle[]{track, wall, water};
    }

    public void doIt(Team team) {
        int j = 0; // счетчик победителей
        for (Animal teamMember : team.member) {
            int i = 0; // счетчик пройденных препятствий

            System.out.println("");
            System.out.println(teamMember.getName() + " lets go:");
            for (Obstacle o : obstacle) { //
                if (o.doIt(teamMember)) i++; // если препятствие успешно пройдено, увеличиваем счетчик
            }
            if (i == obstacle.length) {
                team.winners[j] = teamMember;
                j++;
            }
        }
    }
}
