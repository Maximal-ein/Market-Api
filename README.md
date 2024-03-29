# Market-Api
API for obtaining information about the goods of the shopping center stores (Gradle) + SQL script

Необходимо создать АПИ для получения информации о товарах магазинов торгового центра. 
   
  1. Создать модель БД. 
  БД должна состоять из 4 таблиц: 
  * таблица Магазин 
  * таблица Товар 
  * таблица Покупатель 
  * таблица Продажа 
   
  Поля таблицы Магазин: 
  * Идентификатор 
  * Наименование магазина 
  * Адрес магазина 
   
  Поля таблицы Товар: 
  * Идентификатор 
  * Наименование товара 
  * Цена за 1 единицу товара в рублях 
  * Количество 
  * Код товара 
   
  Поля таблицы Покупатель: 
  * Идентификатор 
  * email 
   
  Поля таблицы Продажа: 
  * Идентификатор 
  * Количество товара 
   
  Таблица Магазин связана с таблицей Товар один ко многим. 
  Таблица Товар связана с таблицей Покупатель много=ие ко многим через таблицу Продажа 
   
  2. Сформировать скрипт на БД. 
   
  3. Установить PostgreSql последней версии, создать БД и накатить на нее скрипт. 
  * Заполнить таблицы Магазин, Товар и Пользователь тестовыми данными. 
   
  4. Создать SpringBoot приложение. Использовать Gradle. Подключить следующие модули: 
  * spring-boot-starter 
  * spring-boot-starter-web 
  * spring-boot-starter-data-jpa 
  * org.postgresql:postgresql:42.2.2 
   
  5. Создать JPA сущности на каждую таблицу БД 
   
  6. Создать контроллер (сервис) БД. Методы: 
  * получение списка магазинов 
  * получение покупателя по email 
  * получение списка товаров по идентификатору магазина 
  * получение списка проданных товаров по идентификатору магазина 
  * создание продажи (добавление записи в таблицу продажа). 
   Входные параметры: 
    идентификатор товара 
    идентификатор покупателя 
    количество товара 
   
  7. Разработать rest-сервис. Состав методов сервиса: 
  * Получение списка магазинов: 
    GET - запрос 
    входных параметров нет 
    выходные параметры - JSON, содержащий список магазинов (идентификатор, наименование, адрес), например: 
    [{"id":1, "name":"Магазин 1", "address":"Адрес магазина 1"}] 
  * получение покупателя по email 
    GET - запрос 
    входные параметры: email Покупателя 
    выходные параметры - JSON, содержащий информацию о покупателе (идентификатор, ФИО, email), например: 
    {"id":1, "fio":"Иванов И.И.", "email":"ivanov@test.test"} 
  * получение списка товаров по идентификатору магазина 
    GET - запрос 
    входные параметры: идентификатор магазина 
    выходные параметры - JSON, содержащий информацию о количестве товаров (Идентификатор товара, идентификатор магазина, наименование товара, количество товаров, цена за 1 товара), например: 
    [{"id":1, "shopId":"1", "name":"Товар 1", "count":10, "price": 1000.50}] 
  * получение списка проданных товаров по идентификатору магазина 
    GET - запрос 
    входные параметры: идентификатор магазина 
    выходные параметры - JSON, содержащий информацию о количестве товаров (Идентификатор товара, идентификатор магазина, наименование товара, количество товаров), например: 
    [{"id":2, "shopId":"1", "name":"Товар 2", "count":10, "price": 2000.00}] 
  * создание продажи (добавление записи в таблицу продажа). 
    POST - запрос 
    входные параметры: идентификатор товара, идентификатор покупателя, количество товара 
    выходные параметры - JSON, содержащий информацию о результате операции, например: 
    {"result":true}
