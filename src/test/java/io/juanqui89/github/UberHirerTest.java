package io.juanqui89.github;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UberHirerTest {

  UberHirer uberHirer;
  Taxi taxi;
  Passenger passenger;

  @BeforeTest
  public void setUp() {
    uberHirer = new UberHirer();
    passenger = new Passenger("pepe");
    passenger.setUberHirer(uberHirer);
    taxi = new Taxi(uberHirer,"lion");
    uberHirer.addUberTaxi(taxi);
  }

  @Test
  public void showUberTaxisAvailables() {
    uberHirer.showUberTaxisAvailables();
  }

  @Test
  public void hireTaxi() {
    String expected = passenger.hireUberTaxi("lion");
    Assert.assertEquals("picking up pepe", expected );
  }
}