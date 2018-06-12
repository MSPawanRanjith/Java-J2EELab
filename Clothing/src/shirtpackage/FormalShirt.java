package shirtpackage;

public class FormalShirt extends Shirt {

	boolean mHasSleves;
	boolean mHasStripes;
	public FormalShirt(int size, int price,boolean hasSleves, boolean hasStripes) {
		super(size, price);
		mHasSleves=hasSleves;
		mHasStripes=hasStripes;
		mColor="None";
	}

	@Override
	public String getColor() {
		return mColor;
	}

	@Override
	public void putColor(String color) {
		mColor=color;

	}

}
