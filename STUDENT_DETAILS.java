import java.util.Scanner;
public class STUDENT_DETAILS {
public static  void main(String args[]){
    Scanner STUDENT=new Scanner(System.in);
    System.out.println("ENTER NAME OF THE STUDENT: ");
    String name= STUDENT.next();
    System.out.println("ENTER ROLL NO OF THE STUDENT: ");
    int roll= STUDENT.nextInt();
    System.out.println("ENTER MARKS IN ENGLISH: ");
    int eng= STUDENT.nextInt();
    System.out.println("ENTER MARKS IN MATH: ");
    int math= STUDENT.nextInt();
    System.out.println("ENTER MARKS IN PHYSICS: ");
    int phy= STUDENT.nextInt();
    System.out.println("ENTER MARKS IN CHEMESTRY: ");
    int chem= STUDENT.nextInt();
    System.out.println("ENTER MARKS IN BIOLOGY: ");
    int bio= STUDENT.nextInt();
    int total=eng+math+phy+chem+bio;
    float percent=(float)total/500*100;
    System.out.println("NAME OF THE STUDENT: " +name);
    System.out.println("ROLL NO OF THE STUDENT: " +roll);
    System.out.println("MARKS IN EACH SUBJECTS: ");
    System.out.println("ENGLISH: " +eng);
    System.out.println("MATH: " +math);
    System.out.println("PHYSICS: " +phy);
    System.out.println("CHEMESTRY: " +chem);
    System.out.println("BIOLOGY: " +bio);
    System.out.println("TOTAL MARKS: " +total);
    if(percent>=60)
        System.out.println("FIRST DIVISSION");
    else if (percent>=30&&percent<60)
        System.out.println("PASS");
    else
        System.out.println("FAIL");
}
}
