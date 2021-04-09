import java.util.*;
class ArrayListSwap
{
public static void main(String[] args)
{
ArrayList<String> alist = new ArrayList<String>();
alist.add("Gali");
alist.add("Soma");
alist.add("Naga");
alist.add("Maheswar");
alist.add("Reddy");
System.out.println(alist);

Collections.swap(alist,1,4);
for(String str : alist)
System.out.println(str);
}
}
