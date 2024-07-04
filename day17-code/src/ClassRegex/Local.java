package ClassRegex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Local {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版木，目前企业中用的最多的是]ava8和]ava11，因为这两个是长期支持版木。" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        String regex = "ab+?";
        Pattern p =Pattern.compile(regex);
        Matcher matcher = p.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }



    }
}
