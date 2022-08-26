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
