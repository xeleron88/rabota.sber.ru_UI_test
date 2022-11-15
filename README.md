
<h2 align="center"> Проект по автоматизации тестирования для компании Сбер </h2>
<a href="https://rabota.sber.ru"><img src="./images/logo/sber.png"  alt="Сбер работа"/></a>

### :green_book: *Содержание*
- *Технологии и инструменты*
- *Примеры автоматизированных тест кейсов*
- *Сборка в Jenkins*
- *Команды для запуска из терминала*
- *Allure отчёт*
- *Интреграция с Allure TestOps*
- *Интеграция с Jira*
- *Уведомление в Telegram при помощи Alert bot*
- *Примеры видео выполнения тестов на Selenoid*

____
## :computer: *Технологии и инструменты*

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/AllureTestOps.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

____
## *Примеры автоматизированных тест кейсов*
- :white_check_mark: Проверка title главной страницы
- :white_check_mark: Проверка наличия элементов в верхнем меню
- :white_check_mark: Проверка работоспособности поиска вакансий на главной странице
- 
- :white_check_mark: Проверка title и h1 на странице поиска
- :white_check_mark: Проверка работоспособности поиска вакансий на странице вакансий
- :white_check_mark: Проверка работы фильтров по региону и населённому пункту
- :white_check_mark: Проверка поиска несуществующих вакансий

____
## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/ru.sber.rabota/">**Сборка в Jenkins**</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/ru.sber.rabota/"><img src="images/screenshot/jenkins1.png" alt="Jenkins"/></a>  
</p>

### *Параметры сборки в Jenkins:*

- *BROWSER (браузер, по умолчанию chrome)*
- *BROWSER_VERSION (версия браузера, по умолчанию 100.0)*
- *BROWSER_SIZE (размер окна браузера, по умолчанию 1920x1080)*
- *REMOTE_DRIVER_URL (логин, пароль и адрес удаленного сервера Selenoid)*

____
## :keyboard: *Команды для запуска из терминала*

***Локальный запуск:***
```bash  
gradle clean test
```

***Удалённый запуск через Jenkins:***
```bash  
clean
test
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
-DremoteUrl=${REMOTE_DRIVER_URL}
```

## <img src="images/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> *Allure* <a target="_blank" href="https://jenkins.autotests.cloud/job/ru.sber.rabota/6/allure/">*отчёт*</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/allure1.png">  
</p>  

### *Тест кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshot/allure3-test-cases.png">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screenshot/allure2-graphs.png">  
</p>

___

## <img src="images/logo/AllureTestOps.svg" width="25" height="25"  alt="Allure"/></a>*Интеграция с* <a target="_blank" href="https://allure.autotests.cloud/project/1668/dashboards">*Allure TestOps*</a>

## *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screenshot/allure4.png">  
</p>  

## *Тест кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screenshot/allure5.png">  
</p>

___

## <img src="images/logo/Jira.svg" width="25" height="25"  alt="Allure"/></a>*Интеграция с* <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-427">Jira</a>

<p align="center">  
<img title="Jira" src="images/screenshot/jira.png">  
</p>

____
## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> *Уведомление в Telegram при помощи Alert bot*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/tg.png">  
</p>


## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Selenoid"/></a> *Примеры видео выполнения тестов на Selenoid*



<img title="Selenoid Video" src="images/screenshot/selenoid.gif" width="650" height="350"  alt="video">
