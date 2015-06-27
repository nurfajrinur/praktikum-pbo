package laporan4;

public class tugas4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			For();
			ArrayFor();
		}
	
		public static void For() {
			for (int i = 1; i < 11; i++){
				System.out.println("For 1 : "+ i);
			}
			for (int i = 10; i >= -3; i--){
				System.out.println("For 2 : "+ i);
			}
			for (int i = 10, j = 2; i >= -3 & j < 10 ; i--, j++){
				System.out.println("For 3 : "+ i +" "+ j);
			}
		}
		public static void ArrayFor() {
			int [] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			for (int item : angka){
				System.out.println("Angka : " + item);
			}
			
		}

}
