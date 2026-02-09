import java.util.*;

public class GuessGame{
    public static void main(String cals []){
        
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        
        int num = random.nextInt(100) + 1;
        int guess = 0;
        
        while(guess != num){
            System.out.print("Guess a number from 1-100: ");
            guess = s.nextInt();
            
            if(guess == num){
                System.out.println("\nCorrect Guess!");
            }else if(guess > num){
                System.out.println("Guess is too high! ");
            }else{
                System.out.println("Guess is too low! ");
            }
        }
    }
}
