package Chapter8

/**
 * Created by colmcavanagh on 5/9/14.
 */
class Person(val name: String) {
 override def toString = getClass.getName+"[name=]"+name+"]"
}
class SecretAgent(codename:String) extends Person(codename){
  override val name = "secret"
  override val toString = "secret"

}
