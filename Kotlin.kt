import java.util.Scanner
fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.nextInt()
    var b = read.nextDouble()
    println("%.3f km/l".format(a / b))
}
