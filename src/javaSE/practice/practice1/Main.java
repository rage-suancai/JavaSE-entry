package javaSE.practice.practice1;

/**
 * 当操作一个对象的时候 我们真正操作的是这个对象的引用 所以当"将一个对象"时 你其实是将这个引用从一个地方复杂到另一个地方
 * 这意味着对对象而言 c = d 就是将c和d都指向原本只有的指向的那个对象 下面练习了一下
 *
 * Tank类非常简单 它的两个实例(t1和t2) 是在main()方法里生成的 每个Tank类对象的leve字段都被赋了一个不同的值 然后t2被赋给t1
 * 接着又修改了t1 在许多编程语言里 你可能会认为t1和t2总是相互独立的 但由于赋值操作的是引用 修改t1的同时显然也改变了t2
 *
 * 这是因为t1和t2包含了指向相同对象的引用(t1最初包含的引用指向那个字段值为10的对象)
 * 当对t1重新赋值的时候 这个引用被覆盖了 因此 对象被丢失了 它对应的对象也会由垃圾收集器清理
 *
 * 这种现象通常称为"别名" 是java操作对象的一种基本方式 不过 如果你不想让别名出现在这里 应该怎么办呢 可以不按之前的赋值处理 而向下这样写:
 *                  t1.level = t2.level;
 *
 * 这样就可以保持两个对象彼此独立 而不是丢弃一个对象 然后将t1和t2都绑定到剩下的那个对象上 直接操作对象内部的字段违背了java的设计原则
 * 这不是一个小问题 所以你需要时刻注意 为对象赋值可能会产生意想不到的结果
 */
public class Main {

    public static void main(String[] args) {

        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 10;
        t2.level = 20;
        System.out.println("tank1: " + t1.level + ", tank2: " + t2.level);

        // tank1 = tank2;
        t1.level = t2.level;
        System.out.println("tank1: " + t1.level + ", tank2: " + t2.level);

        t1.level = 88;
        System.out.println("tank1: " + t1.level + ", tank2: " + t2.level);

    }

}
