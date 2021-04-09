import java.util.*;
class Ex7
{
 public static void main(String args[])
 {
  int x,y;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the X value");
  x=sc.nextInt();
  System.out.println("Enter the Y value");
  y=sc.nextInt();
  if(x==0 && y==0)
   System.out.println("The coordinate lies on origin");
  else if(x==0 && y!=0)
   System.out.println("The coordinate lies on Y-axis");
  else if(x!=0 && y==0)
     System.out.println("The coordinate lies on X-axis");
  else
    System.out.println("The coordinate does not lie on any axis");
 }
}
