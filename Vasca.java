package esercizi.esercizio18;

/*
La classe base Vasca memorizza i dati di una vasca generica:

	� nome (di tipo stringa)
	
	� volume (double)
	
	� quantitativo_contenuto (double)
	
e li gestisce tramite i metodi:

	� il costruttore con parametro Vasca(String nome)
	
	� void aggiungiContenuto(double quantita)
		che aggiunge una certa quantit� SOLO se c'� sufficiente spazio disponibile, altrimenti genera una
		eccezione
		
	� void prelevaContenuto(double quantita)
		che sottrae una certa quantit� SOLO se essa non supera il contenuto presente, altrimenti genera
		una eccezione
		
	� double getContenuto() che restituisce la quantit� contenuta nella vasca
	
	� double getVolume() che restituisce il volume della vasca
*/

public class Vasca {
	
	/*La classe base Vasca memorizza i dati di una vasca generica:

		� nome (di tipo stringa)
		� volume (double)
		� quantitativo_contenuto (double)*/

	private String nome; //nome della vasca
	private double volume; //volume della vasca
	private double qtaContenuto; //volume occupato

	//CONSTRUCTORS
	public Vasca(String nome, double volume, double qtaContenuto) {
		super();
		this.nome = nome;
		this.volume = volume;
		this.qtaContenuto = qtaContenuto;
	}
	
	public Vasca() { //Empy Constructor
		super();
		this.nome = "";
		this.volume = 0;
		this.qtaContenuto = 0;
	}
	
	public Vasca(Vasca v) { //Copy Constructor
		super();
		this.nome = v.nome;
		this.volume = v.volume;
		this.qtaContenuto = v.qtaContenuto;
	}
	
	//� il costruttore con parametro Vasca(String nome)
	public Vasca(String nome) {
		super();
		this.nome = nome;
		this.volume = 0;
		this.qtaContenuto = 0;
	}
	
	//GETTERS & SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getQtaContenuto() {
		return qtaContenuto;
	}
	public void setQtaContenuto(double qtaContenuto) {
		this.qtaContenuto = qtaContenuto;
	}
	
	//� void aggiungiContenuto(double quantita)
	//		che aggiunge una certa quantit� SOLO se c'� sufficiente spazio disponibile, 
	//		altrimenti genera una eccezione
	
	public void addContenuto(double qta) throws MiaEccezione {
		
		if(qta > this.volume - this.qtaContenuto) {
			throw new MiaEccezione("Non c'è abbastanza spazio nella vasca per aggiungere " + qta + "l");
		}else {
			this.volume += qta;
		}
		
	}
	
	//� void prelevaContenuto(double quantita)
	//		che sottrae una certa quantit� SOLO se essa non supera il contenuto presente, 
	//		altrimenti genera una eccezione
	
	public void removeContenuto(double qta) throws MiaEccezione {
		if(volume < qta) {
			throw new MiaEccezione("E' possibile togliere al massimo "+ volume + "l");
		}else {
			this.volume -= qta;
		}
	}

	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Vasca) {
			return nome.equals(((Vasca) arg0).nome);
		}
		return false;
	}	
	
	
}









