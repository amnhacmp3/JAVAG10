package BàiTap;

public class b8 {
	static int tongChuSo(int n) {
		int sum = 0;
		while(n > 0) {
			sum += (n%10);
			n /= 10;
		}
		return sum;
	}
}
