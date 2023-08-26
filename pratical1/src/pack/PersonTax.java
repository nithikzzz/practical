package pack;

import java.util.Scanner;

public class PersonTax {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		name=ob.next();
		System.out.println("Enter Employee Income : ");
		int income=ob.nextInt();
		System.out.println("Employee tax  ");
		int tax=ob.nextInt();
		Person p=new Person();
		p.setName(name);
		p.setIncome(income);
		Taxcalc calc=new Taxcalc();
		calc.calctax(p);
		System.out.println("After calc ");
		System.out.println(p);
	}

}
