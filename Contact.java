import java.util.*;
class contact{
public static void main(String[] args)
{
ArrayList <String> con= new ArrayList<String>();
con.add("zhini");
con.add("shafi");
con.add("bava");
con.add("deepika");
con.add("jay");
for(String con1:con)
{
System.out.println("contact list"+con1);
}
System.out.println("Retrieve:"+con.get(3));
System.out.println("Update:"+con.set(4,"Oops"));
System.out.println("Remove:"+con.remove(1));
System.out.println("Final contact list" +con);
}}