Задание:

Создать 3 xml файла имитирующие тесты(пример из задания framework).
Создать фреймворк, который будет запускать тесты через maven, с возможностью выбора теста.
Если тест упал, то в созданном файле должно вывести "test failed".
Если тест прошел, то вывести о положительном результате в консоль.

Для создания фреймворка необходимо использовать:
ITestListener
Logger
Assert

mvn -Dsurefire.suiteXmlFiles=src\test\resources\testng-regression.xml clean test
mvn -Dsurefire.suiteXmlFiles=src\test\resources\testng-functional.xml clean test
mvn -Dsurefire.suiteXmlFiles=src\test\resources\testng-smoke.xml clean test

mvn -Dsuite.file=testng-regression clean test
mvn -Dsuite.file=testng-smoke clean test
mvn -Dsuite.file=testng-functional clean test