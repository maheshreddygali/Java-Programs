import java.util.*;
import java.io.*;
class ClassProperty
{
public static void main(String[] args) throws Exception
{
Properties prop = new Properties();
prop.setProperty("Name","Mahesh");
prop.setProperty("mail","galimahesh@gmail.com");
prop.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
}
}
