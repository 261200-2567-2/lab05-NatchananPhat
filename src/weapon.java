public class weapon implements accessories{
    @Override
    public void equip(String weapon) {
        switch(weapon){
            case "sword" -> System.out.println("you use a sword");
            case "arrow" -> System.out.println("you use a arrow");
            case "staff" -> System.out.println("you use a staff");
            case "book" -> System.out.println("you use a book");
        }
    }
    public String useWarrior(String weapon){
        if(weapon.equals("sword")){
            return "you are swordsman";
        }else if(weapon.equals("arrow")){
            return "you are archer";
        }else{
            return "you don't have a special career";
        }
    }
    public String useMage(String weapon){
        if(weapon.equals("staff")){
            return "you are witch";
        }else if(weapon.equals("book")){
            return "you are magician";
        }else{
            return "you don't have a special career";
        }
    }
}
