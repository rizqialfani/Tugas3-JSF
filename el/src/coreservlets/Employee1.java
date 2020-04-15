package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class Employee1 extends Employee {
  public Employee1() {
    super(new Name("M. Rizqi", "Alfani"),
          new Company("Computer Engineering",
                      "Tech"));
  }
}
