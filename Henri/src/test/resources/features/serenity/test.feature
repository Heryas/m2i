#language:fr
  Fonctionnalité: test


    Scénario: Un étudiant remplie et valide le formulaire d'inscription
      Soit un étudiant sur le site "https://demoqa.com/login"
      Quand il saisit son userName "User"
      Et il saisit son password "Name"
      Et il clique sur le bouton login
      Alors le message d'erreur "Invalid username or password" apparait en rouge

    @test
    Plan du scénario: Un étudiant remplie et valide le formulaire d'inscription
      Soit un étudiant sur le site <url>
      Quand il saisit son userName <username>
      Et il saisit son password <password>
      Et il clique sur le bouton login
      Alors le message d'erreur <message> apparait en rouge
      Exemples:
        | url                        | username | password | message                         |
        | "https://demoqa.com/login" | "User"   | "Name"   | "Invalid username or password!" |

