package exercicios_banco_imobiliario.domain;
/**
 * @author alefe
 * @author artur
 * @author aisllan
 * @author carlos
 *
 */
public class Carta {
	
	/**
	 * int value for id
	 */
	private int id;
	/**
	 * String value for name
	 */
	private String nome;
	private int preco;
	private int aluguelSemCasa;
	private int aluguelUmaCasa;
	private int aluguelDuasCasas;
	private int aluguelTresCasas;
	private int aluguelQuatroCasas;
	private int aluguelHotel;
	private int numeroCasas;
	private int precoDaCasa;
	private int[] indices = null;
	
	
	/**
	 * @param id
	 * @param nome
	 */
	public Carta(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	

	public Carta(int id, String nome, int preco, int aluguelSemCasa, int aluguelUmaCasa,
			int aluguelDuasCasas, int aluguelTresCasas, int aluguelQuatroCasas, int aluguelHotel, int numeroCasas,
			int precoDaCasa) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.aluguelSemCasa = aluguelSemCasa;
		this.aluguelUmaCasa = aluguelUmaCasa;
		this.aluguelDuasCasas = aluguelDuasCasas;
		this.aluguelTresCasas = aluguelTresCasas;
		this.aluguelQuatroCasas = aluguelQuatroCasas;
		this.aluguelHotel = aluguelHotel;
		this.hipoteca = hipoteca;
		this.precoDaCasa = precoDaCasa;
	}

	
	public Carta(int id, String nome, int preco, int hipoteca) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.hipoteca = hipoteca;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getPreco() {
		return preco;
	}

	public int getAluguelSemCasa() {
		return aluguelSemCasa;
	}

	public int getAluguelUmaCasa() {
		return aluguelUmaCasa;
	}

	public int getAluguelDuasCasas() {
		return aluguelDuasCasas;
	}

	public int getAluguelTresCasas() {
		return aluguelTresCasas;
	}

	public int getAluguelQuatroCasas() {
		return aluguelQuatroCasas;
	}

	public int getAluguelHotel() {
		return aluguelHotel;
	}

	public int getHipoteca() {
		return hipoteca;
	}

	public int getPrecoDaCasa() {
		return precoDaCasa;
	}
	
	public int[] getIndices() {
		return indices;
	}

}
