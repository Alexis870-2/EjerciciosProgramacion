Algoritmo fecha_correcta
	Definir dia, mes, año como Entero
	
	Escribir "Ingrese el día: "
	Leer dia
	Escribir "Ingrese el mes: "
	Leer mes
	Escribir "Ingrese el año: "
	Leer año
	
	Si dia >= 1 y dia <= 30 y mes >= 1 y mes <= 12 Entonces
		Escribir "La fecha es correcta"
	Sino
		Escribir "La fecha no es correcta"
	FinSi
FinAlgoritmo
