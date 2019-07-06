/**
 * @(#)Reverse.java
 *
 *
 * @author 
 * @version 1.00 2019/7/6
 */

import java.util.Stack;

class Main
{
	// Function untuk membalik string yang sudah ditetapkan dengan menggunakan stack dan array karakterto reverse a given string using a stack and character array
	public static String reverse(String str)
	{
		// return saat string null atau empty
		if (str == null || str.equals(""))
			return str;

		// membuat stack kosong characters
		Stack<Character> stack = new Stack<Character>();

		// push setiap character dari string yang sudah ditetapkan ke dalam stack
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++)
			stack.push(ch[i]);
		
		// start from index 0
		int k = 0;

		// pop characters dari stack sampai habis
		while (!stack.isEmpty())
		{
			// menempatkan kembali setiap character yang di pop kembali ke dalam array
			ch[k++] = stack.pop();
		}

		// konversi array character array menjadi string
		return String.copyValueOf(ch);
	}

	public static void main (String[] args)
	{
		String str = "Universitas Stikubank";
		String strReverse = reverse(str);

		System.out.println("String asli : " + str);
		System.out.println("String yang sudah dibalik : " + strReverse);
	}
}