package laporan7.Interface.extend;

import laporan7.Interface.BentukKeliling;
import laporan7.Interface.BentukLuas;
import laporan7.Interface.Lingkaran;

public class CobaInterface {
	public static double hitungLuasBentuk(BentukLuas b){
		return b.hitungLuas();
	}
	
	public static double hitungLuasKeliling(BentukKeliling b){
		return b.hitungKeliling();
	}

	public static void main(String[] args) {
		BentukInterface bInterface = (BentukInterface) new Lingkaran(3.0);
		System.out.println(hitungLuasBentuk((BentukLuas)bInterface));
		System.out.println(hitungLuasKeliling((BentukKeliling)bInterface));
	}

}
