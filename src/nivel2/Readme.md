# 🌍 International Contact Manager – Abstract Factory Pattern

This project demonstrates the use of the **Abstract Factory** design pattern by implementing a simple international contact manager.

## 📌 Description

The application allows users to add **addresses** and **phone numbers** to an address book, supporting different **international formats** depending on the selected country.

Each country can have a unique address and phone number format. To simplify this variability and maintain code extensibility and modularity, we use the **Abstract Factory** pattern to generate country-specific objects.

## 🧱 Design Pattern

This project was created using the **Abstract Factory** design pattern. Structure:

- *(Easily extensible to other countries)*

- **Abstract Products**
- `Address`
- `Phone Number`

- **Concrete Products**
- `ColombiaAddress`, `ColombiaPhone Number`
- `USAddress`, `USPhone Number`

- **Client**
- `Main.java`: Interacts with the user and creates the contact using the selected factory.

## 🚀 Features

- Enter the address and phone number.

## 🛠️ Technologies

- Java 21+ (backward compatible)
- No external libraries required

## ▶️ How to run

1. Clone or download the repository.
2. Open it in IntelliJ IDEA or any Java IDE.

3. Compile and run the `Main.java` class.

