package javaSE.practice.practice6;

import javax.xml.transform.Source;
import java.util.Random;

public class Main {

    /**
     * 逻辑操作符练习
     */
    static void test1() {

        Random random = new Random(47);
        int i = random.nextInt(100);
        int j = random.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));

        // 在java中 把int类型当作boolean类型并不合法
        //- System.out.println("i && j is " + (i && j));
        //- System.out.println("i || j is " + (i || j));
        //- System.out.println("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));

    }

    /**
     * 短路现象
     */
    static boolean test2(int val) {

        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;

    }
    static boolean test2_1(int val) {

        System.out.println("test2_1(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;

    }
    static boolean test2_2(int val) {

        System.out.println("test2_2(" + val + ")");
        System.out.println("result: " + (val < 3));
        return true;

    }

    public static void main(String[] args) {

        //test1();

        boolean b = test2(0) && test2_1(2) && test2_2(3);
        System.out.println("expression is " + b);

    }

}
