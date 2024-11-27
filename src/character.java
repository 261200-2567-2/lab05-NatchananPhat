public interface character {
    int damage = 12;
    int defense = 4;

    default int attack(){
        return damage;
    }
    default int defense(){
        return defense;
    }

}
