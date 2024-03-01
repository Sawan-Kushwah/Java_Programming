public class exercise_pattern {
    public static void main(String[] args) {
        // pattern 1 solid rectangle
//         for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //pattern 2 hollow rectangle
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i == 1 || j == 1 || i == 4 || j == 5) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }

        //problem 3 half pyramid up down
//        for (int i = 4; i >=1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // problem 4 pyramid 180 rotate
//        for (int i = 1; i < 4; i++) {
//            for (int j = i; j <= 4; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j < 4; j++) {
//                System.out.print("* ");
//            }
//            for (int j = i; j <= 4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // problem 5 half pyramid with number + floyd's
//        int k = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {//we can reverse by 5 - i + 1
//                System.out.print(k + " "); //print j for another pattern
//                k++;
//            }
//            System.out.println();
//        }

        // problem 6 triangle 0 1
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print("1" + " ");
//                } else {
//                    System.out.print("0" + " ");
//                }
//            }
//            System.out.println();
//        }

        // Problem 10 Butterfly pattern
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("    ");
            }
//            for (int j = i; j < n; j++) {
//                System.out.print("  ");
//            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = i; j < n; j++) {
//                System.out.print("    ");
//            }
////            for (int j = i; j < n; j++) {
////                System.out.print("  ");
////            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("    ");
//            }
////            for (int j = 1; j < i; j++) {
////                System.out.print("  ");
////            }
//            for (int j = i; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Problem 11 solid rhombus
//        for (int i = 1; i <= 5; i++) {
//            for (int j = i; j <= 5; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 5; j++) {// Hollow rhombus
//                if (i == 1 || i == 5 || j == 5 || j == 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //problem 12 number pyramid
//        for (int i = 1 ; i <=5; i++){
//            for(int j = i; j<=5; j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j<=i; j++){
//                System.out.print(" " + i + " ");
//            }
//            System.out.println();
//        }

    }
}
