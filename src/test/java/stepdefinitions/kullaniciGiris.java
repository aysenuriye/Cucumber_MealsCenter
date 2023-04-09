package stepdefinitions;

import pages.userpage.Userpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class kullaniciGiris {

    Userpage userpage = new Userpage();


    @Given("kullanıcı {string} gider")
    public void kullanıcı_gider(String ilyasHocaaa) {
Driver.getDriver().get(ConfigReader.getProperty(ilyasHocaaa));
    }

    @Then("user giris ve parolayı girer")
    public void userGirisVeParolayıGirer() {
        userpage.LoginMethod();
    }
}


