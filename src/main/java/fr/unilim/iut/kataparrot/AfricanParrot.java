package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot{

	public AfricanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(_type, numberOfCoconuts, voltage, isNailed);
	}

	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN,numberOfCoconuts,0,false);
	}

	@Override 
	public double getSpeed() {
		return Math.max(0, Parrot.BASE_SPEED - Parrot.LOAD_FACTOR * numberOfCoconuts);
	}
}
