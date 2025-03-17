# TodoList
Реализован список дел, который управляется командами в консоли. 
Команды: LIST, ADD, EDIT, DELETE. 
Для работы с данными списка дел в проекте находится класс TodoList, который отвечает за хранение и работу со списком дел.
В классе Main реализовано взаимодействие с пользователем через ввод команд в консоль.

Принцип работы команд:

**LIST** — выводит дела с их порядковыми номерами;  

**ADD** — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер; если указан несуществующий индекс - добавить в конец списка.

**EDIT** — заменяет дело с указанным номером; если указан несуществующий индекс - ничего не делать.

**DELETE** — удаляет; если указан несуществующий индекс - ничего не делать.  


Команды вводятся пользователем в консоль одной строкой.  


Примеры работы со списком дел (жирным шрифтом выделен ввод пользователя)

**ADD buy milk**

Добавлено дело "buy milk"

**ADD learn java**

Добавлено дело "learn java"

**LIST**

0 - buy milk

1 - learn java

**EDIT 0 make a cup of tea**

Дело "buy milk" заменено на "make a cup of tea"

**DELETE 1**

Дело "learn java" удалено

**LIST**

0 - make a cup of tea

**DELETE 100**

Дело с таким номером не существует
