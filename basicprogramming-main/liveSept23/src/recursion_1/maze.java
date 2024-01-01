package recursion_1;
import java.util.*;

public class maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//maze(0, 0, "");
		int[][] maze= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		//chal(0,0,"",maze,visited);
		maze(0,0,"");
		
	}
	
	public static void maze(int R, int D, String path) {
		if(R==2 && D==2) {
			System.out.println(path);
			return;
		}
		if(R<=2) {
			maze(R+1, D, path+"R");
		}
		if(D<=2) {
			maze(R,D+1,path+"D");
		}
	}
	
	public static void chal(int r, int c, String path, int[][] maze, boolean[][] visited) {
		
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(path);
			//visited[r][c]=false;
			return;
		}
		if(r<0 || r>=maze.length||c>=maze[0].length||c<0||maze[r][c]==1||visited[r][c]==true) {
			return;
		}
		visited[r][c]=true;
		chal(r-1,c, path+"U", maze,visited);
		chal(r+1,c,path+"D", maze,visited);
		chal(r,c-1,path+"L",maze,visited);
		chal(r,c+1, path+"R",maze,visited);
		visited[r][c]=false;
	}
}
