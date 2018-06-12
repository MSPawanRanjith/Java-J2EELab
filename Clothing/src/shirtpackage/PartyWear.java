package shirtpackage;

public class PartyWear extends FormalShirt {
	
	String mBrand;
	public PartyWear(int size, int price, boolean hasSleves, boolean hasStripes,String brand) {
		super(size, price, hasSleves, hasStripes);
		mBrand=brand;
	}

}
