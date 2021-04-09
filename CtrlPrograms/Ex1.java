import java.util.*;
class Ex1
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  a=sc.nextInt();
  if(a>0)
    System.out.println("The number is POSITIVE");
  else
    System.out.println("The number is NEGATIVE");
 }
}
