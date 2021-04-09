import java.util.*;
class Ex34
{
 public static void main(String args[])
 {
  int max=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  while(n!=0)
   {
    int r=n%10;
    if(r>max)
     max=r;
    n=n/10;
   }
  System.out.println("The biggest digit is:"+max);
 }
}
