package javaSE.javase.javase9;

/**
 * 循环结构
 * 小明想向小红表白 于是他在屏幕上打印了520个"我爱你" 我们用java该如何实现呢
 *
 * for语句
 * for语句是比较灵活的循环控制语句 一个for语句的定义如下:
 *                  for(初始条件; 循环条件; 更新) {
 *                      // 循环执行的内容
 *                  }
 *                  // 循环结束后 继续执行
 *
 *      > 初始条件: 循环开始时的条件 一般用与定义控制循环的变量
 *      > 循环条件: 每轮循环开始之前 进行一次判断 如果满足则继续 不满足则结束 要求为boolean变量或是boolean表达式
 *      > 更新: 每轮循环结束后都会执行的内容 一般写增量表达式
 *
 * 初始条件 循环条件 更新条件不是缺一不可 甚至可以都缺
 *                  for(int i = 0; i < 520; ++i) {
 *                      System.out.println("我爱你");
 *                  }
 *
 *                  for(;;) {
 *                      // 这里的内容将会永远地进行下去
 *                  }
 *
 * 增强for循环在数组时在讲解
 *
 * while循环
 * while循环和for循环类似 但是它更加简单 只需要添加维持循环的判断条件即可
 *                  while(循环条件) {
 *                      // 循环执行的内容
 *                  }
 *
 * 和for一样 每次循环开始 当循环条件不满足时 自动退出 那么有时候我们希望先执行了我们的代码再去判断怎么办呢 我们可以使用do-while语句:
 *                  do {
 *                      // 执行内容
 *                  } while(循环条件);
 *
 * 一定会先执行do里面的内容 再做判断
 *
 * 思考:
 *                  for(;;) {
 *
 *                  }
 *
 *                  while(true) {
 *
 *                  }
 *
 *                  // 它们的性能谁更高
 */
public class Main {

    static void test1() {

        for (int i = 0; i <= 10; ++i) {
            System.out.println("Fuck World");
        }

    }

    static void test2() {

        /*int i = 0;
        while (i < 10) {
            ++i;
        }*/

        do {
            System.out.println("Fuck World");
        } while (false);

    }

    public static void main(String[] args) {
        //test1();
        test2();
    }

}
