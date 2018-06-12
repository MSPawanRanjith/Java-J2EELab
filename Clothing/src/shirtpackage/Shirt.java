package shirtpackage;

public abstract class Shirt {
	int mSize;
	int mPrice;
	String mColor;
	public Shirt(int size,int price) {
		mSize=size;
		mPrice=price;
	}
	
	public abstract String getColor();
	public abstract void putColor(String color);

}
