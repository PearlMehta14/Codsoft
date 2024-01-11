import java.util.*;
public class Grade {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\tSTUDENT GRADE CALCULATOR\t");
        System.out.println("Enter your Name");
        String name=sc.next();
        System.out.println("Enter your Roll No");
        int no=sc.nextInt();
        System.out.println("Enter your marks in English:");
        int eng=sc.nextInt();
        System.out.println("Enter your marks in Maths:");
        int math=sc.nextInt();
        System.out.println("Enter your marks in Science:");
        int sci=sc.nextInt();
        System.out.println("Enter your marks in Hindi:");
        int hind=sc.nextInt();
        System.out.println("Enter your marks in Marathi:");
        int mara=sc.nextInt();
        System.out.println("Enter your marks in Social Science:");
        int ss=sc.nextInt();

        long total=eng+math+sci+hind+mara+ss;
        double avg=total/6;
        String grade;
        if(avg>89)
        {
            grade="A";
        }
        else if(avg>75&&avg<90)
        {
            grade="B";
        }
        else if(avg>65&&avg<55)
        {
            grade="C";

        }
        else if(avg>45&&avg<35)
        {
             grade="D";
        }
        else
        {
            grade="E";
        }
        System.out.println(name+" "+no);
        System.out.println("Total Marks:"+total);
        System.out.println("Average Percentage:"+avg);
        System.out.println("Grade:"+grade);




        sc.close();

    }
    
}
