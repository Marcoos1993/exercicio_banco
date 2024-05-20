package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public List<Conta> listContas = new ArrayList<>();
	
	public void addConta(Conta conta) {
		listContas.add(conta);
	}
	
	
	
}
