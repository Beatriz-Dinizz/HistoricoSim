package controller;

import br.edu.fateczl.pilhaIntString.PilhaString;

public class HistoricoController {
	
		public HistoricoController() {
			super();
		}
		
		public void inserirEndereco(PilhaString historico, String endereco) {
			historico.push(endereco);
		}
		
		public void consultarUltimoEndereco(PilhaString historico) {
			try {
				System.out.println(historico.top());
			} catch (Exception e) {
				System.err.println("Não há histórico.");
			}
		}
		
		public void removerUltimoEndereco(PilhaString historico) {
			try {
				System.out.println("Endereço '" + historico.pop() + "' removido.");
			} catch (Exception e) {
				System.err.println("O histórico está vazio");
			}
		}
		
		public void limparHistorico(PilhaString historico) {
			while(!historico.isEmpty()) {
				try {
					historico.pop();
				} catch (Exception e) {
					System.err.println("O histórico já está vazio");
				}
			}
			System.out.println("O histórico apagado.");
		}
}
