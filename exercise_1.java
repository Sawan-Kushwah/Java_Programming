import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);

//        String name;
//        // String as a input
//        System.out.println("Enter your name : ");
//        name = marks.nextLine();
//
//        int eng, math, phy, chem, cse, out1;
//        System.out.println("Marks out of : ");
//        out1 = marks.nextInt();
//        System.out.println("Enter your english marks : ");
//        eng = marks.nextInt();
//        System.out.println("Enter your maths marks : ");
//        math = marks.nextInt();
//        System.out.println("Enter your physics marks : ");
//        phy = marks.nextInt();
//        System.out.println("Enter your chemistry marks : ");
//        chem = marks.nextInt();
//        System.out.println("Enter your computer science marks : ");
//        cse = marks.nextInt();
//        int total = eng + math + phy + chem + cse;
//        int out = out1 * 5;
//        System.out.println("your total marks is : " + total + " out of " + out);
//        double percentage = (double) total / out * 100;
//        System.out.println(name+" percentage is : " + percentage + "%"); //showcasing of percentage
//
//        System.out.println("enter the value in KM : ");
//        int km= marks.nextInt();
//        System.out.println(km +" is equal to "+ km*0.621371+ " miles "); //convert km into miles

        //checking whether it is integer or not
        System.out.println("enter a integer");
        boolean integer = marks.hasNextInt();
        System.out.println(integer);
        int inp = marks.nextInt();
        System.out.println(inp);
    }
}
