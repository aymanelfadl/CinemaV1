package mmm;

import java.util.Date;

public class Seance {

	private Film film;
	private Salle salle;
	private Date date;
	private int nbrPlcaesV;
	
	public Seance(Film f, Salle s, Date d,int nbrPlacesV) {
		this.film = f; this.salle=s; this.date=d; this.nbrPlcaesV = nbrPlacesV;
	}
	
	
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNbrPlcaesV() {
		return nbrPlcaesV;
	}
	public void setNbrPlcaesV(int nbrPlcaesV) {
		this.nbrPlcaesV = nbrPlcaesV;
	}

	public void buyPlace(int nbrPlaces) {
		this.nbrPlcaesV += nbrPlaces;
	}
	
	@Override
	public String toString() {
		return "Seance [film=" + film.toString() + ", salle=" + salle.toString() + ", date=" + date + ", nbrPlcaesV=" + nbrPlcaesV + "]";
	}
	
	
	
}
