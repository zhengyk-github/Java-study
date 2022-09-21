package Constructor构造方法;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Scanner;

/**
 * @ClassName: calculator计算器
 * @Date: Created in 2022/9/20 16:36
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class calculator计算器 {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入第一个数");
        Scanner scannera = new Scanner(System.in);
        int a = scannera.nextInt();
        sum = a;
        while (true) {
            System.out.println("请输入符号");
            Scanner scannerb = new Scanner(System.in);
            String b = scannerb.next();
            System.out.println("请输入第二个数");
            Scanner scannerc = new Scanner(System.in);
            int c = scannerc.nextInt();
            sum = calculator(sum, b, c);
            System.out.println(sum);
        }
    }

    private static int calculator(int sum, String b, int c) {
        if ("+".equals(b)) {
            sum = sum + c;
        }
        if ("-".equals(b)) {
            sum = sum - c;
        }
        if ("*".equals(b)) {
            sum = sum * c;
        }
        if ("/".equals(b)) {
            sum = sum / c;
        }
        return sum;
    }


    //取json格式的值
    {
        JSONObject jo1 = new JSONObject();
        JSONObject jo2 = new JSONObject();
        JSONArray joarray = new JSONArray();
        jo1.put("id", "123456789");
        jo1.put("remark", "test1");
        jo2.put("id", "987654321");
        jo2.put("remark", "test2");
        joarray.add(jo1);
        joarray.add(jo2);
        JSONObject jo0 = new JSONObject();
        JSONObject jo = new JSONObject();
        jo0.put("WaybillRoute", joarray);
        jo.put("Body", jo0);
        System.out.println("初始数组:" + jo.toString());

        JSONObject ja = jo.getJSONObject("Body");
        System.out.println("Body:" + ja.toString());
        JSONArray jaarray = ja.getJSONArray("WaybillRoute");
        jaarray.remove(1);
        System.out.println("WaybillRoute:" + jaarray.toString());
        for (int i = 0; i < jaarray.size(); i++) {
            JSONObject jsonObject = jaarray.getJSONObject(i);
            System.out.println(i + ",数据:" + jsonObject.toString());
        }
    }
}
