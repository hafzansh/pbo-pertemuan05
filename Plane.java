public class Plane {
    String planetype,difficulty;
    int score,stage,health;


    void print(){
        System.out.println("Current Health : " + health);
        System.out.println("Current Score : " + score);
        System.out.println("Current Stage : " + stage);
    }
    void shoot(){
        System.out.println("Asteroid Destroyed, +20 points");
        score+=20;        
    }

    void hit(){
        System.out.println("You got hit by asteroid, losing 1 point on health");
        health-=1;
    }

    void gameover(){
        System.out.println("Current health is " + health +", game over...");
    }

    void nextstage(){
        stage++;
        System.out.println("Entering stage " + stage);
    }
    
}