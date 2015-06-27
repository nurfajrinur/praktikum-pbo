package laporan5;

public class argumen {


		public static void passingPrimitif(int n)
		{
			n=2;
		}
		
		public static void passingObject(Titik m)
		{
			m.x=3;
			m.y=4;
		}

		public static void main(String[] args) {
			int n = 2;
			passingPrimitif(n);
			System.out.println(n);
			
			Titik m = new Titik();
			passingObject(m);
			System.out.println(m.x + " " + m.y);
			System.out.println(n + " "+ m.x + " " + m.y);
		}
		
	}

	class Titik {
		public int x;
		public int y;
		
		public Titik(){
			x=0;
			y=0;
		}



}
