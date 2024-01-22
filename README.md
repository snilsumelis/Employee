# Employee Management System

## Overview
This Java program implements an Employee class that represents an employee's information, including name, salary, work hours, and hire year. It also provides methods to calculate tax, bonus, and salary raise based on specific conditions.

## Employee Class
### Attributes
- **name (String):** The name of the employee.
- **salary (double):** The monthly salary of the employee.
- **workHours (int):** The number of hours the employee works.
- **hireYear (int):** The year the employee was hired.

### Methods
#### `tax()`
Calculates the tax amount based on the salary. If the salary is greater than 1000, a 3% tax is applied.

#### `bonus()`
Calculates the bonus amount based on the work hours. If the employee works more than 40 hours, a bonus is applied for each additional hour.

#### `raiseSalary()`
Calculates the salary raise based on the number of years the employee has been with the company. Different raise percentages are applied for different tenure periods.

#### `toString1()`
Prints a summary of the employee's information, including name, salary, work hours, hire year, tax, bonus, raise, and the total salary considering tax and bonus.

## Usage
1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/snilsumelis/Employee
    ```

2. Navigate to the project directory:
    ```bash
    cd your-repository
    ```

3. Open the project in your preferred Java IDE.

4. Run the `Main` class in the `src` directory to create an instance of the `Employee` class and display the employee's information.

5. Customize the employee information by creating new instances of the `Employee` class with different parameters.

## Contribution
Feel free to contribute by opening issues or creating pull requests. Contributions are always welcome!
