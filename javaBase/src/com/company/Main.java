package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Jumanjii");
    Dog dg  = new Dog();
    Cat ct  = new Cat();
     	String Name ;
        String Voice ;
        dg.set__Name__("Whiskey");
        dg.set__Voice__("Woof!");
	ct.set__Name__("Rum");
        ct.set__Voice__("Meow!");

    
    System.out.println(dg.get__Name__()+" does "+ dg.get__Voice__());
    System.out.println(ct.get__Name__()+" does "+ ct.get__Voice__());
    }
}
