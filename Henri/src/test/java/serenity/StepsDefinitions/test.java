package serenity.StepsDefinitions;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class test extends PageObject {
    
    @FindBy(xpath = "//* [@id = \"userName\"]")
    WebElementFacade UserName;
    
    @FindBy(xpath = "//* [@id = \"password\"]")
    WebElementFacade password;
    
    @FindBy(xpath = "//* [@id = \"login\"]")
    WebElementFacade login;

    @FindBy(xpath = "//* [@id = \"name\"]")
    WebElementFacade Error;
    
    
    @Soit("un étudiant sur le site {string}")
    public void unÉtudiantSurLeSite(String arg0) {
        openAt(arg0);
    }

    @Quand("il saisit son userName {string}")
    public void ilSaisitSonUserName(String arg0) {
        UserName.sendKeys(arg0);
    }

    @Et("il saisit son password {string}")
    public void ilSaisitSonPassword(String arg0) {
        password.sendKeys(arg0);
    }

    @Et("il clique sur le bouton login")
    public void ilCliqueSurLeBoutonLogin() {
        login.click();
    }

    @Alors("le message d'erreur {string} apparait en rouge")
    public void leMessageDErreurApparaitEnRouge(String arg0) {
        Assert.assertEquals(arg0, Error.getText());
    }
}
