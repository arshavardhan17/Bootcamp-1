
# **1. What is Programming? (Java Perspective)**

Programming is giving **step-by-step instructions** to a computer to perform tasks.

### Key Points

* Computers understand **binary (0 and 1)**.
* Java converts human-readable code → **bytecode** → executed by **JVM (Java Virtual Machine)**.
* Java is **platform-independent** (“Write Once, Run Anywhere”).

---

# **2. Why Programming Languages Exist**

### Problem:

Computers understand only machine code.

### Solution:

High-level languages like Java:

* Improve readability
* Reduce errors
* Increase productivity
* Provide abstraction

### Java Advantages

* Object-Oriented
* Secure
* Automatic Memory Management
* Portable

---

# **3. IDE and Syntax Importance**

### IDE Examples

* IntelliJ IDEA
* Eclipse
* VS Code

### Why Syntax Matters

Java is **strictly syntax-based**:

* Missing semicolon → compilation error
* Wrong capitalization → error
* Bracket mismatch → error

---

# **4. First Java Program (Hello World)**

```java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## Explanation

### `class Main`

* Every Java program must have a **class**.

### `public static void main`

* Entry point of execution.

### `System.out.println()`

* Prints output to console.

---

# **5. Important Java Rules**

| Rule           | Description                   |
| -------------- | ----------------------------- |
| Semicolon      | Every statement ends with `;` |
| Case Sensitive | `Main` ≠ `main`               |
| Quotes         | Text inside `" "`             |
| Main Method    | Program starts from `main()`  |
| Braces         | `{}` must be balanced         |

---

# **6. Variables in Java**

### Definition

Variable = Named memory location to store data.

### Syntax

```java
int age = 20;
```

---

### Naming Rules

✔ Must start with letter/_
✔ No spaces
✔ Case-sensitive
✔ Meaningful names

❌ 1age
❌ total marks

---

# **7. Data Types in Java (Foundation)**

## Primitive Data Types

| Type    | Size    | Use                      |
| ------- | ------- | ------------------------ |
| int     | 4 bytes | Whole numbers            |
| long    | 8 bytes | Large integers           |
| double  | 8 bytes | Decimal values           |
| float   | 4 bytes | Decimal (less precision) |
| char    | 2 bytes | Single character         |
| boolean | 1 bit   | true / false             |
| byte    | 1 byte  | Small integers           |
| short   | 2 bytes | Medium integers          |

---

### Example

```java
int a = 10;
double pi = 3.14;
char grade = 'A';
boolean pass = true;
```

---

# **8. Arithmetic Operators**

| Operator | Meaning |
| -------- | ------- |

* | Addition

- | Subtraction

* | Multiplication
  / | Division
  % | Modulus

---

### Example

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

---

# **9. Taking Input in Java**

Java uses **Scanner class**.

---

### Import Scanner

```java
import java.util.Scanner;
```

---

### Example

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
double x = sc.nextDouble();
String name = sc.next();
```

---

### Input Types

| Method       | Input                  |
| ------------ | ---------------------- |
| nextInt()    | Integer                |
| nextDouble() | Decimal                |
| next()       | Single word            |
| nextLine()   | Full line              |
| nextChar()   | Character (via charAt) |

---

# **10. Relational Operators**

Used for comparison.

| Operator | Meaning |
| -------- | ------- |

> | Greater than
> < | Less than
> = | Greater or equal
> <= | Less or equal
> == | Equal
> != | Not equal

---

### Example

```java
int a = 5;
int b = 3;

System.out.println(a > b);  // true
System.out.println(a == b); // false
```

---

# **11. Logical Operators**

Used to combine conditions.

| Operator | Meaning |    |
| -------- | ------- | -- |
| &&       | AND     |    |
|          |         | OR |
| !        | NOT     |    |

---

### Example

```java
int age = 20;

if(age > 18 && age < 30) {
    System.out.println("Eligible");
}
```

---

# **12. Conditional Statements (Decision Making)**

---

## IF Statement

```java
if(condition) {
    // code
}
```

---

## IF-ELSE

```java
if(a > b) {
    System.out.println("A is greater");
} else {
    System.out.println("B is greater");
}
```

---

## ELSE IF Ladder

```java
if(marks >= 90) {
    System.out.println("A Grade");
}
else if(marks >= 70) {
    System.out.println("B Grade");
}
else {
    System.out.println("Fail");
}
```

---

# **13. Even or Odd Example**

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

if(n % 2 == 0) {
    System.out.println("Even");
}
else {
    System.out.println("Odd");
}
```

---

# **14. Find Maximum of Two Numbers**

```java
int a = 10;
int b = 7;

if(a > b) {
    System.out.println("Max = " + a);
}
else {
    System.out.println("Max = " + b);
}
```

---

# **15. Area of Rectangle Example**

```java
Scanner sc = new Scanner(System.in);

int length = sc.nextInt();
int breadth = sc.nextInt();

int area = length * breadth;
int perimeter = 2 * (length + breadth);

System.out.println(area);
System.out.println(perimeter);
```

---

