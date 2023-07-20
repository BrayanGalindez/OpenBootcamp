
class Vehiculo:
    def __init__(self, Color, Ruedas, Puertas):
        self._color = Color
        self._ruedas = Ruedas
        self._puertas = Puertas


class Coche(Vehiculo):
    def __init__(self, Color, Ruedas, Puertas, Velocidad, Cilindrada):
        super().__init__(Color, Ruedas, Puertas)
        self._velocidad = Velocidad
        self._cilindrada = Cilindrada
    
    def __str__(self):
        return f"Coche: Color={self._color}, Ruedas={self._ruedas}, Puertas={self._puertas}, Velocidad={self._velocidad}, Cilindrada={self._cilindrada}"


carro1 = Coche("Azul", 4, 5, "200 km/h", "2000 cc")
print(carro1)