Algoritmo adivinar_numero
	Definir num, intento como Entero
	num = Aleatorio(1, 100)
	Escribir "Adivina un n�mero entre 1 y 100"
	Mientras Verdadero Hacer
		Escribir "Ingrese un n�mero: "
		Leer intento
		Si intento < num Entonces
			Escribir "Mayor"
		Sino
			Si intento > num Entonces
				Escribir "Menor"
			Sino
				Escribir "�Felicidades! Has acertado el n�mero"
			FinSi
		FinSi
	FinMientras
FinAlgoritmo
