package mmm;

import java.util.List;

public interface IUserCinema {
	
	public Film consulterFilm(String titre);
	
	public Salle consulterSalle(int id);
	
	public List<Film> consulterFilms();
	
	public void buyPlace(Film film , int nbr) throws PlaceIndiponipleException;

}
