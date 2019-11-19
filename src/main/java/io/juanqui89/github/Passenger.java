package io.juanqui89.github;

public  class Passenger {
  private String userName;
  private UberHirer uberHirer;

  public Passenger(String userName) {
    this.userName = userName;
  }

  public void setUberHirer(UberHirer hirer) {
    this.uberHirer = hirer;
  }

  public String getUserName() {
    return userName;
  }

  public void showAvailableTaxis() {
    uberHirer.showUberTaxisAvailables();
  }

  public String hireUberTaxi(String codeName) {
    return uberHirer.hireTaxi(this,codeName);

  }


}
