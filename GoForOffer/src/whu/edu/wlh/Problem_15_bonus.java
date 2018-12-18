package whu.edu.wlh;

/**
 * 功能:实现Excel的字母列号和数字列号互转
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/27
 */
public class Problem_15_bonus {
	public static int excelColumn2Num(String column) {
		int result = 0;
		int strLength = column.length();
		for(int i=0;i<strLength;i++) {
			char ch = column.charAt(strLength-i-1);
			int num = ch-'A'+1;
			num = num * (int)Math.pow(26, i);
			result +=num;
		}
		return result;
	}
	public static String excelNum2Column(int num) {
		StringBuilder result = new StringBuilder();
		while(num>0) {
			int n = num%26;
			if (n==0) {
				n=26;
				num--;
			}
			char getChar = (char)('A'+n-1);
			result.insert(0, getChar);
			num = num/26;
		}
		return result.toString();

	}
	public static void main(String[] args) {
		System.out.println(excelColumn2Num("AZ"));
		System.out.println(excelNum2Column(52));
	}
}
