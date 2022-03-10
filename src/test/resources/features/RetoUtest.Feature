#Autor: Johana

@stories
Feature: utest technical challenge
  a user wants to register on the utest page

  @Scenario1
  Scenario Outline: Perform successful registration on the Utest page
    Given user starts the registration process in the option join today
    When user performs the registration process of the utest page
      | firstName   | secondName    |   email             |   monthBirth  |   dayBirth  |   yearBirth |   city      |   zipCode |   mobileDevice  |   model     |   operatingSystem |   password      |
      | <firstName> | <secondName>  | <email>             | <monthBirth>  | <dayBirth>  | <yearBirth> | <city>      | <zipCode> | <mobileDevice>  | <model>     | <operatingSystem> | <password>      |
    Then user achieves successful registration
      | answer  |
      |<answer>|

  Examples:
    | firstName | secondName  | email             | monthBirth  | dayBirth  | yearBirth | city      | zipCode | mobileDevice  | model     | operatingSystem | password      | answer |
    | Johana    | Grandas     | joana06@gmail.com | August      |   2       | 1982      | Medellín  | 050015  | Apple         | iPhone 4  | iOS 11.0.3      | Reto123456*   |  Welcome to the world's largest community of freelance software testers!         |