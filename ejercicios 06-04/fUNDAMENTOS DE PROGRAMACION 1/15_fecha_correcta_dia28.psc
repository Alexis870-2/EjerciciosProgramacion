Algoritmo fecha_correcta
	Definir dia, mes, a�o como Entero
	
	Escribir "Ingrese el d�a: "
	Leer dia
	Escribir "Ingrese el mes (en numeros ejemplo: 1 = enero) : "
	Leer mes
	Escribir "Ingrese el a�o: "
	Leer a�o
	Si mes = 2 Entonces
		Si dia >= 1 y dia <= 28 Entonces
			Escribir "La fecha es correcta"
		Sino
			Escribir "La fecha no es correcta"
		FinSi
	Sino
		Si mes = 4 o mes = 6 o mes = 9 o mes = 11 Entonces
			Si dia >= 1 y dia <= 30 Entonces
				Escribir "La fecha es correcta"
			Sino
				Escribir "La fecha no es correcta"
			FinSi
		Sino
			Si dia >= 1 y dia <= 31 Entonces
				Escribir "La fecha es correcta"
			Sino
				Escribir "La fecha no es correcta"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
