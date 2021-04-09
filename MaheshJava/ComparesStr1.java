class ComparesStr1
{
public static void main(String[] args)
{
String s1 = new String("mahesh");
String s2 = new String("mahesh");
System.out.println(s1==s2);

String s3 = "mahesh";
System.out.println(s1==s3);

String s4 = "mahesh";
System.out.println(s3==s4);

String s5 = "mahe" + "sh";
System.out.println(s4==s5);

String s6 = "mahe";
String s7 = s6 + "sh";
System.out.println(s4==s7);
}
}
