package sem2.polymorphism;

public class Hero extends Character {

    @Override
    public void move(){
        System.out.println("Hero Moves swiftly and agilely...");
    }
    public void move (String direction){
        System.out.println("Hero is moving to " + direction);
    }

   
}
