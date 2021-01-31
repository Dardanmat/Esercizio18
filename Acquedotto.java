package esercizi.esercizio18;
import java.util.Vector;

/*
	Scrivere la classe contenitore Acquedotto con il dato privato Vector di oggetti di tipo Vasca
	fornendo i seguenti metodi:
		� Vasca ricercaVasca(String nome)Restituisce la vasca dato il nome (se non esiste
			una vasca con quel nome, generare un�eccezione)
			
		� void aggiungiVasca(Vasca v) Aggiunge una vasca
		
		� boolean rimuoviVasca(String nome)Rimuove una vasca con quel nome (se non
			esiste una vasca con quel nome, generare un�eccezione)
			
		� boolean aggiungiContenuto(String nome, double quantita)Aggiunge il
			contenuto ad una vasca dato il nome (se non esiste una vasca con quel nome generare
			un�eccezione) e restituisce se la quantit� � stata aggiunta nella vasca
			
		� boolean prelevaContenuto (String nome, double quantita) Preleva il
			contenuto da una vasca dato il nome (se non esiste una vasca con quel nome generare
			un�eccezione) e restituisce se la quantit� � stata prelevata dalla vasca
			
		� double getContenuto(String nome)Restituisce il contenuto di una vasca dato il
			nome (se non esiste una vasca con quel nome generare un�eccezione)
			
		� double getContenutoTotale()Restituisce il contenuto totale delle vasche
		
		� int contaVascheA()Restituisce il numero delle vasche di tipo A
*/
public class Acquedotto {

	Vector<Vasca> listaVasche;

	public Acquedotto(Vector<Vasca> listaVasche) {
		this.listaVasche = listaVasche;
	}
	
	public Acquedotto(Acquedotto a) {
		this.listaVasche = a.listaVasche;
	}
	
	public Acquedotto() {
		this.listaVasche = new Vector<>();
	}

	public Vector<Vasca> getListaVasche() {
		return listaVasche;
	}
	public void setListaVasche(Vector<Vasca> listaVasche) {
		this.listaVasche = listaVasche;
	}
	
	/*� Vasca ricercaVasca(String nome)Restituisce la vasca dato il nome (se non esiste
			una vasca con quel nome, generare un�eccezione)*/
	public Vasca ricercaVasca(String nome) throws MiaEccezione {

		for(Vasca v: listaVasche) {
			if(v.getNome().equals(nome)) {
				return v;
			}
		}
		throw new MiaEccezione("La vasca col nome " + nome + " non esiste nella lista.");

	}
	
	public boolean isVascaPresente(Vasca v) {
		for(Vasca va: listaVasche) {
			if(va.equals(v)) return true;
		}
		return false;
	}
	
	//� void aggiungiVasca(Vasca v) Aggiunge una vasca
	public void addVasca(Vasca v) throws MiaEccezione {
		if(isVascaPresente(v)) throw new MiaEccezione("La vasca "+v.getNome()+" è già presente");
		
		listaVasche.add(v);
	}
	
	//boolean rimuoviVasca(String nome)Rimuove una vasca con quel nome (se non
	//esiste una vasca con quel nome, generare un�eccezione)
	
	public void removeVasca(String nome) throws MiaEccezione {
		listaVasche.remove(ricercaVasca(nome));
	}
	
	/*� boolean aggiungiContenuto(String nome, double quantita)Aggiunge il
			contenuto ad una vasca dato il nome (se non esiste una vasca con quel nome generare
			un�eccezione) e restituisce se la quantit� � stata aggiunta nella vasca*/
	
	public void addContenuto(String nome, double qta) throws MiaEccezione {
		ricercaVasca(nome).removeContenuto(qta);
	}
	
	/*� boolean prelevaContenuto (String nome, double quantita) Preleva il
			contenuto da una vasca dato il nome (se non esiste una vasca con quel nome generare
			un�eccezione) e restituisce se la quantit� � stata prelevata dalla vasca*/
	
	public void prelevaContenuto(String nome, double qta) throws MiaEccezione {
		ricercaVasca(nome).removeContenuto(qta);
	}
	
	/*� double getContenuto(String nome)Restituisce il contenuto di una vasca dato il
			nome (se non esiste una vasca con quel nome generare un�eccezione)*/
	
	public double getContenuto(String nome) throws MiaEccezione {
		return ricercaVasca(nome).getQtaContenuto();
	}
	
	/*� double getContenutoTotale()Restituisce il contenuto totale delle vasche*/
	
	public double getContenutoTotale() {
		double sum = 0;
		
		for(Vasca v: listaVasche) {
			sum += v.getQtaContenuto();
		}
		return sum;
	}
	
	/*� int contaVascheA()Restituisce il numero delle vasche di tipo A*/
	
	public int contaVascheA() {
		int i = 0;
		
		for(Vasca v: listaVasche) {
			if(v instanceof VascaTipoA) {
				i++;
			}
		}
		return i;
	}
	
}
