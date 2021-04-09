import java.util.*;
class Ex5
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Maths marks");
   int m=sc.nextInt();
   System.out.println("Enter Physics marks");
   int p=sc.nextInt();
   System.out.println("Enter Chemistry marks");
   int c=sc.nextInt();
   if(m>=40 && p>=40 && c>=40)
   {
    System.out.println("The Student is PASSED");
    int total=m+p+c;
    System.out.println("The total marks obtained is :"+total);
    float perc=(total*100)/300;
    System.out.println("The percentage obtained is :"+perc);
    if(perc>=90)
     System.out.println("The student's grade is A");
    else if(perc>=80 && perc<90)
     System.out.println("The student's grade is B");
    else if(perc>=70 && perc<80)
     System.out.println("The student's grade is C");
    else if(perc>=60 && perc<70)
     System.out.println("The student's grade is D");
   }
   else
    System.out.println("The Student is FAILED");
  }
}
