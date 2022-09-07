package javaSE.practice.practice4;

/**
 * 自动递增递减练习
 */
public class Main {

    public static void main(String[] args) {

        int i = 1;

        System.out.println("i: " + i);
        System.out.println("i: " + ++i); // 前缀递增
        System.out.println("i: " + i++); // 后缀递增

        System.out.println("=========");

        System.out.println("i: " + i);
        System.out.println("i: " + --i); // 前缀递减
        System.out.println("i: " + i--); // 后缀递减
        System.out.println("i: " + i);

    }

}
