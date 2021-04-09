import java.util.*;
class Ex3
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any year");
  a=sc.nextInt();
  if(a%100==0 && a%400==0 || a%100!=0 && a%4==0)
    System.out.println("The entered year is LEAP year");
  else
    System.out.println("The entered year is not a LEAP year");
 }
}
