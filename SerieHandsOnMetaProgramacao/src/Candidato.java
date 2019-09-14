import java.math.BigDecimal;

public class Candidato {
	
	@Validacao(descricao = "Nome Completo")
	private String nome;
	@Validacao(descricao = "CPF")
	private String cpf;
	@Validacao(descricao = "Posição")
	private int posicao;
	@Validacao(descricao = "Nota")
	private BigDecimal nota;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public BigDecimal getNota() {
		return nota;
	}
	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}
	
	
	

}
