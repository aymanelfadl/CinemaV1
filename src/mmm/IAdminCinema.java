package mmm;

public interface IAdminCinema {

	public void addFilm(Film film);
	
	public void addSalle(Salle salle);
	
	public void addSeance(Seance seance);
	
	public void chargerFilms(String chemain);
	
	public void saveFilms(String chemain);
	
	
}
