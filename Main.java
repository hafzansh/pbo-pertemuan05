public class Main {
    public static void main(String[] args) {
        Plane player = new Plane();
        player.planetype = "Jet";
        player.score = 0;        
        player.health = 3;
        player.stage = 1;

        System.out.println();
        System.out.println("Select Difficulty : Easy, Medium, Hard");
        player.difficulty = "Hard";
        System.out.println(player.difficulty + " Difficulty Selected");
        System.out.println();
        System.out.println("Game Start");
        System.out.println();

        player.shoot();
        player.print();

        System.out.println();

        player.hit();
        player.print();

        System.out.println();

        player.nextstage();
        player.hit();
        player.shoot();
        player.print();

        System.out.println();

        player.hit();
        player.print();
        player.gameover();
    }
}