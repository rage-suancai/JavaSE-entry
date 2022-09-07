package javaSE.javase.javase3;

/**
 * 基本数据类型
 * java中的数据类型分为基本数据类型和引用类型两大类 引用类型我们在面向对象时再提 基本数据类型是重点中的重点 首先我们需要了解有哪些类型 然后 我们需要知道的
 * 并不是它们的精度如何 能够表示的范围有多大 而是为什么java会给我们定义这些类型 计算机是怎么表示这些类型的 这样我们才能更好的记忆它们的精度 表示范围大小
 * 所以 我们从计算机原理的角度出发 带领大家走进java的基本数据类型
 *
 * 这一部分稍微有点烧脑 但是是重中之重 如果你掌握了这些 任何相关的面试题都难不倒你(如果你学习过程计算机组成原理就很好理解了)
 *
 * 计算机中的二进制表示
 * 在计算机中 所有的内容都是二进制形式表示 十进制是以10为进位 如9+1=10 二进制则是满2进位(因为我们的计算机是电子的 电平信号只有高位和低位 你也可以暂且理解为通电和不通电高电平代表1 低电平代表0 由于只有0和1
 * 因此只能使用二进制表示我们的数字) 比如1+1=10=2^1+0 一位也叫一个bit 8个bit称为1字节 16个bit称为一个字 32个bit称为一个双字 64个bit称为一个四字 我们一般采用字节来描述数据大小
 *
 * 十进制的7 -> 在二进制中为 111 = 2^2 + 2^1 + 2^0
 *
 * 现在有4个bit位 最大能够表示多大的数字呢
 *      > 最小 0000 => 0
 *      > 最大 1111 => 2^3 + 2^2 + 2^1 + 2^0 => 8 + 4 + 2 + 1 = 15
 *
 * 现在 我们4bit能够表示的范围变为了-7~+7 这样的表示方式称为原码
 *
 * 计算机中的加减法
 * 原码
 * 虽然原码表示简单 但是原码在做加减法的时候 很麻烦 以bit为例:
 *                  1+(-1) = 0001 + 1001 = 怎么让计算机去计算(虽然我们知道该去怎么算 但是计算机不知道)
 *
 * 我们得创造一种更好的表示方式 于是我们引入了反码:
 * 反码
 *      > 正数的反码是其本身
 *      > 负数的反码是在其原码的基础上 符号位不变 其余各个位取反
 *
 * 经过上面的定义 我们再来进行加减法:
 *                  1+(-1) = 0001 + 1110 = 1111 => -0(直接相加 这样就简单多了)
 *
 * 思考: 1111代表-0 0000代表+0 在我们实数的范围内 0有正负之分吗
 *      > 0既不是正数也不是负数 那么显然这样的表示依然不够合理
 *
 * 补码
 * 根据上面的问题 我们引入了最终的解决方案 那就是补码 定义如下:
 *      > 正数的补码就是其本身(不变)
 *      > 负数的补码是在其原码的基础上 符号位不变 其余各位取反 最后+1(即在反码的基础上+1)
 *
 * 其实现在就已经能够想通了 -0其实已经被消除了 我们再来看上面的运算:
 *                  1+(-1) = 0001 + 1111 = (1)0000 => +0(现在无论你怎么算 也不会有-0了)
 *
 * 所以现在 4bit位能够表示的范围是: -8 - +7(java使用的就是补码)
 *
 * 以上内容是重点 是一定要掌握的知识 这些知识是你怎么在面试中的最终防线 有了这些理论基础 无论面试题如何变换 都能够通过理论知识来破解
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Fuck World");
    }

}
