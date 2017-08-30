package com.kannan.collection.tree;

import java.util.*;

class Node {
    char label;
    boolean visited = false;

    public Node(char l) {
        this.label = l;
    }
}

public class Graph {
    private Node rootNode;
    private ArrayList nodes = new ArrayList();
    private int[][] adjMatrix;//Edges will be represented as adjacency Matrix
    private int size;

    private void setRootNode(Node n) {
        this.rootNode = n;
    }

    public Node getRootNode() {
        return this.rootNode;
    }

    private void addNode(Node n) {
        nodes.add(n);
    }

    //This method will be called to make connect two nodes
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
            if (adjMatrix[index][j] == 1 && ((Node) nodes.get(j)).visited == false) {
                return (Node) nodes.get(j);
            }
            j++;
        }
        return null;
    }

    //BFS traversal of a tree is performed by the bfs() function
    private void bfs() {

        //BFS uses Queue data structure
        List<Node> resultSet = new ArrayList<>(nodes.size());
        Queue q = new LinkedList();
        q.add(this.rootNode);
        resultSet.add(this.rootNode);
        rootNode.visited = true;
        while (!q.isEmpty() && resultSet.size() < nodes.size()) {
            Node n = (Node) q.remove();
            Node child;
            while ((child = getUnvisitedChildNode(n)) != null) {
                child.visited = true;
                resultSet.add(child);
                q.add(child);
            }
        }
        //Clear visited property of nodes
        clearNodes();

        resultSet.forEach(node -> System.out.print(node.label));
    }

    //DFS traversal of a tree is performed by the dfs() function
    private void dfs() {
        //DFS uses Stack data structure
        Stack s = new Stack();
        s.push(this.rootNode);
        rootNode.visited = true;
        printNode(rootNode);
        while (!s.isEmpty()) {
            Node n = (Node) s.peek();
            Node child = getUnvisitedChildNode(n);
            if (child != null) {
                child.visited = true;
                printNode(child);
                s.push(child);
            } else {
                s.pop();
            }
        }
        //Clear visited property of nodes
        clearNodes();
    }


    //Utility methods for clearing visited property of node
    private void clearNodes() {
        int i = 0;
        while (i < size) {
            Node n = (Node) nodes.get(i);
            n.visited = false;
            i++;
        }
    }

    //Utility methods for printing the node's label
    private void printNode(Node n) {
        System.out.print(n.label + " ");
    }

    public static void main(String[] args) {

        //Lets create nodes as given as an example in the article
        Node nA = new Node('A');
        Node nB = new Node('B');
        Node nC = new Node('C');
        Node nD = new Node('D');
        Node nE = new Node('E');
        Node nF = new Node('F');

        //Create the graph, add nodes, create edges between nodes
        Graph g = new Graph();
        g.addNode(nA);
        g.addNode(nB);
        g.addNode(nC);
        g.addNode(nD);
        g.addNode(nE);
        g.addNode(nF);
        g.setRootNode(nA);

        g.connectNode(nA, nB);
        g.connectNode(nA, nC);
        g.connectNode(nA, nD);

        g.connectNode(nB, nE);
        g.connectNode(nB, nF);
        g.connectNode(nC, nF);

        //Perform the traversal of the graph
        System.out.println("DFS Traversal of a tree is ------------->");
        g.dfs();

        System.out.println("\nBFS Traversal of a tree is ------------->");
        g.bfs();
    }
}
