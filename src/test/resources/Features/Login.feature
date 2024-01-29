Feature: Facebook Login

  Background:
    Given Launch the browser
    And   Open the application

  Scenario Outline: Login Scenario with Valid Cred

    When  User Enters the "<username>" and "<password>"
    Then  Click the login button

    Examples:
      | username | password       |
      | John     | 12345          |
      | Mr.X     | shbdeuhfueffru |

    #Ctrl+alt+L - Alignment correction