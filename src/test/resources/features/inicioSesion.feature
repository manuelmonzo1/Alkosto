Feature: Inicio de Sesión

  Scenario: Iniciar sesión en la página de Alkosto

    Given que el usuario accede al sitio web de Alkosto con sus credenciales
    When ingresa su correo electrónico <correo>
    Then se le mostrará en pantalla el mensaje ¡Listo, encontramos tu cuenta!




