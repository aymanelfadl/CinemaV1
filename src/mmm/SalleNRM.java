package mmm;

public class SalleNRM extends Salle {

	private int prixSalle ;
	
	public SalleNRM(int id, String nom, int nbrPlaces,int prix) {
		super(id, nom, nbrPlaces);
		this.prixSalle = prix;
	}

	@Override
	public String toString() {
		return super.toString() + "SalleNRM [prixSalle=" + prixSalle + "]";
	}

}
