package mediaaluno;
// controle da classe aluno
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ControleAprovação {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		String semestre = JOptionPane.showInputDialog(" digite o semestre do aluno");// *aqui que esta dando problema
		aluno.setSemestre(semestre);
		System.out.println(" Digite o Ra do aluno");
		aluno.setRa(Integer.parseInt(sc.nextLine())); // Integer.parseInt(sc.nextLine())
		System.out.println(" Digite o nome do aluno");
		aluno.setNome(sc.nextLine());
		System.out.println(" Digite o nome do pai do aluno");
		aluno.setNomePai(sc.nextLine());
		System.out.println(" Digite o nome do mãe do aluno");
		aluno.setNomeMae(sc.nextLine());
		System.out.println(" Digite o CPF aluno");
		aluno.setNumeroCpf(Integer.parseInt(sc.nextLine()));
		System.out.println(" Digite a data de nascimento");
		aluno.setDataNascimento(sc.nextLine());
		System.out.println(" Digite o nome da Escola");
		aluno.setNomeEscola(sc.nextLine());
		
		
		for (int i = 1; i < 4; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog(" Digite o nome da disciplina"+ i + " ?");
			String notaDisciplina = JOptionPane.showInputDialog(" Digite a nota da disciplina"+ i +" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		
		   System.out.println(aluno.toString());
		   System.out.printf(" A sua média é: .2f" + aluno.getMediaNota());
		   System.out.println(" O aluno " + aluno.getNome() + " está" + (aluno.getAprovacao() ? " Aprovado" :" Reprovado"));
		
		
	
		
		
	

		
		sc.close();
	}

}
