# Java Singleton Pattern Example: Undo Command

This project demonstrates the use of the **Singleton Design Pattern** in Java by implementing an undo command system. The example simulates a console-based interface that allows users to add, delete, and view a history of commands, similar to a simplified version of the `history` and `undo` functions in a Linux terminal.

## 📌 Features

* Singleton implementation of the `Undo` class
* Console interface for interacting with the system
* Support for adding, deleting, and listing commands
* Demonstrates how to restrict a class to a single instance in a real-world scenario

## 🧱 Project Structure

* Main.java
* Menu
* Undo.java

## 🔁 Undo.java

This class implements the Singleton pattern and is responsible for storing command history. It provides methods for adding a command, deleting the last command, and displaying the command history.

## 🔁 Menu.java

This class calls the Undo class (Singleton).

##▶️ Main.java
This class contains the main method and calls the Menu class.

## 🧠 Design Pattern Used

### Singleton

The Singleton design pattern ensures that a class has only one instance and provides a global access point to it. In this case, the `Undo` class uses this pattern to manage a single, shared command history.

## 🚀 How to Run

1. Compile the Java files using a terminal or command prompt.
2. Run the program to begin interacting with the menu-based interface.

## 📄 License

This project is for educational purposes and is free to use.

---