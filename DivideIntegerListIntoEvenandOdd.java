package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Given a list of integers, divide it into two lists one having even and other having an odd numbers
 *
 * Input : int[] arr = [1,2,3,4,5,6,7,8,9}
 *
 * Output : [[1,3,5,7,9],[2,4,6,8]]
 *
 * */
public class DivideIntegerListIntoEvenandOdd {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        List<Integer> integerList = Arrays.stream(arr)
                .boxed() // converts primitive integer to objects
                .collect(Collectors.toList());

        System.out.println(integerList);


        Map<Boolean, List<Integer>> collect = integerList.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));

        System.out.println(collect);


        List<List<Integer>> collect1 = integerList.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet()
                .stream()
                .map(x -> x.getValue())
                .collect(Collectors.toList());

        System.out.println(collect1);

        // we can write partitoning by inplace of grouping by still it works


    }
}
