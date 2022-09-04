package FahrenheitToCelsius;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FahrenheitToCelsius {
  public static void main(String[] args) throws Exception {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    boolean done = false;

    while (!done) {
      String fahrenheitString = br.readLine();
      if (fahrenheitString == null || fahrenheitString.length() == 0) {
        done = true;
      } else {
        double fahrenheit = Double.parseDouble(fahrenheitString);
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.println("F=" + fahrenheit + ", C=" + celsius);
      }
    }
    System.out.println("FahrenheitToCelsius exit");
  }
}
