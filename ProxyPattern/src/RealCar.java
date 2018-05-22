
public class RealCar implements Car{
	
	   private String carName;

	   public RealCar(String carName){
	      this.carName = carName;
	      loadFromDisk(carName);
	   }

	   @Override
	   public void display() {
	      System.out.println("Displaying " + carName);
	   }

	   private void loadFromDisk(String carName){
	      System.out.println("Loading " + carName);
	   }
}
