package test;

import model.BinaryTree;
import model.Car;

public class Runner {
    public static void main(String[] args) {
        BinaryTree<Car> bts = new BinaryTree<>((car1, car2)->Integer.compare( car1.getModel(),car2.getModel()));

        bts.addNode( new Car("JJJ708","Renault 9",1989, "Azul"));
        bts.addNode( new Car("NOT560","Chevrolet Aveo",2007, "Rojo"));
        bts.addNode( new Car("DZW615","Kia Picanto",2018, "Gris"));
        bts.addNode( new Car("HWY818","Nissan Versa",2014, "Blanco"));
        bts.addNode( new Car("ZGB453","Mazda CX5",2016, "Verde"));
        bts.addNode( new Car("WGD737","Chevrolet Corsa",2006, "Plata"));
        bts.addNode( new Car("BFT826","Ford Fiesta",2020, "Rojo"));

        bts.listInsort().forEach( System.out::println );

    }
}
