package javaSE.javase.javase2;

/**
 * java语法规范
 * 所有的java语法必须以 ; 结尾
 *
 * 无论是() []还是{} 所有的括号必须一一匹配
 *
 * 主方法的代码只能写在{}中
 *
 * java基础语法(面向过程)
 * 在学习面向对象之前 我们需要了解面向过程的编程思想 如果你学习过C语言和Python就会很轻松
 *
 * 变量和关键字
 * 变量
 * 变量即使一个可变的量 例如定义一个int类型的变量(int就是整数类型):
 *                  int a = 10;
 *                  a = 20;
 *                  b = 30;
 *
 * 我们能够随意更改它的值 也就是说它的值是随时可变的 我们称为变量 变量可以是类的变量 也可以是方法内部的局部变量(我们现阶段主要用局部变量 类变量在面向对象再讲解)
 *
 * 变量和C语言中的变量不同 java中的变量是存放在JVM管理的内存中 C语言的变量存放在内存(某些情况下需要手动释放内存 而java会自动帮助我们清理变量占据的内存)
 * java和C++很类似 但是没有指针 java也叫C++--
 *
 * java是强类型语言 只有明确定义了变量之后 你才能使用 一旦被指定某个数据类型 那么它将始终被认为是对应的类型(和JS不一样)
 *
 * 定义一个变量的格式如下:
 *                  [类型] [标识符(名字)] = [初始值(可选)]
 *                  int a = 10;
 *
 * 注意: 标识符不能为以下内容:
 *      > 标识符以由大小写字母 数字 下划线_和美元符号$组成 但是不能以数字开头
 *      > 大小写敏感
 *      > 不能有空格 @ # + - /等符号
 *      > 应该使用有意义的名称 达到见名知意的目的 最好以小写字母开头
 *      > 不可以是true和false
 *      > 不能与java语言的关键字重名
 *
 * 关键字
 *                  abstract        assert        boolean       break          byte
 *                  case            catch         char          class          const
 *                  continue        default       do            double         else
 *                  enum            extends       final         finally        float
 *                  for             goto          if            implements     import
 *                  instanceof      int           interface     long           native
 *                  new             package       private       protected      public
 *                  return          strictfp      short         static         super
 *                  switch          synchronized  this          throw          throws
 *                  transient       try           void          volatile       while
 *
 * 包括基本数据类型 流程控制语句等 了解就行 后面会一点一点带大家认识
 *
 * 常量
 * 常量就是无法修改值的变量 常量的值 只能定义一次
 *                  final int a = 10;
 *                  a = 10; // 报错
 *
 * 常量前面必须添加final关键字(C语言里面是const 虽然java也有 但是不能使用)
 *
 * 这只是final关键字的第一个用法 后面还会有更多的用法
 *
 * 注释
 * 养成注释的好习惯 不然以后自己都看不懂自己的代码 注释包括单元注释和多行注释:
 *                  // 我是单元注释
 *
 *                  /**
 *                  * 我是
 *                  * 多行注释
 *
 *                  //TODO 待做标记
 */
public class Main {

    public static void main(String[] args) {
        int a = 88;
        System.out.println(a);
    }

}
