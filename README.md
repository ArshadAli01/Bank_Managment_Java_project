# 🏦 Bank Management System – Java Console Application

This is a **console-based Java project** simulating the core functionalities of a **Bank Management System**, designed using **Object-Oriented Programming (OOP)** principles. The project includes a **menu-driven interface** that allows users to interact with customers, accounts, and transactions in a structured way.

---

## 💡 Features

- Add new customers
- Open bank accounts (Savings or Current)
- Deposit and withdraw money
- View customer and account details
- Easy-to-navigate console-based menu

---

## 🧰 Technologies Used

- **Java** – Core language
- **OOP Concepts** – Encapsulation, Inheritance, Polymorphism, Abstraction
- **Scanner Class** – For user input via console

---

## 🧱 Project Structure

```
src/
├── Main.java              # Entry point + console interface
├── Bank.java              # Bank class to manage customers
├── Customer.java          # Stores customer and their accounts
├── Account.java           # Abstract base class for accounts
├── SavingsAccount.java    # Inherits Account, adds interest rate
├── CurrentAccount.java    # Inherits Account, adds overdraft limit
```

---

## 🔄 How It Works

1. **Add Customer:**  
   Input a unique Customer ID and name.

2. **Open Account:**  
   Select account type: Savings or Current. Enter account details.

3. **Deposit/Withdraw:**  
   Locate an account via customer ID and account number, and perform the transaction.

4. **View Account Details:**  
   Displays all accounts under a customer along with account type and balance.

5. **Exit:**  
   Ends the program.

---

## 📦 OOP Concepts in Action

| Concept         | Used In |
|----------------|---------|
| Encapsulation  | Private fields and getters/setters in `Customer`, `Account` |
| Inheritance    | `SavingsAccount` and `CurrentAccount` extend `Account` |
| Polymorphism   | `Account` reference used for both savings and current accounts |
| Abstraction    | `Account` is abstract with defined method signatures |

---

## 🧪 Sample Menu (Console UI)

```
===== Main Menu =====
1. Add Customer
2. Open Account
3. Deposit
4. Withdraw
5. View Account Details
6. Exit
Enter choice: _
```

---

## 📌 Future Enhancements (Optional)

- File-based data saving/loading
- Login system for customers
- Admin panel for viewing all customers
- Interest calculation scheduler
- Transaction history tracking

---

## 📁 How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java
   ```
2. Run the program:
   ```bash
   java Main
   ```

---

## 👤 Author

- Developed by **Arshad Ali**
