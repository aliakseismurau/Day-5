# Day-5
Task. Data Access Object
Необходимо разработать приложение согласно требованиям,
приведенным ниже. В приложении должна быть реализована
функциональность, определенная индивидуальным заданием.
Требования
- Разработать класс Сущность с 4-5 полями (Книга Java from EPAM. Задания из главы 3.
Вариант А). Для выполнения основных операций со списком сущностей, которые хранятся
в некотором хранилище (шаблон Singleton) разработать класс СущностьDao (шаблон DAO).
- Классы-сущности должны быть отделены от классов с методами бизнес-логики (Service).
- Объекты классов-сущностей должные храниться в синглтон-объекте Warehouse.
- Использовать перечисления (enum) для описания полей с ограниченным набором значений.
- Реализовать функциональность CRUD:
- добавить книгу в хранилище в случае, если такой книги нет, в противном случае
генерировать исключение; (dao)
- удалить книгу, если она есть, в противном случае генерировать исключение; (dao)
- изменить книгу по заданным полям/полю; (dao)
- найти книгу по заданному/ым критерию; (dao)
- отсортировать список книг по заданному/ым критерию.(service/find)
- Для сортировок наборов объектов можно использовать реализацию интерфейса
Comparator и его возможности. В частности thenComparing.
- При решении задачи можно использовать паттерн Factory Method.
- Все классы приложения должны быть структурированы по пакетам.
- Оформление кода должно соответствовать Java Code Convention.
- Параметры, необходимые для создания объектов, должны вводиться с помощью чтения
данных из файла (.txt). Информация в файле заведомо корректная. Создаваться должно
10-12 объектов.
- Для записи логов использовать Log4J2.
- Код должен быть покрыт Unit-тестами.