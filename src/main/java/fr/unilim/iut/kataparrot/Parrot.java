package fr.unilim.iut.kataparrot;

public class Parrot {
	protected final static double BASE_SPEED = 12.0;
	protected final static double LOAD_FACTOR = 9.0;
	
	private ParrotTypeEnum type;
	protected int numberOfCoconuts = 0;
	private double voltage;
	private boolean isNailed;

	public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		this.type = _type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
			throw new RuntimeException("Should be unreachable");
		case AFRICAN:
			throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
			return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	private double getLoadFactor() {
		return 9.0;
	}

	private double getBaseSpeed() {
		return 12.0;
	}

}