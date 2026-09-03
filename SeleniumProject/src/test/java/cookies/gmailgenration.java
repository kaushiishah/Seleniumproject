package cookies;

import net.datafaker.Faker;

public class gmailgenration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "kaushal" + System.currentTimeMillis() + "@gmail.com";
  System.out.println(email);
  
  ///toexcute this add depencecy in pom.xml>>>net.datafaker
  Faker faker = new Faker();

  String email1 = faker.internet().emailAddress();
  System.out.println(email1);
	}

}
