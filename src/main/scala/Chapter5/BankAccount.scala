package Chapter5


/**
 * Created by colmcavanagh on 5/9/14.
 */
class BankAccount {
  //read only
  private var bal = 0

  def deposit(amount: Int) {
    bal += amount
  }

  def balance = bal

  def withdraw(withdrawAmmount: Int) {
    bal -= withdrawAmmount
  }
}
