class BankAccount:
    def __init__(self, account_number, account_holder_name, initial_balance=0.0):
        self.__account_number = account_number
        self.__account_holder_name = account_holder_name
        self.__balance = initial_balance  # Private attribute for encapsulation

    # Method to deposit money
    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"Deposited ₹{amount:.2f}")
        else:
            print("Deposit amount must be positive.")

    # Method to withdraw money
    def withdraw(self, amount):
        if amount > 0:
            if self.__balance >= amount:
                self.__balance -= amount
                print(f"Withdrew ₹{amount:.2f}")
            else:
                print("Insufficient balance.")
        else:
            print("Withdrawal amount must be positive.")

    # Method to display current balance
    def display_balance(self):
        print(f"Account Holder: {self.__account_holder_name}")
        print(f"Account Number: {self.__account_number}")
        print(f"Current Balance: ₹{self.__balance:.2f}")
