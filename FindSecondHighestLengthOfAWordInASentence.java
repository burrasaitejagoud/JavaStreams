package StreamApi;

/*
 *
 * Find the 2nd Highest Length of a word in a sentence
 *
 * Input : String s = "I am Learning Stream Api in java";
 *
 * Output : 7 -> because Stream is second largest word
 *
 * */

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestLengthOfAWordInASentence {

    public static void main(String[] args) {


        String s = " I am Learning Streams Api in java";

        Integer i = Arrays.stream(s.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(i);


    }


}
