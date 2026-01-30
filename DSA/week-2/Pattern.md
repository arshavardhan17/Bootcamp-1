
# **PATTERN PRINTING IN JAVA — COMPLETE NOTES**

Pattern printing is a practical way to understand:

* Nested loops
* Row-column relationship
* Loop boundaries
* Output formatting
* Character and number manipulation

All patterns depend on:

* **Outer loop → rows**
* **Inner loop → columns / elements in a row**

---

# **GENERAL TEMPLATE (CORE CONCEPT)**

Almost all patterns follow this structure:

```java
for(int i = 1; i <= rows; i++) {
    for(int j = 1; j <= columns; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

* `i` controls **row**
* `j` controls **printing per row**
* `println()` moves cursor to next line

---

# -------------------------------------------------

# **1) PRINT 1 TO N (VERTICAL)**

(Page 2)

### Pattern:

For n = 5

```
1
2
3
4
5
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {
    System.out.println(i);
}
```

---

### Logic:

* Single loop
* Print row number directly
* No inner loop needed

---

# -------------------------------------------------

# **2) PRINT 2 STARS (FIXED WIDTH)**

(Page 3)

### Pattern:

```
**
**
**
**
**
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= 2; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

### Logic:

* Rows = n
* Columns = fixed (2)

---

# -------------------------------------------------

# **3) PRINT 4 STARS**

(Page 4)

### Pattern:

```
****
****
****
****
****
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= 4; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

# -------------------------------------------------

# **4) RECTANGLE (N x M STARS)**

(Page 5)

### Pattern Example:

n = 5, m = 7

```
*******
*******
*******
*******
*******
```

---

### Java Code:

```java
int n = 5;
int m = 7;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= m; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

### Logic:

* Outer loop → rows
* Inner loop → columns

---

# -------------------------------------------------

# **5) SQUARE PATTERN**

(Page 6)

Rows = Columns

### Pattern:

n = 5

```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

# -------------------------------------------------

# **6) PYRAMID (RIGHT ANGLED TRIANGLE)**

(Page 7)

### Pattern:

n = 5

```
*
**
***
****
*****
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

### Logic:

* Row number decides stars count

---

# -------------------------------------------------

# **7) INVERTED PYRAMID**

(Page 8)

### Pattern:

n = 5

```
*****
****
***
**
*
```

---

### Java Code:

```java
int n = 5;

for(int i = n; i >= 1; i--) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

# -------------------------------------------------

# **8) HOLLOW SQUARE**

(Page 9)

### Pattern:

n = 5

```
* * * * *
*       *
*       *
*       *
* * * * *
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n; j++) {

        if(i == 1 || i == n || j == 1 || j == n) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }

    }
    System.out.println();
}
```

---

### Border Logic:

Print `*` when:

* First row
* Last row
* First column
* Last column

---

# -------------------------------------------------

# **9) HOLLOW RECTANGLE**

(Page 10)

### Pattern:

n = 5, m = 7

```
*******
*     *
*     *
*     *
*******
```

---

### Java Code:

```java
int n = 5;
int m = 7;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= m; j++) {

        if(i == 1 || i == n || j == 1 || j == m) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

    }
    System.out.println();
}
```

---

# -------------------------------------------------

# **10) NUMBERED RECTANGLE (ROW NUMBER)**

(Page 11)

### Pattern:

n = 5, m = 7

```
1111111
2222222
3333333
4444444
5555555
```

---

### Java Code:

```java
int n = 5;
int m = 7;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= m; j++) {
        System.out.print(i);
    }
    System.out.println();
}
```

---

# -------------------------------------------------

# **11) NUMBERED RECTANGLE – COLUMN NUMBERS**

(Page 12)

### Pattern:

```
1234567
1234567
1234567
```

---

### Java Code:

```java
int n = 5;
int m = 7;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= m; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

---

# -------------------------------------------------

# **12) ALPHABET RECTANGLE (COLUMN LETTERS)**

(Page 13)

### Pattern:

```
ABCDEFG
ABCDEFG
ABCDEFG
```

---

### Java Code:

```java
int n = 5;
int m = 7;

for(int i = 1; i <= n; i++) {
    char ch = 'A';

    for(int j = 1; j <= m; j++) {
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}
```

---

# -------------------------------------------------

# **13) ALPHABET RECTANGLE (ROW LETTERS)**

(Page 14)

### Pattern:

```
AAAA
BBBB
CCCC
DDDD
```

---

### Java Code:

```java
int n = 5;
int m = 7;

char ch = 'A';

for(int i = 1; i <= n; i++) {

    for(int j = 1; j <= m; j++) {
        System.out.print(ch);
    }

    ch++;
    System.out.println();
}
```

---

# -------------------------------------------------

# **14) NUMBER PYRAMID**

(Page 15)

### Pattern:

n = 5

```
1
22
333
4444
55555
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print(i);
    }

    System.out.println();
}
```

---

# -------------------------------------------------

# **15) BINARY PYRAMID**

(Page 16)

### Pattern:

n = 5

```
0
1 0
0 1 0
1 0 1 0
0 1 0 1 0
```

---

### Java Code:

```java
int n = 5;

for(int i = 1; i <= n; i++) {

    int val = (i % 2 == 1) ? 0 : 1;

    for(int j = 1; j <= i; j++) {
        System.out.print(val + " ");
        val = 1 - val;
    }

    System.out.println();
}
```

---

### Logic:

* Alternating 0 and 1
* Row parity decides starting value

---

# -------------------------------------------------

# **IMPORTANT PATTERN RULES**

### Always Remember:

| Concept          | Meaning           |
| ---------------- | ----------------- |
| Outer Loop       | Rows              |
| Inner Loop       | Columns           |
| Print without ln | Same line         |
| println          | New row           |
| Spaces important | Alignment control |

---

# **TIME COMPLEXITY**

Most patterns:

```
O(n × m)
```

Because nested loops are used.

---

# **COMMON ERRORS**

| Error           | Cause                      |
| --------------- | -------------------------- |
| Extra stars     | Wrong inner loop condition |
| Missing newline | Forgot println             |
| Wrong pattern   | Using i instead of j       |
| Infinite loop   | Incorrect increment        |

