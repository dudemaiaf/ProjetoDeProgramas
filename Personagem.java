package personagem;
import comportamentos.ComportamentoNormal;

public abstract class Personagem implements ComportamentoNormal{
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void andar ();
	public abstract void usarItem ();
	public abstract void guardarItem ();
	
}
