package laporan4;

public class tugas5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Break();
		BreakDua();
		BreakLabel();
	}
	public static void Break() {
		int [] angka = {32, 87, 3, 586, 12, 1076, 2000, 8, 622, 127};
		int cari = 127;
		
		int i;
		boolean ketemu = false;
		
		for (i = 0; i < angka.length; i++){
			if (angka[i] == cari){
				ketemu = true;
				break;
			}
		}
		if (ketemu){
			System.out.println("ditemukan "+ cari +" pada index "+i);
		}
		else {
			System.out.println(cari +" tidak terdapat dalam angka array");
		}
		
	}
	public static void BreakDua() {
		for (int i = 0; i<10; i++){
			int k = 0;
			for (;;){
				do {
					if (k == 5) break;
					k++;
				}while (k<10);
				break;
			}
			System.out.println("k = " + k);
		}
		
	}
	public static void BreakLabel(){
		int [] [] arrayAngka = {{32, 87, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 77, 955}};
		int cari = 12;
		
		int i;
		int j = 0;
		boolean ketemu = false;
		
		keluar :
			for (i = 0; i < arrayAngka.length; i++){
				for (j = 0; j < arrayAngka[i].length; j++){
					if (arrayAngka [i][j] == cari){
						ketemu = true;
						break keluar;
					}
				}
			}
			
			if (ketemu){
				System.out.println("ketemu "+ cari + " pada indeks "+ i + " , " +j);
			}
			else {
				System.out.println(cari + " tidak ada terdapat dalam array");
			}
	}




}
