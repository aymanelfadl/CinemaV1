package mmm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Cinema implements IUserCinema, IAdminCinema, IVendeurCinema {

	ArrayList<Salle> salles = new ArrayList() ; 
	ArrayList<Film> films = new ArrayList() ;
	ArrayList<Seance> seances = new ArrayList();
	
	@Override
	public Film consulterFilm(String titre) {
		for(Film f : films) {
			if(f.getTitleFilm().equals(titre)) {
				return f;				
			}
		}
		System.out.print("NO FILM FOUND!!");
		return null;
	}

	@Override
	public Salle consulterSalle(int id) {
		for(Salle s : salles) {
			if(s.getIdSalle() == id) {
				return s;
			}
		}
		System.out.print("NO SALLE FOUND!!");
		return null;
	}

	@Override
	public List<Film> consulterFilms() {
		return films;
	}

	@Override
	public void buyPlace(Film film , int nbr) throws PlaceIndiponipleException {
		for(Seance seance : seances) {
			if(seance.getFilm().getTitleFilm().equals(film.getTitleFilm())) {
				if(seance.getSalle().getNbrPlaces() > seance.getNbrPlcaesV()+nbr) {
					seance.buyPlace(nbr);
				}else {
					throw new PlaceIndiponipleException("FULL !!");
				}
			}
		}
		
	}

	@Override
	public void addFilm(Film film) {
		this.films.add(film);
	}

	@Override
	public void addSalle(Salle salle) {
		this.salles.add(salle);
	}

	@Override
	public void addSeance(Seance seance) {
		this.seances.add(seance);
	}

	@Override
	public void chargerFilms(String chemain) {
		try {
		File f = new File (chemain);
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		String line;
		while((line=bfr.readLine()) != null) {
			String[] lines = line.split(";");
			this.films.add(new Film(lines[0],lines[1]));
		}
		
		}catch(Exception e){
			e.getMessage();
		}
	}

	@Override
	public void saveFilms(String chemain) {
		try {
			File f = new File(chemain);
			FileWriter fw = new FileWriter(f);
			BufferedWriter bfw = new BufferedWriter(fw);
			for(Film flm : films) {
				bfw.write(flm.toString());
				bfw.newLine();
			}
			bfw.close();
			System.out.println("DONE !");
		}catch(Exception e) {
			e.getMessage();
		}
	}

	@Override
	public void sellPlace(Film film) {

		
	}

	@Override
	public String toString() {
		return "Cinema [salles=" + salles + ", films=" + films + ", seances=" + seances + "]";
	}

}