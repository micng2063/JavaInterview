//  Write a program that prints the numbers from 1 to 100.

//  For multiples of three, print “Fizz” instead of the number
//  For the multiples of five, print “Buzz”.
//  For numbers that are multiples of both three and five, print “FizzBuzz”.

public class FizzBuzz {
    public static void main(String[] args){
        for(int i = 0; i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i + ": FizzBuzz");
            }
            else if (i % 5 == 0 ){
                System.out.println(i + ": Buzz");
            }
            else if (i % 3 == 0){
                System.out.println(i + ": Fizz");
            }
        }
    }
}
