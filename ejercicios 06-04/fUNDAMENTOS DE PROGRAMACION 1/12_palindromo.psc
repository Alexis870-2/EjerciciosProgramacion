Algoritmo palindromo
	Definir num como Real
	Definir num_s como Cadena
	Definir es_pal como Logico
	Definir i como Entero
	Escribir "Ingrese un n�mero entre 0 y 9.999: "
	Leer num
	num_s = ConvertirATexto(num)
	es_pal = Verdadero
	Para i = 1 Hasta Longitud(num_s) / 2 Hacer
		Si Subcadena(num_s, i, i) <> Subcadena(num_s, Longitud(num_s) - i + 1, Longitud(num_s) - i + 1) Entonces
			pal = Falso
		FinSi
	FinPara
	Si es_pal Entonces
		Escribir "El n�mero es pal�ndromo"
	Sino
		Escribir "El n�mero no es pal�ndromo"
	FinSi
	
FinAlgoritmo

