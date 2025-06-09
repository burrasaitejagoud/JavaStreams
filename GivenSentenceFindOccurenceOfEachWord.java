package StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
 * Given a Sentence , Find Occurence of each Word
 *
 * Input : String s = " I am learning Stream Api in java java";
 *
 * output : { Java = 2 , in = 1, Api = 1, Learning = 1 , am = 1, Streams = 1 }
 *
 * */
public class GivenSentenceFindOccurenceOfEachWord {

    public static void main(String[] args) {

        String s = "I am learning Streams Api in java java";

        Map<String, Long> collect = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> collect1 = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect);
        System.out.println(collect1);

    }
}
