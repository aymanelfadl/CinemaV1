package mmm;

public class SalleVIP extends Salle{

	private int prixPlace;
	
	public SalleVIP(int id, String nom, int nbrPlaces , int prix) {
		super(id, nom, nbrPlaces);
		this.prixPlace= prix;
	}

	public int getPrixPlace() {
		return prixPlace;
	}

	public void setPrixPlace(int prixPlace) {
		this.prixPlace = prixPlace;
	}

	@Override
	public String toString() {
		return super.toString() + "SalleVIP [prixPlace=" + prixPlace + "]";
	}

}
