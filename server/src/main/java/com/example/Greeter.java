package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * voici ma java doc bordel ce jenkisn va me les briser avec ses rapports de tests^^.
   * @param someone est le nom d'une personne
   * @return string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
