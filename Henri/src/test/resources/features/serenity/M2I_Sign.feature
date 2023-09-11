Feature: M2I

  Scenario: Connexion et signature M2I sign
    Given un utilisateur sur la page "https://sign.m2iformation.fr/signin"
    When Il rentre son mail ou son numéro de téléphone dans le champs dédié "0649498286"
    And il rentre son mot de passe dans le champs dédié "45831"
    And il clique sur Se connecter
    And il clique en haut à droite sur feuille de présence
    And il clique sur émarger ici à la date et l'heure correspondante
    Then il clique sur valider et se deconnecter tout en haut de la page