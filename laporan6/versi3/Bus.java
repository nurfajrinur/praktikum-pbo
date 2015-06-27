package laporan6.versi3;
import laporan6.Mesin;
import laporan6.versi2.Motor;

public class Bus  extends Motor {
	public Bus(){
	}
	public void angkut(){
		mesin = new Mesin();
		stater();
		nama = "Bus";
		System.out.println("Membawa Motor diatas Bus");
	}
	public void stater(){
		System.out.println("Stater Bus");
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.angkut();
	}

}



