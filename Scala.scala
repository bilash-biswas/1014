object Main {
  def main(args:Array[String]){
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readDouble()
    println("%.3f km/l".format(a / b))

  }
}
