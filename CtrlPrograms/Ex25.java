import java.util.*;
class Ex25
{
 public static void main(String args[])
 {
  int digit=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  while(n!=0)
   {
    int r=n%10;
     digit++;
    n=n/10;
   }
  System.out.println(digit);
 }
}
