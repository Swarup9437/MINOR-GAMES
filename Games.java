// Pen Paper Scissor Game
import java.util.*;
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose yours: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        System.out.println("4. Do it");
        System.out.println("(Choose either 1 or 2 or 3): ");
        String[] arr = {"Rock", "Paper", "Scissor" };
        int num = sc.nextInt();
        if (num > 3) {
            System.out.println("You are out of contest");
        } else {
            System.out.println("You: " + arr[num - 1]);

            Random randomChoice = new Random();
            int idx = randomChoice.nextInt(3);
            switch (idx) {
                case 0 -> System.out.println("Computer: Rock");
                case 1 -> System.out.println("Computer: Paper");
                case 2 -> System.out.println("Computer: Scissor");
            }

            if (num - 1 == idx) System.out.print("Same Pinch");
            else if (num == 1 && idx == 1) System.out.print("Computer Win");
            else if (num == 1 && idx == 2) System.out.print(" BOOM You Win");
            else if (num == 2 && idx == 0) System.out.print(" BOOM You Win");
            else if (num == 2 && idx == 2) System.out.print("Computer Win");
            else if (num == 3 && idx == 0) System.out.print("Computer Win");
            else System.out.print(" BOOM You Win"); // (num == 3 && idx == 1)
        }
    }
}
