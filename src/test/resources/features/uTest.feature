# Autor : Hernan Rueda Perez

@stories
Feature: U Test
  Hernan wants to register as a user in utest
  @scenario1
  Scenario: registers his data in utest
    Given : when Hernan wants to register in utest
    When : he starts the registration in utest
  | strFirstname | strLastname   |            strEmail            | strMonth | strDay | strYear | strCity | strZip | strCountry | strComputer | strVersion | strLang | strMobile | strModel    | strOs  | strPw |
  | Hernan       | Rueda         | correoele1+1@xyz.com | October  |   6    |  1996   |Cúcuta  | 5400001| Colombia  | Windows     |10|Spanish | Xiaomi    | Poco F2 Pro | Android 11 | Contra12345* |
    Then : he login in utest
    |strOk  |
    |Step 4:|
