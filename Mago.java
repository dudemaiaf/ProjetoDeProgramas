package personagem;
import comportamentos.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico{

	public Mago (String nome){
		super (nome);
	};
	@Override
	public void invisibilidade() {
		// TODO Auto-generated method stub
		System.out.println("Agora voce ve "+getNome()+", agora nao ve mais.");
	}

	@Override
	public void ultrarapidez() {
		// TODO Auto-generated method stub
		System.out.println("Quando eu, "+getNome()+", ativei essa habilidade voce nao conseguira me acompanhar.");
		
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		System.out.println("Ahhh, "+getNome()+" não deveria andar.");
	}

	@Override
	public void usarItem() {
		// TODO Auto-generated method stub
		System.out.println("O Implacavel Mago, "+getNome()+" vai usar seu cajado do vazio.");
	}

	@Override
	public void guardarItem() {
		// TODO Auto-generated method stub
		System.out.println("O Implacavel Mago, "+getNome()+" vai guardar seu anel.");
	}

}
