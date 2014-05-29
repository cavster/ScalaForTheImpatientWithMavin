package Chapter8

/**
 * Created by colmcavanagh on 5/5/14.
 */
//Q1 + Q 2
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount; balance
  }

  def withdraw(amount: Double) = {
    balance -= amount; balance
  }

  def checkBalance = balance
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = super.deposit(amount - 1)

  //call to super with override will change it
  override def withdraw(amount: Double) = super.withdraw(amount + 1)
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private val mouthlyIntrest = 0.01
  private var count = 0

  def earnMothlyIntrest() = {
    val intrest = initialBalance * mouthlyIntrest //+= would not work!
    var count = 0
    initialBalance + intrest
  }

  override def deposit(amount: Double) = {
    if (count < 3) super.deposit(amount)
    else super.deposit(amount - 1.0) //charges them a dollar
    count += 1
    count
  }

  override def withdraw(amount: Double) = {
    if (count < 3) super.deposit(amount)
    else super.deposit(amount - 1.0)
    count += 1
    count
  }
}



