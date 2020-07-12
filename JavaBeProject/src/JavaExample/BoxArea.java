package JavaExample;

public class BoxArea {

	 private int lenght;
	 private int breadth;
	 private int height;
	 
	 public void setDimention(int l,int b,int h)
     {
		 lenght=l;
		 breadth=b;
		 height=h;
     }
	 
	 public void showDimention()
	 {
		System.out.println("Length= " +lenght); 
		System.out.println("breadth= " +breadth); 
		System.out.println("height= " +height); 
	 }
	
}
