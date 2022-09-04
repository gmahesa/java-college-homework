package modul5;
import java.util.Scanner;

public class driverdijkstra {

	public static void main(String[] args){ 
		int graph[][] = new int[][]{{0, 5, 8, 0, 0},
									{0, 0, 0, 2, 3}, 
									{0, 0, 0, 0, 4}, 
									{1, 0, 0, 0, 0}, 
									{7, 0, 0, 6, 0}  
									}; 
		int root;
		Scanner input = new Scanner(System.in);
		ShortestPath path = new ShortestPath(); 
		System.out.println("Input vertex root (antara 0 sampai 4) : "); 
		root=input.nextInt();
		path.dijkstra(graph, root); 
	} 
}
