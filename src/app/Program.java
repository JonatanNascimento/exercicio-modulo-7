/**
 * 
 * @author jonatanNascimento
 */


package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalNote());
		
		//Calculo para verificar se aluno "Passa" ou "Reprova"
		if (student.finalNote() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missing());
		}
		else {
			System.out.println("PASS");			
		}		
		
		sc.close();
	}

}
