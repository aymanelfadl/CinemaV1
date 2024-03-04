package mmm;

public class Film {

	private String titleFilm;
	private String realisateur;
	
	public Film(String t, String r) {
		this.realisateur = r ;
		this.titleFilm = t ;
	}
	
	public String getTitleFilm() {
		return titleFilm;
	}
	public void setTitleFilm(String titleFilm) {
		this.titleFilm = titleFilm;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	@Override
	public String toString() {
		return "Film [titleFilm=" + titleFilm + ", realisateur=" + realisateur + "]";
	}
	
	
	
}
