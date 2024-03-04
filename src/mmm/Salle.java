package mmm;

public  abstract class Salle {
	private int idSalle;
	private String nomSalle;
	private int nbrPlaces;
	
	public Salle(int id , String nom , int nbrPlaces) {
		this.idSalle=id;this.nbrPlaces=nbrPlaces;this.nomSalle=nom;
	}
	
	public int getIdSalle() {
		return this.idSalle;
	}
	
	public void setIdSalle(int id) {
		this.idSalle = id;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public int getNbrPlaces() {
		return nbrPlaces;
	}

	public void setNbrPlaces(int nbrPlaces) {
		this.nbrPlaces = nbrPlaces;
	}

	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", nbrPlaces=" + nbrPlaces + "]";
	}
	
}
