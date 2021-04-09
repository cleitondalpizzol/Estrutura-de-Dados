
public class Frutas{

	
	private String nome;
	private double peso;
	
	public Frutas() {}
	
	public Frutas(String nome, Double peso) {
		setNome(nome);
		setPeso(peso);
	}
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Frutas [nome=" + nome + ", peso=" + peso + "]";
	}

}
