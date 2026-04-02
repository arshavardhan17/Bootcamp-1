
## **1. What is a Loop?**

A loop is used to **repeat a block of code multiple times** until a condition becomes false. This avoids writing the same code again and again .

### Example Problem:

Printing numbers from 1 to 1000 manually is inefficient. Loops automate repetition.

---

## **2. Types of Loops in Java**

Java provides **four loop types**:

1. `while` loop
2. `do-while` loop
3. `for` loop
4. Enhanced `for-each` loop

(First three are shown in the reference file)

---

# **3. While Loop**

## **Syntax**

```java
initialization;

while(condition) {
    // statements
    update;
}
```

---

## **Execution Flow**

1. Initialization runs once
2. Condition checked
3. If true → body executes
4. Update happens
5. Repeats until condition becomes false

---

## **Example: Print 1 to 10**

```java
int i = 1;

while(i <= 10) {
    System.out.println(i);
    i++;
}
```

---

## **Important Points**

* Condition is checked **before execution**
* If condition is false initially → loop never runs
* Risk of **infinite loop** if update is missing

---

## **Infinite Loop Example (Wrong)**

```java
int i = 1;
while(i <= 5) {
    System.out.println(i);
}
```

Reason: `i++` missing.

---

# **4. Printing From 1 to N**

Input-based looping is common

```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int i = 1;
while(i <= n) {
    System.out.println(i);
    i++;
}
```

---

# **5. Printing N to 1 (Reverse Order)**

```java
int i = n;

while(i >= 1) {
    System.out.println(i);
    i--;
}
```

---

# **6. Printing Numbers Between L and R**

```java
int l = 5;
int r = 10;

int i = l;
while(i <= r) {
    System.out.println(i);
    i++;
}
```

---

# **7. Printing Even Numbers (1 to N)**

## Method 1 — Using Condition

```java
int i = 1;

while(i <= n) {
    if(i % 2 == 0) {
        System.out.println(i);
    }
    i++;
}
```

---

## Method 2 — Optimized

```java
int i = 2;

while(i <= n) {
    System.out.println(i);
    i += 2;
}
```

Better performance (half iterations).

---

# **8. Printing Alphabets Using Loop**

ASCII concept shown in file

Java supports character increment.

```java
char ch = 'A';

while(ch <= 'Z') {
    System.out.println(ch);
    ch++;
}
```

---

## ASCII Values (Important)

| Character | ASCII |
| --------- | ----- |
| A         | 65    |
| Z         | 90    |
| a         | 97    |
| z         | 122   |

---

# **9. Multiplication Table**

```java
int n = 5;

int i = 1;
while(i <= 10) {
    System.out.println(n + " x " + i + " = " + (n*i));
    i++;
}
```

---

# **10. Reverse a Number**

Logic from file

### Formula:

```
rev = rev * 10 + digit
```

---

## Java Code

```java
int n = 512;
int rev = 0;

while(n != 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n = n / 10;
}

System.out.println(rev);
```

---

# **11. Sum of Digits**

```java
int n = 1927;
int sum = 0;

while(n != 0) {
    sum += n % 10;
    n = n / 10;
}

System.out.println(sum);
```

---

# **12. Palindrome Number**

A number is palindrome if **original == reverse**

---

## Example Code

```java
int n = 12321;
int temp = n;
int rev = 0;

while(n != 0) {
    rev = rev * 10 + n % 10;
    n = n / 10;
}

if(temp == rev) {
    System.out.println("YES");
} else {
    System.out.println("NO");
}
```

---

# **13. Do-While Loop**

## Syntax

```java
do {
   // statements
} while(condition);
```

---

## Key Difference

* Executes **at least once**
* Condition checked **after execution**

---

## Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while(i <= 5);
```

---

# **14. For Loop**

Preferred when iteration count is known.

---

## Syntax

```java
for(initialization; condition; update) {
    // code
}
```

---

## Example (1 to 10)

```java
for(int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

---

## Execution Order

1. Initialization (once)
2. Condition
3. Body
4. Update
5. Repeat

---

# **15. Nested Loops**

Loop inside another loop.

---

## Example: Pattern Printing

```
*****
*****
*****
```

```java
for(int i=1; i<=3; i++) {
    for(int j=1; j<=5; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

# **16. Loop Control Statements**

## break

Stops loop immediately.

```java
for(int i=1;i<=10;i++){
    if(i==5) break;
    System.out.println(i);
}
```

---

## continue

Skips current iteration.

```java
for(int i=1;i<=5;i++){
    if(i==3) continue;
    System.out.println(i);
}
```

---

# **17. Enhanced For Loop (For-Each)**

Used for arrays & collections.

---

## Syntax

```java
for(dataType variable : collection) {
}
```

---

## Example

```java
int arr[] = {10,20,30};

for(int x : arr) {
    System.out.println(x);
}
```

---

## Limitations

* No index access
* Cannot modify original structure
* No reverse traversal

---

# **18. Common Errors in Loops**

| Error         | Reason              |
| ------------- | ------------------- |
| Infinite Loop | Missing update      |
| Off-by-one    | Wrong condition     |
| Logical error | Incorrect condition |
| Overflow      | Large loop counters |

---

# **19. Performance Notes**

* Prefer `for` loop for fixed iterations
* Avoid heavy logic inside loop
* Reduce nested loops
* Use `StringBuilder` instead of `+` inside loops

---

# **20. Interview Points**

* Difference between while & do-while
* Infinite loop cases
* Break vs Continue
* Nested loop complexity
* Time complexity of loops
* Loop optimization

---

