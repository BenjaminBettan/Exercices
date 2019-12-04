package lambdas;
/**Simple POJO*/
public class Bookshop {
	private int quantity = 0;
	private int price = 0;
	
	public Bookshop(int quantity, int price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Librairie [nbLivres=" + quantity + ", price=" + price + "]";
	}
	
}
