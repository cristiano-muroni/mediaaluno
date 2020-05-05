package mediaaluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private int ra;
	private String nome;
	private String semestre;
		
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
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public double getMediaNota() { // método que calcula a média das notas da lista " Disciplinas"
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota(); 
		}
		return somaNotas / disciplinas.size() ;	  	
	}
	
	@Override
	public String toString() {
		return "O aluno ra: " + ra + ", nome: " + nome +"\n" + semestre  +" semestre";
	}
	
	
	
	
	
		
		
	
	
	

	

}
