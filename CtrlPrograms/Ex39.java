import java.util.*;
class Ex39
{
 public static void main (String args[])
 {
  int flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  for(int i=2;i<=n/2;i++)
   {  
    if(n%i==0)
     flag=1;
   }
  if(flag==1)
     System.out.println("The entered number is a NOT PRIME number");
  else
     System.out.println("The entered number is PRIME number");
 }
}
