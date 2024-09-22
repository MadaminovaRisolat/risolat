1.Class Definition
The `Student` class models a student with attributes like `name`, `id`, `age`, `major`, `year1` (current year), and `year2` (start year).

2.Attributes
- `name`, `id`, and `age` are **private**, meaning they can't be accessed directly outside the class.
- `major`, `year1`, and `year2` are **public**, allowing direct access from outside the class.

3.Methods
- **`displayInfo()`**: Prints out the student's details and calls `calculateYearsInSchool()` to show how long they've been studying.
- **`calculateYearsInSchool()`**: Calculates the difference between the current year (`year1`) and the start year (`year2`).

4.Main Method
- Creates a `Student` object and sets its attributes.
- Calls `displayInfo()` to print the student's information.

Key Issues:
- Private attributes can't be accessed directly from `main()`. You should use a constructor or setters.
- The variable names `year1` and `year2` could be renamed to `currentYear` and `startYear` for clarity.

![Screen Shot 2024-09-21 at 22 47 34](https://github.com/user-attachments/assets/931906fb-7302-44c4-b540-30067b69bcfb)
