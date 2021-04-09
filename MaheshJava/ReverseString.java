import java.util.*;
class ReverseString {
public static void main(String[] args)
{
String input = "gali mahesh";
char[] char1 = input.toCharArray();
for (int i = char1.length - 1; i >= 0; i--)
System.out.println(char1[i]);
}
}
