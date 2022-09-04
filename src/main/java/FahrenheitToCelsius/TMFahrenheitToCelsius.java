package FahrenheitToCelsius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TMFahrenheitToCelsius extends Application {
  private BufferedReader br;
  public static void main(String[] args) {
    (new TMFahrenheitToCelsius()).run();
  }
  @Override
  protected void init() {
    InputStreamReader isr = new InputStreamReader(System.in);
    br = new BufferedReader(isr);
  }

  @Override
  protected void idle() {
    String fahrenheitString = readLineAndReturnNullIfError();
    if (fahrenheitString == null || fahrenheitString.length() == 0) {
      setDone();
    } else {
      double fahrenheit = Double.parseDouble(fahrenheitString);
      double celsius = 5.0 / 9.0 * (fahrenheit - 32);
      System.out.println("F=" + fahrenheit + ", C=" + celsius);
    }
  }

  private String readLineAndReturnNullIfError() {
    String s;
    try {
      s = br.readLine();
    } catch (IOException e) {
      s = null;
    }
    return s;
  }

  @Override
  protected void cleanup() {
    System.out.println("FahrenheitToCelsius exit");
  }
}
