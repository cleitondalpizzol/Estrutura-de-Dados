
public class JogosComparable implements Comparable<JogosComparable>{
	private String nome;
	private double tamanho;

	
	public JogosComparable(String nome, double tamanho) {
		setNome(nome);
		setTamanho(tamanho);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "" + nome;
	}
	
	@Override
	public int compareTo(JogosComparable jogos) {
		
		if(jogos == null) {
			throw new RuntimeException("O objeto está nulo");
		}
		
		double comparacao = this.tamanho -  jogos.tamanho;
		if(comparacao > 0.0) {
			return 1;
		}
		if(comparacao < 0.0) {
			return -1;
		}
		return 0;
	}
}
