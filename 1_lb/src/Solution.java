import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {

        //1
        System.out.println("№1\n");

        Calculation calculation = new Calculation(10,8);
        calculation.printResult();
        System.out.println("\n");

        //2
        System.out.println("№2\n");

        Random rnd = new Random();

        int[] arraySort = new int[10_000];
        for(int i = 0; i < arraySort.length; i++){
            arraySort[i] = i;
            //System.out.println(arraySort[i]);
        }

        int[] arr = new int[10_000];
        for(int i = 0; i < arr.length; i++){
            if(i < 1000){
                arr[i] = rnd.nextInt(-1000,1000);
            }else  arr[i] = i;
            //System.out.println(arr[i]);
        }

        int[] arrayRandom = new int[10_000];
        for(int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = rnd.nextInt(-1000,1000);
            //System.out.println(arrayRandom[i]);
        }


        int[] tempOne = arraySort.clone();
        long time = System.currentTimeMillis();
        bubbleSort(tempOne);
        System.out.println("bubble sort tempOne : " + (System.currentTimeMillis() - time));

        int[] tempTwo = arr.clone();
        time = System.currentTimeMillis();
        bubbleSort(tempTwo);
        System.out.println("bubble sort tempTwo : " + (System.currentTimeMillis() - time));

        int[] tempThree = arrayRandom.clone();
        time = System.currentTimeMillis();
        bubbleSort(tempThree);
        System.out.println("bubble sort tempThree : " + (System.currentTimeMillis() - time));


        tempOne = arraySort.clone();
        time = System.currentTimeMillis();
        insertionSort(tempOne);
        System.out.println("insertion sort tempOne : " + (System.currentTimeMillis() - time));

        tempTwo = arr.clone();
        time = System.currentTimeMillis();
        insertionSort(tempTwo);
        System.out.println("insertion sort tempTwo : " + (System.currentTimeMillis() - time));

        tempThree = arrayRandom.clone();
        time = System.currentTimeMillis();
        insertionSort(tempThree);
        System.out.println("insertion sort tempThree : " + (System.currentTimeMillis() - time));

        tempOne = arraySort.clone();
        time = System.currentTimeMillis();
        selectionSort(tempOne);
        System.out.println("selection sort tempOne : " + (System.currentTimeMillis() - time));

        tempTwo = arr.clone();
        time = System.currentTimeMillis();
        selectionSort(tempTwo);
        System.out.println("selection sort tempTwo : " + (System.currentTimeMillis() - time));

        tempThree = arrayRandom.clone();
        time = System.currentTimeMillis();
        selectionSort(tempThree);
        System.out.println("selection sort tempThree : " + (System.currentTimeMillis() - time));


        tempOne = arraySort.clone();
        time = System.currentTimeMillis();
        quickSort(tempOne,0, tempOne.length-1);
        System.out.println("quick sort tempOne : " + (System.currentTimeMillis() - time));

        tempTwo = arr.clone();
        time = System.currentTimeMillis();
        quickSort(tempTwo,0, tempTwo.length-1);
        System.out.println("quick sort tempTwo : " + (System.currentTimeMillis() - time));

        tempThree = arrayRandom.clone();
        time = System.currentTimeMillis();
        quickSort(tempThree,0,tempThree.length-1);
        System.out.println("quick sort tempThree : " + (System.currentTimeMillis() - time));


        tempOne = arraySort.clone();
        time = System.currentTimeMillis();
        mergeSort(tempOne,0,tempOne.length-1);
        System.out.println("merge sort tempOne : " + (System.currentTimeMillis() - time));

        tempTwo = arr.clone();
        time = System.currentTimeMillis();
        mergeSort(tempTwo,0,tempOne.length-1);
        System.out.println("merge sort tempTwo : " + (System.currentTimeMillis() - time));

        tempThree = arrayRandom.clone();
        time = System.currentTimeMillis();
        mergeSort(tempThree,0,tempOne.length-1);
        System.out.println("merge sort tempThree : " + (System.currentTimeMillis() - time));



        tempOne = arraySort.clone();
        time = System.currentTimeMillis();
        Arrays.sort(tempOne);
        System.out.println("Arrays.sort tempOne : " + (System.currentTimeMillis() - time));

        tempTwo = arr.clone();
        time = System.currentTimeMillis();
        Arrays.sort(tempTwo);
        System.out.println("Arrays.sort tempTwo : " + (System.currentTimeMillis() - time));

        tempThree = arrayRandom.clone();
        time = System.currentTimeMillis();
        Arrays.sort(tempThree);
        System.out.println("Arrays.sort tempThree : " + (System.currentTimeMillis() - time));

        System.out.println();
        System.out.println("functions:");

        int[] tmp = {1,3,4,5,7,4,4,1,342,456,78,89,5,5,5,7,8,234,345,657,8,90,12};
        System.out.println("source array :" + Arrays.toString(tmp));
        System.out.println("first n elements : " + Arrays.toString(getFirst(tmp,5)));
        System.out.println("last n elements : " + Arrays.toString(getLast(tmp,5)));
        System.out.println("count identic : " + Arrays.toString(countIdentic(tmp)));
        System.out.println("remove duplicates eklements : " + Arrays.toString(removeDuplicates(tmp)));
        System.out.println();

        //3
        System.out.println("№3\n");

        Book book = new Book("Булгаков", "Мастер и Маргарита",570,"AIST");
        Book book1 = new Book("Достоевский", "Двойник",600,"PTVP");
        Book book2 = new Book("Толстой", "Лолита",400,"Moscov");

        ReaderBook readerBook = new ReaderBook("Иван","Иванов", "г.Муром", 20);
        ReaderBook readerBook1 = new ReaderBook("Петр","Петров", "г.Муром", 25);

        Library library = new Library("Частная библиотека","г. Муром, ул. Ленина 1", " 8.00-19.00","Иванова Светлана");
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);

        library.addReaderBook(readerBook);
        library.addReaderBook(readerBook1);

        library.addBookFromReader(readerBook,book);
        library.addBookFromReader(readerBook,book1);
        library.addBookFromReader(readerBook,book2);

        library.booksFromReader(readerBook);

        library.removeBookFromReader(readerBook,book2);
        System.out.println();
        library.booksFromReader(readerBook);


        System.out.println(library.getReadersBooks().size());
        library.removeReaderBook(readerBook);
        System.out.println(library.getReadersBooks().size());

        System.out.println(library.toString());
    }





    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];
        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];
        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;
        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
        // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, то скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }


    // 3
    public static int[] getFirst(int[] array, int n){
        int[] result = new int[n];
        for (int i = 0; i < n; ++i){
            result[i] = array[i];
        }
        return result;
    }

    public static int[] getLast(int[] array, int n){
        int[] result = new int[n];
        int j = 0;
        for (int i = array.length -1; i > array.length - n-1; i--){
            result[j] = array[i];
            j++;
        }
        return result;
    }

    public static int[] removeDuplicates(int[] array){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(!result.contains(array[i])){
                result.add(array[i]);
            }
        }
       return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] countIdentic(int[] array){
        List<Integer> tmp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(!tmp.contains(array[i])){
                tmp.add(array[i]);
            } else {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
