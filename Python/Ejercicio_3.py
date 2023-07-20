def imc() :
    print("Escribe tu peso en kg y estatura en metros separados por un espacio")
    respuesta = input()
    total = respuesta.split()
    peso = float(total[0])
    estatura = float(total[1])
    imc = (peso / estatura**2)
    return imc

resultado_imc = imc()
print("Tu indice de Masa Corporal (IMC) es:", round(resultado_imc, 2))
