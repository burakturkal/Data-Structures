/*
This calculates the execution time.
Every computer will have different execution time. That means, this is not a
good way to decide whether this algorithm or not. Instead, we need to check
the number of operations.
 */

public class TimeTest {
    public static void main(String[] args) {
        int n=10000;
        long startTime=System.currentTimeMillis();
        int numberOfOperations=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) numberOfOperations++;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Number of Operations is = "+ numberOfOperations + " in "+ (endTime-startTime)+" milisecs");
    }
}
