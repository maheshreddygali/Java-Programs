import java.util.*;
class ArrayListCompare
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

ArrayList alist2 = new ArrayList();
alist2.add("Gali");
alist2.add("Soma");
alist2.add("Naga");
alist2.add("Maheswar");
alist2.add("Reddy");
System.out.println(alist2);

ArrayList<String> alist3 = new ArrayList<String>();
for(String str : alist)
alist3.add(alist2.contains(str)? "Yes" : "No" );
System.out.println(alist3);

}
}
