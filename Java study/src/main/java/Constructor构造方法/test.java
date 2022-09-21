package Constructor构造方法;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Scanner;

/**
 * @ClassName: test
 * @Date: Created in 2022/9/20 11:09
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class test {
    public static void main(String[] args) {
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
