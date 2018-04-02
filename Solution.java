
public class Solution {
  /*
  Given a 32-bit signed integer, reverse digits of an integer.

  Example 1:
  Input: 123
  Output:  321

  Example 2:
  Input: -123
  Output: -321

  Example 3:
  Input: 120
  Output: 21

  Note:
  Assume we are dealing with an environment which could only hold integers
  within the 32-bit signed integer range. For the purpose of this problem,
  assume that your function returns 0 when the reversed integer overflows.
  
  2147483647 ... 0 ... -2147483648
  */
  
  public int reverse(int x) {
    int revInt = 0;
    int digit = 0;
    int prefix = x;
    
    while(prefix != 0) {
      digit = prefix % 10;
      int tmp = revInt * 10 + digit;
      if(((tmp < 0) && (revInt > 0)) || ((tmp > 0) && (revInt < 0))) {
        revInt = 0;
        break;
      }
      revInt = tmp;
      prefix = prefix / 10;
    }
    return revInt;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int result = 0;

    System.out.println("MAX " + Integer.MAX_VALUE);
    System.out.println("MIN " + Integer.MIN_VALUE);
    System.out.println("123 -> " + s.reverse(123));
    System.out.println("-78 -> " + s.reverse(-78));
    System.out.println("-123 -> " + s.reverse(-123));
    System.out.println("0 -> " + s.reverse(0));
    System.out.println("2147483647 -> " + s.reverse(2147483647));
    System.out.println("-2147483648 -> " + s.reverse(-2147483648));
  }
}
