import java.util.*;
class Ex9
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two values");
  int a=sc.nextInt();
  int b=sc.nextInt();
  String s=(a>b)?"First number is greater":"Second number is greater";
  System.out.println(s);
 }
}
