import java.util.*;
class ArrayListSort
{
public static void main(String[] args)
{
ArrayList<String> alist = new ArrayList<String>();
alist.add("Gali");
alist.add("Soma");
alist.add("Naga");
alist.add("Maheswar");
alist.add("Reddy");
Collections.sort(alist);

for(String str : alist)
{
System.out.println(str);
}
}
}
