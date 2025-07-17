Algoritmo diferencia_fechas
	Definir dia1, mes1, año1, dia2, mes2, año2 como Entero
	
	Escribir "Ingrese el día de la primera fecha: "
	Leer dia1
	Escribir "Ingrese el mes de la primera fecha: "
	Leer mes1
	Escribir "Ingrese el año de la primera fecha: "
	Leer año1
	
	Escribir "Ingrese el día de la segunda fecha: "
	Leer dia2
	Escribir "Ingrese el mes de la segunda fecha: "
	Leer mes2
	Escribir "Ingrese el año de la segunda fecha: "
	Leer año2
	
	Definir fecha1, fecha2 como Entero
	
	fecha1 = año1 * 360 + mes1 * 30 + dia1
	fecha2 = año2 * 360 + mes2 * 30 + dia2
	
	Escribir "La diferencia entre las dos fechas es de ", Abs(fecha2 - fecha1), " días"
FinAlgoritmo
