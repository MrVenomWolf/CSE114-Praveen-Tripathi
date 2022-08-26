/*
An emirp (prime spelled backward) is a non-palindromic prime number whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. Write a program that displays the first 100 emirps. Display 10 numbers per lie, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113 149 157 167 179 199 311 337 347 359 389 …
You need to define and use two additional methods to check for the non-palindrome and prime conditions. Do not write the complete program in the main method.
*/

public class emirp {

	public void check() {
		int n = 0, count = 0, a;

		while (count != 100) {
			n++; // 1
			// System.out.println(n);
			a = n;
			if (primeCheck(a) == true && Palindrome(a) == false) {
				System.out.print(n + " ");
				count++;
				if (count % 10 == 0) // 10 numbers per line
				{
					System.out.println();
				}

			}
		}

	}

	private boolean primeCheck(int n) {
		int i, f = 0;
		boolean res;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				f = 1;
			}
		}
		if (f == 0) { // prime
			res = reversePrime(n); // checking that reverse prime number is
			return res;
		} else {
			return false;
		}
	}

	private boolean Palindrome(int n) {
		int r, rn = 0, a;
		a = n;
		while (n != 0) {
			r = n % 10;
			rn = rn * 10 + r;
			n = n / 10;
		}
		if (a == rn) {
			return true;
		} else {
			return false;
		}
	}

	private boolean reversePrime(int n) {
		int r, rn = 0;
		int i, f = 0;
		// reversing
		while (n != 0) {
			r = n % 10;
			rn = rn * 10 + r;
			n = n / 10;
		}

		for (i = 2; i < rn; i++) {
			if (rn % i == 0) {
				f = 1;
			}
		}
		
		if (f == 0) { // prime
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		emirp em = new emirp();
		em.check();
	}
}
