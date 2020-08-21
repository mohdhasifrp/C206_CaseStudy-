
import java.util.ArrayList;
public class C206_CaseStudy {
	

	public static void main(String[] args) {
		menu();
		int option = Helper.readInt("Enter an option > ");
		while (option != 6) {

			if (option == 1) {
				ArrayList<Account> UserList = null;
				Account(UserList);
			} else if (option == 2) {
				//Request for Quotation
			} else if (option == 3) {
				
				//Manage Appointment	
				
			} else if (option == 4) {
				//Manage Quotation

			} else if (option == 5) {
				 //Manage package
			} else {
				System.out.println("Invalid option!!!");
			}
			menu();
			option = Helper.readInt("Enter an option > ");
		}
		
	}

	public static void menu() {
		C206_CaseStudy.setHeader("Renovation ACE app");
		System.out.println("1. Visitor account Registration");
		System.out.println("2. Request for Quotation");
		System.out.println("3. Manage Appointment");
		System.out.println("4. Manage Quotation");
		System.out.println("5. Manage package");
		System.out.println("6. Exit");
		Helper.line(80, "-");
	
	}

	
	private static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");

	}

	private static void Account(ArrayList<Account> UserList) {
		System.out.println(
		"Option 1. Add user account\nOption 2. View all users\nOption 3. Delete user by name\nOption 4. Exit Back to menu");

		int option = Helper.readInt("Enter an Option > ");
		while (option != 4) {
			if (option == 1) {
				Helper.line(80, "-");
				System.out.println("ADD USER ACCOUNT");
				Helper.line(80, "-");
				String name = Helper.readString("Enter your name > ");
				String role = Helper.readString("Enter your role > ");
				String email = Helper.readString("Enter your email > ");
				String password = Helper.readString("Enter a password > ");
				UserList.add(new Account(name, role, email, password));
			System.out.println(" added");
			} else if (option == 2) {
				Helper.line(80, "-");
				System.out.println("VIEW ALL USERS");
				Helper.line(80, "-");

				for (int i = 0; i < UserList.size(); i++) {
					UserList.get(i).viewUser();
					System.out.println();

				}
			} else if (option == 3) {
				Helper.line(80, "-");
				System.out.println("DELETE USER BY NAME");
				Helper.line(80, "-");
				String deletUser = Helper.readString("Enter name to be deleted > ");
				boolean Del = false;
				for (int i = 0; i < UserList.size(); i++) {
					if (Del == false && deletUser.equalsIgnoreCase(UserList.get(i).getName())) {
						UserList.remove(i);
						Del = true;
					}
				}
				if (Del == true) {
					System.out.println(
							String.format(" deleted!", deletUser));
				} else {
					System.out.println(String.format("Not in system", deletUser));
				}

			} else {
				System.out.println("Invalid option!!!!!");
				option = Helper.readInt("Enter an option > ");
			}
			System.out.println(
					"Option 1. Add user account\nOption 2. View all users\nOption 3. Delete user by name\nOption 4.Exit back to menu");
			option = Helper.readInt("Enter an option > ");
		
		}
	}
}
