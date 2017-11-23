package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot{

	private final static double LOAD_FACTOR = 9.0;
	private int numberOfCoconuts ;
	
	public AfricanParrot(int numberOfCoconuts) {
		super();
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override 
	public double getSpeed() {
		return Math.max(0, Parrot.BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
	}
}
