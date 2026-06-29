-- Customers Accounts
CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    AccountType VARCHAR2(20),
    Balance NUMBER(10,2)
);

-- Employees
CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER(10,2)
);

-- Sample Accounts
INSERT INTO Accounts VALUES (101, 'John', 'Savings', 10000);
INSERT INTO Accounts VALUES (102, 'Alice', 'Savings', 15000);
INSERT INTO Accounts VALUES (103, 'David', 'Current', 20000);

-- Sample Employees
INSERT INTO Employees VALUES (1, 'Rahul', 'IT', 50000);
INSERT INTO Employees VALUES (2, 'Priya', 'HR', 45000);
INSERT INTO Employees VALUES (3, 'Amit', 'IT', 60000);

COMMIT;