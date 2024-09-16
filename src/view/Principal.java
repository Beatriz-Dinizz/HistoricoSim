package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.pilhaIntString.PilhaString;
import controller.HistoricoController;

public class Principal {

	public static void main(String[] args) {
		PilhaString historico = new PilhaString();
		HistoricoController historicoController = new HistoricoController();
		
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n Escolha uma opção: \n 1 - Inserir um novo endereço no histórico "
					+ "\n 2 - Exibir o último endereço visitado \n 3 - Remover o último endereço do histórico;  \n 4 - Apagar histórico \n 9 - Finalizar"));
			switch(opc) {
				case 1:
					String endereco = "";
					while (true) {
						endereco = JOptionPane.showInputDialog("Informe um endereço de site: ");
						if(endereco.contains("http://www.") && (endereco.contains(".com") || endereco.contains(".br") 
								|| endereco.contains(".net") || endereco.contains(".gov"))) {
							break;
						}
					}
					
					historicoController.inserirEndereco(historico, endereco);
					break;
				case 2:
					historicoController.consultarUltimoEndereco(historico);
					break;
				case 3:
					historicoController.removerUltimoEndereco(historico);
					break;
				case 4:
					historicoController.limparHistorico(historico);
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Operação inválida!");
			}
		}
	}
}
