import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner career = new Scanner(System.in);
        System.out.print("Choose your career(warrior/mage): ");
        String myCareer = career.nextLine();
        Scanner weapon = new Scanner(System.in);
        if (myCareer.equals("warrior")) {
            System.out.print("Choose your weapon(sword/arrow): ");
            String myWeapon = weapon.nextLine();
            weapon weapon1 = new weapon();
            weapon1.equip(myWeapon);
            System.out.println("career: " + weapon1.useWarrior(myWeapon));
            warrior warrior1 = new warrior();
            System.out.println("base attack: " + warrior1.attack());
            System.out.println("base defense: " + warrior1.defense());
            System.out.println("attack with " + myWeapon + ": " + warrior1.attackWithWeapon(myWeapon));
            System.out.println("defense with " + myWeapon + ": " +warrior1.blockWithWeapon(myWeapon));
        } else {
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
            mage mage1 = new mage();
            System.out.println("base attack: " + mage1.attack());
            System.out.println("base defense: " + mage1.defense());
            System.out.println("attack with " + myWeapon + ": " + mage1.attackWithCastSpell(myWeapon));
            System.out.println("defense with " + myWeapon + ": " + mage1.blockWithArcaneShield(myWeapon));
            System.out.println("attack with " + myRing + " element: " + mage1.attackWithElement(myRing));
        }
    }
}
