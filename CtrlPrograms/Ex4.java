import java.util.*;
class Ex4
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  a=sc.nextInt();
  if(a%3==0 && a%5==0)
    System.out.println("The entered number is divisible by both 3 and 5");
  else
    System.out.println("The entered number is not divisible by both 3 and 5");
 }
}
