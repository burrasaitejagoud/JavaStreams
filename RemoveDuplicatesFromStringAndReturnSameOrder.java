package StreamApi;

/*
* Remove Duplicates from the String and return in the same order
*
* Input : String s = "dabcadefg";
* Output : dabcefg
*
* */

import java.util.Arrays;

public class RemoveDuplicatesFromStringAndReturnSameOrder {

    public static void main(String[] args) {


        String s = " dabcadefg";


        s.chars() // This converts String to intstream
                .distinct()
                .mapToObj(c->(char)c)// Converts again back to Character
                .forEach(System.out::print);


        Arrays.stream(s.split(" ")).distinct().forEach(System.out::print);


    }


}
