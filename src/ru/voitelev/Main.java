package ru.voitelev;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Введите размерность массива");
    Scanner in = new Scanner(System.in);
    int sizeArray = Integer.parseInt(in.nextLine());
    CreatorArray creatorArray = new CreatorArray();
    if (creatorArray.validationSize(sizeArray)) {
      System.out.println("Неотсоритированный массив");
      SortingArray sortingArray = new SortingArray(creatorArray.arrayFilling(sizeArray));
      System.out.println("\nОтсортированный массив");
      creatorArray.printerArray(sortingArray.getSortedArray());
    }
  }
}
