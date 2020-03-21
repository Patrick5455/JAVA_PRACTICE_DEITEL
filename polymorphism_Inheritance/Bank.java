package polymorphism_Inheritance;

//using keyword abstract before declaring the class prevents creating an object of class bank. e,g
// Bank bank = new Bank();
//An abstract class is a class that cannot be instantiated.
//We can only create a reference of class bank and instantiate it with any of its sub class
//e.g Bank bank = new Bank_ABC(); But we are prevented from creating an object of Class Bank.
abstract class Bank {

    //polymorphism the property of an object to have different forms.

    abstract int  getInterestRate();

}

//just like abstract classes, we also have abstract methods.
// Abstract methods can only be implemented using the sub class.
//There are 2 conditons to make a method abstract
//1. The class it belongs to must also be abstract e.g abstract class Bank(){}
//2.

// if we do not add "abstract" keyword before a class, it makes the class
//concrete which means it can be instantiated, unlike abstract classes