package Movie;

public enum MovieGenre {
	
	HORROR(0), COMEDIA(1), ROMANCE(2), ACAO(3), SIFI(4), CLASSICO(5), DRAMA(6), ANIMACAO(7);

	private int id;

	MovieGenre(int id) {
		this.setId(id);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
