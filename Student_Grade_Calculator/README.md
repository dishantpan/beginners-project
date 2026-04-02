# 🎓 Project 1 — Student Grade Calculator

> **Tier:** Beginner | **Repo:** beginners-project
> First real Java OOP project — built to understand Classes, Objects, and Encapsulation from scratch.

---

## 💡 What This Project Does

Takes a student's name, roll number, and subject marks as input.
Automatically calculates their **average** and assigns a **grade.**
Multiple student objects can be created from the same class — like filling the same form with different data.

**Sample Output:**
```
Name       : Dishant Panchal
Roll No    : 2303031050153
Average    : 84.33
Grade      : A
-------------------------
Name       : Akshit Jain
Roll No    : 2303031050036
Average    : 73.33
Grade      : B
-------------------------
```

---

## 🧠 OOP Concepts I Learned Here

### 1. Class and Object
Class = blank student registration form (blueprint).
Object = one filled form (real instance with actual data).
Same class, different objects, different data — that is the power of OOP.

### 2. Encapsulation — `private` keyword
Without `private`, any other file can directly change `dishant.name = "Hacker"` — no permission needed.
With `private`, only the class itself controls its own data. Data is safe and protected.

### 3. Constructor
Runs automatically when an object is created.
All fields get filled in one shot — no need to set them one by one manually.

### 4. `this` keyword
Used inside the constructor to tell Java:
`this.name` = the field belonging to this object.
`name` = the parameter passed into the constructor.
Without `this`, Java gets confused between the two.

### 5. `int[]` Array instead of separate variables
Using `marks1, marks2, marks3` breaks the moment subjects increase.
Using `int[] marks` works cleanly for any number of subjects — scalable design.

### 6. `(double)` Casting
Without the cast, Java does integer division and silently drops the decimal.
`253 / 3` gives `84` instead of `84.33` — wrong answer, no warning, no crash.
Casting to `double` first forces proper decimal division.

### 7. `printf` vs `println`
`println` prints whatever the value is — ugly long decimals.
`printf("%.2f")` controls exactly how many decimal places to show — clean professional output.

### 8. Single Responsibility
Each method does one job only — `calcAverage()` only calculates, `getGrade()` only grades, `display()` only prints.
If the grade formula changes tomorrow, only one method needs to be touched.

---

## 📌 Key Decisions Made

| Decision | Why |
| :-------- | :-- |
| Used `private` on all fields | Encapsulation — protect data from outside access |
| Used `int[]` instead of separate marks | Scalable — works for any number of subjects |
| Used `(double)` cast | Avoid silent integer division bug |
| Split into 3 separate methods | Single responsibility — clean and reusable code |
| Used `printf` not `println` | Professional formatted decimal output |

---

## 🔮 What's Coming Next — Project 1 v2

- `ArrayList` to store unlimited students dynamically
- `Scanner` to take real user input from keyboard
- Getters and Setters for proper controlled data access

---

*Part of my beginners-project repo — one concept, one commit at a time.* 🚀
