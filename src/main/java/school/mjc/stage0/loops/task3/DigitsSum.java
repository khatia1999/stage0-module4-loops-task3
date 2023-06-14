package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t ){

        int sum;

        for(sum = 0; t > 0 ; sum += t % 10, t /= 10){

            System.out.println(sum + t);


        }

    }
}

// Write a program that will find the sum of digits of a given number passed as a method argument.
// There are some tips: if you concatenate int with string you will be able to use string.
// length() and iterate till the end. you shouldn't use other String methods, but length: