package store;
import java.util.ArrayList;

public class Store {
	private ArrayList<Item> Stock= new ArrayList<Item>(); //Articoli contenuti nel magazzino
	private String Address; //Indirizzo Magazzino
	
	




	public Store(ArrayList<Item> stock, String address) {
		Stock = getStock();
		Address = getAddress();
	}
	
	
	
	public ArrayList<Item> getStock() {
		return Stock;
	}

	public void setStock(ArrayList<Item> stock) {
		Stock = stock;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Item FindItem(String Dress) {
		for(Item item: Stock) {
			if(Item.getDress().equals(Dress)) 
				return item;
		}
		return null;
	}
}

