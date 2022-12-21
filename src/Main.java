import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Hero[] heroes = {magic,medic,warrior};
        for (int i = 0; i <3 ; i++) {
       heroes[i].applySuperAbility();
        }
        System.out.println("-----------");
        medic.applySuperAbility();
        System.out.println("на способность медика прибавленно 10% : общий: " + (int) medic.getHealPoints());
    }

}



