## Задача

#### Создать MVP приложения для знакомств Tinder

Вы можете найти готовые шаблоны всех HTML страниц в папке [templates](templates).

#### Командная работа

На данном проекте все студенты разделены на группы по три человека. Участники команды могут самостоятельно распределить между собой задачи.

## Список рабочих эндпоинтов в полностью готовом приложении:
- /users
- /liked
- /messages/{id}
- /login

## Предлагаемый порядок выполнения задач:
1. Создать новое приложение
2. Запустить веб-сервер
3. Создать тестовый сервлет, который будет выводить "Hello world" в браузере
4. Замапить тестовый сервлет на путь "/users"
5. При запросе на путь "/users" выводить статическую HTML страницу с четырьмя элементами - имя, картинка с фотографией (ссылка на фото в интернете), и две кнопки - Yes/No
6. Обернуть страницу в HTML форму.
7. При нажатии на кнопки Yes/No отсылать POST запрос на сервер (пока что там нет его обработчика)
8. Запоминать на сервере, какой из выборов сделал пользователь (в любом виде)
9. Метод doPost должен перенаправлять пользователя снова на страницу "/users"
10. Создать несколько "профайлов" (имя + ссылка на фотографию в интернете), хранить их в какой-нибудь коллекции внутри сервлета
11. При нажатии на кнопку Yes/No показывать пользователю другой профиль, на странице "/users" должны поменяться имя и фотография
12. Когда список доступных профайлов закончится, показывать его снова сначала по кругу
13. Создать класс ДАО, куда перенести коллекцию с профайлами
14. Добавить сервлет с адресом "/liked", выводить на странице по этому адресу статический (захардкоженный) список профайлов, которые мы лайкнули
15. После того, как пользователь прокликал все доступные профили, перенаправлять его на страницу "/liked"
16. Выводить на странице "/liked" реальные профайлы, которым мы нажали Yes
17. Добавить всем профайлам атрибут id
18. Добавить сервлет с адресом "/messages/{id}", выводить на странице по этому адресу статический чат с захардкоженными сообщениями
19. При клике на какой-нибудь профайл на странице "/liked", переходить на страницу "/messages/{id}", где показывать какой-то захардкоженный диалог с пользователем
20. Подключить базу данных MySQL/PostgreSQL к приложению (локальную или удаленную)
21. Написать новую имплементацию DAO классов, чтобы все пользователи теперь хранились в базе данных
22. На странице "/messages/{id}" показывать реальные сообщения между пользователями
23. Добавить на страницу "/messages/{id}" возможность делать POST запрос на сервер с отправкой нового сообщения
24. Реализовать метод doPost в соответствующем сервлете, который будет сохранять новое сообщение в базу дханных
25. Добавить простую логин страницу по адресу "/login"
26. Использовать Bootstrap шаблоны как основу для всех веб-страниц
27. Использовать Freemarker template для выведения HTML страниц
28. Реализовать метод POST со страницы логина, который позволит пользователю залогиниться в приложение. Хранить данные о залогиненном пользователе в cookies
29. Создать HttpFilter, который будет перенаправлять на страницу логина незалогиненного пользователя
30. Добавить возможность логина разных пользователей. Хранить отдельно данные каждого
31. Подключить проект к удаленной базе данных
32. Собрать проект в исполняемый JAR архив
33. Развернуть готовое приложение на [Heroku](https://heroku.com/login)
