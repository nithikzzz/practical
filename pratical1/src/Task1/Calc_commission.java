package Task1;

public class Calc_commission {

	int percent,com;
	
	public void Calc( Commission C) {
		if( C.getSales_amount() >= 100000 ) {
			percent= ( C.getSales_amount()/100 ) * 10 ;
			com=C.setSales_amount(percent);
			System.out.print("The Commmission Amount is : " + com );
			
		}
		else if( 50000 <= C.getSales_amount() && C.getSales_amount() < 100000 ) {
			percent= ( C.getSales_amount()/100 ) * 5 ;
			com= C.setSales_amount(percent);
			System.out.print("The Commmission Amount is : " + com );
		}
		else if( 30000 <= C.getSales_amount() && C.getSales_amount() < 50000 ) {
			percent= ( C.getSales_amount()/100 ) * 3 ;
			com=C.setSales_amount(percent);
			System.out.print("The Commmission Amount is : " + com );
		}
		else {
			com=C.setSales_amount(0);
			System.out.print("The Commmission Amount is : No Commission " );
		}
		
	}
}

