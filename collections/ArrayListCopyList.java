import java.util.*;
class ArrayListCopyList
{
public static void main(String[] args)
{
ArrayList alist = new ArrayList();
alist.add("Gali");
alist.add("Soma");
alist.add("Naga");

System.out.println(alist);

List l = new ArrayList();
l.add("Maheswar");
l.add("Reddy");
System.out.println(l);

l.addAll(alist);
System.out.println(l);
}
}
