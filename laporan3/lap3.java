package laporan3;

public class lap3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte angka = 10;
		byte angka2 = -10;

		int hasil = angka++ >> 4 + 10 * 4 | 10 << angka2;
		System.out.println(hasil);

		int hasil4 = 6 >> 4 + 10 * 4 | 10 << -10;
		System.out.println(hasil4);

		int hasil3 = 10 << -10;
		System.out.println(hasil3);

		int hasil5 = 10 << -10 | 6 >> 4;
		System.out.println(hasil5);

		int hasil2 = 10 * 4 | 10 << angka2;
		System.out.println(hasil2);

	}

}


