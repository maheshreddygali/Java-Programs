import java.util.*;
class Ex28
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number between 1 and 10");
  int n=sc.nextInt();
  if(n<1 || n>10)
   System.out.println("Enter the number only in the range 1-10");
  else
   System.out.println("The entered number is:"+n);
 }
}
