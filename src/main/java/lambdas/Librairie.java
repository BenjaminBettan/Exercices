package lambdas;

public class Librairie {
	private int nbLivres = 0;
	private int price = 0;
	
	public Librairie(int nbLivres, int price) {
		super();
		this.nbLivres = nbLivres;
		this.price = price;
	}

	public int getNbLivres() {
		return nbLivres;
	}

	public void setNbLivres(int nbLivres) {
		this.nbLivres = nbLivres;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Librairie [nbLivres=" + nbLivres + ", price=" + price + "]";
	}
	
}
