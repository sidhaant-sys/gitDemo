package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Jumanjii");
    Dog dg  = new Dog();
    Cow cw  = new Cow();
    String Name ;
    String Voice ;
    Cat ct  = new Cat();
        dg.set__Name__("Whiskey");
        dg.set__Voice__("Woof!");
	ct.set__Name__("Rum");
        ct.set__Voice__("Meow!");
	cw.set__Name__("Radha");
        cw.set__Voice__("Mohhhh!");
    
    System.out.println(cw.get__Name__()+" does "+ cw.get__Voice__());   
    System.out.println(dg.get__Name__()+" does "+ dg.get__Voice__());
    System.out.println(ct.get__Name__()+" does "+ ct.get__Voice__());

    }
}
