package whu.edu.wlh;

/**
 * 功能:判断字符串是否表示数值（使用正则表达式匹配）
 * 作者:Wang Lihao from WHU
 * 日期:2018/10/29
 */
public class Problem_20 {
	public boolean isNumeric(char[] str) {
	    if (str == null || str.length == 0)
	        return false;
	    //表示数值的字符串遵循模式A[.[B]][e|EC]或者.B[e|EC]，其中A为数值的整数部分，B紧跟着小数点为数值的小数部分，C为紧跟着e或E的指数部分
	    //小数点前的整数部分不是必须的，如.123就表示0.123
	    //将char数组转换为String对象，然后调用matches方法来匹配正则表达式
	    return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
	}
}
