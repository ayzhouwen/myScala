package org.scala.base

/**
  * Created by Administrator on 2017/7/14.
  */
class HelloWorld {

}

object HelloWorld{
  def main(args: Array[String]): Unit = {
    println("Hello Scala World........")
    println(returnHelloStr("Scala"))
    printlnHelloStr("Scala........")
    printlnHelloStrNoP
    println(sum(2,8)(3)(7))
    variableParm("33,44,55,abc")
    println(returnDefaulV())
  }

  //第一种方式定义方法(有返回值)
  def returnHelloStr(str:String):String={
    "Hello"+str
  }

  //第二种方式 定义方法(直接打印)
  def printlnHelloStr(str:String) {
    println("直接Hello"+str)
  }
  //第三种无参方法

  def printlnHelloStrNoP {
    println("直接Hello,无参")
  }

  //第四种,匿名函数

  def mutiply=(x:Int,y:Int)=>x*y

//第五种方式定义方法(柯力化)
def sum(x:Int,a:Int)(y:Int)(z:Int)=x+y+z+a


  //第六种方式定义方法(可变参数)

  def variableParm(str:String*)={
    str.foreach(s=> print(s))
  }

//第七种方式定义方法(默认参数)

  def  returnDefaulV(value:String="this is default value"):String={
     "dafault value:"+value
  }
}