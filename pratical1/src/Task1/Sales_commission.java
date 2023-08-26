package Task1;

import java.util.Scanner;

public class Sales_commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,address;
		int phn,sales_amount;
		Scanner ob= new Scanner(System.in);
		System.out.print("Enter your Name : ");
		name=ob.next();
		System.out.print("Enter your Address : ");
		address=ob.next();
		System.out.print("Enter your Mobile Number : ");
		phn=ob.nextInt();
		System.out.print("Enter your Sales Account : ");
		sales_amount=ob.nextInt();
		
		Commission co=new Commission();
		co.setName(name);
		co.setAddress(address);
		co.setPhone(phn);
		co.setSales_amount(sales_amount);
		
		Calc_commission cc=new Calc_commission();
		cc.Calc(co);
		System.out.print("Commission amount is ");
		System.out.print(co);
		
	}

}
