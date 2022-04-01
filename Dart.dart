import 'dart:io';
void main(){
  double num2;
  int num1;
  
  num1 = int.parse(stdin.readLineSync());
  num2 = double.parse(stdin.readLineSync());

  var num = (num1 / num2).toStringAsFixed(3);
  print("$num km/l");
}
