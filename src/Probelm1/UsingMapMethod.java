package Probelm1;
//Importing stream Library to use Stream
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UsingMapMethod
{
    public static void main(String[] args)
    {
        //Declaring object as names for the Stream Interface,Initializing with Stream.of(Values),Values are in string type.
        Stream<String> names = Stream.of("aBc","d","ef");

        // Stream does intermediate operations
        //1. using map method to provide the stream after performing the lambda logic on all the elements in names sequentially
        //2. Converting each element in stream into upper case by calling toUppercase()
        //3. using .toList() to convert a stream returned by  map method into a List.

        System.out.println("\nAfter converting all elements to upper case : " + names.map(String::toUpperCase).toList());
    }

}
