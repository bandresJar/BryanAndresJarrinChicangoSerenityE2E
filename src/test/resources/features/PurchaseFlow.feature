Feature: Flujo de compra en SauceDemo

  Scenario: Completar el flujo de compra en SauceDemo
    Given el usuario esta en la pagina de inicio de sesion
    When el usuario ingresa el nombre de usuario "standard_user" y la contrasena "secret_sauce"
    Then deberia ver la pagina principal con el titulo "Products"
    When el usuario agrega dos productos al carrito
    And el usuario revisa el carrito
    And el usuario acepta los productos en el carrito
    And el usuario llena los datos de envio
    And el usuario acepta la compra
    Then el usuario finaliza la compra
    And el usuario deberia ver el mensaje de confirmacion "Thank you for your order!"
