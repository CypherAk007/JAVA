import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class II9_Stream {
  public static void main(String[] args) {
    List<Integer> nums=Arrays.asList(1,2,3,4,5);
    System.out.println(nums);

    Stream<Integer> s1 = nums.stream();
    System.out.println(s1);
    Stream<Integer>s2 = s1.filter(n->n%2==0);
    Stream<Integer>s3 = s2.map(n->n*2);
    int result = s3.reduce(0, (c,e)->c+e);
    System.out.println(result);

    int result1 = nums.stream()
                      .filter(n->n%2==0)
                      .map(n->n*2)
                      .reduce(0,(c,e)->c+e);
                  
    System.out.println(result1);


    // s3.forEach(n->System.out.println(n));





  }
}
