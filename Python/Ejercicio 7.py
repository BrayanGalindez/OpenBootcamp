
class Alumno():
    def __init__(self, Nombre, Nota):
        self._nombre = Nombre
        self._nota = Nota

    def imprimir_informacion(self):
        print(f"Nombre del alumno: {self._nombre}"+ f"\nNota del alumno: {self._nota}")
        if self._nota >= 3:
            print(f"El alumno {self._nombre} ha aprobado")
        else:
            print(f"El alumno {self._nombre} no ha aprobado")

Alumno1 = Alumno("Anderson", 2.5)
Alumno1.imprimir_informacion()
