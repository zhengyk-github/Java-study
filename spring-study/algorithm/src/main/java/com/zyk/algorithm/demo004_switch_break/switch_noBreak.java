package com.zyk.algorithm.demo004_switch_break;

public class switch_noBreak {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();*/
        int i = 1;
        switch (i) {
            case 1:
                i += 2;
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        }
        System.out.println(i);
    }
}
