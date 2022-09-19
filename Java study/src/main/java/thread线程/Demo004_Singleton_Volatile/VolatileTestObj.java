package thread线程.Demo004_Singleton_Volatile;

/**
 * @ClassName: VolatileTestObj
 * @Date: Created in 2022/7/29 10:48
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: volatile修饰 https://zhuanlan.zhihu.com/p/425772213
 **/
public class VolatileTestObj {
    private String value = null;
    private  boolean hasNewValue = false;//volatile

    public void put(String value) {
        while (hasNewValue) {
            // 等待，防止重复赋值
        }
        this.value = value;
        hasNewValue = true;
    }

    public String get() {
        while (!hasNewValue) {
            // 等待，防止获取到旧值
        }
        String value = this.value;
        hasNewValue = false;
        return value;
    }
}
