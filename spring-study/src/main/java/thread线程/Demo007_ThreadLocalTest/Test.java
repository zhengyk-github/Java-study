package thread线程.Demo007_ThreadLocalTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: Test
 * @Date: Created in 2022/8/1 15:26
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                System.out.println(DataUtil.parse("2022-08-01 15:30:00"));
            });
        }
        executorService.shutdown();
    }
}
