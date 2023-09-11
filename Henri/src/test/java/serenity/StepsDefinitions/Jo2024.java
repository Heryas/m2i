package serenity.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Jo2024 extends PageObject{


    String Date = DateTimeFormatter.ofPattern("MM/dd/yyyy").format(LocalDateTime.now()).toLowerCase();
    String Heure = DateTimeFormatter.ofPattern("a").format(LocalDateTime.now()).toLowerCase();
    String Date_complete = Date + Heure;

    @FindBy( xpath = "//* [@id = \"inputPhoneNumber\"]")
    WebElementFacade PhoneNumber;

    @FindBy(xpath = "//* [@id = \"inputSmsCode\"]")
    WebElementFacade Password;

    @FindBy(xpath = "//* [@id = \"connexion\"]")
    WebElementFacade Connexion;

    @FindBy(xpath = "//* [@href = \"/timesheet\"]")
    WebElementFacade FeuilleDePresence;

    @FindBy(xpath = "//* [@href = \"/close-session\"]")
    WebElementFacade Fermer;

    String xpath_Expression = "//* [@id = \""+Date_complete+"\"] [@src=\"http://sign.m2iformation.fr/images/images-fdp/signatureicon.jpg\"]";





    @Given("un utilisateur sur la page {string}")
    public void unUtilisateurSurLaPage(String arg0) {
        openAt("https://sign.m2iformation.fr/signin");
    }

    @When("Il rentre son mail ou son numéro de téléphone dans le champs dédié {string}")
    public void ilRentreSonMailOuSonNuméroDeTéléphoneDansLeChampsDédié(String arg0) {
        PhoneNumber.sendKeys(arg0);
    }

    @And("il rentre son mot de passe dans le champs dédié {string}")
    public void ilRentreSonMotDePasseDansLeChampsDédié(String arg0) {
        Password.sendKeys(arg0);
    }

    @And("il clique sur Se connecter")
    public void ilCliqueSurSeConnecter() {
        Connexion.click();
    }

    @And("il clique en haut à droite sur feuille de présence")
    public void ilCliqueEnHautÀDroiteSurFeuilleDePrésence() {
        waitFor(FeuilleDePresence);
        FeuilleDePresence.click();
    }

    @And("il clique sur émarger ici à la date et l'heure correspondante")
    public void ilCliqueSurÉmargerIciÀLaDateEtLHeureCorrespondante() {
        getDriver().findElement(By.xpath(xpath_Expression)).click();
    }

    @Then("il clique sur valider et se deconnecter tout en haut de la page")
    public void ilCliqueSurValiderEtSeDeconnecterToutEnHautDeLaPage() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        Fermer.click();
    }
}
