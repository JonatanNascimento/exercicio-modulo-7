/**
 * @author jonatanNascimento
 */


package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3; 
	
	//Metodo para calculo da soma das notas
	public double finalNote() {
		return nota1 + nota2 + nota3;
	}
	
	//Metodo para verificar e calcular quanto falta para atingir a media
	public double missing() {
		if (finalNote() < 60) {
			return 60 - finalNote();
		}
		else {
			return 0.0;
		}
	}
	
	
}
