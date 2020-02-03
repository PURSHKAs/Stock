package store;
import java.util.ArrayList;
public class Order {
	private ArrayList<Item> OrderList= new ArrayList<Item>();
	private int qty;

	


	public Order(ArrayList<Item> orderList, int oqty) {
		OrderList = getOrderList();	//lista degli ordini 
		qty= getqty();
	}

	
	public int getqty() {
		return qty;
	}


	public void setqty(int qty) {
		this.qty = qty;
	}

	public ArrayList<Item> getOrderList() {
		return OrderList;
	}

	public void setOrderList(ArrayList<Item> orderList) {
		OrderList = orderList;
	}
	
	
	//Funzione che aggiuge L'item alla lista degli ordini 
	public void addOrder(Item item, int qty) {
		OrderList.add(item);
		OrderList.set(qty, item);
	}
	
	
	//funzione che cerca un ordine nella lista
	public Item FindOrder(String Dress) {
		for(Item item: OrderList) {
			if(Item.getDress().equals(Dress)) 
				return item;
		}
		return null;
	}
}
