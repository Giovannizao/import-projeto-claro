package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFacotry;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/",

		glue = "testes",

		tags = "@cadastro",
		
		dryRun = false,

		monochrome = true,
		
		plugin = { "pretty", "html:target/report.html" },
		
		snippets = SnippetType.CAMELCASE
)

public class Executa extends DriversFacotry {
	

	// essa class deve iniciar o projeto e executar o cucumber por tags tem na
	// plataforma como fazer

	

	@BeforeClass
	public static void abrirNavegador() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

}

