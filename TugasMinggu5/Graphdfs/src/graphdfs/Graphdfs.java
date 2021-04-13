/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphdfs;

/**
 *
 * @author LENOVO
 */
public class Graphdfs {
   private final int MAX_VERTS = 20;
    private Vertexdfs vertexList[]; 
    private int adjMat[][];      
    private int nVerts;          
    private Stackdfs theStack;

    public Graphdfs() 
    {
        vertexList = new Vertexdfs[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int y = 0; y < MAX_VERTS; y++) 
        {
            for (int x = 0; x < MAX_VERTS; x++) 
            {
                adjMat[x][y] = 0;
            }
        }
        theStack = new Stackdfs();
    }  

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertexdfs(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    public void dfs()
    {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);

        while (!theStack.isEmpty())
        {
 
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) 
            {
                theStack.pop();
            } else
            {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }  

        
        for (int j = 0; j < nVerts; j++) 
        {
            vertexList[j].wasVisited = false;
        }
    }  

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
                return j;
            }
        }
        return -1;
    } 
}  
