package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int sum = 0;

        for(int i = 1; i <= lengthOfLastNumber; i++){

            sum += lengthOfLastNumber; // პირველად იქნება 0+9=9;

            lengthOfLastNumber= lengthOfLastNumber * 10 + 9;

            System.out.println(sum);

       }



    }
}


//Write a program that will display the sum of the series [ 9 + 99 + 999 + 9999 ... n].
// Where n is a number passed as a method argument, n is the last number which consists of "9" n times: