/*

Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом .String
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.*/

public class Main {

    public static void main(String[] args) {

Dog avva = new Dog("Avva",  20);
     avva.setName("Bob");
       avva.setAge(10);
System.out.println("Меня зовут " + avva.getName() +  " мне " + avva.getAge());
    }
}
 class Dog {
    private String  name;
     private int age;
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName(){return this.name;}
        int getAge(){return this.age; }
        void setAge(int age){System.out.println( "мне" + age);}
        void setName(String name){
            System.out.println("Меня зовут " + name +  " мне "  + age);
        }
}
    //напишите тут ваш код

