package lab10;

public class FlashLight {
	private Battery batteries[];
	//Constructors---------------
	public FlashLight() {
		batteries = new Battery[0];
	}
	public FlashLight(Battery[] batteries) {
		this.batteries = batteries;
	}
	//----------------------------
	
	//Methods----------------------
	public double getTotalPower() {
        double totalPower = 0;
        for (Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (Battery battery : batteries) {
            if(battery.getClass() == ToshibaBattery.class) {
            	totalEnergy += ((ToshibaBattery)battery).getEnergy() + 
            					((ToshibaBattery)battery).getEnergy();
            }
            if(battery.getClass() == DuracellBattery.class) {
            	totalEnergy += ((DuracellBattery)battery).getEnergy();
            }
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        return getTotalEnergy() / getTotalPower();
    }
}

