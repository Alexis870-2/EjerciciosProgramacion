Algoritmo multiplo_num
	Definir num1, num2 como Entero
	
	Escribir "Ingrese el primer n�mero: "
	Leer num1
	Escribir "Ingrese el segundo n�mero: "
	Leer num2
	Si num1 % num2 == 0 Entonces
		Escribir num1, " es m�ltiplo de ", num2
	Sino
		Si num2 % num1 == 0 Entonces
			Escribir num2, " es m�ltiplo de ", num1
		Sino
			Escribir "No son m�ltiplos"
		FinSi
	FinSi
FinAlgoritmo
