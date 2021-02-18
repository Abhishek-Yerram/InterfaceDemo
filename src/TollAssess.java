
interface Truck{
	int getAxle();
	long getTotalweight();
}

class myTruck implements Truck{
	static int Axle;
	static long Totalweight;
	
	public myTruck(int Axle,long Totalweight) {
		this.Axle=Axle;
		this.Totalweight=Totalweight;
	}
	public int getAxle() {
		return Axle;
	}
	public long getTotalweight() {
		return Totalweight;
	}
}


class Ford extends myTruck{
	public Ford(int Axle,long Totalweight) {
		super(Axle,Totalweight);
	}
}

class Nissan extends myTruck{
	public Nissan(int Axle,long Totalweight) {
		super(Axle,Totalweight);
	}
}

class Audi extends myTruck{
	public Audi(int Axle, long Totalweight) {
		super(Axle,Totalweight);
	}
}
interface TollBooth{
	public void CalculateToll(Truck t);
	public void Display();
	public void Reset();
}

class AllegencyTollBooth implements TollBooth{
	public static int totaltrucks=0;
	public static long totalreceipts=0;
	public void CalculateToll(Truck t) {
		int axle=myTruck.Axle;
		System.out.println("no of Axles: "+axle);
		long totalweight=myTruck.Totalweight;
		System.out.println("Total weight: "+totalweight);
		long tollpaid=(axle*5)+(10*(totalweight/500));
		System.out.println("Total toll paid is"+tollpaid);
		totaltrucks+=1;
		totalreceipts=totalreceipts+tollpaid;
		
	}
	public void Display() {
		System.out.println("Total Trucks passed"+totaltrucks);
		System.out.println("Total receipts since collection"+totalreceipts+"$");
		System.out.println("---------------------------------------------------");
	}
	public void Reset() {
		System.out.println("----------------Resetting the data-----------------");
		totaltrucks=0;
		totalreceipts=0;
	}
	
}

public class TollAssess extends AllegencyTollBooth{

	public static void main(String[] args) {
		TollBooth tollbooth=new AllegencyTollBooth();
		myTruck ford=new Ford(4,3400);
		tollbooth.CalculateToll(ford);
		tollbooth.Display();
		
		
		myTruck nissan=new Nissan(4,2000);
		tollbooth.CalculateToll(nissan);
		tollbooth.Display();
		tollbooth.Reset();
		
		myTruck audi=new Audi(5,6946);
		tollbooth.CalculateToll(audi);
		tollbooth.Display();
		
		
		

	}

}
