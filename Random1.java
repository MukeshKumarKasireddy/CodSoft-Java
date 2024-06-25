import java.util.*;
import java.lang.*;
public class Random1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rndm = new Random();
        int r = rndm.nextInt(100)+1;
        int i;
        System.out.println("The random number is "+r);
        System.out.println("Enter a number to guess: ");
        i = sc.nextInt();
        if(i==r)
            System.out.println("Great!! \nYou have guessed correct number");
        else if(i>r)
            System.out.println("You have guessed larger number");
        else
            System.out.println("you have guessed  smaller number");
    }

}
