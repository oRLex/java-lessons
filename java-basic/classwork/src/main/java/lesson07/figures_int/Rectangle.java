package lesson07.figures_int;

import lesson07.figures_ac.Utils;

public class Rectangle implements HasArea {

  public final double side1;
  public final double side2;

  public Rectangle(double side1, double side2) {
    this.side1 = side1;
    this.side2 = side2;
  }

  public static Rectangle random() {
    return new Rectangle(Utils.random(), Utils.random());
  }

  @Override
  public double area() {
    return side1 * side2;
  }
}
