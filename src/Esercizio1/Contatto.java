package Esercizio1;

public class Contatto {

	private String nome;
	private String telefono;

	// Construtore
	public Contatto(String nome, String telefono) {
		super();
		this.nome = nome;
		this.telefono = telefono;
	}

//	getter and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", telefono=" + telefono + "]";
	}

}