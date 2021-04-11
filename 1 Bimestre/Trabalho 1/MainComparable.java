
public class MainComparable {

	public static void main(String[] args) {
		JogosComparable jogos = new JogosComparable("Call Of Duty: Modern Warfare",190);
		JogosComparable jogos2 = new JogosComparable("Quantum Break",178);
		JogosComparable jogos3 = new JogosComparable("Destiny 2: Shadowkeep",165);
		JogosComparable jogos4 = new JogosComparable("Deus Ex: Mankind Divided",77);
		JogosComparable jogos5 = new JogosComparable("Gears Of War 4 ",112.3);
		
		
		System.out.println("Jogo "+jogos+" é maior que o jogo "+jogos2+" = "+jogos.compareTo(jogos2));
		System.out.println("Jogo "+jogos2+" é maior que o jogo "+jogos3+" = "+jogos2.compareTo(jogos3));
		System.out.println("Jogo "+jogos4+" é menor que o jogo "+jogos+" = "+jogos4.compareTo(jogos));
		System.out.println("Jogo "+jogos3+" é maior que o jogo "+jogos5+" = "+jogos3.compareTo(jogos5));
		System.out.println("Jogo "+jogos5+" é menor que o jogo "+jogos2+" = "+jogos5.compareTo(jogos2));
		System.out.println("Jogo "+jogos3+" é menor que o jogo "+jogos+" = "+jogos3.compareTo(jogos));
	}

}
