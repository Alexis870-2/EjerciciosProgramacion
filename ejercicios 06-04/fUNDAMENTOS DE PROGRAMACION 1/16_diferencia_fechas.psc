Algoritmo diferencia_fechas
	Definir dia1, mes1, a�o1, dia2, mes2, a�o2 como Entero
	
	Escribir "Ingrese el d�a de la primera fecha: "
	Leer dia1
	Escribir "Ingrese el mes de la primera fecha: "
	Leer mes1
	Escribir "Ingrese el a�o de la primera fecha: "
	Leer a�o1
	
	Escribir "Ingrese el d�a de la segunda fecha: "
	Leer dia2
	Escribir "Ingrese el mes de la segunda fecha: "
	Leer mes2
	Escribir "Ingrese el a�o de la segunda fecha: "
	Leer a�o2
	
	Definir fecha1, fecha2 como Entero
	
	fecha1 = a�o1 * 360 + mes1 * 30 + dia1
	fecha2 = a�o2 * 360 + mes2 * 30 + dia2
	
	Escribir "La diferencia entre las dos fechas es de ", Abs(fecha2 - fecha1), " d�as"
FinAlgoritmo
