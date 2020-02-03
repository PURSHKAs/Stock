package store;

public class Supplier {
	private String Name;
	private String Office; //sede legale del fornitore
	private String Logo; //Stringa per il percorso dei file
	
	
	
	
	public Supplier(String name, String office, String logo) {
		Name = getName();
		Office = getOffice();
		Logo = getLogo();
	}




	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getOffice() {
		return Office;
	}

	public void setOffice(String office) {
		Office = office;
	}

	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		Logo = logo;
	}
}
