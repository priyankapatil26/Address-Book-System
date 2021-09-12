package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class UC3 {
	List<AddressBookMain> addressBooks = new ArrayList<AddressBookMain>();

	public static void main(String args[]) {
		UC3 u = new UC3();
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Add Details \n2) Edit Details  \n3) Print details");
		while (true) {
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				u.add();
				break;
			case 2:
				u.edit();
				break;
			case 3:
				u.printDetails();
				break;
			}
		}
	}

	// function to add person
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
		addressBooks.add(ab2);
		System.out.println("Data added successfully");
		// addressBooks.add(new
		// AddressBook2(firstName,lastName,address,city,state,zip,phoneNumber,EmailID));
	}

	// function to edit person
	private void edit() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String FirstName = sc.next();
		Iterator<AddressBookMain> iterator = addressBooks.listIterator();

		while (iterator.hasNext()) {
			AddressBookMain ab2 = iterator.next();
			// System.out.println(ab2);
			if (FirstName.equals(ab2.getFirstName())) {
				System.out.println("Enter new firstname");
				String firstName = sc.next();
				ab2.setFirstName(firstName);

				System.out.println("Enter new Lastname");
				String lastName = sc.next();
				ab2.setLastName(lastName);

				System.out.println("Enter new address");
				String address = sc.next();
				ab2.setAddress(address);

				System.out.println("Enter new city");
				String city = sc.next();
				ab2.setCity(city);

				System.out.println("Enter new state");
				String state = sc.next();
				ab2.setState(state);

				System.out.println("Enter new zip");
				int zip = sc.nextInt();
				ab2.setZip(zip);

				System.out.println("Enter new Phone Number");
				long phoneNumber = sc.nextLong();
				ab2.setPhoneNumber(phoneNumber);

				System.out.println("Enter new emailId");
				int EmailID = sc.nextInt();
				ab2.setID(EmailID);
				// addressBooks.add(ab2);
				System.out.println("updated successfully");

			}
		}
	}

	void printDetails() {
		for (AddressBookMain str : addressBooks) {
			System.out.println(str);
			System.out.println();
		}
	}
}
