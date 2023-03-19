public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException{
        ShapeCache bs = new ShapeCache(); //try to create object bs
	bs.setWebName("Shop1");
	bs.loadData();
	System.out.println(bs);  

	System.out.println();
	
	ShapeCache bs1 = (ShapeCache) bs.clone(); //instead of creating new object create clone
	bs1.setWebName("Shop2");
	bs1.loadData();
	System.out.println(bs1);  
  
    }
    }
    