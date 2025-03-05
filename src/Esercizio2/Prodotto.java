package Esercizio2;

public class Prodotto {
	private String name = "prodotto di default";
	private Double price = 0.0d;
	private Integer quantity = 0;

	public Prodotto(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + this.name + ", Prezzo=" + this.price + ", Quantità=" + this.quantity + "]";
	}

}
