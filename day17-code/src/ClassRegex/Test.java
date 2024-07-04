package ClassRegex;

public class Test {
    public static void main(String[] args) {
        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例: a123a b456b 17891 &abc& a123b(false)
        //捕获分组
        String regex1 = "(.).*\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));
        System.out.println("---------------------------");
        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例: abcabc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).*\\1";
        System.out.println("abcabc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));
        System.out.println("---------------------------");
        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        String regex3 = "((.)\\2)*.*\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        //需求:把重复的内容 替换为 单个的
        //学学                学
        //编编编编            编
        //程程程程程程        程
        System.out.println("---------------------------");
        String str = "我要学学编编编编程程程程程程";
        String replaceAll = str.replaceAll("(.)\\1+", "$1");
        System.out.println(replaceAll);
        //非捕获分组
        String regex4 ="[1-9]\\d{16}(?:\\d|x|x)\\1";
        //?: 就是非捕获分组的意思
        //表示括号里面的东西不占组号


    }
}
