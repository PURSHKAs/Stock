package store;

public class Item {
	private String ID;
	private static String Dress;
	private String Size;
	private String Color;
	private String Img;
	private int Qty;
	
	
	
	
	public Item(String iD, String dress, String size, String color, String img, int qty) {
		super();
		ID = getID();		//ID del capo 
		Dress = getDress();	//nome del capo
		Size = getSize();	//taglia del capo
		Color = getColor(); //Colore del capo
		Img= img;		//Percorso del file immagine 
		Qty = getQty();		//Quantità 
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public static String getDress() {
		return Dress;
	}
	public void setDress(String dress) {
		Dress = dress;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}

	
	
	
	
	
	
}
