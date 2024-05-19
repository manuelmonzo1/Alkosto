Feature: Validar la selección de TV en la página de Alkosto

  Scenario: Compra de TV
    Given que el usuario quiere comprar un televisor
    When ingresa a la página principal e inspecciona los productos de la sección TV
    And selecciona el televisor de su gusto
    Then debo verificar que este elemento se agregue al carrito de compra
