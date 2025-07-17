Algoritmo contador_de_cifras
	Definir num como Real
	
	Escribir "Ingrese un número entre 0 y 9.999: "
	Leer num
	
	Si num < 10 Entonces
		Escribir "El número tiene 1 cifra"
	Sino
		Si num < 100 Entonces
			Escribir "El número tiene 2 cifras"
		Sino
			Si num < 1000 Entonces
				Escribir "El número tiene 3 cifras"
			Sino
				Escribir "El número tiene 4 cifras"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
