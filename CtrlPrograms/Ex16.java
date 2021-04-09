import java.util.*;
class Ex16
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the n value");
  int n=sc.nextInt();
  for(int i=0;i<2*n;i++)
   {
    if(i%2==0)
     System.out.println(i);
   }
 }
}
