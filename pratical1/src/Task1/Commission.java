package Task1;

public class Commission {
	public String Name;
	public String Address;
	public int Phone;
	public int Sales_amount;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public int getSales_amount() {
		return Sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		Sales_amount = sales_amount;
	}
	@Override
	public String toString() {
		return "Commission [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + ", Sales_amount="
				+ Sales_amount + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getPhone()="
				+ getPhone() + ", getSales_amount()=" + getSales_amount() + "]";
	}
	
	
}
