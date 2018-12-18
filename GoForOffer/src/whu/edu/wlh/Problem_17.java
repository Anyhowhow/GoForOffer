package whu.edu.wlh;

/**
 * 功能:输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
 * 作者:Wang Lihao from WHU
 * 日期:2018/10/26
 */
public class Problem_17 {
	public void print1ToMaxOfNDigits(int n) {
	    if (n <= 0)
	        return;
	    char[] number = new char[n];
	    print1ToMaxOfNDigits(number, 0);//从最低位开始打印
	}
	//低位递归调用高位，然后遍历高位，遍历完，再遍历低位（此时会再次遍历高位）,number(0→N，数字的高位→低位)
	private void print1ToMaxOfNDigits(char[] number, int digit) {
	    if (digit == number.length) {
	        printNumber(number);
	        return;
	    }
	    for (int i = 0; i < 10; i++) {
	        number[digit] = (char) (i + '0');
	        print1ToMaxOfNDigits(number, digit + 1);
	    }
	}
	//从第一个非0位开始打印
	private void printNumber(char[] number) {
	    int index = 0;
	    while (index < number.length && number[index] == '0')
	        index++;
	    while (index < number.length)
	        System.out.print(number[index++]);
	    System.out.println();
	}
}
