package StreamApi;

import java.util.Arrays;

/*
* Given a sentence , Find the Words with  a specified number of vowels
*
* Input : String s = "I am Learning Streams Api in java";
*
* Output : Streams
*           Api                      // we should print the word with 2 number of vowels
*           Java
* */
public class FindWordsWithSpecifiedNumberofVowels {


    public static void main(String[] args) {

        String s = "I am Learning Streams Api in java";


        Arrays.stream(s.split(" "))
                .filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);

    }
}
