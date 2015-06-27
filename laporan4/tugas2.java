package laporan4;

public class tugas2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchtest();
		switchtest2();

	}
	public static void switchtest() {
		int bulan = 5;
		switch (bulan){
		case 1 : System.out.println("januari"); break;
		case 2 : System.out.println("februari"); break;
		case 3 : System.out.println("maret"); break;
		case 4 : System.out.println("april"); break;
		case 5 : System.out.println("mei"); break;
		case 6 : System.out.println("juni"); break;
		case 7 : System.out.println("juli"); break;
		case 8 : System.out.println("agustus"); break;
		case 9 : System.out.println("september"); break;
		case 10 : System.out.println("oktober"); break;
		case 11 : System.out.println("november"); break;
		case 12 : System.out.println("desember"); break;
		default: System.out.println("bulan salah"); break;
		}
		
	}
	public static void switchtest2() {
		int bulan = 5;
		int tahun = 2015;
		int jumlahHari = 0;
		
		switch (bulan){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			jumlahHari = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			jumlahHari = 30;
			break;
		case 2:
			if ( ((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0) )
				jumlahHari = 29;
			else
				jumlahHari = 28;
			break;
		default:
			System.out.println("bulan salah");
			break;
		}
		System.out.println("jumlah hari MEI "+tahun +" = "+ jumlahHari);
		
	}
}




