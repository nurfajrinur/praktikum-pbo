package laporan6.versi1;
import laporan6.Rangka;

public class Motor {
	private Rangka rangka;
	protected laporan6.Mesin mesin;
	private int nomer;
	protected String nama;
	

	public Motor(){
		setRangka(new Rangka());
		setMesin(new laporan6.Mesin());
		System.out.println("Konstruktor Motor");
	}
	
	public Motor(String nama){
		this.nama=nama;
	}
	
	public void stater(){
		System.out.println("Mengendarai Motor");
	}
	
	
	
	

	public Rangka getRangka() {
		return rangka;
	}

	public void setRangka(Rangka rangka) {
		this.rangka = rangka;
	}

	public laporan6.Mesin getMesin() {
		return mesin;
	}

	public void setMesin(laporan6.Mesin mesin) {
		this.mesin = mesin;
	}

	public int getNomer() {
		return nomer;
	}

	public void setNomer(int nomer) {
		this.nomer = nomer;
	}

}



