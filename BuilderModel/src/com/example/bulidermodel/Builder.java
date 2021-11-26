package com.example.bulidermodel;



/**
 * @author renfurui
 * @create -11-02-14:10
 */
public interface Builder {
   void setCarType(CarType type);
   void setSeats(int seats);
   void setEngine(Engine engine);
   void setTransmission(Transmission transmission);
   void setTripComputer(TripComputer tripComputer);
   void setGPSNavigator(GPSNavigator gpsNavigator);
}
