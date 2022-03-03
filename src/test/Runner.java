package test;

import model.BinaryTree;

public class Runner {
    public static void main(String[] args) {
        BinaryTree<Integer> bts = new BinaryTree<>((o1,o2)->Integer.compare( o1, o2));

        bts.addNode( 50 );
        bts.addNode( 10 );
        bts.addNode( 69 );
        bts.addNode( 5 );
        bts.addNode( 34 );
        bts.addNode( 57 );
        bts.addNode( 95 );
        bts.addNode( 18 );
        bts.addNode( 40 );
        bts.addNode( 63 );
        bts.addNode( 120 );
        bts.addNode( 100 );

        //preorden
        //50 10 5 34 18 40 69 57 63 95 120 100
        //bts.listPresort().forEach( System.out::println);

        //inorden
        //5 10 18 34 40 50 57 63 69 95 100 120
        //bts.listInsort().forEach( System.out::println);

        //posorden
        //5 18 40 34 10 63 57 100 120 95 69 50
        bts.listPosort().forEach( System.out::println);
    }
}
