# Gym Membership Management System

## Team Members & Roles
**Team ID: C9**
*   **Nithilan S** (AM.SC.U4CSE25262) - [Insert Role, e.g., Lead Developer / Documentation]
*   **Dharun A** (AM.SC.U4CSE25215) - [Insert Role]
*   **Sujeeth S** (AM.SC.U4CSE25253) - [Insert Role]
*   **Nithish Kumar Saravanan** (AM.SC.U4CSE25239) - [Insert Role]

## Problem Description
The Gym Membership Management System is a Java-based application designed to manage gym member information efficiently. It helps store details such as member ID, name, contact information, membership type, and payment status. The system allows the administrator to add, update, delete, and search member records easily. It reduces manual paperwork and improves accuracy in managing gym memberships. Furthermore, the system integrates Java standard I/O libraries to enable data persistence, allowing the administrator to save and load member records to and from a local file seamlessly. This project demonstrates the use of Java concepts like classes, objects, abstract classes, and file handling to build a simple management system.

## How to Run the Code
1. Clone the repository to your local machine.
2. Open the project in a Java IDE (like Eclipse or IntelliJ).
3. Ensure all Java files in the `/src` folder are within the same package/project.
4. Run the `Main.java` file.

## Sample Input/Output
*(Please see the `/output` folder for detailed console screenshots.)*

**Brief Example Output:**
```text
--- System Initialization Complete ---
Successfully registered: M001
Successfully registered: M002
Nithilan S assigned to trainer Sujeeth S
Dharun A assigned to trainer Sujeeth S
--- Schedule for Sujeeth S ---
Specialization: Bodybuilding
Currently training 2 members.
--- Displaying Profiles ---
Member [ID: M001, Name: Nithilan S, Plan: Monthly Basic, Expiry: Sat May 30 18:30:23 IST 2026]
Trainer [ID: T001, Name: Sujeeth S, Specialization: Bodybuilding]
--- Saving & Loading Data ---
Data successfully saved to gym_members.txt
--- Loading Members from File ---
Loaded record: M001,Nithilan S,9876543210,nithilan@amrita.edu,Monthly Basic
