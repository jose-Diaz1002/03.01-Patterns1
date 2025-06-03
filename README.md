# Design Patterns Practice - Java

This project is part of a practical exercise focused on learning how to identify and implement software design patterns using Java. Design patterns are essential for building extensible and reusable software. Java and many of its frameworks are built upon well-known design patterns.

## Overview

The project is structured in multiple levels, each demonstrating a different design pattern through concrete examples. Each level includes a `Main` class to show how the implemented pattern works in action.

---

## Level 1 - Singleton Pattern

**Goal:** Implement a command history system similar to the Unix/Linux `history` and `undo` functionality using the Singleton pattern.

### Features

- A class `Undo` replicates the functionality of a command history.
- The `Undo` class stores the latest commands entered.
- It supports:
  - Adding new commands.
  - Removing commands.
  - Listing previously entered commands.
- The `Undo` class must strictly implement the **Singleton** design pattern.
- A `Main` class provides a basic console interface to interact with `Undo`.

---

## Level 2 - Abstract Factory Pattern

**Goal:** Develop a small address and phone number manager supporting multiple international formats using the Abstract Factory pattern.

### Features

- A contact manager that handles international addresses and phone numbers.
- Takes into account formatting differences between countries.
- Uses the **Abstract Factory** design pattern to create families of related objects (e.g., address and phone number) without specifying their concrete classes.
- A `Main` class demonstrates the creation of contact entries from different countries.

---

## Future Work

**Level 3 (Coming Soon):**  
Another design pattern will be implemented in the next phase of this project.

---

## Requirements

- Java Development Kit (JDK) 8 or higher
- Basic understanding of object-oriented programming
- Familiarity with design patterns (Singleton, Abstract Factory)

## How to Run

Each level is implemented as a separate project or package. To run a specific level:

1. Navigate to the level's directory in your terminal or IDE.
2. Compile the Java files:
   ```bash
   javac Main.java
