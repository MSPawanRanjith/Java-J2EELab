package shirtpackage;

public class Shop {
	
	
	public static void main(String[] args) {
		PullOver pullOver=new PullOver(38, 2000, true, false);
		//pullOver.getColor();
		pullOver.putColor("Black");
		System.out.println("Pull Over\nSize : "+pullOver.mSize+"\nPrice : "+pullOver.mPrice+"\nColor : "+pullOver.getColor()+"\nHas hood : "+pullOver.mHasHood+"\nHas Stripe : "+pullOver.mHasStripes);
		
		PartyWear partyWear=new PartyWear(28, 3000, true, true, "LV"); 
		//partyWear.getColor();
		partyWear.putColor("Red");
		System.out.println("Party Wear\nSize : "+partyWear.mSize+"\nPrice : "+partyWear.mPrice+"\nColor : "+partyWear.getColor()+"\nHas Sleves : "+partyWear.mHasSleves+"\nHas Stripe : "+partyWear.mHasStripes+"\nBrand : "+partyWear.mBrand);
		
		FormalShirt formalShirt=new FormalShirt(40, 2050, false, false);
		//formalShirt.getColor();
		formalShirt.putColor("Green");
		System.out.println("Formal Shirt\nSize : "+formalShirt.mSize+"\nPrice : "+formalShirt.mPrice+"\nColor : "+formalShirt.getColor()+"\nHas Sleve  : "+formalShirt.mHasSleves+"\nHas Stripe : "+formalShirt.mHasStripes);
		

	}

}
