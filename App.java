package sem2.polymorphism;

public class App {
    public static void main(String[] args) {
        
       
        System.out.println("==== Tugas Polymorphism ====" + "\nSarah Safira Millati" + "\n225150600111028" + "\nPTI-C\n");
        
         //Static Polymorphisme
        System.out.println("==== Static Polymorphism ====");
        Hero hero = new Hero();
        hero.move();
        hero.move("North");

        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(10);

        System.out.println("");
        
        // Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        System.out.println("==== Dynamic Polymorphism =====");

        Character character = new Character();
        character.move(); // Character is moving...

        Character character1 = new Hero();
        character1.move(); // Hero is moving...

        Character character2 = new Enemy();
        character2.move(); // Enemy is moving...

        Character character3 = new Witch();
        character3.move(); // Witch is moving...

        Character character4 = new Fighter();
        character4.move(); // Fighter is moving...

        System.out.println("");

        System.out.println("== Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter =="); 
        Character witch1 = new Witch();

        try {
            ((Fighter) witch1).move();
        } catch (Exception e) {
            System.out.println("Error bestie! " + e.getMessage());
            System.out.println(" \n");
        }
    }
}
