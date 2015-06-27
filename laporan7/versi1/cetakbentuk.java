package laporan7.versi1;
import laporan7.Bentuk;
import laporan7.segiempat;
import laporan7.segitigasamakaki;
import laporan7.segitigasamasisi;


public class cetakbentuk {
	public static void CetakBangun(Bentuk B){
		System.out.println(B.HitungLuas());
		B.tulis();
		B.geser(5, 5);
	}
	
	public static void main(String[] args) {
		CetakBangun(new segiempat());
		CetakBangun(new segitigasamakaki());
		CetakBangun(new segitigasamasisi());

	}

}
