import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class II6_Comparator {
  public static void main(String[] args) {
    Comparator<Integer> comp = new Comparator<Integer>(){
      public int compare(Integer i,Integer j){
        if(i%10>j%10){
          return 1;
        }
        else{
          return -1;
        }
      }
    };

    Comparator<String> comps = new Comparator<String>(){
      public int compare(String i,String j){
        if(i.length()>j.length()){
          return 1;
        }
        else{
          return -1;
        }

      }
    };

    List<String> s = new ArrayList<String>();
    s.add("a");
    s.add("aaaa");
    s.add("aa");
    s.add("ab");
    s.add("aaa");
    System.out.println(s);
    Collections.sort(s,comps);
    System.out.println(s);

    List<Integer> arr = new ArrayList<Integer>();
    arr.add(1);
    arr.add(23);
    arr.add(32);
    arr.add(101);
    System.out.println(arr);

    Collections.sort(arr,comp);
    System.out.println(arr);
  }
}
