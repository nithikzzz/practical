package Task1;

public class Calc_commission {

	public int percent;
	public void Calc( Commission C) {
		if( C.getSales_amount() >= 100000 ) {
			percent= ( C.getSales_amount()/100 ) * 10 ;
			C.setSales_amount(percent);
		}
		else if( 50000 <= C.getSales_amount() && C.getSales_amount() < 100000 ) {
			percent= ( C.getSales_amount()/100 ) * 5 ;
			C.setSales_amount(percent);
		}
		else if( 30000 <= C.getSales_amount() && C.getSales_amount() < 50000 ) {
			percent= ( C.getSales_amount()/100 ) * 3 ;
			C.setSales_amount(percent);
		}
		else {
			C.setSales_amount(0);
		}
		
	}
}

