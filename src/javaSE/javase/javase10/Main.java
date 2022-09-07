package javaSE.javase.javase10;

/**
 * 面向过程编程实战(基础+算法)
 * 打印九九乘法表
 *
 * 简单: 将九九乘法表打印倒控制台
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }

    }

}
