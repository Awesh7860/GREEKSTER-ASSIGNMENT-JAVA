import java.util.Scanner;
public class ODD_EVEN {
    public static void main(String args[]){
        Scanner NUM=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER:");
        int num = NUM.nextInt();
        if(num % 2==0)
            System.out.println(num+" IS A EVEN NUMBER");
        else
        System.out.println(num+" IS A ODD NUMBER");
    }
}
