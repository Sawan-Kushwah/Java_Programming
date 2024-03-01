import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {

        //Question 1
//        byte sub1, sub2, sub3;
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the subject marks : ");
//        sub1 = sc.nextByte();
//        sub2 = sc.nextByte();
//        sub3 = sc.nextByte();
//        float percentage = (sub1 + sub2 + sub3) / 3.0f;
//        if (percentage >= 40 && sub1 > 33 && sub2 > 33 && sub3 > 33) {
//            System.out.println("You are pass!!");
//        } else {
//            System.out.println("you are fail !!");
//        }

        //question 2
//        float salary;
//        float tax = 0;
//        System.out.println("Enter your salary per annum in lakhs : ");
//        salary = sc.nextFloat();
//        if (salary < 2.5f) {
//            tax = tax + 0;
//        } else if (salary >= 2.5f && 5f > salary) {
//            tax = tax + 0.05f * (salary - 2.5f);
//        } else if (salary >= 5f && 10f > salary) {
//            tax = tax + 0.05f * (5f - 2.5f);
//            tax = tax + 0.2f * (salary - 5f);
//        } else {
//            tax = tax + 0.05f * (5f - 2.5f);
//            tax = tax + 0.2f * (10f - 5f);
//            tax = tax + 0.3f * (salary - 10f);
//        }
//        System.out.println("Your total tax paid to govt is : " + tax + " lakhs");


        //question 3
//        System.out.println("Enter a number to know days : ");
//        int number = sc.nextByte();
//        switch (number){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //Question 4
//        System.out.println("Enter the year you wanna check whether it is a leap year or not ? ");
//        int year = sc.nextInt();
//        if(year%4==0){
//            System.out.println("It is a leap year !!");
//        }
//        else{
//            System.out.println("It is not a leap year");
//        }

    //Question 5
        System.out.println("Enter URL: ");
        String url = sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }else if(url.endsWith(".org")){
            System.out.println("This is an Organisational website");
        }else if(url.endsWith(".in")){
            System.out.println("This is an Indian website");
        }


    }
}
