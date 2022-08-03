package lang.print.gaps.task3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeclaringVars {
    public static void main(String[] args) {
        //write code here
        int a, b, c;
        a = b = c = 10;
        System.out.println(c);

        Logger logger= LoggerFactory.getLogger(DeclaringVars.class);
        logger.info(String.valueOf(c));

    }
}
