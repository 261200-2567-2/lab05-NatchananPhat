import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner career = new Scanner(System.in);
        System.out.print("Choose your career(warrior/mage): ");
        String myCareer = career.nextLine();
        if (myCareer.equals("warrior")) {
            Scanner weapon = new Scanner(System.in);
            System.out.print("Choose your weapon(sword/arrow): ");
            String myWeapon = weapon.nextLine();
            weapon weapon1 = new weapon();
            weapon1.equip(myWeapon);
            System.out.println("career: " + weapon1.useWarrior(myWeapon));
            System.out.println("base attack: " + character.damage);
            System.out.println("base defense: " + character.defense);
            warrior warrior1 = new warrior();
            System.out.println("attack with " + myWeapon + ": " + warrior1.attackWithWeapon(myWeapon));
            System.out.println("defense with " + myWeapon + ": " +warrior1.blockWithWeapon(myWeapon));
        } else {
            Scanner weapon = new Scanner(System.in);
            System.out.print("Choose your weapon(staff/book): ");
            String myWeapon = weapon.nextLine();
            weapon weapon2 = new weapon();
            weapon2.equip(myWeapon);
            Scanner ring = new Scanner(System.in);
            System.out.println("Choose your ring(earth/water/air/fire): ");
            String myRing = ring.nextLine();
            ring ring1 = new ring();
            ring1.equip(myRing);
            System.out.println("career: " + weapon2.useMage(myWeapon));
            System.out.println("element: " + ring1.useElement(myRing));
            System.out.println("base attack: " + character.damage);
            System.out.println("base defense: " + character.defense);
            mage mage1 = new mage();
            System.out.println("attack with " + myWeapon + ": " + mage1.attackWithCastSpell(myWeapon));
            System.out.println("defense with " + myWeapon + ": " + mage1.blockWithArcaneShield(myWeapon));
            System.out.println("attack with " + myRing + "element: " + mage1.attackWithCastSpell(myRing));
        }
    }
}
