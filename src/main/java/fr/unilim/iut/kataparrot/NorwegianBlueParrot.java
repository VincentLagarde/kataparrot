package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot{

	private static final double MAX_SPEED = 24.0;
	private boolean isNailed;
	private double voltage;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE);
		this.voltage = voltage;
		this.isNailed = isNailed;
	}
	
	@Override 
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
	
	private double getBaseSpeed(double voltage) {
		return Math.min(MAX_SPEED, voltage * Parrot.BASE_SPEED);
	}
}
