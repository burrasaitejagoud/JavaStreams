package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
*  Given a list of strings , Create a list that contains only integers
*
* Input : String[] s = {"abc","123","456","xyz"}
*
* Output : [123,456]
* */
public class CreateAListFromStringsContainsOnlyIntegers {

    public static void main(String[] args) {

        String[] s = {"abc","123","456","xyz"};

        List<Integer> collect = Arrays.stream(s)
                .filter(x -> x.matches("[0-9]+"))
                .map(Integer::valueOf) //  valueof returns integer object which returns from the specified string
                .collect(Collectors.toList());


        System.out.println(collect);

    }
}
