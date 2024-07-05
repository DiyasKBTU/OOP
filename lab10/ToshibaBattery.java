package lab10;

public class ToshibaBattery extends Battery{
	private double voltage; // volt
	private double currency; //ampere
	private double energy; //joule
	private double extraEnergy; //joule
	// Constructors---------------------
	public ToshibaBattery() {}
	public ToshibaBattery(double voltage, double currency, 
			double energy, double extraEnergy) {
		this.voltage = voltage;
		this.currency = currency;
		this.energy = energy;
		this.extraEnergy = extraEnergy;
	}
	//---------------------------------
	
	//Getters and setters-------------
	 public double getVoltage() {
	        return voltage;
	    }

	    public double getCurrency() {
	        return currency;
	    }

	    public double getEnergy() {
	        return energy;
	    }

	    public double getExtraEnergy() {
	        return extraEnergy;
	    }
	//--------------------------------
	//Methods-------------------------
	public double getPower() {
		return voltage * currency;
	}
	public double getLifeTime() {
		return (energy + extraEnergy) / getPower();
	}
	
	
}
