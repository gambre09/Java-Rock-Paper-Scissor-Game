import java.util.Random;
import java.util.Scanner;

public class RPSgame {
    public static void main(String[] args) {
        /*
        1-Rock
        2-Paper
        3-Scissor
          */
        System.out.println("Welcome Lets Play \n 1-Rock\n 2-Paper\n 3-Scissor\n");
        System.out.print("Choose your number: ");
        Scanner sc = new Scanner(System.in);
        int User = sc.nextInt();
        Random rnd = new Random();
        int computer = rnd.nextInt(1,4);

        if (User>=1&&User<=3){
            System.out.print("My Pick: ");
            System.out.println(computer);
            if (User==1&&computer==3 || User==2&&computer==1 || User==3&&computer==2){
                System.out.println("You Win!!!");
            } else if (User==1&&computer==2 || User==2&&computer==3 || User==3&&computer==1) {
                System.out.println("You Lose!!!");
            }else {
                System.out.println("TIE!!!");
            }
        }else {
            System.out.println("Incorrect Option!!!");
        }
    }
}
