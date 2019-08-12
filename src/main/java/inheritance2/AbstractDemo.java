package inheritance2;

public class AbstractDemo extends AbstractCars {
	public void setPrivateSpeed(int speed) {
		super.setPrivateSpeed(10);
	}
//	public void engineStart() {
//		//super.engineStart();
//		System.out.println("bwm have keyless engine start");
//	}
	@Override
	public void engineStart(String keyType, int numofCyl) {
		System.out.println("This is bmw engine start");
		
	}
}
