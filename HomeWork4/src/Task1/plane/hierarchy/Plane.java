package Task1.plane.hierarchy;

public abstract class Plane {
	private final String aircraftManufacturer;
	private final String aircraftModel;
	private final int flightRange;
	private final int fuelConsumption;

	public Plane(int flightRange,
				 int fuelConsumption,
				 String aircraftManufacturer,
				 String aircraftModel) {
		this.flightRange = flightRange;
		this.fuelConsumption = fuelConsumption;
		this.aircraftManufacturer = aircraftManufacturer;
		this.aircraftModel = aircraftModel;
	}

	public abstract int getSeatingCapacity();
	
	public abstract int getCargoCapacity();
	
	public int getFlightRange() {
		return flightRange;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}


	@Override
	public String toString() {
		return "Aircraft [aircraftManufacturer=" + aircraftManufacturer
				+ ", aircraftModel=" + aircraftModel + ", seatingCapacity="
				+ getSeatingCapacity() + ", cargoCapacity=" + getCargoCapacity()
				+ ", flightRange=" + flightRange + ", fuelConsumption="
				+ fuelConsumption + "]";
	}
	
}
