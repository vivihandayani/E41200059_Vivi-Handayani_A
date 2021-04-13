/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph1;

/**
 *
 * @author LENOVO
 */
public class GraphApp {
    public static void main(String[] args) {
        
        Graph1 theGraph1 = new Graph1();
        theGraph1.addVertex('A'); // 0
        theGraph1.addVertex('B'); // 1
        theGraph1.addVertex('C'); // 2
        theGraph1.addVertex('D'); // 3
        theGraph1.addVertex('E'); // 4
        
        theGraph1.addEdge(0, 1); //AB
        theGraph1.addEdge(1, 2); //BC
        theGraph1.addEdge(2, 3); //AD
        theGraph1.addEdge(3, 4); //DE
        
        //theGraph1.bfs();
        
        theGraph1.bfs();
        theGraph1.display();
    }
}

