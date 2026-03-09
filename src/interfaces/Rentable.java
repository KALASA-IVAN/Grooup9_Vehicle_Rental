package interfaces;

public interface Rentable {

    void rentVehicle(int vehicleId, int days) throws Exception;

    void returnVehicle(int vehicleId);
}