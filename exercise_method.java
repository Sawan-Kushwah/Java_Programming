import java.util.*;

public class exercise_method {
    public static float average(int... arr) {
        //Available as int [] arr;
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        return (float) sum / arr.length;
    }

    public static int sumOfOddNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int maximumOfTwoNumber(int a, int b) {
        return a > b ? a : b;
    }

    public static float circumferenceOfCircle(int radius) {
        return 2 * 3.14f * radius;
    }

    public static void voteDecision(int age) {
        if (age > 18) {
            System.out.println("You can vote !!");
        } else {
            System.out.println("You are a kid(piddi kahi ka)");
        }
    }

    public static int power(int number, int numberOfTimes) {
        int product = 1;
        for (int i = 1; i <= numberOfTimes; i++) {
            product *= number;
        }
        return product;
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void countOfNumber(int[] number) {
        int countOfZeros = 0;
        int countOfPositive = 0;
        int countOfNegative = 0;
        for (int element : number) {
            if (element > 0) {
                countOfPositive++;
            } else if (element < 0) {
                countOfNegative++;
            } else {
                countOfZeros++;
            }
//            System.out.println(element);
        }
        System.out.println("Positive number : " + countOfPositive);
        System.out.println("Negative number : " + countOfNegative);
        System.out.println("Zeros number : " + countOfZeros);
    }

    public static int HCF(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
            return num1;
    }

    public static float celsiusToFahrenheit(int celsius){
        return (celsius * 9/5f) + 32 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for problem 1
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.printf("Average of %d %d %d is %f", a, b, c, average(a, b, c));

        // problem 2
//        int n = 10;
//        System.out.println("the sum is " + sumOfOddNumber(n));

        // problem 3
//        System.out.printf("the maximum of 100 and 34 is  %d" ,maximumOfTwoNumber(100,34));

        // problem 4
//        System.out.println("Circumference of circle with radius 7 is " + circumferenceOfCircle(7));

        //problem 5
//        System.out.println("enter your age");
//        int age = sc.nextInt();
//        voteDecision(age);

        // problem 8
//        System.out.println(power(2, 4)); // we can also use pow function from math library

        // problem 10
//        int n = 5;
//        for (int i= 0; i<=n; i++){
//            System.out.print(fib(i) + " ");
//        }

        //problem 7
//        int [] number ={2,5,33,3,0,-2,44,-5,6,-4}; // just for checking function
//        String s;
//        System.out.println("enter how many you want");
//        int n = sc.nextInt();
//        int [] number = new int[n];
//        System.out.println("enter number : ");
//        for (int i = 0; i < n ; i ++){
//            number[i] = sc.nextInt();
//        }
//        countOfNumber(number);


        //problem 9
//        System.out.println(HCF(80, 12));

        // problem 11
        System.out.println(celsiusToFahrenheit(76));
    }
}
