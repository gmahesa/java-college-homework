package modul5;  

class ShortestPath 
{ 
	static final int Vertex=5; 
	
	int minDistance(int jarak[], Boolean shortestpathT[]) 
	{ 
		int min = Integer.MAX_VALUE, min_index=-1; 

		for (int v = 0; v < Vertex; v++) 
			if (shortestpathT[v] == false && jarak[v] <= min) 
			{ 
				min = jarak[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 
 
	void print(int jarak[], int n, int source) 
	{ 
		System.out.println("Jarak vertices source : "+source+" ke semua vertices :"); 
		for (int i = 0; i < Vertex; i++) 
			System.out.println("Jarak source ke vertices "+(i)+" adalah "+jarak[i]); 
	} 

	void dijkstra(int graph[][], int src) 
	{ 
		int jarak[] = new int[Vertex];
		Boolean shortestpathT[] = new Boolean[Vertex]; 
		for (int i = 0; i < Vertex; i++) 
		{ 
			jarak[i] = Integer.MAX_VALUE; 
			shortestpathT[i] = false; 
		} 
		jarak[src] = 0; 
		for (int count = 0; count < Vertex-1; count++) 
		{ 
			int u = minDistance(jarak, shortestpathT); 
			shortestpathT[u] = true; 
			for (int v = 0; v < Vertex; v++) 
				if (!shortestpathT[v] && 
						graph[u][v]!=0 && 
						jarak[u] != Integer.MAX_VALUE && 
						jarak[u]+graph[u][v] < jarak[v])
					
					jarak[v] = jarak[u] + graph[u][v]; 
			
		} 
		print(jarak, Vertex, src); 
	
	}
} 