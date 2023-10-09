package jdbc_programs;
import java.sql.*;   //step -1 import the packages
import javax.sql.*;

public class JdbcSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step -2 load and register the driver but skip in this version
		//step - 3 Establish the connection
		try {
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root" , "Balaji1359@");
		// step - 4 create the statement
			Statement st=conn.createStatement();
		// step - 5 Execute the query
			String strSelect="select ID ,Age ,Name from demo_table";
			System.out.println("The Statement : " + strSelect );
		// step - 6 process the result
			ResultSet rst = st.executeQuery(strSelect);
			System.out.println("The records are: ");
			int rowCount=0;
			while(rst.next()) {
				int ID = rst.getInt("ID");
				int Age=rst.getInt("Age");
				String Name=rst.getString("Name");
				
				System.out.println(ID + " " + Age + " " + Name );
				++rowCount;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
