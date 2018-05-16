## Testing of the site [bayramix.com.ua](http://www.bayramix.com.ua/) 

#### Java+Selenium+JUnit
#### With the use Page Object - PageFactory  

***

### AddAndCheckCartTest
Add to the cart product and check the quantity and amount

#### MainPage
In the menu select "Интернет-магазин"

#### InternetMagazinPage
Go to the section facade paints and coatings.

#### ShtukaturkiPage
Go to the plaster of marble chips. In this section there is material ����� �������

#### GoldMineralPage
Add to shopping cart 5 pieces of product ����� �������

#### CartPage
Check: Make sure that it is in the cart in this quantity.
Check that the total order amount corresponds to the declared on the website  

***

### SearchFormTest
Checks the operation of the search on the site

#### MainPage
In the search form, enter ���������
In the pop-up window, select ��������� ��� �����������

#### SearchFormPage
Finish off the window, search for �� ������
Switch the radio to ������� ����������
In Select choose ��� ��������
Click on 2 checkboxes: �����������, ��������
Click �Search�

#### SearchResultsPage
Check for a string ���������� ������: ������� 2 ��������  

***

### CreateAccountTest
Checks the registration form on the website

#### MarketPlacePage
Go to ������ ���������� (http://bayramix.com.ua/marketplace.html)
Click on ���� ��������

#### LoginPage
Choose ���� ��� ������� ������?�

#### CreateAccountPage
Fill in the fields: Name, Login, Password and Email
In the ������� ������ *� - enter the wrong Email
Click �������������

#### NextCreateAccountPage
Check for the message ������� ����������� ����� �� ���������. �����������

