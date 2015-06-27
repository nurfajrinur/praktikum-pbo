package laporan5;

public class argumendua {
	public static void argumenArray(int[]args){
 		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}
	public static void argumenSembarang(int[]args){
 		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 4, 5};
		argumenArray(a);
		argumenSembarang(a);
		
		
	}
	
}
