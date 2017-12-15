
package verlierer;
 
import java.util.Random;

public class PointSystem {

  
    public static void main(String[] args) {
        int freeSkateScore = highScore(200);
        System.out.print(" ");
        int shortProgramScore = lowScore(100);

        
    }
    
    public static int highScore(int numSides) {
        Random randomInts = new Random();
        int side = randomInts.nextInt();
        int remainder = Math.abs(side) % numSides;
        if(remainder < 30){
            System.out.print(remainder + 120);
                    return remainder;
        }
        else if(remainder < 100){
            System.out.print(remainder + 90);
                    return remainder;}
        
        else if(remainder < 130){
            System.out.print(remainder + 70);
                    return remainder;
        }
        else if(remainder < 150){
            System.out.print(remainder + 10);
                    return remainder;    
        }
        System.out.println(remainder);
        return remainder;
      }
    public static int lowScore(int numSides) {
        Random randomInts = new Random();
        int side = randomInts.nextInt();
        int remainder = Math.abs(side) % numSides;
        if(remainder < 20){
            System.out.print(remainder + 60);
                    return remainder;
        }
        else if(remainder < 40){
            System.out.print(remainder + 40);
                    return remainder;  
        }
        System.out.println(remainder);
        return remainder;
      }
    
}
/*max short = 100
max free = 200 */