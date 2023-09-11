#language:fr
  Fonctionnalité: site selenium

    Règle:
    Contexte: lance une page web sur le site de selenium
      Soit un utilisateur sur le site de selenium "https://selenium.dev"
      Quand il clique sur le bounton en dessous de Selenium Webdriver
      Alors Il arrive sur la page de Selenium webdriver
@test
    Scénario:  un utilisateur sur le site de selenium
      Quand il clique sur le bouton getting started
      Alors il arrive sur la page getting started
      Quand il clique sur le lien de telechargement
      Alors il arrive sur la page de telechargement
      Et il verifie que le titre contient le mot "Downloads"
