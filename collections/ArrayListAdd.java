import java.util.*;
class ArrayListAdd
{
public static void main(String[] args)
{
ArrayList alist = new ArrayList();
alist.add("Gali");
alist.add("Soma");
alist.add("Naga");
alist.add("Maheswar");
alist.add("Reddy");
System.out.println(alist);
alist.remove("Reddy");
System.out.println(alist);
alist.add(4,"Reddy");
System.out.println(alist);
}
}
