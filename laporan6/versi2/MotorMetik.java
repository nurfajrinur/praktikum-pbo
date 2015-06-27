package laporan6.versi2;
import laporan6.versi3.Becak;
import laporan6.versi3.Bus;


public class MotorMetik {
	private static final Motor Bus = null;

	public static void StaterMotor (Motor motor) {
		motor.stater();
	}

	public static void main(String[] args) {
		Motor becak = new Becak();
		Bus bus = new Bus();
		
		StaterMotor(new Motor());
		
		StaterMotor(becak);
		
		StaterMotor(Bus);

	}

}


