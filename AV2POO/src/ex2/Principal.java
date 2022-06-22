package ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idaluno = Integer.parseInt(JOptionPane.showInputDialog("ID do Aluno: "));
		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano: "));
		
		AlunoEnem AlunoEnem = new AlunoEnem(idaluno, nome, ano);
		
		
		
		ArrayList<ProvaEnem>provas = new ArrayList<> ();
		
		double notaFinal=0;
		for(int i=0; i<=5; i++) {
			int idProva = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da prova: "));
			String titulo = JOptionPane.showInputDialog("Digite o titulo: ");
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
			
			ProvaEnem prova = new ProvaEnem (idProva, titulo, nota);
			provas.add(prova);
			notaFinal += prova.getNota();
		}
		
	
		JOptionPane.showMessageDialog(null, "Nota final: "+ notaFinal);
		
		
	}
}
	

