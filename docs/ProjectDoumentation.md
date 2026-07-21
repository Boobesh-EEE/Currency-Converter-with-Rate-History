# Currency Converter with Rate History

## Project Description

The Currency Converter with Rate History is a console-based Java application developed using Object-Oriented Programming principles. The application allows users to convert currencies, view exchange rates, and maintain a history of viewed exchange rates using a Stack.

The project demonstrates the practical implementation of HashMap and Stack data structures while following Low-Level Design (LLD) concepts.

---

## Functional Requirements

- Display available currencies.
- Convert one currency to another.
- View exchange rate between two currencies.
- Store viewed exchange rates in history.
- Undo the last viewed exchange rate.
- Display complete rate history.
- Exit the application.

---

## Non-Functional Requirements

- Simple console-based interface.
- Fast currency lookup using HashMap.
- Efficient history management using Stack.
- Easy to maintain and extend.

---

## Data Structures Used

### HashMap

Purpose:
- Stores currency objects.
- Provides quick access using currency code.

Time Complexity:
- Search: O(1)
- Insert: O(1)

---

### Stack

Purpose:
- Stores viewed exchange rates.
- Supports Undo operation.

Time Complexity:
- Push: O(1)
- Pop: O(1)

---

## Classes

### Main

Responsibilities:
- Display menu
- Read user input
- Call CurrencyService methods

---

### Currency

Attributes:
- Currency Code
- Currency Name
- Exchange Rate

---

### CurrencyService

Responsibilities:
- Load exchange rates
- Currency conversion
- View exchange rate
- Connect with RateHistory

---

### RateHistory

Responsibilities:
- Push viewed rates
- Undo last viewed rate
- Display history

---

## OOP Concepts Used

- Classes and Objects
- Encapsulation
- Abstraction
- Modularity

---

## Future Enhancements

- Live Exchange Rate API
- Database Integration
- JavaFX GUI
- Web Version
- User Authentication

---

## Conclusion

This project demonstrates the implementation of HashMap and Stack in Java while following Low-Level Design principles. It also strengthens understanding of Java, OOP concepts, Git, and GitHub.