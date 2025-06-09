package StreamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/*
* Given an array of integers , group the numbers by the range in which they belong
*
*
* Input : int[] arr = {2,3,10,14,20,24,30,34,40,44,50,54}
*
* Output : {0=[2,3],10=[10,14],20=[20,24],30=[30,34],40=[40,44],50=[50,54]}
* */
public class GroupingTheNumbersByRangeTheyBelong {

    public static void main(String[] args) {

        int[] arr = {2,3,10,14,20,24,30,34,40,44,50,54};

        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(collect);

        LinkedHashMap<Integer, List<Integer>> collect1 = collect.stream()
                .collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new, Collectors.toList()));


        System.out.println(collect1);
    }



}
