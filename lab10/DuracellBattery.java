package lab10;

public class DuracellBattery extends Battery {
	private double voltage;
	private double currency;
	private double energy;
	private double internalVoltage;
	//Constructors------------------
	public DuracellBattery() {}
	public DuracellBattery(double voltage, double currency, 
							double energy, double internalVoltage) {
		this.voltage = voltage;
		this.currency = currency;
		this.energy = energy;
		this.internalVoltage = internalVoltage;
	}
	//-----------------------------
	//Getters and setters---------
	public double getVoltage() {
        return voltage;
    }

    public double getCurrency() {
        return currency;
    }

    public double getEnergy() {
        return energy;
    }

    public double getInternalVoltage() {
        return internalVoltage;
    }
	//----------------------------
	//Methods----------------------
	public double getPower() {
		return internalVoltage * currency;
	}
	public double getLifeTime() {
		return energy / getPower();
	}
	
}
