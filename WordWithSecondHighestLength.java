package StreamApi;
/*
* Given a Sentence, Find the Word that has the 2nd(Nth) Highest length
*
* Input : String s = "I am Learning Streams Api in Java";
*
* Output : Streams
*
* you can also find 3rd 4th...nth using same code
*
* */

import java.util.Arrays;
import java.util.Comparator;

public class WordWithSecondHighestLength {

    public static void main(String[] args) {

        String s = "I am Learning Streams Api In Java";

        String ans = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1).
                findFirst()
                .get();

        System.out.println(ans);
    }


}
