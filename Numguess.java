import java.util.*;
public class Numguess {
   
   
     
     public static void main(String args[])
    {   
         Scanner sc=new Scanner(System.in);
         int score=0;
         System.out.println("      NUMBER GUESSING GAME     ");
        System.out.println("How many rounds you want to play?");
        int rounds=sc.nextInt();
        for(int k=0;k<rounds;k++)
        {
        System.out.println("ROUND "+k+1);
        
        
        int randomnum=(int)(100 * Math.random());
        
        System.out.println("A number is generated between 1 to 100");

       System.out.println( "Guess the number in 4 trials.");
        for(int i=0;i<4;i++)
        {
            System.out.println("Guess the number:");
            int guess=sc.nextInt();
            if(guess==randomnum)
            {
                System.out.println("You hve guess the right number");
                score=score+10;
            }
            else if(guess>randomnum)
            {
                System.out.println("Guess is too high ");
            }
            else if(guess<randomnum)
            {
                System.out.println("Guess is too low ");
            }
        }
        System.out.println("The number was "+randomnum);
        
    }
    System.out.println("Your final Score is "+score);
    sc.close();
        }
        
    }

