package JavaExample;

public class BoxArea2 {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		BoxArea2 b1 = new BoxArea2();
        b1.setDimention(10,20,30);
       	b1.showDimention(); 	
	}
	
}
