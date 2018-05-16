# Testing of the site [bayramix.com.ua](http://www.bayramix.com.ua/) 

### Java+Selenium+JUnit
### With the use Page Object - PageFactory



## AddAndCheckCartTest
Add to the cart product and check the quantity and amount

### MainPage
In the menu select У»нтернет-магазинФ

### InternetMagazinPage
Go to the section facade paints and coatings.

VShtukaturkiPage
Go to the plaster of marble chips. In this section there is material У√олд минералФ

VGoldMineralPage
Add to shopping cart 5 pieces of product У√олд минералФ

### CartPage
Check: Make sure that it is in the cart in this quantity.
Check that the total order amount corresponds to the declared on the website



## SearchFormTest
Checks the operation of the search on the site

### MainPage
In the search form, enter УфасадныФ
In the pop-up window, select Уѕоказать все результатыФ

### SearchFormPage
Finish off the window, search for Уе краскиФ
Switch the radio to У“очное совпадениеФ
In Select choose Уѕо алфавитуФ
Click on 2 checkboxes: УћатериалыФ, У“оварыФ
Click УSearchФ

### SearchResultsPage
Check for a string У–езультат поиска: найдено 2 объектаФ



## CreateAccountTest
Checks the registration form on the website

### MarketPlacePage
Go to Уƒоска объ€вленийФ (http://bayramix.com.ua/marketplace.html)
Click on Ућой профильФ

### LoginPage
Choose У≈щЄ нет учетной записи?Ф

### CreateAccountPage
Fill in the fields: Name, Login, Password and Email
In the Уѕовтор парол€ *Ф - enter the wrong Email
Click У–егистраци€Ф

### NextCreateAccountPage
Check for the message Ујдреса электронной почты не совпадают. ѕожалуйстаФ

