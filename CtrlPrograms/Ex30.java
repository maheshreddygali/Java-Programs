import java.util.*;
class Ex30
{
 public static void main(String args[])
 {
  //String n,r="";
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any value");
  int n=sc.nextInt();
  //int l=n.length();
  int temp=n;
  while(n!=0)
   {
    int r=n%10;
    sum=(sum*10)+r;
    n=n/10;
   }
  if(sum==temp)
   System.out.println("Entered is a PALINDROME");
  else
   System.out.println("Entered is NOT PALINDROME");
 }
}
