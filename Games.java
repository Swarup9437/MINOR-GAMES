// Pen Paper Scissor G
import java.util.*;
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose yours: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        String [] arr = {"Rock", "Paper", "Scissor" };
        int num = sc.nextInt();
        System.out.println("You: " + arr[num-1]);

        Random randomChoice = new Random();
        int idx = randomChoice.nextInt(3);
        switch (idx) {
            case 0 -> System.out.println("Computer: Rock");
            case 1 -> System.out.println("Computer: Paper");
            case 2 -> System.out.println("Computer: Scissor");
        }

        if (num-1 == idx) System.out.print("Same Pinch");
        if (num == 1 && idx == 1) System.out.print("Computer Win");
        if (num == 1 && idx == 2) System.out.print(" BOOM You Win");
        if (num == 2 && idx == 0) System.out.print(" BOOM You Win");
        if (num == 2 && idx == 2) System.out.print("Computer Win");
        if (num == 3 && idx == 0) System.out.print("Computer Win");
        if (num == 3 && idx == 1) System.out.print(" BOOM You Win");
    }
}
