/**
 * Contributor
 */
public class Contributor {

  private String name;
  private String lastName;
  private String cf;
  private double reddito;
  
  public Contributor(String name, String lastName, String cf, double reddito) {
    this.name = name;
    this.lastName = lastName;
    this.cf = cf;
    this.reddito = reddito;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getCf() {
    return cf;
  }
  public void setCf(String cf) {
    this.cf = cf;
  }
  public double getReddito() {
    return reddito;
  }
  public void setReddito(double reddito) {
    this.reddito = reddito;
  }
  @Override
  public String toString() {
    return "Contributor [cf=" + cf + ", lastName=" + lastName + ", name=" + name + ", reddito=" + reddito + "]";
  }
}