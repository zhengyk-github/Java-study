package reflect;

/**
 * @ClassName: TestMain
 * @Date: Created in 2022/10/31 15:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description:  反射 通过Class对象操作Persion.class类
 **/
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException {
        Persion p = new Persion();
        //Class<?> clazz = Class.forName("reflect.Persion");
        Class<Persion> clazz = Persion.class;
        //Class<? extends Persion> clazz = p.getClass();
        int result = clazz.getModifiers();//获取类的修饰符(权限 特征)
        //每一个修饰符 用一个整数来表示
        //0开始--0 1 2 4 8 16 32 64 128 256 512 1024
        //0--默认不写  1--public  2--private  4--protected
        //8--static  16--final  32--synchronized 64--volatile
        //128--transient  256--native  512--interface  1024--abstract
        System.out.println("result:"+result);

    }
}
