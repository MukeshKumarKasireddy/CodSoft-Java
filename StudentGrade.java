import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rno,total=0;
        int m[] = new int[5];
        String name;
        float per;
        System.out.println("Enter name of the student: ");
        name = sc.nextLine();
        System.out.println("Enter the student roll number: ");
        rno = sc.nextInt();
        System.out.print("The marks of ");
        for(int i=0;i<m.length;i++){
         System.out.print("subject "+(i+1)+" is ");
         m[i] = sc.nextInt();
         total = total+m[i];
        }
        System.out.println("Total marks obtained by the student is:"+total);
        per = total/5;
        System.out.println("The average percentage is: "+per);
        if(per>=90)
            System.out.println("Student grade is A");
        else if((per>=75)&&(per<90))
            System.out.println("Student grade is B");
        else if((per>=60)&&(per<75))
            System.out.println("Student grade is C");
        else if((per>=45)&&(per<60))
            System.out.println("Student grade is D");
        else if((per>=35)&&(per<45))
            System.out.println("Student grade is E");
        else
            System.out.println("Student is fail");
    }
}