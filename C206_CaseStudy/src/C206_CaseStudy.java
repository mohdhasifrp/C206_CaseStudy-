
import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;

		while (option != 5) {

		C206_CaseStudy.menu();//HASIF
		option = Helper.readInt("Enter an option > ");
		if (option == 1) {
			C206_CaseStudy.setHeader("ADD USER ACCOUNT");			
			C206_CaseStudy.setHeader("VIEW ALL USER");
			C206_CaseStudy.setHeader("DELET USER BY NAME  ");
			System.out.println("1. ADD USER ACCOUNT");
			System.out.println("2. VIEW ALL USER");
			System.out.println("3. DELET USER BY NAME");
			int functionType = Helper.readInt("Enter option to select function > ");
			if (functionType == 1) {
				// ADD USER ACCOUNT
				

			} else if (functionType == 2) {
				// VIEW ALL USER
			
			}else if (functionType == 3) {
				//DELET USER BY NAME
			} else {
				System.out.println("Invalid functionType");
		
			}}else if (option == 2) {

		}
		}
	}
		
		
	public static void menu() {
		C206_CaseStudy.setHeader("Renovation ACE customer app");
		System.out.println("1. Visitor account Registration");
		System.out.println("2.Request for Quotation");
		System.out.println("3. Manage Appointment");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

}
