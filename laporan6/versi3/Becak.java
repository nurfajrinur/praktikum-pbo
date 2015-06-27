package laporan6.versi3;
import laporan6.versi2.Motor;

public class Becak extends Motor {
	public String nama;
	public Becak(){
		super();
	}
	public Becak (String nama){
		super(nama);
	}
	public void cetak (String nama){
		super.nama = nama;
		this.nama="Becak Lokal";
		System.out.println(nama);
		System.out.println(this.nama);
	}
	public void stater(){
		System.out.println("Stater Becak");
	}

public static void main(String args[]){
	Becak becak = new Becak();
	becak.cetak("BECAK");
}
	
}



