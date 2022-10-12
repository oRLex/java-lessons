## Мини-проект "Счастливая семья"

Суть проекта: описание структуры семьи с учетом того, что у каждого человека есть кровные родственники, а состав семьи может со временем меняться. 

До прохождения темы "Коллекции" все домашние задания должны быть выполнены с использованием массивов (**НЕ** используйте интерфейсы `List`, `Set`, `Map`, пока об этом не будет прямо сказано в задании).

## Объекты

## Задание

- Создайте и опишите классы: Домашний любимец(`Pet`), Человек(`Human`). Создайте конструкторы для написанных классов. Создайте класс `Main` и в нем создайте экземпляры описанных классов.
- Сделайте поля всех классов приватными.
- Создайте и опишите класс Семья (Family). Будем считать, что семья может создаваться 2-мя людьми, которые не расходятся и могут рождать/усыновлять своих детей. Дети могут взрослеть и уходить из семьи, создавая свою собственную.
- Переопределите методы `equals()` и `hashCode()` во всех классах проекта.
- В классе `Family` добавьте метод `deleteChild(Human child)` c учетом наличия данных методов.

#### Технические требования:
- Опишите у класса Pet следующие поля:
  - вид животного (`species`), строка (собака, кот и тд)
  - кличка (`nickname`)
  - возраст (`age`)
  - уровень хитрости (`trickLevel`) (целое число от 0 до 100)
  - привычки (`habits`) (массив строк)
- Опишите у класса Pet и реализуйте следующие методы:
  - покушать (`eat`) (метод выводит на экран сообщение `Я кушаю!`)
  - отозваться (`respond`) (метод выводит на экран сообщение `Привет, хозяин. Я - [имя животного]. Я соскучился!`)
  - сделать домашнюю гадость (`foul`) (метод выводит на экран сообщение `Нужно хорошо замести следы...`)
- Опишите у класса Human следующие поля:
  - Имя (`name`)
  - Фамилия (`surname`)
  - Год рождения (`year`), число
  - Уровень IQ (`iq`) (целое число от 0 до 100)
  - Домашний любимец (`pet`) (объект типа Pet)
  - Мама (`mother`) (объект типа Human)
  - Папа (`father`) (объект типа Human)
  - Расписание внерабочих занятий (`schedule`) (2-мерный массив: [день недели] x [тип секции/отдыха])
- Опишите у класса Human и реализуйте следующие методы:
  - поприветствовать своего любимца (`greetPet`)("Привет, [имя животного]")
  - описать своего любимца (`describePet`): (вывести на экран всю информацию о своем питомце: "У меня есть [вид животного], ему [возраст животного] лет, он [очень хитрый]/[почти не хитрый]". Степень описания хитрости должна зависеть от уровня хитрости питомца, если больше 50 - [очень хитрый], если меньше или равно 50 - [почти не хитрый])
- Переопределите метод `toString()` у обоих классов;
  - у класса Pet должен выводить сообщение следующего вида: `dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}`, где `dog` - вид животного;
  - у класса Human должен выводить сообщение следующего вида: `Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}`
- В классе `Pet` создайте конструкторы:
  - конструктор, описывающий вид животного и его кличку
  - конструктор, описывающий все поля животного
  - пустой конструктор
- В классе `Human` создайте конструкторы:
  - конструктор, описывающий имя, фамилию и год рождения
  - конструктор, описывающий имя, фамилию, год рождения, папу и маму
  - конструктор, описывающий все поля
  - пустой конструктор
- Объявите все поля существующих классов как приватные. Добавьте геттеры и сеттеры; сделайте рефакторинг существующих методов с учетом изменений.
- Опишите у класса `Family` следующие поля:
  - мама `mother` (тип `Human`)
  - папа `father` (тип `Human`)
  - дети `children` (массив `Human`)
  - домашний любимец `pet` (тип `Pet`)
- Добавьте геттеры, сеттеры; переопределите `toString` так чтобы он показывал всю информацию о всех членах семьи.
- В классе `Family` создайте конструктор:
  - единственным условием создания новой семьи является наличие 2-х родителей, при этом у родителей должна устанавливаться ссылка на текущую новую семью, а семья создается с пустым массивом детей.
