import java.util.Scanner;

public class exercise_matrix_multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n, p, q;
        int sum = 0;
        System.out.println("Enter the rows and column of first matrix : ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter the rows and column of Second matrix : ");
        p = sc.nextInt();
        q = sc.nextInt();
        int[][] first_matrix = new int[m][n];
        int[][] second_matrix = new int[p][q];
        int[][] resultant_matrix = new int[m][q];

        //Taking input of first matrix
        if (n == p) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter the " + i + " " + j + " element of first matrix");
                    first_matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Your first matrix is : ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(first_matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Taking input of second matrix
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.println("Enter the " + i + " " + j + "element of second matrix");
                    second_matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Your Second matrix is : ");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(second_matrix[i][j] + " ");
                }
                System.out.println();
            }

            //Logic of matrix multiplication
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += first_matrix[i][k] * second_matrix[k][j];
                    }
                    resultant_matrix[i][j] = sum;
                }
            }
            System.out.println("Matrix multiplication is ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(resultant_matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not Possible \nColumn of first matrix is not equal to Rows of second matrix ");
            System.out.println(n + " != " + p);
        }


    }
}
