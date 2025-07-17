Algoritmo adivinar_numero
	Definir num, intento como Entero
	num = Aleatorio(1, 100)
	Escribir "Adivina un número entre 1 y 100"
	Mientras Verdadero Hacer
		Escribir "Ingrese un número: "
		Leer intento
		Si intento < num Entonces
			Escribir "Mayor"
		Sino
			Si intento > num Entonces
				Escribir "Menor"
			Sino
				Escribir "¡Felicidades! Has acertado el número"
			FinSi
		FinSi
	FinMientras
FinAlgoritmo
