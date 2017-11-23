package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(_type);
		
	}

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN);
	}

	@Override 
	public double getSpeed() {
		return Parrot.BASE_SPEED;
	}

}
