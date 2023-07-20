def year(year):
    # Convertir la entrada del usuario a un número entero
    year = int(year)
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                print("El año", year, "es un año bisiesto")
            else:
                print("El año", year, "no es un año bisiesto")
        else:
            print("El año", year, "es un año bisiesto")
    else:
        print("El año", year, "no es un año bisiesto")

# Ejemplo de uso
print("Escribe el año que deseas saber si es bisiesto, sin puntos o comas")
year_input = input()
year(year_input)