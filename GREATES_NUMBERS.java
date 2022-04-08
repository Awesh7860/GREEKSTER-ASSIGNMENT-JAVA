import java.util.Scanner;
public class GREATES_NUMBERS {
    public static void main(String args[]){
      Scanner number=new Scanner(System.in);
        System.out.println("ENTER 1st NUMBER:");
        int num1= number.nextInt();
        System.out.println("ENTER 2nd NUMBER:");
        int num2= number.nextInt();
        System.out.println("ENTER 3rd NUMBER:");
        int num3= number.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println(num1+ " IS GREATEST NUMBER");
         else if (num1>num2)
        System.out.println(num2+ " IS GREATEST NUMBER");
         else
        System.out.println(num3+ " IS GREATEST NUMBER");
    }

}
