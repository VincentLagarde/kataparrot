package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super();
	}

	@Override 
	public double getSpeed() {
		return Parrot.BASE_SPEED;
	}

}
