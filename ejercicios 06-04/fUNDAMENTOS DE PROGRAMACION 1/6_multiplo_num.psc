Algoritmo multiplo_num
	Definir num1, num2 como Entero
	
	Escribir "Ingrese el primer número: "
	Leer num1
	Escribir "Ingrese el segundo número: "
	Leer num2
	Si num1 % num2 == 0 Entonces
		Escribir num1, " es múltiplo de ", num2
	Sino
		Si num2 % num1 == 0 Entonces
			Escribir num2, " es múltiplo de ", num1
		Sino
			Escribir "No son múltiplos"
		FinSi
	FinSi
FinAlgoritmo
