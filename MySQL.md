# База данных животных

> sudo MySQL

База данных Human_Friends

``` 
CREATE DATABASE Human_Friends;
USE Human_Friends; 
```

## Создание таблиц базы данных

**Pets**

``` 
CREATE TABLE Pets ( 
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50),
    Type VARCHAR(50),
    BirthDate DATE,
    Commands TEXT
);
``` 

**PackAnimals**
```
CREATE TABLE PackAnimals ( 
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50),
    Type VARCHAR(50),
    BirthDate DATE,
    Commands TEXT
);
``` 

__*НЕОБХОДИМО ЗАПОЛНИТЬ ТАБЛИЦЫ ДАННЫМИ*__

**Pets**
```
INSERT INTO (Name, Type, Birthday, Commands) VALUES
('Persik', 'Cat', '2020-12-12', 'Sit, Stay'),
('Korjik', 'Dog', '2023-10-16', 'Sit, 'Stay', 'Voice'),
```

**PackAnimals**
```
INSERT INTO (Name, Type, Birthday, Commands) VALUES
('Spirit', 'Horse', '2013-10-12', 'Trot, Canter, Gallop'),
('Anna', 'Donkey', '2016-02-05', 'Walk, Bray, Kick'),
```

__*УДАЛЕНИЕ ЗАПИСЕЙ*__

```
DELETE FROM PackAnimals WHERE Type = 'Donkey';
```

__*ОБЪЕДИНЕНИЕ ТАБЛИЦ*__

```
CREATE TABLE Combined_Animals AS
SELECT ID, Name, Type, BirthDate, Commands FROM Pets WHERE Type IN ('Cat', 'Dog');
```

__*ОБЪЕДИНЕНИЕ ВСЕХ ТАБЛИЦ В ОДНУ*__

```
CREATE TABLE All_Animals AS

SELECT ID, Name, Type, BirthDate, Commands, 'Pets' AS Source
FROM Pets
UNION ALL

SELECT ID, Name, Type, BirthDate, Commands, 'PackAnimals' AS Source
FROM PackAnimals
UNION ALL;
```