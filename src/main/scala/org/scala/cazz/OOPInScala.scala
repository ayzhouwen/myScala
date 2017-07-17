package org.scala.cazz

/**
  * Created by Administrator on 2017/7/14.
  */
class OOPInScala {

}
class  User{
  var name:String=_ // "_"代表占位符
   var age=18
  private  [this] val gender="中性" //私有属性


}



object  OOPInScala{
  def main(args: Array[String]): Unit ={
    val user=new User
    user.name="summer"
    println("user.name="+user.name)
    println("user.age="+user.age)



  }

}