- Сделайте рефакторинг класса `Human` с учетом структуры `Family`:
  - удалите из Human всю информацию, дублирующуюся в классе Family (Human должен хранить только информацию описывающую себя)
  - добавьте поле `family` (тип `Family`) (теперь оно хранит всю информацию о семейных данных человека)
  - добавьте необходимые геттеры, сеттеры, конструкторы; удалите неактуальные конструкторы и методы; сделайте рефакторинг методов `поприветствовать своего любимца`, `описать своего любимца`, `накормить`
  - сделайте рефакторинг метода `toString()`. Он должен выводить информацию в следующем формате: `Human{name='Name', surname='Surname', year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}`
- В `Family` опишите методы: 
  - добавить ребенка `addChild` (принимает тип `Human` и добавляет его в массив детей; добавляет ребенку ссылку на текущую семью)
  - удалить ребенка `deleteChild` (принимает индекс массива и удаляет данный элемент; возвращает логическое значение - был ли удален элемент)
  - получить количество человек в семье `countFamily` (родители в семье никогда не изменяются; если происходит изменение родительского состава - это уже другая семья)
  - переопределите метод `toString()`
- Решите какие поля стоит использовать для сравнения в методе `equals()` (к примеру, привычки животного могут меняться).
- Решите какие поля стоит использовать для сравнения в методе `equals()` (к примеру, привычки животного могут меняться).
- В классе Main создайте несколько семей, чтобы у каждого из классов были использованы все возможные конструкторы. Выведите информацию о каждом человеке на экран.
- В классе Main создайте маму, папу, ребенка и его домашнее животное. Присвойте все необходимые ссылки (у ребенка на родителей и питомца), чтобы получилась полноценная семья. Вызовите все доступные методы у ребенка (включая метод `toString()`) и у его питомца.
  
Методы должны не просто добавлять/удалять элементы в массив `Human` но и производить необходимые модификации (добавленному/удаленном элементу установить/удалить ссылку на текущую семью). При удалении элемента, в массиве не должно оставаться пустых мест - необходимо создать новый массив.  

#### Необязательное задание продвинутой сложности:

- Опишите и реализуйте метод `накормить питомца` (`feedPet`) у класса Human, который принимает параметром логический тип boolean "наступило ли время кормить". Если время наступило - хозяин кормит питомца, если время не наступило, то уровень хитрости сравнивается с псевдослучайным числом 0-100 `java.util.Random`, и хозяин кормит, если уровень хитрости больше сгенерированного числа. Метод должен выводить на экран результат (`Хм... покормлю ка я Джека[имя животного]`/`Думаю, Джек не голоден.`) и возвращать логический результат (`true/false`) - произошла ли кормежка.
- В `Family` опишите метод `удалить ребенка`(`deleteChild`) (принимает тип Human и удаляет соответствующий элемент). Метод должен быть написан с учетом наличия методов `equals()` и `hashCode()`.

   **Подсказка**: для того, чтобы удалить верный элемент из массива Human'ов вам необходимо делать сравнения по полям идентифицирующим именно данного человека (подумайте, какие поля для этого подходят).
   
- Добавьте в каждый класс статический и нестатический блоки инициализации.
  - Статический блок должен выводить на экран информацию, что загружается новый класс (указать имя класса).
  - Нестатический блок должен выводить информацию на экран, что создается новый объект (указать тип объекта).

#### Литература:
- [Классы и объекты](https://metanit.com/java/tutorial/3.1.php)
- [Object and Classes](https://www.tutorialspoint.com/java/java_object_classes.htm)
- [Конструкторы и инициализаторы](https://metanit.com/java/tutorial/3.1.php)
- [Инкапсуляция. Геттеры/сеттеры](https://proselyte.net/tutorials/java-core/incapsulation/)
- [Перегрузка методов](http://www.linkex.ru/java/overloading-methods.php)
- [Переопределение equals и hashCode](http://javateaching.blogspot.com/2011/12/equals-hashcode.html)
- [Comparing Java objects with equals() and hashcode()](https://www.javaworld.com/article/3305792/learn-java/java-challengers-4-comparing-java-objects-with-equals-and-hashcode.html)
- [Java Best Practices: equals() and hashCode()](https://www.intigua.com/blog/good-and-bad-equals-and-hashcode)
- [Java/Статический конструктор](http://codewiki.imagetube.xyz/code/Java/Статический_конструктор)
- [Нестатические блоки инициализации](https://habr.com/post/133237/)