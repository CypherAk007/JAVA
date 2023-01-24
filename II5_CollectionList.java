
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class II5_CollectionList {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(6);
    nums.add(7);
    nums.add(4);
    nums.add(5);
    nums.add(7);
    // System.out.println(nums.indexOf(7));    
    // System.out.println(nums.get(4));
    // System.out.println(nums);
    // for(int n : nums){
    //   System.out.println(n);
    // }
    Set<Integer> nums1 = new HashSet<Integer>();
    nums1.add(6);
    nums1.add(7);
    nums1.add(4);
    nums1.add(5);
    nums1.add(7);
    
    for(int n : nums1){
      System.out.println(n);
    }

    Map<String,Integer> students = new HashMap<>();
    students.put("n",5);
    students.put("k",6);
    students.put("a",10);
    students.put("h",11);
    System.out.println(students);
    System.out.println(students.keySet());

    for(String key: students.keySet()){
      System.out.println(key+": "+students.get(key));
    }


  }
}
