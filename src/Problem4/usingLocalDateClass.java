package Problem4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class usingLocalDateClass
{
    public static void main(String[] args)
    {
        //Scanner to collect the user entered input
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd)  : ");
        //Storing entered input as String
        String dob = reader.nextLine();

        //using .split method to store year,month,day separately as int type
        String[] splitArr = dob.split("-");
        int year = Integer.parseInt(splitArr[0]);
        int month = Integer.parseInt(splitArr[1]);
        int day = Integer.parseInt(splitArr[2]);


        LocalDate today = LocalDate.now(); // to get today date using LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(year,month,day); // to set date of birth without any Time zone format

        Period period = Period.between(dateOfBirth,today); // to calculate the duration since Date of birth

        // .getYears() --> provides years duration
        // .getMonths() --> provides months duration
        // .getDays()  -- > provides days duration
        System.out.println("Your age is : " + period.getYears() +" years "+ period.getMonths() + " months " + period.getDays() + " days");


    }
}
