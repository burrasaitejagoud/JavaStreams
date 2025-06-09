package StreamApi;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Given a string , find the first repeated character
 *
 * Input : String s = "Hello World";
 *
 * Output : l
 * */
public class FirstRepeatedCharacter {

    public static void main(String[] args) {


        String s = "Hello World";

        Map<Character, Long> characterLongMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(characterLongMap);


        Character character = characterLongMap.entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(m -> m.getKey())
                .findFirst()
                .get();

        System.out.println(character);


    }
}
