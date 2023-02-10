package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: test
 * @Date: Created in 2023/2/10 14:21
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class testComparable {
		public static void main(String[] args) {
			UserComparable user1 = new UserComparable("ake", 25, true);
			UserComparable user2 = new UserComparable("reo", 24, false);
			UserComparable user3 = new UserComparable("fg", 24, false);
			List<UserComparable> list = new ArrayList<UserComparable>();
			list.add(user1);
			list.add(user2);
			list.add(user3);
			Collections.sort(list);
			System.out.println("Comparable:" + list);
		}
}
