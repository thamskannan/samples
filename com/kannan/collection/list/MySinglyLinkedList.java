package com.kannan.collection.list;

public class MySinglyLinkedList {

    private static Node head;

    private class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    private void insert(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(value);
        }
    }

    private void delete(int value) {
        if (head != null) {
            if (head.data == value) {
                head = head.next;
            } else {
                Node curr = head;
                while (curr.next != null) {
                    if (curr.next.data == value) {
                        curr.next = curr.next.next;
                    } else {
                        curr = curr.next;
                    }
                }
            }
        }
    }

    /* Function to reverse the linked list */
    private void reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    private void reverse_Recursive(Node current, Node prev) {
        if (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            reverse_Recursive(current, prev);
        } else {
            head = prev;
        }
    }

    // prints content of double linked list
    private void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        list.insert(85);
        list.insert(15);
        list.insert(4);
        list.insert(20);
        list.insert(10);
        list.insert(30);

        System.out.println("Given Linked list");
        list.printList(head);
        //list.reverse(head);
        list.reverse_Recursive(head, null);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
        System.out.println("");
        System.out.println("Delete from list");
        list.delete(4);
        list.printList(head);
    }
}