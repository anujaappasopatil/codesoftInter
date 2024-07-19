import java.util.Scanner;
class Task2
{
    public static void main(String [] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter marks for Subject 1");
        int sub1=s.nextInt();
        System.out.println("enter marks for Subject 2");
        int sub2=s.nextInt(); 
        System.out.println("enter marks for Subject 3");
        int sub3=s.nextInt();
         System.out.println("enter marks for Subject 4");
        int sub4=s.nextInt();
         System.out.println("enter marks for Subject 5");
        int sub5=s.nextInt();
         System.out.println("enter marks for Subject 6");
        int sub6=s.nextInt();
        int total=sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("total marks"+total);
        int S=6;
        float percentage;

        percentage=(float)(total/S);
        System.out.println("percentage:"+percentage);
        if((sub1 >= 40) || (sub2>=40) || (sub3>=40) || (sub4>=40) || (sub5>=40) || (sub6>=40))
              {
                if (percentage>=40)
                {
                    if(percentage>=40 && percentage<=60)
                    {
                        System.out.println("grade : C");
                    }
                    else if (percentage>=61 && percentage<=80)
                    {
                        System.out.println("Grade :B");
                    }
                    else
                    {
                        System.out.println("Grade :A");
                    }
                }
                else{
                    System.out.println("Fail");
                }

                
              }
              else{
                if((sub1 < 40) || (sub2<40) || (sub3<40) || (sub4<40) || (sub5<40) || (sub6<40))
                {
                    System.out.println("Fail in sub");
                }
              }
    }
}