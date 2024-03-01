import java.util.Scanner;

public class exercise_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem 1
//        float [] number = new float[5];
//        number[0]=1.1f;
//        number[1]=2.1f;
//        number[2]=3.1f;
//        number[3]=4.1f;
//        number[4]=5.1f;
//        float sum=0f ;

//        for (float element:number){
//            System.out.println("Printing array element: ");
//            System.out.println(element);
//                sum += element;
//        }

//        for(int i = 0; i <number.length; i++){
//            System.out.println(number[i]);
//            sum += number[i];
//        }
//        System.out.println("the sum is : " +sum);

        // Problem 2
//        int[] number = {2, 5, 7, 12, 4, 77};
//        int check_number = 4;
//        boolean isInArray = false;
//        for (int element : number) {
//            if (check_number == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("This element is present in array ");
//        } else {
//            System.out.println("This element is not present in array ");
//        }

        //problem 3
//        int []marks={78,98,78,44,23,88};
//        int sum=0;
//        for (int element: marks){
//            sum+=element;
//        }
//        float avg =(float) sum/marks.length;
//        System.out.println(avg);

        //problem 4
//        int[][] matrix_1 = {{2, 8, 3},
//                {2, 3, 4}};
//        int[][] matrix_2 = {{2, 8, 3},
//                {2, 3, 4}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//        for (int i = 0; i < matrix_1.length; i++) {
//            for (int j = 0; j < matrix_1[i].length; j++) {
//                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
//            }
//        }
//        for (int i = 0; i < matrix_1.length; i++) {
//            for (int j = 0; j < matrix_1[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

        //Problem 5
//        int[] array = {3, 6, 1, 8, 9,4,365,54};
//        System.out.println("Printing array before reversing");
//        for (int j : array) {
//            System.out.print(j + " ");
//        }
//        //Logic of reversing
//        int temp;//temp variable used for swapping
//        int n = array.length -1 ;//size of array
//        for (int i = 0; i <= n / 2; i++) {
//            temp = array[i];
//            array[i] = array[n - i];
//            array[n - i] = temp;
//        }
//        System.out.println("\nPrinting array after reversing");
//        for (int k : array) {
//            System.out.print(k + " ");
//        }

        //problem 6 max element in array
//        int[] array = {3, 6, 1, 8, 9,4,365,54};
//        int max = 0 ;
//        for (int element : array){
//            if(element>max){
//                max = element;
//            }
//        }
//        System.out.printf("the maximum number is %d" ,max);

        //problem 7 max element in array
//        int[] array = {3, 6, 1, 8, 9,4,365,54};
//        int min =Integer.MAX_VALUE;
//        for (int element : array){
//            if(element<min){
//                min = element;
//            }
//        }
//        System.out.printf("the maximum number is %d" ,min);

        // Problem 8 is shorted
//        boolean isShorted = true;
//        int[] array = {2,3,4,5,6,7,8};
//        for (int i = 0 ; i < array.length-1;i++){
//            if (array[i]>array[i+1]){
//                isShorted=false;
//                break;
//            }
//        }
//        if (isShorted){
//            System.out.println("Array is shorted in ascending order");
//        }else{
//            System.out.println("Array is un-shorted in ascending order");
//        }


    }
}
