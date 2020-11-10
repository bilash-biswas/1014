package main

import "fmt"

func main() {
	var a int
	var b float64
	fmt.Scan(&a)
	fmt.Scan(&b)
	var result float64 = float64(a) / b
	fmt.Printf("%.3f km/l\n", result)

}
