package io.juanqui89.github;

import java.util.Objects;
import java.util.UUID;

public abstract class UberTaxi {
  private UUID id;
  protected UberHirer uberHirer;
  private String codeName;

  public UberTaxi(UberHirer hirer, String codeName) {
    uberHirer = hirer;
    this.codeName = codeName;
    id = UUID.randomUUID();
  }

  public String getCodeName() {
    return codeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UberTaxi uberTaxi = (UberTaxi) o;
    return id.equals(uberTaxi.id) &&
            codeName.equals(uberTaxi.codeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codeName);
  }

  public String pickingUp(Passenger passenger) {
    return "picking up " + passenger.getUserName();
  }
}
