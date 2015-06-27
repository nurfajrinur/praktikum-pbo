package laporan7;

public abstract class segitiga extends Bentuk {
	protected float alas;
	protected float tinggi;
	
	public void Segitiga(){
		alas = 3;
		tinggi = 6;
	}
	
	public float hitungLuas(){
		return (alas*tinggi)/2;		
	}
	
	

}
