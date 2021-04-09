import java.util.*;
class Ex2
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  a=sc.nextInt();
  if(a%2==0)
    System.out.println("The entered number is a EVEN number");
  else
    System.out.println("The entered number is a ODD number");
 }
}
