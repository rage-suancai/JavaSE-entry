package javaSE.practice.practice9;

public class Main {

    /**
     * 三元操作符练习
     */
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
    static int standardIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

    /**
     * 字符串操作符 + 和 += 练习
     */
    static void test1() {

        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);

        // 将x转为字符串
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));

        // Integer.toString的简化版
        System.out.println("" + x);

    }

    /**
     * 类型转换练习
     */
    static void Casting() {

        int i = 200;
        long lng = (long) i;
        lng = i; // 宽化 因此不需要强制类型转换
        long lng2 = (long) 200;
        lng2 = 200;
        // 一个窄化转型
        i = (int) lng2; // 需要强制类型转换

    }

    /**
     * 类型转换的截尾和舍入练习
     */
    static void CastingNumbers() {

        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above: " + (int) above);
        System.out.println("(int)below: " + (int)below);
        System.out.println("(int)fabove: " + (int)fabove);
        System.out.println("(int)fbelow: " + (int)fbelow);

    }
    static void RoundingNumbers() {

        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): " + Math.round(fbelow));

    }

    public static void main(String[] args) {

        /*System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));*/

        //test1();

        CastingNumbers();
        RoundingNumbers();

    }

}
