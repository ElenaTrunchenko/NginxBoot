
# [Задача «Прокси на NGINX»](https://github.com/netology-code/jd-homeworks/blob/master/linux/task1/README.md)

## Описание

Реализуйте ваше первое приложение с обратным прокси перед ним. Напишите конфигурацию NGINX, который будет возвращать статический сайт. С помощью него можно обратиться к вашему сервису авторизации из прошлого домашнего задания.

**Шаг 1.** Сначала нужно создать html-форму для авторизации, которую вам будет возвращать NGINX. Этот файл нужно положить в соответствующую папку, откуда NGINX сможет её забрать.

```html
<html>
    <body>
        <h1>Sign in form</h1>
    
        <form action="/authorize" method="get" target="_blank">
          <label for="user">User name:</label>
          <input type="text" id="user" name="user"><br><br>
          <label for="password">Password:</label>
          <input type="text" id="password" name="password"><br><br>
          <button type="submit">Submit</button>
        </form>
    </body>
</html>
```

**Шаг 2.** Вам нужно написать конфигурацию для NGINX так, чтобы он при вызове http://localhost/signin возвращал вам эту html-страницу, а всё остальное он проксировал на ваше Spring Boot приложение, которое работает на порту 8080.

 То, что вы напишите в конфигурации, добавьте в текстовый файл (формат файла любой, например, txt) в ваш проект с сервисом авторизации, запушьте в ваш репозиторий и пришлите ссылку на репозиторий.
