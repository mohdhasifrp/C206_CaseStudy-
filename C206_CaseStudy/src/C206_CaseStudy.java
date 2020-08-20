
import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;

		while (option != 5) {

		C206_CaseStudy.menu();//HASIF
		option = Helper.readInt("Enter an option > ");
		}
	}
		
		
	public static void menu() {
		C206_CaseStudy.setHeader("Renovation ACE customer app");
		System.out.println("1. Visitor account Registration");
		System.out.println("2.Request for Quotation");
		System.out.println("3. Manage Appointment");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

}
