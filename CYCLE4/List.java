import java.util.*;
public class List
{
 public static void main(String[] args)
 {
  System.out.println("Name : Jaison Jacob\nRoll No : 23mca033\nDate : 16/04/2024");
  System.out.println("Program 21 : Program to remove all the elements from a linked list");
  System.out.println("\n___________________________________________________________________\n");
  LinkedList<String> L=new LinkedList<>();
  L.add("java");
  L.add("python");
  L.add("c language");
  L.add("Android");
  System.out.println(L);
  L.remove("c language");
  System .out.println(L);
  L.remove(2);
  System.out.println(L);
  L.removeLast();
  System.out.println(L);
  L.removeFirst();
  System.out.println(L);
  }
  }
  
