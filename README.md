# Описание приложения SpecialRoadProject

Это простое приложение на основе Spring Boot, которое реализует 2 rest-сервиса и синглетон для хранения значения.

## Структура проекта

1. AppController.java
    - содержит два метода
        - /set: принимает аргумент value и записывает его в синглетон, затем возвращает {"result":"success"}
        - /get: принимает аргументы pow (обязательный) и add (не обязательный, значение по умолчанию 1), вычисляет результат result=pow*value+add с помощью значения, взятого из синглетона. Затем, возвращает {"result":result}
2. ValueSingleton.java
    - является синглетоном для хранения значения
    - содержит методы
        - setValue: записывает значение в синглетон
        - getValue: возвращает хранимое в синглетоне значение
3. SpecialRoadProjectApplication.java
    - точка входа в приложение

## Как запустить приложение

1. Скачайте проект
2. Импортируйте проект в IntelliJ IDEA или другую среду разработки, поддерживающую Java
3. Нажмите на Run для запуска приложения
4. После запуска, откройте браузер и перейдите по адресу http://localhost:8081/app/set?value=1 , чтобы установить значение в синглетон (значение можно изменять)
5. Перейдите по адресу http://localhost:8081/app/get?pow=10 , чтобы получить результат вычисления
6. Ожидаемый результат:  {"result":11}

## Используемые технологии
- Java 17
- Spring Boot version3.1.0
- Maven
