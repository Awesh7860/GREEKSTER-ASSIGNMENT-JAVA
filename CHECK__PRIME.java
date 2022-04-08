import java.util.Scanner;
public class CHECK__PRIME {
    public static void main(String args[]){
       int count=0;
        Scanner Number=new Scanner(System.in);
        System.out.println("ENTER  A NUMBER");
        int num = Number.nextInt();
        for (int i=1;i<=num;i++)
        {
            if(num%i==0){
                count++;
            }
        }
            if(count==2)
                System.out.println(num+" IS A PRIME NUMBER");
             else
                System.out.println(num+" IS A NON PRIME NUMBER");

    }
}
