package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN);
	}

	@Override 
	public double getSpeed() {
		return Parrot.BASE_SPEED;
	}

}
