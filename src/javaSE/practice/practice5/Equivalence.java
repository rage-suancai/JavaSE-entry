package javaSE.practice.practice5;

public class Equivalence {

    static void show1(String desc, Integer n1, Integer n2) {

        System.out.println(desc + ":");
        System.out.printf("%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2));

    }

    static void show2(String desc, Double n1, Double n2) {

        System.out.println(desc + ":");
        System.out.printf("%e==%e %b %b%n", n1, n2, n1 == n2, n1.equals(n2));

    }

}
