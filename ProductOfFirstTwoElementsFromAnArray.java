package StreamApi;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Find the product of the first two elements from an array.
*
* Input : int[] arr = {12,5,6,9,2,4}
*
* Output : 60
*
* */
public class ProductOfFirstTwoElementsFromAnArray {

    public static void main(String[] args) {

        int[] arr = {12,5,6,9,2,4};


        Integer reduce = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .limit(2)
                .reduce(1, (a, b) -> a * b);

        System.out.println(reduce);


    }

}
