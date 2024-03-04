package mmm;

import java.util.Date;


public class Test {
	
	public static void main(String[] args ) throws PlaceIndiponipleException {
		
		Cinema c1 = new Cinema();
		Salle sVIP = new SalleVIP(1,"salle vip ", 100, 50);
		Salle sNRM = new SalleNRM(2,"salle normale", 60 ,35);
		
		c1.chargerFilms("C:\\Users\\amine\\eclipse-workspace\\CinemaV2\\cinema.txt");
		
		c1.addFilm(new Film("men dar ldar", "ilyas nbv"));
		c1.addSalle(sVIP);
		c1.addSalle(sNRM);
		Film film = new Film("XD3" , "ayman el fadl");
		c1.addSeance(new Seance(film, new SalleVIP(4,"salle vip2", 150, 60), new Date(),145));
	
		System.out.println(c1.toString());
		System.out.println("======================= After selling some plcaes ====================================");

		c1.buyPlace(film, 4);
		System.out.println(c1.toString());

		c1.saveFilms("C:\\Users\\amine\\eclipse-workspace\\CinemaV2\\cinema1.txt");
		
		
	}

}
