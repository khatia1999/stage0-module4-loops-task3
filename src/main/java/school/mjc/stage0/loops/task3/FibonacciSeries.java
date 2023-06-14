package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
      int  firstTerm = 0;
      int secondTerm = 1;

        for(int i = 1; i <= lastFibonacci; i++){


            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }
}


//Write a program that will display the first n terms of Fibonacci series, each on new line: