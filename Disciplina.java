package mediaaluno;

/* essa classe servirá para todos os objetos e instancias de notas e matérias */
public class Disciplina {

	private double nota;
	private String disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "--*-- Disciplina: " + getDisciplina() + ", nota: " + getNota() + " --*--";
	}

}
