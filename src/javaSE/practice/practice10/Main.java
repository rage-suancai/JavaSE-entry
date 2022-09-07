package javaSE.practice.practice10;

import java.util.Random;

/**
 * 控制语句练习
 */
public class Main {

    /**
     * if-else练习
     */
    static int result = 0;
    static void IfElse(int testval, int target) {

        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0;

    }

    /**
     * 迭代语句(while, do-while)练习
     * @return
     */
    static boolean condition() {

        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;

    }

    /**
     * for练习
     */
    static void ListCharacters() {

        for (char c = 0; c < 128; ++c)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int)c + " character: " + c);

    }
    static void CommaOperator() {

        for (int i = 1, j = i + 10; i < 5; ++i, j = i  * 2)
            System.out.println("i = " + i + " j = " + j);

    }
    static void ForInFloat1() {

        Random random = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; ++i)
            f[i] = random.nextFloat();
        for (float x : f) // for-in
            System.out.println(x);
        for (char c : "An African Swallow".toCharArray())
            System.out.print(c);

    }
    /**
     * return练习
     */
    static int TestWithReturn(int testval, int target) {

        if (testval > target)
            return +1;
        if (testval < target)
            return -1;
        return 0;

    }

    /**
     * 带标签的break和continue练习
     */
    static void LabeledFor() {

        int i = 0;
        outer: // 此处不能有语句
        for(; true ;) { // 无限循环
            inner: // 此处不能有语句
            for (; i < 10; ++i) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    ++i; // 否则i不会递增
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    ++i; // 否则i不会递增
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; ++k) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // 此处不能有标签

    }
    static void LabeledWhile() {

        int i = 0;
        outer:
        while(true) {
            System.out.println("Outer while loop");
            while(true) {
                ++i;
                System.out.println("i = " + i);
                if (i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    System.out.println("break");
                    break;
                }
                if (i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }

    }

    /**
     * Switch练习
     */
    static void VowelsAndConsonants() {

        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = random.nextInt(26) + 'a';
            System.out.println((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }

    }

    public static void main(String[] args) {

        /*IfElse(10, 5);
        System.out.println(result);
        IfElse(5, 10);
        System.out.println(result);
        IfElse(5, 5);
        System.out.println(result);*/

        /*while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");*/

        /*ListCharacters();
        CommaOperator();
        ForInFloat1();*/

        /*System.out.println(TestWithReturn(10, 5));
        System.out.println(TestWithReturn(5, 10));
        System.out.println(TestWithReturn(5, 5));*/

        /*LabeledFor();
        LabeledWhile();*/

        VowelsAndConsonants();

    }

}
