package javaSE.practice.practice5;

import com.sun.jdi.Value;

import java.lang.invoke.VarHandle;
import java.sql.SQLOutput;

/**
 * 测试对象是否相等练习
 */
public class Main {

    @SuppressWarnings("deprecation")
    public static void test1(int value) {

        Integer i1 = value;
        Integer i2 = value;
        Equivalence.show1("Automatic", i1, i2);

        // 在java9及更新版本中已经被弃用的旧方式
        Integer r1 = new Integer(value);
        Integer r2 = new Integer(value);
        Equivalence.show1("new Integer()", r1, r2);

        // java9中更新版本中提倡的方式
        Integer v1 = Integer.valueOf(value);
        Integer v2 = Integer.valueOf(value);
        Equivalence.show1("Integer.valueOf()", v1, v2);

        // 基本类型不能使用equals()方法
        int x = value;
        int y = value;

        // x.equals(y); // 无法编译
        System.out.println("Primitive int:");
        System.out.printf("%d==%d %b%n", x, y, x == y);

    }

    @SuppressWarnings("deprecation")
    static void test2(double x1, double x2) {

        // x1.equals(x2) // 无法编译
        System.out.printf("%e==%e %b%n", x1, x2, x1 == x2);
        Double d1 = x1;
        Double d2 = x2;
        Equivalence.show2("Automatic", d1, d2);

        Double r1 = new Double(x1);
        Double r2 = new Double(x2);
        Equivalence.show2("new Double()", r1, r2);

        Double v1 = Double.valueOf(x1);
        Double v2 = Double.valueOf(x2);
        Equivalence.show2("Double valueOf()", v1, v2);

    }


    public static void main(String[] args) {

//        test1(127);
//        test1(128);

//        test2(0, Double.MIN_VALUE);
//        System.out.println("------------------------");
//        test2(Double.MAX_VALUE, Double.MAX_VALUE - Double.MIN_VALUE * 1_000_000);

        ValA va1 = new ValA();
        ValA va2 = new ValA();
        va1.i = va2.i = 100;
        System.out.println(va1.equals(va2));

        ValB vb1 = new ValB();
        ValB vb2 = new ValB();
        vb1.i = vb2.i = 100;
        System.out.println(vb1.equals(vb2));

    }

}
