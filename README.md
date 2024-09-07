# Grade Calculator

This project is a basic **Grade Calculator** capable of calculating final grades based on the weighted average of assignments, quizzes, midterms, and finals. The calculator uses standard percentages and weights common in the US education system to determine letter grades.

## Features

- Calculate the final grade based on multiple components (e.g., assignments, quizzes, exams).
- Display the final grade as both a percentage and a letter grade (A, B, C, D, F).
- Weighted averages for different components, such as:
    - **Assignments**: 40%
    - **Quizzes**: 20%
    - **Midterm Exams**: 20%
    - **Final Exam**: 20%

## Grading Scale (US System)

| Grade   | Percentage Range |
|---------|------------------|
| A       | 90 - 100%        |
| B       | 80 - 89%         |
| C       | 70 - 79%         |
| D       | 60 - 69%         |
| F       | Below 60%        |

## Prerequisites

To run this calculator, ensure you have the following installed based on the language you're working with:

- **For Java**: Java Development Kit (JDK)
- **For Python**: Python 3.x
- **For C++**: A C++ compiler such as GCC or Clang
- **For JavaScript**: Node.js or a browser-based environment
- Other environments as required for specific languages.

## Installation

1. Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2. Navigate to the project directory:
    ```bash
    cd Grade-Calculator-main
    ```
3. Choose the folder corresponding to the programming language you want to use (e.g., `java`, `python`, `cpp`).

## Usage

1. Depending on the chosen language, follow the steps below to run the program:

    - **For Java**:
        1. Navigate to the `java` directory.
        2. Compile and run the main file using:
           ```bash
           javac Main.java
           java Main
           ```
    - **For Python**:
        1. Navigate to the `python` directory.
        2. Run the script using:
           ```bash
           python3 grade_calculator.py
           ```
    - **For C++**:
        1. Navigate to the `cpp` directory.
        2. Compile and run using:
           ```bash
           g++ grade_calculator.cpp -o grade_calculator
           ./grade_calculator
           ```
    - **For JavaScript**:
        1. Navigate to the `javascript` directory.
        2. Run the script using:
           ```bash
           node grade_calculator.js
           ```

2. Enter the required scores for assignments, quizzes, midterms, and the final exam.
3. The calculator will compute the weighted average and display both the percentage and the corresponding letter grade.

## Example

Here’s a simple example of how the grade calculator works (common across languages):

```
Enter the average score for Assignments (out of 100): 85
Enter the average score for Quizzes (out of 100): 90
Enter the Midterm Exam score (out of 100): 78
Enter the Final Exam score (out of 100): 92

Final Grade: 86.4%
Letter Grade: B
```

## Future Enhancements

In future versions, the following features could be added:
- **Support for extra credit**
- **Support for custom weights (e.g., allowing users to define their own weight percentages)**
- **Graphical User Interface (GUI)**
- **Support for more grading systems (e.g., international systems)**

## Contributing
Feel free to fork the repository and contribute by submitting a pull request. For major changes, please open an issue first to discuss what you would like to change.