package laporan6;

import laporan6.Rangka.Ban;

public class Rangka {
public Ban ban;
	
	public Rangka(){
		ban = new Ban();
		System.out.println("Konstruktor Rangka");
	}
	
	class Ban {
		public Ban(){
			System.out.println("konstruktor Ban");
		}

	}

}
