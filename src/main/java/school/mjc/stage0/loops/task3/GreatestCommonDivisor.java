package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int gcd = 1;

        for (int i = 1; i <= first && i <= second; i++){

            if(first % i == 0 && second % i == 0 ){
                gcd = i;

            }
        }

    }
}


// Write a program that will print the
// Greatest Common Divisor (GCD) of two numbers given as method arguments: