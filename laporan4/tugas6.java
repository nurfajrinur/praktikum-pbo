package laporan4;

public class tugas6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContinueDemo();
		ContinueLabel();

	}
	public static void ContinueDemo() {
		String kalimat = "ular melingkar di pinggir pagar umar";
		
		int maks = kalimat.length();
		int jumlahR = 0;
		
		for (int i = 0; i < maks; i++){
			if (kalimat.charAt(i) != 'r')
				continue;
				jumlahR++;
		}
		System.out.println("Ditemukan "+ jumlahR +" huruf r dalam kalimat.");
		System.out.println("(ular melingkar di pinggir pagar umar)\n");
	}
	public static void ContinueLabel() {
		String kalimat = "cari kata ini di dalam kalimat";
		String cari = "ini";
		boolean ketemu = false;
		
		int max = kalimat.length() - cari.length();
		
		test:
			for (int i = 0; i <= max; i++){
				int n = cari.length();
				int j = i;
				int k = 0;
				
				while (n-- != 0){
					if (kalimat.charAt(j++) != cari.charAt(k++)){
						continue test;
					}
				}
				ketemu = true;
				break test;
			}
		System.out.println(ketemu ? "ketemu" : "tidak ketemu");
	}




}
