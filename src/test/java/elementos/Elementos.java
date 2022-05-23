package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elementos {

	public static WebDriver driver;

	

	// YOUR PERSONAL INFORMATION
	private By sign = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

	private By email = By.xpath("//*[@id=\"email_create\"]");
	private By createanaccount = By.xpath("//*[@id=\"SubmitCreate\"]/span/i");

	private By firstname = By.xpath("//*[@id='customer_firstname']");

	private By lastname = By.xpath("//*[@id=\"customer_lastname\"]");
	private By email1 = By.xpath("");
	private By password = By.xpath("//*[@id=\"passwd\"]");
	private By dateOfbirth = By.xpath("//*[@id=\"days\"]");
	private By dateOfbirth1 = By.xpath("//*[@id=\"days\"]");
	private By dateOfbirth2 = By.xpath("//*[@id=\"days\"]");

	private By singnUp = By.xpath("//*[@id=\"newsletter\"]");
	private By receive = By.xpath("//*[@id=\"optin\"]");

	// Your Address

	private By firstname1 = By.xpath("//*[@id='customer_firstname']");

	private By lastname1 = By.xpath("//*[@id=\"customer_lastname\"]");
	private By company = By.xpath("//*[@id=\"company\"]");
	private By address = By.xpath("//*[@id=\"address1\"]");
	private By address2 = By.xpath("//*[@id=\"address2\"]");
	private By city = By.xpath("//*[@id=\"city\"]");
	private By state = By.xpath("//*[@id=\"id_state\"]");
	private By zippostal = By.xpath("//*[@id=\"postcode\"]");
	private By additionalinformation = By.xpath("//*[@id=\"other\"]");
	private By homephone = By.xpath("//*[@id=\"phone\"]");
	private By mobilephone = By.xpath("//*[@id=\"phone_mobile\"]");
	private By assingaddress = By.xpath("//*[@id=\"alias\"]");
	private By register = By.xpath("//*[@id=\"submitAccount\"]/span");

	// Efetuar Login

	private By emailogin = By.xpath("//*[@id=\"email\"]");
	private By passwordlogin = By.xpath("//*[@id=\"passwd\"]");
	private By signInlogin = By.xpath("//*[@id=\"SubmitLogin\"]/span");

	// Metodos Publicos

	public By getSign() {
		return sign;
	}

	public By getEmail() {
		return email;
	}

	public By getCreateanaccount() {
		return createanaccount;
	}

	public By getFirstname() {
		return firstname;
	}

	public By getLastName() {
		return lastname;
	}

	public By getEmail1() {
		return email1;
	}

	public By getPassword() {
		return password;
	}

	public By getDateOfBirth() {
		return dateOfbirth;
	}

	public By getDateOfBirth1() {
		return dateOfbirth1;
	}

	public By getDateOfBirth2() {
		return dateOfbirth2;
	}

	public By getSingnUp() {
		return singnUp;
	}

	public By getReceive() {
		return receive;
	}

	public By getEmailogin() {
		return emailogin;
	}

	public By getPasswordlogin() {
		return passwordlogin;
	}

	public By getSignInlogin() {
		return signInlogin;
	}

	public By getFirstname1() {
		return firstname1;
	}

	public By getLastname() {
		return lastname;
	}

	public By getDateOfbirth() {
		return dateOfbirth;
	}

	public By getDateOfbirth1() {
		return dateOfbirth1;
	}

	public By getDateOfbirth2() {
		return dateOfbirth2;
	}

	public By getLastname1() {
		return lastname1;
	}

	public By getCompany() {
		return company;
	}

	public By getAddress() {
		return address;
	}

	public By getAddress2() {
		return address2;
	}

	public By getCity() {
		return city;
	}

	public By getZippostal() {
		return zippostal;
	}

	public By getState() {
		return state;
	}

	public By getAdditionalinformation() {
		return additionalinformation;
	}

	public By getHomephone() {
		return homephone;
	}

	public By getMobilephone() {
		return mobilephone;
	}

	public By getAssingaddress() {
		return assingaddress;
	}

	public By getRegister() {
		return register;
	}
}
	
