//Collatz sequence
//even: n/2
//odd: 3n+1
//Which starting number, under one million, produces the longest sequence?

public class collatzSequence {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (3 * num) + 1; 
            }
            System.out.println(num);
        } 
    }
}