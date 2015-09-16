/* 
DESCRIPTION: You are asked to calculate factorials of some small positive integers.
Input:
An integer T, denoting the number of testcases, followed by T lines, each containing a single integer N.

Output:
For each integer N given at input, output a single line the value of N!

Input Constraint:
1 <= T <= 100
1 <= N <= 100 
*/

import java.util.Scanner;

class TestClass {
	public static int factorial(int num){
		if(num == 0){
			return 1;
		}
		return num * factorial(num - 1);
	}
	
  public static void main(String args[] ) throws Exception {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i < T; i++){
			int num = input.nextInt();
			System.out.println(factorial(num));
		}
    }
}
