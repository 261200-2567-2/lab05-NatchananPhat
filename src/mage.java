public class mage implements character {
    public int attackWithCastSpell(String weapon){
        if(weapon.equals("staff") || weapon.equals("book")){
            return damage + 10;
        }else{
            return damage - 8;
        }
    }
    public int attackWithElement(String ring){
        if(ring.isEmpty()){
            return  damage - 4;
        }else{
            return damage + 11;
        }

    }
    public int blockWithArcaneShield(String weapon){
        if(weapon.equals("staff") || weapon.equals("book")){
            return defense + 5;
        }else{
            return damage - 2;
        }
    }

    @Override
    public int attack() {
        return damage;
    }

    @Override
    public  int defense(){
        return defense;
    }
}
