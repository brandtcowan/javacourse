package javacourse;

public class house {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wall wall= new Wall("West");
		Wall wall2= new Wall("East");
		Wall wall3= new Wall("North");
		Wall wall4= new Wall("South");
		
		Ceiling ceiling = new Ceiling("White",12);
		
		Bed bed = new Bed("Modern","King", 4,3,2,1);
		
		Lamp lamp = new Lamp("Classic",false, 75);
		
		Bedroom bedRoom = new Bedroom("Brandt", wall, wall2, wall3, wall4, ceiling, bed, lamp);
		
		bedRoom.makeBed();
		bedRoom.getLamp().turnOn();
					 
	}

}
