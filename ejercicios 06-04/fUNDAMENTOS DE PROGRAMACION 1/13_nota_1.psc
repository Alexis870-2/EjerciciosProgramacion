Algoritmo nota_1
	Definir nota como Real
	
	Escribir "Ingrese una nota entre 0 y 10: "
	Leer nota
	
	Si nota < 5 Entonces
		Escribir "Insuficiente"
	Sino
		Si nota < 7 Entonces
			Escribir "Suficiente"
		Sino
			Escribir "Satisfactorio"
		FinSi
	FinSi
FinAlgoritmo
