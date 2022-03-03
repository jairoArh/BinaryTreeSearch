package model;

import java.util.ArrayList;
import java.util.Comparator;

public class BinaryTree<T> {
    private TreeNode<T> root;
    private Comparator<T> comparator;
    private int aux;
    private ArrayList<T> list;

    public BinaryTree( Comparator<T> comparator ){
        this.comparator = comparator;
        root = null;
    }

    public boolean isEmpty(){

        return root == null ? true : false;
    }

    public void addNode( T info ){
        TreeNode<T> newNode = new TreeNode<>( info );
        if( isEmpty( ) ){
            root = newNode;
        }else{
            TreeNode<T> aux = root;
            TreeNode<T> ant = null;
            while( aux != null ){
                ant = aux;
                aux = comparator.compare(info, aux.getInfo()) < 0 ? aux.getLeft() : aux.getRight();
            }
            if( comparator.compare(info, ant.getInfo()) < 0 ){
                ant.setLeft( newNode );
            }else{
                ant.setRight( newNode );
            }
        }
    }

    public ArrayList<T> listPresort(){
        list = new ArrayList<>();
        presort( root );

        return list;
    }

    private void presort(TreeNode<T> node) {
        if( node != null ){
            list.add( node.getInfo());
            presort( node.getLeft());
            presort( node.getRight());
        }
    }

    public ArrayList<T> listInsort(){
        list = new ArrayList<>();
        insort( root );

        return list;
    }

    private void insort(TreeNode<T> node) {
        if( node != null ){
            insort( node.getLeft());
            list.add( node.getInfo());
            insort( node.getRight());
        }
    }

    public ArrayList<T> listPosort(){
        list = new ArrayList<>();
        posort( root );

        return list;
    }

    private void posort(TreeNode<T> node) {
        if( node != null ){
            posort( node.getLeft());
            posort( node.getRight());
            list.add( node.getInfo());
        }
    }

}
