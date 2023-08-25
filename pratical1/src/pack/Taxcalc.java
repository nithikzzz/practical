package pack;

public class Taxcalc {
	public void calctax(Person obj) {
		if(obj.getIncome() <=35000) {
			obj.setTax(0);
		}
		else if(obj.getIncome()<=50000 && obj.getIncome()>=35000) {
			obj.setTax(1000);
		}
		else {
			obj.setTax(0);
		}
	}

}
