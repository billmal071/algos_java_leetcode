
public class BubbleSort {

    int[] array = {1, 4, 6, 7, 10, 40, 35};
    int arraySize = array.length;

    public String linearSearchValue(int value) {
        StringBuilder indexWithValue = new StringBuilder();

        for (int i = 0; i < arraySize; i++) {
            if (array[i] == value) {
                indexWithValue.append(i).append(" ");
            }
        }

        return indexWithValue.toString();
    }

    public boolean binarySearchValue(int value) {
        int lowIndex = 0;
        int highIndex = arraySize - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;

            if (array[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else if (array[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public void swapValues(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexTwo] = array[temp];
        array[indexOne] = array[indexTwo];
    }

    public void bubbleSort() {
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapValues(j, j + 1);
                }
            }
        }
    }

    public void selectionSort() {
        for (int x = 0; x < arraySize; x++) {
            int min = x;
            for (int y = x; y < arraySize; y++) {
                if (array[min] > array[y]) {
                    min = y;
                }
            }
            swapValues(x, min);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = array[i];
            while ((j > 0) && (array[j - 1] > toInsert)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = toInsert;
        }
    }

}
