package laporan4;

public class tugas3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileDemo();
		DoWhileDemo();
	}
	public static void WhileDemo() {
		int angka = 1;
		while (angka < 11){
			System.out.println("Angka: "+angka);
			angka++;
		}
		
	}
	public static void DoWhileDemo(){
		int count = 1;
		do {
			System.out.println("count is: "+ count);
			count++;
		}
		while (count <= 11);
	}

	}





