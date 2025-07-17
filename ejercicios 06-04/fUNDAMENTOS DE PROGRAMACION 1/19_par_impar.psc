Algoritmo par_impar
	Definir num como Entero
		Repetir
			Escribir "Ingrese un número: "
			Leer num
			
			Si num = 0 Entonces
				Escribir "Fin del programa"
			Sino
				Si num % 2 = 0 Entonces
					Escribir "El número es par"
				Sino
					Escribir "El número es impar"
				FinSi
			FinSi
		Hasta Que num=0
FinAlgoritmo
