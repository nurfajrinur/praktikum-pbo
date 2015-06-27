package laporan7.Interface.extend;

public class Lingkaran implements HitungKeliling, HitungLuas {
private double jariJari;
	
	public Lingkaran (double jariJari){
		this.jariJari = jariJari;
	}
	
	public void tulis(){
		System.out.println("Lingkaran");
	}
	
	public double hitungKeliling(){
		return 2*PHI*jariJari;
	}
	
	public double hitungLuas(){
		return PHI*Math.pow(jariJari, 2);
	}
	
	
}

