package mediaaluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private int ra;
	private String nome;
	private String nomePai;
	private String nomeMae;
	private String dataNascimento;
	private long numeroCpf;
	private String nomeEscola;
	private String Semestre;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>(); // instanciando a classe "Disciplina" na lista

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(long numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSemestre() {
		return Semestre;
	}

	public void setSemestre(String semestre) {
		Semestre = semestre;
	}

	public double getMediaNota() { // método que calcula a média das notas da lista " Disciplinas"

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();

		}
		return somaNotas / disciplinas.size();
	}

	public boolean getAprovacao() {
		double media = this.getMediaNota();
		if (media >= 7) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return " O Aluno: " + "nome: " + getNome() + " ra: " + getRa() + "\n nomePai: " + getNomePai() + " e nomeMae: "
				+ getNomeMae() + "\n semestre:" + getSemestre() + "\n dataNascimento:" + getDataNascimento()
				+ ", numeroCpf:" + getNumeroCpf() + "\n" + " Escola: " + getNomeEscola() + "\n"  ;
	}
	

}
