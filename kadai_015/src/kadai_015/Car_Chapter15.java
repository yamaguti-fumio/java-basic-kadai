package kadai_015;

public class Car_Chapter15 {
	// ギア
	private int gear = 1;
	//　スピード
	private int speed = 10;

	public void gearChange(int afterGear) {
		this.gear = afterGear;

		switch (gear) {
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;

		default:
			speed = 10;
			break;
		}
	}

	public void run() {
		System.out.println("ギア1からギア" + gear + "に切り替えました");
		System.out.println("速度は時速" + speed + "です");
	}

}
