package mediaaluno;
// controle da classe aluno
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ControleAprovação {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		Disciplina disciplina1 = new Disciplina();		
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(10);
				
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática Discreta");
		disciplina2.setNota(8);
				
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Estrutura de Dados");
		disciplina3.setNota(5);
						
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Orientação a Objetos");
		disciplina4.setNota(9.5);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		System.out.println(aluno1.getMediaNota());
		
		
	

		
		sc.close();
	}

}
