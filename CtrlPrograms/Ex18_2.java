import java.util.*;
class Ex18_2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the n value");
  int n=sc.nextInt();
  int i=0;
  do
   {
    if(i%2==0)
     System.out.println(i);
    i++;
   }while(i<=n);
 }
}
