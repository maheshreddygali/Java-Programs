import java.util.*;
class Ex12
{
 public static void main(String args[])
 {
  int op=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the operands");
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("Select the operation");
  System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
  int c=sc.nextInt();
  switch(c)
   {
    case 1:op=a+b;
           break;
    case 2:op=a-b;
           break;
    case 3:op=a*b;
           break;
    case 4:op=a/b;
           break;
    default:System.out.println("Entered wrong option");
   }
  System.out.println(op);
 }
}
