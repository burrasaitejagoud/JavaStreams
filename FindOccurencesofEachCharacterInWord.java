package StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* Given a word, Find the occurence of each character
*
* Input : String s = "Mississippi";
*
* Output : { p=2,s=4,i=4,m=1 }
*
* */
public class FindOccurencesofEachCharacterInWord {

    public static void main(String[] args) {

        String s = "Mississippi";

        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


    }
}
