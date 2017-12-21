package com.kannan.collection.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {
    /**
     * @author Kannan Dharmalingam
     */
    private class Node {
        char data;
        boolean visited = false;

        Node(char data) {
            this.data = data;
        }
    }

    private Node rootNode;
    private List<Node> nodes = new ArrayList<>();
    private int[][] adjMatrix;//Edges will be represented as adjacency Matrix
    private int size;

    private void setRootNode(Node n) {
        this.rootNode = n;
    }

    private void addNode(Collection<Node> nodeCollection) {
        nodes.addAll(nodeCollection);
    }

    private void connectNode(Node start, Node end) {
        if (adjMatrix == null) {
            size = nodes.size();
            adjMatrix = new int[size][size];
        }

        int startIndex = nodes.indexOf(start);
        int endIndex = nodes.indexOf(end);
        adjMatrix[startIndex][endIndex] = 1;
        adjMatrix[endIndex][startIndex] = 1;
    }

    private Node getUnvisitedChildNode(Node n) {

        int index = nodes.indexOf(n);
        int j = 0;
        while (j < size) {
            if (adjMatrix[index][j] == 1 && !(nodes.get(j)).visited) {
                return nodes.get(j);
            }
            j++;
        }
        return null;
    }

    //BFS uses Queue data structure
    private void breadthFirstSearch() {
        System.out.print("Breadth First Search-:");
        List<Node> resultSet = new ArrayList<>(nodes.size());
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.rootNode);
        resultSet.add(this.rootNode);
        rootNode.visited = true;
        while (!queue.isEmpty() && resultSet.size() < nodes.size()) {
            Node n = queue.remove();
            Node child;
            while ((child = getUnvisitedChildNode(n)) != null) {
                child.visited = true;
                resultSet.add(child);
                queue.add(child);
            }
        }
        clearNodes(); //Clear visited property of nodes

        resultSet.forEach(node -> System.out.print(" " + node.data));
        System.out.println();
    }

    //DFS uses Stack data structure
    private void depthFirstSearch() {
        System.out.print("Depth First Search---:");
        Stack<Node> stack = new Stack<>();
        stack.push(this.rootNode);
        rootNode.visited = true;
        printNode(rootNode);
        while (!stack.isEmpty()) {
            Node n = stack.peek();
            Node child = getUnvisitedChildNode(n);
            if (child != null) {
                child.visited = true;
                printNode(child);
                stack.push(child);
            } else {
                stack.pop();
            }
        }
        clearNodes(); //Clear visited property of nodes
    }

    //Utility methods for clearing visited property of node
    private void clearNodes() {
        int i = 0;
        while (i < size) {
            Node n = nodes.get(i);
            n.visited = false;
            i++;
        }
    }

    //Utility methods for printing the node's label
    private void printNode(Node n) {
        System.out.print(" " + n.data);
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.initialize();

        tree.breadthFirstSearch();
        tree.depthFirstSearch();
    }

    private void initialize() {
        Node nA = new Node('A');
        Node nB = new Node('B');
        Node nC = new Node('C');
        Node nD = new Node('D');
        Node nE = new Node('E');
        Node nF = new Node('F');

        addNode(Arrays.asList(nA, nB, nC, nD, nE, nF));
        setRootNode(nA);

        connectNode(nA, nB);
        connectNode(nA, nC);
        connectNode(nA, nD);

        connectNode(nB, nE);
        connectNode(nB, nF);
        connectNode(nC, nF);
    }
}
/*
Output:
Breadth First Search-: A B C D E F
Depth First Search---: A B E F C D
*/