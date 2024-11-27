public class warrior implements character {
    public int attackWithWeapon(String weapon){
        if(weapon.equals("sword") || weapon.equals("arrow")){
            return damage + 12;
        }else{
            return damage - 2;
        }
    }
    public int blockWithWeapon(String weapon){
        if(weapon.equals("sword") || weapon.equals("arrow")){
            return defense + 4;
        }else{
            return defense;
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
