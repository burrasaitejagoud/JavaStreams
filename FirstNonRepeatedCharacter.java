package StreamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
*  Given a String , Find the first non-repeated character
*
* Input : String s = "Hello World";
*
* Output : H
*
* */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String s = "Hello World";

/*        String s1 = Arrays.stream(s.split("")).
                filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst()
                .get();

        System.out.println(s1);*/


/*  checking
        int firstocc = s.indexOf("l");
        int lastocc = s.indexOf("l");


        String s2 = Arrays.stream(s.split(""))
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst().
                get();

        System.out.println(firstocc+ " "+lastocc);
*/


        Character character = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() == 1)
                .map(m -> m.getKey())
                .findFirst()
                .get();

        System.out.println(character);


    }

}
