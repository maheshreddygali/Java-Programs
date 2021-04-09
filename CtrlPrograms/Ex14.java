import java.util.*;
class Ex14
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter which multiplication table you want");
  int n=sc.nextInt();
  for(int i=1;i<=20;i++)
   System.out.println(n+" * "+i+" = "+n*i);
 }
}

