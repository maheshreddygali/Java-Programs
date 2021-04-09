import java.util.*;
class Ex32
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter which multiplication table you want");
  int n=sc.nextInt();
  int i=1;
  do
   {
    System.out.println(n+" * "+i+" = "+n*i);
    i++;
   }while(i<=20);
 }
}

