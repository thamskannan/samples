package com.kannan.collection.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {
    /**
     * @author Kannan Dharmalingam
     */
    static class Node {
        char data;
        boolean visited = false;

        Node(char data) {
            this.data = data;
        }
    }

    private Node rootNode;
    private ArrayList<Node> nodes = new ArrayList<>();
    private int[][] adjMatrix;//Edges will be represented as adjacency Matrix
    private int size;

    private void setRootNode(Node n) {
        this.rootNode = n;
    }

    private void addNode(Node n) {
        nodes.add(n);
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
        TreeTraversal.Node nA = new TreeTraversal.Node('A');
        TreeTraversal.Node nB = new TreeTraversal.Node('B');
        TreeTraversal.Node nC = new TreeTraversal.Node('C');
        TreeTraversal.Node nD = new TreeTraversal.Node('D');
        TreeTraversal.Node nE = new TreeTraversal.Node('E');
        TreeTraversal.Node nF = new TreeTraversal.Node('F');

        TreeTraversal tree = new TreeTraversal();
        tree.addNode(nA);
        tree.addNode(nB);
        tree.addNode(nC);
        tree.addNode(nD);
        tree.addNode(nE);
        tree.addNode(nF);
        tree.setRootNode(nA);

        tree.connectNode(nA, nB);
        tree.connectNode(nA, nC);
        tree.connectNode(nA, nD);

        tree.connectNode(nB, nE);
        tree.connectNode(nB, nF);
        tree.connectNode(nC, nF);

        tree.breadthFirstSearch();
        tree.depthFirstSearch();
    }
}
/*
Output:
Breadth First Search-: A B C D E F
Depth First Search---: A B E F C D
*/