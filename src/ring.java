public class ring implements accessories {
    @Override
    public void equip(String ring) {
        if(ring.equals("earth")||ring.equals("water")||ring.equals("air")||ring.equals("fire")){
            System.out.println("you have your element");
        }
    }
    public String useElement(String ring) {
        return switch (ring) {
            case "earth" -> "you have the earth element";
            case "water" -> "you have the water element";
            case "air" -> "you have the air element";
            default -> "you have the fire element";
        };
    }
}
