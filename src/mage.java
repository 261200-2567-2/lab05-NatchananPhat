public class mage implements character {
    public int attackWithCastSpell(String weapon){
        if(weapon.equals("staff") || weapon.equals("book")){
            return damage + 10;
        }else{
            return damage - 8;
        }
    }
    public int attackWithElement(String ring){
        switch (ring) {
            case "earth" -> System.out.println("Earth attack ");
            case "water" -> System.out.println("Water attack ");
            case "air" -> System.out.println("Air attack ");
            case "fire" -> System.out.println("Fire attack ");
        }
        return damage + 11;
    }
    public int blockWithArcaneShield(String weapon){
        if(weapon.equals("staff") || weapon.equals("book")){
            return defense + 5;
        }else{
            return damage - 2;
        }
    }
}
