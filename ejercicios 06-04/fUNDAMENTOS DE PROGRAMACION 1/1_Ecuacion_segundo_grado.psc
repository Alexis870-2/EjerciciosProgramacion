Algoritmo Ecuacion_segundo_grado
	DEFINIR a, b, c, discr, x1, x2 COMO REAL 
	Escribir "Ingrese el coeficiente a: "
	Leer a
	Escribir "Ingrese el coeficiente b: "
	Leer b
	Escribir "Ingrese el coeficiente c: "
	Leer c
	discr = b^2 - 4*a*c
	Si discr >= 0 Entonces
		x1 = (-b + raiz(discr)) / (2*a)
		x2 = (-b - raiz(discr)) / (2*a)
		Escribir "Las soluciones son: "
		Escribir "x1 = ", x1
		Escribir "x2 = ", x2
	Sino
		Escribir "No existen soluciones reales"
	FinSi
FinAlgoritmo
