package Chapter8

/**
 * Created by colmcavanagh on 5/5/14.
 */
class BankAccount(initialBalance:Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def checkBalance = balance
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = super.deposit(amount-1)//call to super with override will change it
  override def withdraw(amount: Double) = super.withdraw(amount+1)
}
class SavingsAccount(initialBalance : Double) extends BankAccount(initialBalance){
  private val mouthlyIntrest = 0.01
  var count =0
  def earnMothlyIntrest() = {
     val intrest=  initialBalance*mouthlyIntrest//+= would not work!
    var count=0
     initialBalance+intrest
  }
  override def deposit(amount: Double) = {
    if(count<3)super.deposit(amount)
    else super.deposit(amount-1.0)//charges them a dollar
    count += 1; count
      }

  override def withdraw(amount: Double) = {
    if(count<3)super.deposit(amount)
    else super.deposit(amount-1.0)
    count += 1; count
  }

}

object Main extends App{
  val bank1 = new BankAccount(500)
  println(bank1.deposit(100))
  println(bank1.withdraw(200))
  val bank2 = new CheckingAccount(500)
  if(bank2.isInstanceOf[CheckingAccount]) {
    println(bank2.deposit(400))
    println(bank2.withdraw(300))
  }
  val bank3 = new SavingsAccount(500)
  println(bank3)
 // println(bank3.earnMothlyIntrest())
  bank3.deposit(5)
  bank3.deposit(5)
  bank3.deposit(5)
  bank3.deposit(5)
  println(bank3.deposit(5))
  println(bank3.checkBalance)//after 3 will charge one for transaction
}