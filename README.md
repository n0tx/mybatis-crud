# Spring Boot MyBatis CRUD

![image](https://github.com/user-attachments/assets/272f9ed8-613c-40be-84b7-d366f037822a)


- Java 17
- Maven
- Spring Starter Web
- MyBatis
- MySQL
- Lombok

## Cara Menjalankan Aplikasi

### Buat awal MySQL database dan tabel

- #### Membuat database

``` 
create database mybatis_crud;
```

- #### Membuat tabel

``` 
use mybatis_crud; 
create table Users ( id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(25), email VARCHAR(25) );
```

- #### Git clone

```
git clone https://github.com/n0tx/mybatis-crud.git
```

- #### Run Spring Boot

```
$cd mybatis-crud

$pwd
/mybatis-crud

$./mvnw spring-boot:run
```

## Menguji Endpoint API Aplikasi

- #### List Users

GET http://localhost:8080/api/users

- #### Add User

POST http://localhost:8080/api/users

```
{
    "username": "riki",
    "email": "riki@mail.com"
}
```

- #### Update User

PUT http://localhost:8080/api/users/1

```
{
    "username": "riki - update",
    "email": "riki@mail.com"
}
```

- #### Find User

GET http://localhost:8080/api/users/1


- #### Delete User

DELETE http://localhost:8080/api/users/1



