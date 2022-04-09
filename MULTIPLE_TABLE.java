import java.util.Scanner;
public class MULTIPLE_TABLE {
    public static void main(String args[]){
    Scanner NUM=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int num=NUM.nextInt();
        System.out.println("MULTIPLE TABLE OF "+num);
        for (int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
