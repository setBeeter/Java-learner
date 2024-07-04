package ClassRegex;

public class Regex {
    public static void main(String[] args) {

        //System.out.println("AB".matches("[a-zA-Z]"));

        String regx ="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        String num="410926200105163216";
        System.out.println( num.matches(regx));

    }
}
