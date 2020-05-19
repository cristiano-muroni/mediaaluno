package mediaaluno;
// controle da classe Aluno e Disciplina

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ControleAprovação {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
        // capturando os dados do usuário
		System.out.println(" Digite o Ra do aluno");
		aluno.setRa(Integer.parseInt(sc.nextLine()));
		System.out.println(" Digite o nome do aluno");
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

		for (Disciplina conteudo : aluno.getDisciplinas()) {//escopo que faz mostra na tela a lista de disciplinas e suas notas
			System.out.println(conteudo.toString());
		}

		System.out.println(aluno.toString());
		System.out.printf("a sua media %.2f: \n", aluno.getMediaNota());
		System.out.println(" O aluno " + aluno.getNome() + " está" + aluno.getAprovacao());

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
		for (Disciplina conteudo : aluno.getDisciplinas()) {// escopo que mostra na tela todas a notas e discipinas que
															// sobraram, não contendo mais os excluídos
			System.out.println(conteudo.toString());
		}

		sc.close();
	}

}
