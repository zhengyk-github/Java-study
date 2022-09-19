package thread线程;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @ClassName: Demo001TestBigDecimal
 * @Date: Created in 2022/8/9 10:37
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Demo001TestBigDecimal {

    public static void main(String[] args) throws ParseException {

//        Double d = Double.valueOf(1000.01);
//        System.out.println(Double.valueOf(d*10000));

        String zb = "1.000000";
        DecimalFormat df = new DecimalFormat("#.##");
        double d = new DecimalFormat().parse(zb).doubleValue();
        BigDecimal b1 = new BigDecimal(d);
        BigDecimal b2 = new BigDecimal(10000);
        System.out.println(df.format(b1.multiply(b2)));


    }
}
