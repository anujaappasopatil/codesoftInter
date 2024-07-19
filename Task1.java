import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Random rand =new Random();
        int rand1=rand.nextInt(100);
        System.out.println("let start game:");
        int i;
        for (i=1;i<=10;i++)
        {
            System.out.println("enter user number");
            int number=s.nextInt();
            if(number == rand1)
            {
                System.out.println("both number are same");
                System.out.println("you win the game");
                break;
            }
            else if ( number< rand1)
            {
                System.out.println("number is small");
            }
            else
            {
                System.out.println("number is big");
            }

        }
        if(i==10)
        {
            System.out.println("Score:"+i);
        }
        else{
            System.out.println("Score:"+i);
        }
      
    }
}
