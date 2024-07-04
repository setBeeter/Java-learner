package test;

public class t02 {
    /*
    判断101~200之间有多少个素数，并输出所有素数。
    备注：素数就是质数
     */
    public static void main(String[] args) {

        for (int i = 101; i <= 200; i++) {
            boolean flage = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flage = false;
                }
            }
            if (flage) {
                System.out.println(i + "是素数");
            }

        }

    }
}
