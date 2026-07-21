# Currency Converter with Rate History

A simple console-based Java Currency Converter that demonstrates currency conversion using **HashMap** and maintains exchange rate history using **Stack**. This project is designed as a Low-Level Design (LLD) implementation showcasing Object-Oriented Programming (OOP) concepts.

---

## Overview

The application allows users to:

- Display Available Currencies
- Convert Currency
- View Exchange Rate
- Undo Last Rate View
- Show Rate History
- Exit the Application

The project uses two important data structures:

- **HashMap** – Stores currency details and exchange rates.
- **Stack** – Stores viewed exchange rate history and supports undo functionality.

---

## Problem Statement

Develop a console-based Currency Converter that efficiently performs currency conversion using HashMap and maintains exchange rate history using Stack while following Object-Oriented Programming principles.

---

## Objectives

- Implement a Currency Converter in Java.
- Store exchange rates using HashMap.
- Maintain rate history using Stack.
- Perform currency conversion.
- Apply OOP concepts.
- Build a menu-driven console application.

---

## Features

- Display Available Currencies
- Convert Currency
- View Exchange Rate
- Undo Last Rate View
- Show Rate History
- Menu-driven Interface
- HashMap-based Currency Lookup
- Stack-based Rate History

---

## Technologies Used

- **Language:** Java
- **IDE:** Visual Studio Code
- **Data Structures:** HashMap, Stack
- **Version Control:** Git
- **Repository:** GitHub

---

## Data Structures Used

### HashMap

Stores currency objects using currency codes as keys.

Example:

```
USD → US Dollar
EUR → Euro
GBP → British Pound
INR → Indian Rupee
```

Advantages:

- Fast lookup
- Average Time Complexity: **O(1)**

---

### Stack

Maintains the history of viewed exchange rates.

Example:

```
Top

USD → EUR
EUR → INR
GBP → USD

Bottom
```

Advantages:

- Undo support
- LIFO (Last In First Out)

---

## Project Structure

```
Currency-Converter-with-Rate-History
│
├── docs
│   ├── FlowDiagram.png
│   └── ProjectDocumentation.md
│
├── output
│   └── SampleOutput.txt
│
├── src
│   ├── Main.java
│   ├── Currency.java
│   ├── CurrencyService.java
│   └── RateHistory.java
│
├── README.md
└── .gitignore
```

---

## Classes Used

### Main

- Displays the menu
- Reads user input
- Calls service methods

### Currency

Represents a currency.

Attributes:

- Currency Code
- Currency Name
- Exchange Rate

### CurrencyService

Handles:

- Currency lookup
- Currency conversion
- Exchange rate viewing

### RateHistory

Handles:

- Store viewed rates
- Undo last viewed rate
- Display rate history

---

## Algorithm

1. Start application.
2. Load predefined exchange rates.
3. Display menu.
4. Read user choice.
5. Perform selected operation.
6. Repeat until Exit.

---

## OOP Concepts Used

- Classes and Objects
- Encapsulation
- Abstraction
- Modularity

---

## Future Enhancements

- Live exchange rates using API
- File-based rate storage
- Database integration
- GUI using JavaFX
- Web-based Currency Converter

---

## Learning Outcomes

- Practical implementation of HashMap
- Practical implementation of Stack
- Java Object-Oriented Programming
- Low-Level Design
- Git and GitHub workflow

---

## Author

**Boobesh K**

Electrical and Electronics Engineering

---

## License

This project is developed for educational and learning purposes.