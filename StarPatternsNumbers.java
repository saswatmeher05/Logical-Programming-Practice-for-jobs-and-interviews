import java.util.Scanner;

public class StarPatternsNumbers {
    static void print1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5) {
                    System.out.print("*");
                } else {
                    if (i == 1) {
                        if (j == 3)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    if (i == 2) {
                        if (j == 2 || j == 3)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    if (i == 3) {
                        if (j == 1 || j == 3)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    if (i == 4) {
                        if (j == 3)
                            System.out.print("*");

                        else
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void print2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    if (i == 2) {
                        if (j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    if (i == 4) {
                        if (j == 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void print3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("*");
                } else {
                    if (i == 2 || i == 4) {
                        if (j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    } else {
                        if (j == 3 || j == 4 || j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void print4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 2) {
                    if (j == 1 || j == 5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if (i == 3) {
                        System.out.print("*");
                    } else {
                        if (j == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    static void print5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 | i == 5) {
                    System.out.print("*");
                } else {
                    if (i == 2) {
                        if (j == 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    } else {
                        if (j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void print6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    if (i == 2) {
                        if (j == 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    } else {
                        if (j == 1 || j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void print7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1) {
                    System.out.print("*");
                } else {
                    if (j == 5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void print8() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void print9() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    if (i == 2) {
                        if (j == 1 || j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    } else {
                        if (j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void print0() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 0-9 that you want to print:");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                print1();
                break;

            case 2:
                print2();
                break;

            case 3:
                print3();
                break;

            case 4:
                print4();
                break;

            case 5:
                print5();
                break;

            case 6:
                print6();
                break;

            case 7:
                print7();
                break;

            case 8:
                print8();
                break;

            case 9:
                print9();
                break;

            case 0:
                print0();
                break;

            default:
                System.out.println("Invalid Input Please Try Again");
                break;
        }


        // print0();
        // print1();
        // print2();
        // print3();
        // print4();
        // print5();
        // print6();
        // print7();
        // print8();
        // print9();
        // print0();
        sc.close();
    }//main
}//class
