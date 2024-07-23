import java.util.*;

public class Task4 {
    int i=0;
    public void question() {
        System.out.println("How many days are there in a week?");
        System.out.println("1. 1 Day");
        System.out.println("2. 5 Days");
        System.out.println("3. 7 Days"); // Correct answer
        System.out.println("4. 3 Days");
    }

    public void check(int no) {
        if (no == 3) {
            System.out.println("Correct!");
            i++;
        } else {
            System.out.println("Incorrect.");
        }
    }


    public void question1() {
        System.out.println("How many hours are there in a week?");
        System.out.println("1. 24 hours");
        System.out.println("2. 12 hours");
        System.out.println("3. 45 hours");
        System.out.println("4. 168 hours"); // Correct answer
    }

    public void check1(int no) {
        if (no == 4) {
            System.out.println("Correct!");
            i++;
        } else {
            System.out.println("Incorrect.");
        }
    }

    public static void main(String[] args) {
        Task4 T = new Task4();
        Scanner s = new Scanner(System.in);

        T.question();
        System.out.println("Enter answer:");
        int no = s.nextInt();
        T.check(no);

        T.question1();
        System.out.println("Enter answer:");
        int no1 = s.nextInt();
        T.check1(no1);

        s.close();
        System.out.println("Your score is "+T.i+ " out of 2");
    }
}
