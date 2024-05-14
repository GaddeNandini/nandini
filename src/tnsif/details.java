package tnsif;
import java.util.Scanner;
public class details {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String name;
		System.out.println("Enter full name : ");
		name=obj.nextLine();
		int num;
		System.out.println("enter roll number:");
		num=obj.nextInt();
		String grading;
		System.out.println("Enter the grade: ");
		grading=obj.next();
		float perc;
		System.out.println("Enter the percentage");
		perc=obj.nextFloat();
		person p=new person();
		p.setFullname(name);
		p.setRollno(num);
		p.setGrade(grading);
		p.setPercentage(perc);
		System.out.println(p);
		

	}

}


