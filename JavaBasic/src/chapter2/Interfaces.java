package chapter2;

public class Interfaces {

	public static void main(String[] args) {
		Aircon aircon = new AirconImplement();
		long l = 10000;
		
		aircon.airVolumeCotrol();
		aircon.power();
	}

}
