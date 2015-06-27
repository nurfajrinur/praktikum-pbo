package laporan7;

public class segiempat extends Bentuk  {
private float sisi;
	
	public segiempat(){
		setSisi(2);
	}
	public float HitungLuas() {
		
		return sisi*sisi;
	}

	public void tulis() {
		
		System.out.println("segiempat");
	}

	public float getSisi() {
		return sisi;
	}

	public void setSisi(float sisi) {
		this.sisi = sisi;
	}
	
	
}


