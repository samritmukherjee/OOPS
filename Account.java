// Q6. The this keyword and constructors:
// Create a class Account with fields account number and balance.
// Write a parameterized constructor where the parameter names are the same as the
// field names, and use this keyword to resolve ambiguity.

class Account
{
    int accno;
    double balance;

    Account(int accno, double balance)
    {
        this.accno = accno;
        this.balance = balance;
    }

    void display()
    {
        System.out.println("Account Number:" + accno);
        System.out.println("Balance:" + balance);
    }

    public static void main(String args[])
    {
        Account a1 = new Account(33, 50000.0);

        a1.display();
    }
}