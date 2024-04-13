# Banking System App
This Java application, **BankingSystem**, simulates basic banking operations. Users can interact with their bank accounts, including checking balances, making withdrawals, and making deposits. The program includes custom exceptions to handle various scenarios.

## Features

- **BankAccount Class:**
- Represents a bank account with account number, balance, and PIN.
- Provides methods for withdrawal and deposit operations.
  
- **Custom Exceptions:**
- **`InsufficientFundsException`:**
Thrown when a withdrawal exceeds the available balance.
*`InvalidPINException`:
- Thrown when an invalid PIN is entered during account access.
- **`IllegalArgumentException`:**
- Thrown when an account number is entered that does not exist.
  
- **User Interaction:**
- Users are prompted to enter their account number and PIN.
- The program verifies the account and PIN, then allows users to perform withdrawals or deposits.
  
## Usage

1. **Run the Program:**
- Compile and run the `BankingSystem` class.
- The program will prompt you to enter your account number and PIN.
  
2. **Enter Account Details:**
- Input your account number and PIN when prompted.

3. **Select Operation:**
- Choose between withdrawing or depositing funds.
- Follow the instructions provided by the program.

4. **View Balance:**
- The program will display the new balance after a successful transaction.

## Code Explanation

- **BankAccount Class:**
- Represents the structure of a bank account, including attributes and methods for transactions.

- **Custom Exceptions:**
- Exception classes to handle specific scenarios like insufficient funds, invalid PIN, and invalid account number.

- **User Interaction:**
- The program interacts with users by taking input for account details and providing options for transactions.

- **Exception Handling:**
- The program catches and handles custom exceptions to provide informative error messages.

  ## Author

- Mahmoud Najmeh

## Example
```java
public class BankingSystem {
    public static void main(String[] args) {
        // Code snippet for reference.
    }
}
**************







