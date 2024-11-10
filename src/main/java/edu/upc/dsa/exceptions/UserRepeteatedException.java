package edu.upc.dsa.exceptions;

public class UserRepeteatedException extends RuntimeException {
  public UserRepeteatedException(String message) {
    super(message);
  }
}
