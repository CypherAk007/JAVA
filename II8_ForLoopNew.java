import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class II8_ForLoopNew {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    nums=Arrays.asList(1,2,3,4,5);
    System.out.println(nums);

    for(int i=0;i<nums.size();i++){
      System.out.println(nums.get(i));
    }

    for(int n:nums){
      System.out.println(n);
    }

    nums.forEach(n->System.out.println(n));
  }
}
