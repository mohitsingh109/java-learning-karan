## **Problem Statement**
You are required to implement a **text processing system** using **OOP principles** in Java. The system should be able to process a list of sentences and apply multiple transformations in a **chain filtering** manner.

---

## **Requirements**
1. **Create an abstract class** `TextProcessor` that defines:
    - An abstract method `process(String text): String`
    - A method `processAll(List<String> texts): List<String>` that applies the `process` method to each string in a list.

2. **Create two child classes** that extend `TextProcessor`:
    - **`UpperCaseProcessor`**: Converts all text to uppercase.
    - **`WordFilterProcessor`**: Removes words from a given list.

3. **Implement a main program** that:
    - Reads a list of sentences (stored in a `HashMap<Integer, String>`).
    - Applies **multiple processors in sequence** (like a chain).
    - Filters out unwanted words using `WordFilterProcessor`.

---

## **Example Input & Output**
### **Given Input:**
```java
HashMap<Integer, String> sentences = new HashMap<>();
sentences.put(1, "Hello Java is awesome");
sentences.put(2, "Java is great for coding");
sentences.put(3, "Programming in Java is fun");
```

### **Processing Steps:**
1. Convert text to uppercase (`UpperCaseProcessor`).
2. Remove certain words (`"IS"`, `"IN"`, `"FOR"`) using `WordFilterProcessor`.

### **Expected Output:**
```
HELLO JAVA AWESOME
JAVA GREAT CODING
PROGRAMMING JAVA FUN
```

---