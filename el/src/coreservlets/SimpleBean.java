package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class SimpleBean {
  private String[] colors =
    { "red", "orange", "yellow" };
  
  public String getMessage() {
    return("Hello, World. I'm M. Rizqi Alfani.");
  }
  
  public String[] getColors() {
    return(colors);
  }
}