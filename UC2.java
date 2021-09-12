package AddressBook;

import java.util.Scanner;

class UC2 {
	public static void main(String args[]) {
		UC2 u = new UC2();
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Add Details ");
		while (true) {
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				u.add();
				break;
			}
		}
	}

	//function to add person
	private void add() {
		// TODO Auto-generated method stub
		AddressBookMain ab2 = new AddressBookMain();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstname");
		String firstName = sc.next();
		ab2.setFirstName(firstName);

		System.out.println("Enter Lastname");
		String lastName = sc.next();
		ab2.setLastName(lastName);

		System.out.println("Enter address");
		String address = sc.next();
		ab2.setAddress(address);

		System.out.println("Enter city");
		String city = sc.next();
		ab2.setCity(city);

		System.out.println("Enter state");
		String state = sc.next();
		ab2.setState(state);

		System.out.println("Enter zip");
		int zip = sc.nextInt();
		ab2.setZip(zip);

		System.out.println("Enter Phone Number");
		long phoneNumber = sc.nextLong();
		ab2.setPhoneNumber(phoneNumber);

		System.out.println("Enter emailId");
		int EmailID = sc.nextInt();
		ab2.setID(EmailID);
		System.out.println("Data added successfully");
		System.out.println(ab2);
	}

}

