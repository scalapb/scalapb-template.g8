package myexample

import myexample.proto2.Person2

object Main {
  def main(args: Array[String]): Unit = {
    val p = Person2()
      .update(
        _.name := "Moishe",
        _.age := 40
      )
    println(p)
  }
}
