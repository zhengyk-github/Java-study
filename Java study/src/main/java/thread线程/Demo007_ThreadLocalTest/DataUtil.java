package thread线程.Demo007_ThreadLocalTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DataUtil
 * @Date: Created in 2022/8/1 15:19
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 日期工具类
 **/
public class DataUtil {
    private static ThreadLocal<SimpleDateFormat> dataFormatThreadLocal = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static Date parse(String dataString){
        Date date = null;
        try {
            date = dataFormatThreadLocal.get().parse(dataString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}


