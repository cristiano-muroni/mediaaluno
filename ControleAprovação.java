package mediaaluno;
// controle da classe aluno
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ControleAprovação {


	public static void main(String[] args) {
		 
		Aluno aluno = new Aluno();
		Disciplina disciplina = new Disciplina();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		aluno.setSemestre(JOptionPane.showInputDialog("diga o seu semestre"));		
		System.out.println("diga o nome do aluno");
		aluno.setNome(sc.nextLine());
		System.out.println("digite o RA");
		aluno.setRa(Integer.parseInt(sc.nextLine()));
		//System.out.println("digite o semestre");
		//aluno.setSemestre(semestre);
		//aluno.setSemestre(sc.nextLine());
		System.out.println("digite a disciplina 1");
		disciplina.setDisciplina1(sc.nextLine());
		System.out.println("digite a nota 1");
		disciplina.setNota1(Double.parseDouble(sc.nextLine()));
		System.out.println("digite a disciplina 2");
		disciplina.setDisciplina2(sc.nextLine());
		System.out.println("digite a nota 2");
		disciplina.setNota2(Double.parseDouble(sc.nextLine()));
		System.out.println("digite a disciplina 3");
		disciplina.setDisciplina3(sc.nextLine());
		System.out.println("digite a nota 3");
		disciplina.setNota3(Double.parseDouble(sc.nextLine()));
		System.out.println("digite a disciplina 4");
		disciplina.setDisciplina4(sc.nextLine());
		System.out.println("digite a nota 4");
		disciplina.setNota4(Double.parseDouble(sc.nextLine()));
		
		System.out.println("---------------- * -----------------");
		System.out.println(aluno.toString());
		System.out.println("---------------- * -----------------");
		System.out.println(disciplina.toString());
		System.out.println("---------------- * -----------------");
		System.out.printf("A sua nota média é %.2f \n",disciplina.mediaNota());
		System.out.println(aluno.getNome() + " você está " + (disciplina.aprovação()? "aprovado": " reprovado"));
		System.out.println("---------------- * -----------------");

		
		sc.close();
	}

}
