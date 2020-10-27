//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class problem6 {
    public static int sumOfSqaures(int numOfIterations) {
        int exponent = 0;
        int result = 0;
        
        for(int i = 1; i < numOfIterations; i++) {
            exponent = i * i;
            result += exponent;
        }
        return result;
    }
    
    public static int squareOfSum(int numOfIterations) {
        int sum = 0;
        
        for (int i = 1; i < numOfIterations; i++) {
            sum += i;
        }
        return(sum * sum);
    }
    
    public static void main (String[] args) {
        //Compute the difference between sum of the squares and square of             the sum 
        int a = sumOfSqaures(Integer.parseInt(args[0]));
        int b = squareOfSum(Integer.parseInt(args[0]));
        System.out.println(b - a);
    }
}