# Shape Area Calculator

This Java program demonstrates the use of method overloading and inheritance to calculate the area of various shapes, including a **Circle** and a **Rectangle**. The program uses classes to represent shapes and their area calculations. The `Shape` class provides overloaded methods for area calculation, while the `Circle` and `Rectangle` subclasses override these methods to calculate their respective areas.

## Features

- **Method Overloading:** The program demonstrates how method overloading works in Java by providing multiple versions of the `area()` method.
- **Inheritance:** The `Circle` and `Rectangle` classes inherit from the `Shape` class and override the `area()` method.
- **Interactive Input:** Users are prompted to enter the dimensions (radius, length, width) for the circle and rectangle, and the program calculates their respective areas.

## Program Structure

- **Shape Class:** A parent class that contains overloaded `area()` methods for calculating the area of a Circle and a Rectangle.
- **Circle Class:** A subclass of `Shape` that calculates the area of a circle using its own radius.
- **Rectangle Class:** A subclass of `Shape` that calculates the area of a rectangle using its own length and width.
- **Main Class:** The `CalculateArea` class contains the `main` method, which prompts the user for input and calculates the area of the shapes.

## How to Run

1. Clone this repository to your local machine.
   
   ```bash
   git clone https://github.com/yourusername/Shape-Area-Calculator.git
