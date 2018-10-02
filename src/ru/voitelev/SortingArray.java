package ru.voitelev;

class SortingArray {
  private Double[] arrayValue;

  SortingArray(Double[] array) {
    arrayValue = array;
  }

  Double[] getSortedArray() {
    int startIndex = 0;
    int endIndex = arrayValue.length - 1;
    sortArray(startIndex, endIndex);
    return arrayValue;
  }

  private void sortArray(int start, int end) {
    if (start >= end) {
      return;
    }
    int i = start;
    int j = end;
    int center = i - (i - j) / 2;
    while (i < j) {
      while (i < center && (arrayValue[i] <= arrayValue[center])) {
        i++;
      }
      while (j > center && (arrayValue[center] <= arrayValue[j])) {
        j--;
      }
      if (i < j) {
        double temp = arrayValue[i];
        arrayValue[i] = arrayValue[j];
        arrayValue[j] = temp;
        if (i == center) {
          center = j;
        } else if (j == center) {
          center = i;
        }
      }
    }
    sortArray(start, center);
    sortArray(center + 1, end);
  }
}
