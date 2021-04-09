import java.util.*;
class Ex8
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter one value");
  int a=sc.nextInt();
  System.out.println("Enter another value");
  int b=sc.nextInt();
  if(a>b)
   System.out.println("The first entered number is biggest number");
  else
   System.out.println("The second entered number is biggest number");
 }
}
