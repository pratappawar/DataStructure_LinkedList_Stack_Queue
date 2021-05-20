package com.dataStructureLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    @Test
    void given3NumbersWhenAddedToLinkedList_ShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(myThirdNode)&&
                       myLinkedList.head.getNext().equals(mySecondNode)&&
                       myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
}