package laporan4;

public class tugas1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kondisional();
		kondisional2();
		
		}
	
	public static void kondisional(){
		int skor = 90;
		char grade;
		
		if (skor >= 90){
			grade = 'A';
		}
		else if (skor >= 80){
			grade = 'B';
		}
		
		else {
			grade = 'C';
		}
		
		System.out.println("Grade = "+grade);
	}
	
	public static void kondisional2() {
		int nilai1 = 1;
		int nilai2 = 2;
		int hasil;
		boolean kondisi = true;
		hasil = kondisi ? nilai1 : nilai2;
		System.out.println(hasil);
	}


		

	}



