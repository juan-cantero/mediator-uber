package io.juanqui89.github;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UberHirer {
  private Map<String, UberTaxi> taxis;
  private Map<String,Passenger> passengers;

  public UberHirer() {
    taxis = new HashMap<String, UberTaxi>();
    passengers = new HashMap<>();

  }

  public void addUberTaxi(UberTaxi taxi) {
    taxis.put(taxi.getCodeName(),taxi);
  }

  public void showUberTaxisAvailables() {
    for (String uberTaxis : taxis.keySet()) {
      System.out.println(uberTaxis);
    }
  }

  public String hireTaxi(Passenger passenger, String taxiCodeName) {
    return taxis.get(taxiCodeName).pickingUp(passenger);
  }
}
