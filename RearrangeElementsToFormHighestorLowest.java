package StreamApi;
/*
* Given an Int[] array , Rearrange the elements to form highest/Lowest possible value
*
* Input : int[] arr = {1,2,3,4,5};
*
* Output : 54321/12345
*
* */

import java.util.Arrays;
import java.util.Collections;

public class RearrangeElementsToFormHighestorLowest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Arrays.stream(arr).mapToObj(x->x).sorted().forEach(System.out::print);

        Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::print);


    }
}
