package ru.voitelev;

class CreatorArray {
  Double[] arrayFilling(int n) {

    Double[] array = new Double[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.random();
    }
    printerArray(array);
    return array;
  }

  void printerArray(Double[] array) {
    for (Double anArray : array) {
      System.out.print(" " + anArray);
    }
  }

  boolean validationSize(int n) {
    return n > 0 && n < 1000;
  }
}
