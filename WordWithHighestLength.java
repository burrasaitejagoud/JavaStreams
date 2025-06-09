package StreamApi;

/*
 *  Given a Sentence , Find the word that has highest length.
 *
 * Input : String s = "I am learning streams Api in java";
 * Output : learning
 *
 * */

import java.util.Arrays;
import java.util.Comparator;

public class WordWithHighestLength {

    public static void main(String[] args) {

        String s = "I am learning streams api in java";


        String ans = Arrays.stream(s.split(" "))   //Converting string into array based on space
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(ans);


    }

}
