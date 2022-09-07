package javaSE.javase.javase1;

/**
 * java运行机制
 * 如下:
 *                  源文件.java文件 -> java编译器 -> 字节码.class文件 -> JVM([类装载器] -> [字节码校验器] -> [解释器]) -> 操作系统
 *
 * 编译型语言
 * C语言源代码:
 *                  编译成windows          编译成linux            编译成mac          编译成对应
 *                 系统的二进制序列        系统的二进制序列        系统的二进制序列     系统的二进制序列
 *                       |                    |                    |                 |
 *                    windows               linux                 mac              其他
 *
 *      编写源代码 -> 编译为当前系统执行的二进制 -> 运行
 *
 * 解释性语言
 * python源代码:
 *                     编译成windows          编译成linux            编译成mac          编译成对应
 *                    系统的二进制序列        系统的二进制序列        系统的二进制序列     系统的二进制序列
 *                          |                    |                    |                 |
 *                       windows               linux                 mac              其他
 *
 *      编写源代码 -> 运行
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Fuck World!");
    }

}
