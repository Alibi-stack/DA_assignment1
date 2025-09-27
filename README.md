
# DA Assignment 1 

This project includes the implementation of two popular sorting algorithms: **MergeSort** and **QuickSort**, with performance metrics such as execution time and comparison count. There is also an interface to choose the algorithm and perform sorting.

## Project Structure

```
DA_assigment1/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── edu/
│   │           ├── MergeSortSimple.java       
│   │           ├── QuickSortSimple.java        
│   │           ├── AlgorithmController.java    
│   │           └── Utils.java                 
│   ├── test/
│   │   └── java/
│   │       └── edu/
│   │           └── BasicTests.java             
│
├── pom.xml                                      
└── README.md                                    
```

## Description

### Algorithms
- **MergeSort**: A divide-and-conquer algorithm that recursively divides an array into subarrays and merges them.
- **QuickSort**: A fast sorting algorithm that recursively divides the array using a pivot element.

### Key Features
- Each algorithm includes execution time measurement and comparison count during the sorting process.
- The user can choose the algorithm via the console, with two options: **MergeSort** and **QuickSort**.

### Utilities
- **Utils.java**: Contains utility functions for generating random arrays, checking if an array is sorted, and swapping elements.

### Interface
To use the program, open `AlgorithmController.java` and run it. You will be prompted to select one of the two algorithms:
1. **MergeSort** — will perform sorting using the merge sort algorithm.
2. **QuickSort** — will perform sorting using the quick sort algorithm.

Example output:
```
Choose an algorithm to run:
1. MergeSort
2. QuickSort
```

### Tests
Tests for the sorting algorithms are located in `BasicTests.java`. To run them, you need to use **JUnit**.

Example test for MergeSort:
```java
@Test
public void mergeSortSorts() {
    int[] a = Utils.randomArray(1000, 1);
    MergeSortSimple.sort(a);
    assertTrue(Utils.isSorted(a));
}
```

### Running the Project
1. Open the project in your IDE (e.g., IntelliJ IDEA or Eclipse).
2. Navigate to `AlgorithmController.java` and run it.
3. Select the algorithm and view the results in the console.

## Dependencies
The project uses **Maven** for managing dependencies. To run the project, execute the following commands:

```bash
mvn clean install
mvn exec:java
```

## License
This project is available under the MIT license. See the `LICENSE` file for details.

---

**Developer**: Aibekuly Alibi
