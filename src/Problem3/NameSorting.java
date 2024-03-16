package Problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameSorting
{
    public static void main(String[] args)
    {   //initialing all the 10 student names to the List obj - studentsList
        List<String> studentsList = Arrays.asList("Arun","Bala","Chitra","Dinesh","Elango","Fred","alex","Apj","Anand","Sai");

        // Storing the filtered result into the List obj-nameStartsWithA
        // Passing studentsList as source to stream, stream passes all the elements into filter method sequentially
        // filter provides a reduced stream by using Lambda expression as predicate s -> s.startsWith("A") or  s.startsWith("a")
        // converting output stream into a List using collect(Collectors.toList())

        List<String> nameStartsWithA = studentsList.stream().filter(s -> s.startsWith("A") || s.startsWith("a")).collect(Collectors.toList());

        // Displaying filtered names which starts with letter 'A' and 'a'
        System.out.println("\nThe complete Student Lists are       :" + studentsList);
        System.out.println("Students name starts with Letter 'A' :" + nameStartsWithA);
    }

}
