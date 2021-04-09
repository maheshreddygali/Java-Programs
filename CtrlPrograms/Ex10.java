import java.util.*;
class Ex10
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter three values");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  String s=(a>b)?((a>c)?"First number is larger":"Third number is larger"):(b>c)?"Second number is larger":"Third number is larger";
  System.out.println(s);
 }
}
