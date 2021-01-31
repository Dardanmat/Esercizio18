package esercizi.esercizio18;
/*
	La classe VascaTipoB invece gestisce i dati di una vasca a forma di parallelepipedo, per cui viene
	definito il costruttore
	VascaTipoB(String nome,double largh, double lungh, double alt)
*/
public class VascaTipoB extends Vasca{

	public VascaTipoB(String nome, double largh, double lungh, double alt) {
		super(nome, largh*lungh*alt, 0);
	}
	
	public VascaTipoB(String nome, double largh, double lungh, double alt, double qta) {
		super(nome, largh*lungh*alt, qta);
	}
	
	
	
}
