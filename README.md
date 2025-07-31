# Final Project – Java Employee Management System

## 📋 Description
This Java application allows users to manage employee data with role-based conflict detection and file persistence. It demonstrates key software skills like object-oriented programming, file I/O, and business logic design.

---

##  Features

- Add employees with ID, name, roles, and leave balance  
- Automatically detects **Separation of Duties (SoD)** conflicts  
- Saves and loads employee data to `employees.txt`  
- Prints a clean console report with flagged conflicts  

---

## 📂 File Structure

```plaintext
Company/
│
├── Main.java             # Main program logic and test data
├── Employee.java         # Defines employee model and file I/O
├── LeaveRequest.java     # Defines structure for future leave request handling
└── employees.txt         # Auto-generated text file for saving employee records

```markdown
## How to Run the Code

Follow these steps to compile and run the project:

1. **Open Terminal or Command Prompt.**
2. **Navigate to your project folder.**
   ```bash
   cd path/to/your/project
   ```

3. **Compile all Java files:**
   ```bash
   javac Company/*.java
   ```

4. **Run the program:**
   ```bash
   java Company.Main
   ```

---

## Data File Format: `employees.txt`

This file is automatically created by the program and stores employee data in the following CSV format:

```
ID,Name,Role1|Role2|...,LeaveBalance
```

**Example:**
```
101,Alice,Approver|Processor,5
102,Bob,Viewer,2
```

---

## Sample Console Output

```text
Employee ID: 101, Name: Alice, Roles: [Approver, Processor], Leave Balance: 5
  -> SoD Conflict Detected!
Employee ID: 102, Name: Bob, Roles: [Viewer], Leave Balance: 2
Employee ID: 103, Name: Carlos, Roles: [Processor], Leave Balance: 3
Employee ID: 104, Name: Diana, Roles: [Approver], Leave Balance: 1
```

---

## Example Report Format

This is an optional format you can use for a `report.txt` or include in a presentation:

```
=== Employee Report ===

Employee ID: 101
Name: Alice
Roles: Approver, Processor
Leave Balance: 5
⚠ SoD Conflict: Approver + Processor

Employee ID: 102
Name: Bob
Roles: Viewer
Leave Balance: 2
✔ No conflicts

Employee ID: 103
Name: Carlos
Roles: Processor
Leave Balance: 3
✔ No conflicts

Employee ID: 104
Name: Diana
Roles: Approver
Leave Balance: 1
✔ No conflicts

Generated on: 2025-07-30
```

---

## Notes

- `employees.txt` is generated automatically—no need to create it manually.
- The system flags any **SoD (Separation of Duties)** conflict where an employee has **both "Approver" and "Processor"** roles.
- The `LeaveRequest.java` file is fully implemented and ready for future features (like leave approvals), though it is not currently active in the demo.

---
