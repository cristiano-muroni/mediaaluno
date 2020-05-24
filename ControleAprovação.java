package mediaaluno;
// controle da classe Aluno e Disciplina

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ControleAprovação {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno = null;

		for (int qtd = 1; qtd < 4; qtd++) {// inico do escopo para add varios alunos

			aluno = new Aluno();

			// capturando os dados do usuário
			System.out.println(" Digite o Ra do aluno");
			aluno.setRa(Integer.parseInt(sc.nextLine()));
			System.out.println(" Digite o nome do aluno " + qtd);
			aluno.setNome(sc.nextLine());
			System.out.println(" Digite o nome do pai do aluno");
			aluno.setNomePai(sc.nextLine());
			System.out.println(" Digite o nome do mãe do aluno");
			aluno.setNomeMae(sc.nextLine());
			System.out.println(" Digite o CPF aluno");
			aluno.setNumeroCpf(Long.parseLong(sc.nextLine()));
			System.out.println(" Digite a data de nascimento");
			aluno.setDataNascimento(sc.nextLine());
			System.out.println(" Digite o nome da Escola");
			aluno.setNomeEscola(sc.nextLine());
			String semestre = JOptionPane.showInputDialog(" digite o semestre do aluno");
			aluno.setSemestre(semestre);

			Disciplina disciplina = null;

			for (int i = 1; i < 4; i++) {// escopo que scaneia para dentro do List, os dados vindo do usuário

				String nomeDisciplina = JOptionPane.showInputDialog(" Digite o nome da disciplina" + i + " ?");
				String notaDisciplina = JOptionPane.showInputDialog(" Digite a nota da disciplina" + i + " ?");
				disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);

			}

			alunos.add(aluno);// add aluno na lista de alunos

		} // fim do escopo para add varios alunos

		for (Aluno alunoX : alunos) {
			System.out.println(alunoX.toString());
			System.out.printf("a sua media é %.2f: \n", alunoX.getMediaNota());
			System.out.println(" O aluno " + alunoX.getNome() + " está" + alunoX.getAprovacao());
			System.out.println("-------------------------- * -------------------------------");

		}

		for (Disciplina conteudo : aluno.getDisciplinas()) {// escopo que faz mostra na tela a lista de disciplinas e
															// suas notas
			System.out.println(conteudo.toString());
		}

		int escolha = JOptionPane.showConfirmDialog(null, " Deseja remover alguma disciplina?");

		if (escolha == 0) {// trecho do código que faz a remoção de disciplinas

			int continuaRemov = 0;
			int position = 0;
			while (continuaRemov == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual será removida? \n a 1, 2, 3 ou 4 ?");
				aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - position);
				position++;
				continuaRemov = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
			} // final do trecho que faz a remoção de disciplinas
		}

		sc.close();
	}

}
