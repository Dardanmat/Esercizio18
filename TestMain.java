package esercizi.esercizio18;


public class TestMain {

	public static void main(String[] args) throws MiaEccezione {
		
		VascaTipoA va1 = new VascaTipoA("Pignolo", 10, 5);
		VascaTipoA va2 = new VascaTipoA("Calice", 12, 7);
		VascaTipoA va3 = new VascaTipoA("Lampada", 30, 10);
		VascaTipoA va4 = new VascaTipoA("Tasso", 8, 17);
		
		VascaTipoB vb1 = new VascaTipoB("Coperta", 15, 30, 10);
		VascaTipoB vb2 = new VascaTipoB("Buddha", 20, 32, 8);
		VascaTipoB vb3 = new VascaTipoB("Sanguisuga", 30, 60, 20);
		
		stampa("Create le vasche\n");
		
		Acquedotto a = new Acquedotto();
		
		String str = "Aggiunta vasca";
		
		a.addVasca(vb1);
		stampa(str + " " + vb1.getNome());
		
		a.addVasca(vb2);
		stampa(str + " " + vb2.getNome());
		
		a.addVasca(vb3);
		stampa(str + " " + vb3.getNome());
		
		a.addVasca(va1);
		stampa(str + " " + va1.getNome());
		
		a.addVasca(va2);
		stampa(str + " " + va2.getNome());
		
		a.addVasca(va3);
		stampa(str + " " + va3.getNome());
		
                //va4.setNome("Calice"); //per avere l'errore che la vasca esiste di già
                
		a.addVasca(va4);
		stampa(str + " " + va4.getNome());
		
		stampa(a.ricercaVasca("Buddha").getNome());
		
                
                
	}
	
	public static void stampa(String s) {
		System.out.println(s);
	}

}
