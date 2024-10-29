Feature: Flujo de compra en SauceDemo

  Scenario Outline: Completar el flujo de compra en SauceDemo
    Given el usuario esta en la pagina de inicio de sesion
    When el usuario ingresa el nombre de usuario "<username>" y la contrasena "<password>"
    Then deberia ver la pagina principal con el titulo "Products"
    When el usuario agrega dos productos al carrito
    And el usuario revisa el carrito
    And el usuario acepta los productos en el carrito
    And el usuario llena los datos de envio con nombre "<firstName>", apellido "<lastName>" y codigo postal "<postalCode>"
    And el usuario acepta la compra
    Then el usuario finaliza la compra
    And el usuario deberia ver el mensaje de confirmacion "Thank you for your order!"

    Examples:
      | username       | password      | firstName | lastName | postalCode |
      | standard_user  | secret_sauce  | Andres    | Jarrin   | 176178     |
      | standard_user  | secret_sauce  | Maria     | Perez    | 123456     |
      | standard_user  | secret_sauce  | Juan      | Gomez    | 654321     |
      | standard_user  | secret_sauce  | Laura     | Torres   | 987654     |
      | standard_user  | secret_sauce  | Carlos    | Ruiz     | 112233     |
