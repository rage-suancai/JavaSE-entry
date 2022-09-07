package javaSE.javase.javase8;

/**
 * 流程控制
 * 我们的程序都是从上往下依次运行的 但是 仅仅是这样还不够 我们需要更加高级的控制语句来帮我进行更加灵活的控制 比如 判断用户输入的数字
 * 大于1则输出ok 小于1则输出no 这时我们就需要用到选择结构来帮助我们完成条件的判断和程序的分支走向 学习过C语言就很轻松
 *
 * 选择结构
 * 选择结构包含if和switch类型 选择结构能够帮助我们根据条件判断 再执行哪一块代码
 *
 * if语句
 * 就像上面所说 判断用户输入的数字 大于1则输出ok 小于则输出no 要实现这种效果 我们首先可以采用if语句:
 *                  if(判断条件1) {
 *                      // 判断成功执行的内容
 *                  } else {
 *                      // 判断失败执行的内容
 *                  }
 *                  // if的内容执行完成后 后面的内容正常执行
 *
 * 其中 else语句不是必须的
 *
 * 现在 又来了一个新的需求 用户输入的是1打印ok 输入2 打印yes 那么这样就需要我们进行多种条件判断了 当然if能进行多分支判断:
 *                  if(判断条件1) {
 *                     // 判断成功执行的内容
 *                  } else if(判断条件2) {
 *                      // 再次判断 如果判断成功执行的内容
 *                  } else {
 *                      // 上面的都没成功 只能走这里
 *                  }
 *
 * 同样的 else语句不是必须的
 *
 * 现在 又来了一个新的需求 用户输入1之后 在判断用户下一次输入的是什么 如果是1 打印yes 不是就打印no这样 就可以用嵌套if了:
 *                  if(判断条件1) {
 *                      // 前提是判断条件1要成功才能进来
 *                      if(判断条件2) {
 *                         // 判断成功执行的内容
 *                      } else {
 *                         // 判断失败执行的内容
 *                      }
 *                  }
 *
 * switch语句
 * 我们不难发现 虽然else-if能够解决多分支判断问题 但是效率实在是太低了 多分支if采用的是逐级向下判断 虽然费时费力 那么有没有一种更专业的解决多分支判断问题的东西呢
 *                  switch(判断主体) {
 *                      case 值1:
 *                         // 运行xxx
 *                         break; //  break用于跳出switch语句 不添加会导致程序继续向下运行
 *                       case 值2:
 *                         // 运行xxx
 *                         break;
 *                       case 值3:
 *                         // 运行xxx
 *                         break;
 *                  }
 *
 * 在上述语句中 只有判断主体等于case后面的值时 才会执行case中的语句 同时需要使用break来跳出switch语句 否则会继续向下运行
 *
 * 为什么switch效率更高呢 因为switch采用二分思想进行查找(这也是为什么switch只能判断值相等的原因) 能够更快地找到我们想要的结果
 */
public class Main {

    static void test1() {

        /*int a = 3;
        if (a > 1) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }*/

        /*int a = 3;
        if(a > 1) {
            System.out.println("ok");
        } else if(a < 1) {
            System.out.println("no");
        }*/

        /*int a = 3;
        if (a > 1) {
            if (a < 1) {
                System.out.println("ok");
            } else {
                System.out.println("no");
            }
        }*/

    }

    static void test2() {

        int a = 3;
        switch (a) {
            case 3:
                System.out.println("nice");
                break;
            case 10:
                System.out.println("nice2");
                break;
            case 9:
                System.out.println("nice3");
                break;
        }

    }

    public static void main(String[] args) {
        //test1();
        test2();
    }

}
