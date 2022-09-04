package modul_satu;

public class matriks_bagi {
    public static void main(String[] args) {
      
        int a [][]= {{10,8},{4,6}};
        int b [][]= {{2,4},{8,4}};
        float c [][]= new float [2][2];
        
        System.out.println("Matriks A");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
            
        }
        System.out.println("Matriks B");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println();
            
        }
        
       
       int det = 0;
       det = (b[0][0]*b[1][1]) - (b[0][1]*b[1][0]);
       System.out.println(det);
       
       int temp = 0;
       b [0][1] *= -1;
       b [1][0] *= -1;
       
       temp = b [0][0];
       b [0][0] = b [1][1];
       b [1][1] = temp;
       
       float invers=0;
       invers = 1/det;
       System.out.println(invers);
       
       for(int i = 0 ; i<a.length ; i++ ) {
    	   for(int j = 0 ; j<a[0].length ; j++) {
    		   c[i][j] = (float)a[i][j] * invers;
    	   }
       }
       
       System.out.println("Invers matriks B");
       for(int i = 0 ; i < b.length ; i++) {
    	   for(int j = 0 ; j < b[0].length; j++) {
    		   System.out.print(b[i][j]+"  ");
    	   }
    	   System.out.println();
       }
       
       System.out.println("pembagian matriks A dengan B");
       for(int i = 0 ; i < c.length ; i++) {
    	   for(int j = 0 ; j < c[0].length; j++) {
    		   System.out.print(c[i][j]+"  ");
    	   }
    	   System.out.println();
       }
        
    }
}
