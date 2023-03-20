package org.example;
//Eagle will be  the child class.
public class BaldEagle extends Birds{
    //This is an example of method overriding.
    double wingspan ;
    double height;
    double weight ;
    @Override
    public void fly() {

        System.out.println("Bald Eagles can fly.");
    }
    //This is an example of method overloading. 
    public void size(double wingspan) {
        System.out.println("The wingspan of a bald eagle is: " + wingspan + " feet.");
    }
    public void size(double height, double weight) {
        System.out.println("The height of the bald eagle is: " + height + " feet. The weight of a bald eagle is: " + weight  + " pounds.");
    }


}
