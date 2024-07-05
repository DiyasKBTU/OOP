package lab10;

public class Main {

	public static void main(String[] args) {
		DuracellBattery d1 = new DuracellBattery(3, 2.3, 9000, 1);
		DuracellBattery d2 = new DuracellBattery(3.5, 2.4, 11000, 1.3);
		DuracellBattery d3 = new DuracellBattery(3.4, 2.0, 8500, 1.5);
		DuracellBattery d4 = new DuracellBattery(3.0, 2.3, 12000, 1.2);
		DuracellBattery d5 = new DuracellBattery(3.3, 2.2, 10500, 1.4);
		
		ToshibaBattery t1 = new ToshibaBattery(3.2, 2.1, 10000, 300);
		ToshibaBattery t2 = new ToshibaBattery(3.7, 2.0, 9000, 600);
		ToshibaBattery t3 = new ToshibaBattery(3.3, 2.3, 8000, 700);
		ToshibaBattery t4 = new ToshibaBattery(3.4, 2.4, 12000, 400);
		ToshibaBattery t5 = new ToshibaBattery(3.5, 2.2, 11000, 500);
		
		FlashLight f1 = new FlashLight(new Battery[] {t1, d1});
		FlashLight f2 = new FlashLight(new Battery[] {t2, d2});
		FlashLight f3 = new FlashLight(new Battery[] {t3, d3});
		FlashLight f4 = new FlashLight(new Battery[] {t4, d4});
		FlashLight f5 = new FlashLight(new Battery[] {t5, d5});
		
		FlashLight[] fs = {f1, f2, f3, f4, f5};
		
		System.out.println("Life times of flashlights: ");
		for(FlashLight f : fs) {
			System.out.println(f.getTotalLifeTime() + "seconds");
		}
		
		double max = fs[0].getTotalLifeTime();
		for(FlashLight f : fs) {
			if(f.getTotalLifeTime() > max) {
				max = f.getTotalLifeTime();
			}
		}
		System.out.println("Falshlight with maximum life time is " + max);
		
	}

}
