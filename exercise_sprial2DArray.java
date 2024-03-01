import java.util.Scanner;

public class exercise_sprial2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows, col;
        rows = sc.nextInt();
        col = sc.nextInt();
        int[][] numbers = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = col - 1;

        //logic of spiral printing
        System.out.println("spiral form ");
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(numbers[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(numbers[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(numbers[bottom][i] + " ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(numbers[i][left] + " ");
            }
            left++;
        }


    }
}
