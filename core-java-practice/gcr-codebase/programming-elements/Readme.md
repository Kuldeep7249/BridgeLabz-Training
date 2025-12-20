# Programming Elements (Java)

✅ **Overview**

This folder contains beginner-level Java practice programs that cover fundamental programming elements such as arithmetic operations, basic I/O, simple algorithms, type conversions, and small utility problems. Each file demonstrates a focused concept suitable for learning and running from the command line.

---

## Contents

| File | Description |
|---|---|
| `AddTwoNumbers.java` | Adds two numbers and prints the result. |
| `Area_of_Circle.java` | Computes the area of a circle for a given radius. |
| `BasicCalculator.java` | Simple calculator demonstrating arithmetic operations. |
| `Calculate_Average_of_Three_Numbers.java` | Computes average of three numbers. |
| `Calculate_Simple_Interest.java` | Calculates simple interest for principal, rate, and time. |
| `Celsius_to_Fahrenheit_Conversion.java` | Converts Celsius to Fahrenheit and prints result. |
| `Convert_kilometers_to_miles.java` | Converts kilometers to miles. |
| `DistanceConversion.java` | Demonstrates various distance conversion examples. |
| `First_Program.java` | A minimal "Hello World" or introductory program. |
| `Handshakes.java` | Solves the handshake problem (n people handshake count). |
| `Perimeter_of_a_Rectangle.java` | Calculates rectangle perimeter. |
| `Power_Calculation.java` | Computes exponentiation (power) for integers. |
| `SquareSide.java` | Calculates side from area or demonstrates square geometry. |
| `TotalPurchasePrice.java` | Computes total price with discounts/taxes (example). |
| `Volume_of_a_Cylinder.java` | Calculates volume of a cylinder given radius and height. |
| `level-2/` | Contains slightly more involved exercises (see subfolder). |

> Note: The file descriptions are brief — inspect the source to see required inputs and behavior.

---

## How to compile and run 🔧

Prerequisite: Java JDK installed and `javac`/`java` available on PATH.

1. Open a terminal in this folder:
   ```bash
   cd path/to/gcr-codebase/programming-elements
   ```

2. Compile a single file:
   ```bash
   javac ClassName.java
   ```

3. Run the program:
   ```bash
   java ClassName
   ```

Examples:
- Compile and run a program:
  ```bash
  javac AddTwoNumbers.java
  java AddTwoNumbers
  ```

- Compile all files at once:
  ```bash
  javac *.java
  ```

- To run examples in `level-2`, change into the subfolder and compile there:
  ```bash
  cd level-2
  javac AgeFinder.java
  java AgeFinder
  ```

---

## Tips & Conventions 💡
- Keep public class names identical to filenames (Java convention). `public class AddTwoNumbers` must be in `AddTwoNumbers.java`.
- Most programs use `Scanner` for console input — check the `main` method to see expected inputs. Provide values when prompted or modify the program to use hard-coded tests during learning.
- Add small unit tests or a wrapper `Main` class when experimenting with multiple examples.