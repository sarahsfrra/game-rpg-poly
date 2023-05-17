package sem2.polymorphism;

public class Enemy extends Character {
    
    @Override
    public void move(){
        System.out.println("Enemy moves randomly and sometimes slowly... ");
    }

    public void move(int step){
        System.out.println("Enemy is moving " + step + " steps");
    }

    
}
