package fakerlibrary;

import net.datafaker.Faker;

public class userfakedetails {
	

	

	    public static void main(String[] args) {

	        Faker faker = new Faker();

	        String firstName = faker.name().firstName();
	        String lastName = faker.name().lastName();
	        String email = faker.internet().emailAddress();
	        String phone = faker.phoneNumber().cellPhone();
	        String address = faker.address().fullAddress();
	        String company = faker.company().name();
	        String username = faker.name().username();

	        System.out.println("First Name : " + firstName);
	        System.out.println("Last Name  : " + lastName);
	        System.out.println("Email      : " + email);
	        System.out.println("Phone      : " + phone);
	        System.out.println("Address    : " + address);
	        System.out.println("Company    : " + company);
	        System.out.println("Username   : " + username);
	    }
	}
