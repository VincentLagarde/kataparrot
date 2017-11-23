package fr.unilim.iut.kataparrot;

public class Parrot {
	protected final static double BASE_SPEED = 12.0;
	
	private ParrotTypeEnum type;
	
	public Parrot(ParrotTypeEnum type) {
		this.type = type;
	}

	public double getSpeed() {
		throw new RuntimeException("Should be unreachable");
	}

}