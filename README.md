# 📚 Library Management System (LMS) - Java

This is a simple **Library Management System** written in **Java**.  
It allows a librarian to manage books, register members, and issue books to members with loan details.

---

## 🚀 Features
- **Add Books** – Predefined books are added by the librarian.
- **View Book Details** – See title, author, rating, and available copies.
- **Add Members** – Register new members with details (Name, Age, ID Type).
- **Issue Books** – Issue a book to a registered member (with issue date and due date).
- **Loan Records** – Display loan details when a book is issued.

---

## 🗂️ Project Structure
```
LMS_JAVA/
│── src/LMS_Package/
│   ├── Main.java        # Entry point of the program
│   ├── Librarian.java   # Handles books, members, and issuing
│   ├── Member.java      # Member details and ID type
│   ├── Book.java        # Book details and operations
│   ├── Loan.java        # Loan details (issue date, due date)
│
└── README.md            # Project documentation
```

---

## ⚙️ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/shrwn08/LMS_JAVA.git
   cd LMS_JAVA
   ```

2. Compile the project (from `src/` folder):
   ```bash
   javac LMS_Package/*.java
   ```

3. Run the program:
   ```bash
   java LMS_Package.Main
   ```

---

## 🖥️ Example Run

```
Are you registered in the library? Answer it in the form of true or false
false
Enter member's name?
Shrawan
Enter book name?
Ramayana
name: Shrawan
book: Ramayana
New Member name?
Shrawan
Member's Age?
22
Choose your Id:
 1. Adhar_Card
 2. Voter_ID
 3. School_ID
1
...
```

---

## 📌 Notes
- Only 3 books are predefined in the system (`Ramayana`, `Shri Madhbhagwat Geeta`, `Mahabharat`).
- Book availability decreases after each issue.
- Members are stored in a fixed array of size 10.
- Loan period is set to **7 days** by default.

---

## 🔮 Future Improvements
- Replace arrays with `ArrayList` for dynamic storage.
- Add return book functionality.
- Persist data using file handling or a database (MySQL).
- Improve CLI interaction with menus.

---

## 👨‍💻 Author
- **Shrawan Singh**  
  GitHub: [shrwn08](https://github.com/shrwn08)
