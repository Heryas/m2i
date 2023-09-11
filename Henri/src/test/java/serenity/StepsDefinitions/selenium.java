package serenity.StepsDefinitions;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class selenium extends PageObject {

    @FindBy(xpath = "//* [contains(@class, \"selenium-webdriver\")][contains(text(),\"Read more\")]")
    WebElementFacade ReadMore;
    
    @FindBy(xpath = "//h1")
    WebElementFacade titre;
    
    @FindBy(xpath = "//* [@id = \"m-documentationwebdrivergetting_started\"]")
    WebElementFacade GettingStarted;
    

    
    @FindBy(xpath = "//* [@class= \"nav-link\"]//span[text() = \"Downloads\"]")
    WebElementFacade Download;




    @Soit("un utilisateur sur le site de selenium {string}")
    public void unUtilisateurSurLeSiteDeSelenium(String arg0) {
        openAt(arg0);
    }

    @Quand("il clique sur le bounton en dessous de Selenium Webdriver")
    public void ilCliqueSurLeBountonEnDessousDeSeleniumWebdriver() {
        ReadMore.click();
    }

    @Alors("Il arrive sur la page de Selenium webdriver")
    @Alors("il arrive sur la page getting started")
    @Alors("il arrive sur la page de telechargement")
    public void ilArriveSurLaPageDeSeleniumWebdriver() {
        titre.isPresent();
    }

    @Quand("il clique sur le bouton getting started")
    public void ilCliqueSurLeBoutonGettingStarted() {
        GettingStarted.click();
    }


    @Quand("il clique sur le lien de telechargement")
    public void ilCliqueSurLeLienDeTelechargement() {
        Download.click();
    }


    @Et("il verifie que le titre contient le mot {string}")
    public void ilVerifieQueLeTitreContientLeMot(String arg0) {
        Assert.assertEquals(arg0, titre.getText());
    }
}
