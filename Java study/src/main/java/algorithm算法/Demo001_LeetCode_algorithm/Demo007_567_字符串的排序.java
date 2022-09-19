package algorithm算法.Demo001_LeetCode_algorithm;

public class Demo007_567_字符串的排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[26];
		String s1 = "abcdefghi";
		String s2 = "aabbdefgh";
		checkInclusion(s1,s2);
	}

	public static boolean checkInclusion(String s1, String s2) {
		int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];
            ++cnt2[s2.charAt(i) - 'a'];
        }
        
        for (int i = 0; i < n; ++i) {
        	System.out.print("-cnt1:["+i+"]:"+cnt1[i]);
        }
    	System.out.println();

        for (int i = 0; i < n; ++i) {
        	System.out.print("-cnt2:["+i+"]:"+cnt2[i]);
        }
        System.out.println();
        System.out.println(s2.charAt(n-1));
        System.out.println(n);
        return true;
	}
	
}
