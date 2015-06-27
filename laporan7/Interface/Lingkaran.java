package laporan7.Interface;

public class Lingkaran   {
private double jariJari;
	
	public Lingkaran (double jariJari) {
		this.jariJari = jariJari;
	}
	
	public double hitungKeliling(){
		return 2*BentukKeliling.PHI*jariJari;
	}
	
	public double hitungLuas(){
		return BentukLuas.PHI*Math.pow(jariJari, 2);
	}

	

}


