# HomeWorkSpringJDBC
 Домашнее задание по теме "Spring JDBC: работа с базой данных и построение запросов" (ProductStar)

# Постановка задачи
В выданном проекте необходимо дописать код так, чтобы все тесты были пройдены.
## Требования
Вспоминаем приложение для управления базой данной контактов (Урок Spring REST).
Контакт имеет следующие характеристики – Имя и Фамилия, Телефонный номер, Email.
Приложение должно содержать bean ContactDao, который реализует следующие операции - получение всех контактов, получение контакта по идентификатору, добавление контакта (при создании контакту присваивается идентификатор), обновление телефонного номера, обновление email, удаление контакта по идентификатору.
ContactDao взаимодействует с локально развернутой Postgres базой данных.
Необходимо запустить тесты ContactDaoTests и убедиться, что все тесты зеленые (пройдены успешно).
Для того, чтобы запустить тесты, необходимо выполнить следующие шаги:
- Зачекаутить репозиторий Ссылка (Выполнить команду git checkout)
- Открыть модуль spring-jdbc и в файлe jdbc.properties проставить корректные данные для доступа к локально развернутому Postgers
- Открыть класс ContactDao и реализовать методы
## Подключенные зависимости и плагины
- spring-jdbc - Spring JDBC предоставляет уровень абстракции, который упрощает использование кода JDBC
- spring-context - Spring Context предоставляет доступ к сконфигурированным объектам, таким как реестр (контекст).
- postgresql - PostgreSQL JDBC drive
- commons-dbcp - Apache Commons DBCP software implements Database Connection Pooling (содержит класс BasicDataSource для реализации интерфейса DataSource) 
- spring-test -  это фреймворк для модульного и интеграционного тестирования компонентов Spring с помощью JUnit
- assertj-core - это артефакт библиотеки AssertJ для тестирования (нужен для assertThat и тд)
- junit-jupiter - библиотека для unit-тестов.

## Описание основных файлов
- main/java/com/product/star/homework/ContactDao.java - основные методы уровня DAO
- main/java/com/product/star/homework/Contact.java - класс объекта одного контакта
- main/java/com/product/star/homework/ContactConfiguratuion.java - файл основной конфигурации Spring
- main/java/com/product/star/homework/ContactMain.java - дополнительный исполняемый файл для небольшого отладочного прогона
- main/java/com/product/star/common/JdbcConfig.java - дополнительный файл конфигурации Spring для создания соединения с БД и объекта NamedParameterJdbcTemplate
- main/java/com/product/star/common/PropertiesConfiguration.java - дополнительный файл конфигурации Spring для указания на файл описания соединения
- main/resources/jdbc.properties - файл описания соединения с БД
- test/java/com/product/star/homework/ContactDaoTests.java - непосредственно класс теста, который должен отработать для сдачи задания
- main/resources/contact.sql - скрипт sql, необходимый для отработки теста

## Примечания
- Для доработки и сдачи домашнего задания перенёс модуль spring-jdbc в отдельный проект HomeWorkSpringJDBC
- Для успешной отработки теста необходима локально установленная и запущенная на порту 5432 БД PostgreSQL с DB postgres и пользователем postgres с паролём postgres 
- Переделал ContactDaoTests с record на class и определил "@Autowired ContactDao contactDao ;" в полях класса (с record что-то тест не получалось удачно запустить, наверное что-то с версиями изменилось).