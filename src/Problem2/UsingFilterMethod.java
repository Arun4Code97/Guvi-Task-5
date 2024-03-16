package Problem2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFilterMethod
{
    public static void main(String[] args)
    {
        //Declaring lst object for List Interface and initialing values with the Arrays.asList()
        List<String> lst = Arrays.asList("abc","bc","","efg","","dev");
        //List<String> lst = List.of("abc", "bc", "", "efg", "", "dev"); //List.of(elements) also can be used

        //To check the size of lst before applying filter

        System.out.println(lst + "\nBefore passing to filter method,the size is     : " + lst.size());  // output => 6

        // passing lst as source to stream(),where it passes the all the elements in the stream to filter method,returns a stream of elements which only matches the predicate inside its parameter
        // storing the final processed stream of elements into result(List obj) using collect(Collectors.toList())
        List<String> result = lst.stream().filter(s -> !s.isEmpty()).toList();

        System.out.println("After passing to filter method,the size is      : " + result.size());  // output => 4
        System.out.println("The filtered output without any empty elements  : " + result);

    }


}
