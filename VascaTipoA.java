package esercizi.esercizio18;
/*
	La classe VascaTipoA, derivata dalla precedente, si rende necessaria per gestire i dati di una
	vasca a forma cilindrica, per cui viene definito il costruttore
	VascaTipoA(String nome,double diametro,double altezza) 
 */
public class VascaTipoA extends Vasca{

	public VascaTipoA(String nome, double diametro, double altezza) {
		super(nome, (diametro/2)*(diametro/2)*3.1415*altezza, 0);
	}

	public VascaTipoA(String nome, double diametro, double altezza, double qta) {
		super(nome, (diametro/2)*(diametro/2)*3.1415*altezza, qta);
	}
	
}
