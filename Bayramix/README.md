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
Go to the plaster of marble chips. In this section there is material "Голд минерал"

#### GoldMineralPage
Add to shopping cart 5 pieces of product "Голд минерал"

#### CartPage
Check: Make sure that it is in the cart in this quantity.
Check that the total order amount corresponds to the declared on the website  

***

### SearchFormTest
Checks the operation of the search on the site

#### MainPage
In the search form, enter "фасадны"  
In the pop-up window, select "Показать все результаты"  

#### SearchFormPage
Finish off the window, search for "е краски"  
Switch the radio to "Точное совпадение"  
In Select choose "По алфавиту"  
Click on 2 checkboxes: "Материалы", "Товары"  
Click "Search"  

#### SearchResultsPage
Check for a string "Результат поиска: найдено 2 объекта"  

***

### CreateAccountTest
Checks the registration form on the website  

#### MarketPlacePage
Go to "Доска объявлений" (http://bayramix.com.ua/marketplace.html)  
Click on "Мой профиль"  

#### LoginPage
Choose "Ещё нет учетной записи?"  

#### CreateAccountPage
Fill in the fields: Name, Login, Password and Email  
In the "Повтор пароля *" - enter the wrong Email  
Click "Регистрация"  

#### NextCreateAccountPage
Check for the message "Адреса электронной почты не совпадают. Пожалуйста"  

