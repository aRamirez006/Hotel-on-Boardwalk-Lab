package org.example;


public class App {
    public static void main(String[] args) {
        CircularLinkedList monopolyBoard = new CircularLinkedList();
        
        monopolyBoard.append("Go");
        monopolyBoard.append("Mediterranean Avenue");
        monopolyBoard.append("Community Chest");
        monopolyBoard.append("Baltic Avenue");
        monopolyBoard.append("Income Tax");

        System.out.println(monopolyBoard.currentNode());

        monopolyBoard.step();

        System.out.println(monopolyBoard.currentNode());

        monopolyBoard.step();
        monopolyBoard.step();
        monopolyBoard.step();

        System.out.println(monopolyBoard.currentNode());

        for(int i = 0; i < 37; i++){
            monopolyBoard.step();
        }

        System.out.println(monopolyBoard.currentNode());
    }
}
