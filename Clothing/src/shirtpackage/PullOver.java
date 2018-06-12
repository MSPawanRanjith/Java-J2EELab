package shirtpackage;

public final class PullOver extends Shirt {

	boolean mHasHood;
	boolean mHasStripes;
	
	public PullOver(int size, int price,boolean hasHood,boolean hasStripes ) {
		super(size, price);
		mHasHood=hasHood;
		mHasStripes=hasStripes;
		mColor="None";
	}

	@Override
	public String getColor() {
		
		return mColor;
	}

	@Override
	public void putColor(String color) {
		// TODO Auto-generated method stub
		mColor=color;

	}

}
