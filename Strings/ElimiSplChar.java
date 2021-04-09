class ElimiSplChar
{
public static void main(String[] args)
{
int count=0;
String str = "gali @ mahesh";
for(int i=0;i<=str.length();i++)
{
str = str.replaceAll("[^a-zA-Z]","");

count++;
}
System.out.println(str);
}
}
