package codility;
import java.util.LinkedList;
import java.util.Queue;

public class labirint {
	// you can also use imports, for example:
	// import java.util.*;


	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	class Solution {
	    public boolean solution(String[] B) {

	        

	        if (B.length==0){
	            return false;
	        }

	        if(B.length==1){
	            return true;
	        }
	    // making the grid of possible routs
	    //dimentions of grid
	        int rows=B.length;
	        int columns=B[0].length();
	        int [] end = new int[2];
	        end[0]=rows-1;
	        end[1]=columns-1;
	        int[] assassin=new int [2];
	    //itialization of a grid is false == true:)
	        Character [][] grid=new Character[rows][columns];
	    //  the grid is necesary and if I will make changes to the Strings by itself time of creating new string will be tramendus during the implementation realize thre will be need of few of 200x200=40000 time is a ok

	       for(int i=0;i<rows;i++){
	           for (int j=0; j<columns;j++){
	               if (B[i].charAt(j)=='A'){
	               assassin[0]=i;
	               assassin[1]=j;
	               }

	               grid[i][j]=B[i].charAt(j);


	           }}

	       // now the gards lines of view cant fit this value without modification to the grid or string or complex logic logic then try first pen and paper character grid will be easier now it will be easier as long as its interesting it's also tireing have to take breaks to avoid misstakes man there is so much logic w for wiev/view but v is taken lol no then f for field this logic with f don;t work yea lol lookds good break augmented grid is looking good now the travelsal part but first little bit of yea moment hurra
	       for(int i=0;i<rows;i++){
	           for (int j=0; j<columns;j++){
	            if(grid[i][j]=='>'){
	                int f=1;
	                while (j+f<columns&&(grid[i][j+f]=='.'||grid[i][j+f]=='f')){
	                    grid[i][j+f]='f';
	                    f++;
	                }}
	            if(grid[i][j]=='<'){
	                int f=1;
	                while (j-f>=0&&(grid[i][j-f]=='.'||grid[i][j-f]=='f')){
	                    grid[i][j-f]='f';
	                    f++;
	                }}
	            if(grid[i][j]=='v'){
	                int f=1;
	                while (i+f<rows&&(grid[i+f][j]=='.'||grid[i+f][j]=='f')){
	                    grid[i+f][j]='f';
	                    f++;
	                }}
	            if(grid[i][j]=='^'){
	                int f=1;
	                while (i-f>=0&&(grid[i-f][j]=='.'||grid[i-f][j]=='f')){
	                    grid[i-f][j]='f';
	                    f++;
	                }}

	           }}

	   // I'm curious how this looks so far
	   //ok to the grid traversal i go BFS algorithm is going to be used the grid will be usefull to set nodes like visited and hopefully usefull in debugging looks good and logic again this is so much logic of this grid check well move slowly then brain poweer close to finish will try some time and well see brain fog is on it looks promissing kill the bugs hahahahahhahahahahahaha done now the corner bulcases ffffffffffffffffffffffff more corner cases in minwhile lets talk about nr 2

	   //queue 
	   Queue<int[]> q=new LinkedList<int[]>();

	    q.add(assassin);

	    while(!q.isEmpty()){
	        int [] current=q.poll();
	        System.out.println("current "+ current[0]+" "+current[1]);
	        System.out.println("end "+end[0]+" "+end[1]);

	        if(current[0]==end[0]&&current[1]==end[1]){
	            System.out.println("END");






	            return true;
	        }

	        System.out.println(current[0]+" "+current[1]);
	        if(grid[current[0]][current[1]]=='.'||grid[current[0]][current[1]]=='A'){

	            grid[current[0]][current[1]]='-';
	        

	                if(
	                    current[1]+1<columns&&grid[current[0]][current[1]+1]=='.'){
	                    int[] m=new int[2];
	                    m[0]=current[0];
	                    m[1]=current[1]+1;
	                    q.add(m);
	                }
	                if(current[0]+1<rows&&grid[current[0]+1][current[1]]=='.'){
	                    int[] m=new int[2];
	                    m[0]=current[0]+1;
	                    m[1]=current[1];
	                    q.add(m);
	                }
	                if(current[1]-1>=0&&grid[current[0]][current[1]-1]=='.'){
	                    int[] m=new int[2];
	                    m[0]=current[0];
	                    m[1]=current[1]-1;
	                    q.add(m);
	                }
	                if(current[0]-1>=0&&grid[current[0]-1][current[1]]=='.'){
	                    int[] m=new int[2];
	                    m[0]=current[0]-1;
	                    m[1]=current[1];
	                    q.add(m);
	                }




	            // System.out.println(q);
	        }

	    }



	       for(int i=0;i<rows;i++){
	           for (int j=0; j<columns;j++){
	System.out.print(grid[i][j]);
	if(j==columns-1){
	    System.out.println();
	    
	}
	           }}
	   
	   return false;
	   }
	}

	//lol i passedd 2 tests

}
