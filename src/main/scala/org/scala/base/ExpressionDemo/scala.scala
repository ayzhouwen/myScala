package org.scala.base.ExpressionDemo

/**
  * Created by Administrator on 2017/7/14.
  */
class scala {

}

object  ExpressionDemo{
  def main(args: Array[String]) {
    val isStop=1
    //if
    val result=if(1==isStop) true else false
    println("result = "+result)

    var (n,m)=(100,0)
   //while
    while (n>0){
      m=m+n;
      n=n-1;
    }
    println("m= "+m)

    //for
    for (i <- 1 to 10){
      print(i+",")
    }

    for(i <- 1  until 10){
      print(i+" ")
    }

    for(i <- 1 to 100 if i%2==0){
      print(i+" ")
    }

  }
}