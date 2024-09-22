# CRUD Application for Managing Books

## Цель проекта
Этот проект представляет собой CRUD-приложение для управления книгами, реализованное с использованием Spring MVC, Spring Data JPA и Redis. Приложение позволяет выполнять операции создания, чтения, обновления и удаления книг и категорий.

## Технологии
- Spring Boot
- Spring MVC
- Spring Data JPA
- Redis
- PostgreSQL

## Сущности
### Book
- `id`: уникальный идентификатор книги
- `title`: название книги
- `author`: автор книги
- `category`: категория книги (связь многие к одному)

### Category
- `id`: уникальный идентификатор категории
- `name`: имя категории

## Возможности
- **Найти одну книгу** по названию и автору
- **Найти список книг** по имени категории
- **Создать книгу**
- **Обновить информацию** о книге
- **Удалить книгу** по ID

## Кеширование
- Метод поиска книги по названию и автору кешируется в Redis с использованием этих полей как ключ.
- Метод поиска книг по имени категории кешируется по имени категории.
- При создании, обновлении или удалении книги кеш инвалидируется по соответствующему ключу.

### Предварительные требования
- JDK 17 или выше
- Docker и Docker Compose
- PostgreSQL (или используйте встроенную БД H2 для разработки)

## Эндпоинты
- GET /api/books/search: Поиск книги по названию и автору.
- GET /api/books/category/{categoryName}: Поиск книг по имени категории.
- POST /api/books: Создание новой книги.
- PUT /api/books/{id}: Обновление информации о книге.
- DELETE /api/books/{id}: Удаление книги по ID.

