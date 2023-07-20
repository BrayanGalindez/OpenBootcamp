import time

def aviso():
    tiempo_actual = time.time()
    tiempo_local = time.localtime(tiempo_actual)
    hora_actual = tiempo_local.tm_hour
    minutos_actual = tiempo_local.tm_min

    hora_salida = 19
    minutos_salida = 0

    if hora_actual >= hora_salida and minutos_actual >= minutos_salida:
        print("Es hora de ir a casa. ¡Buenas noches!")
    else:
        tiempo_restante = (hora_salida - hora_actual) * 60 - minutos_actual + minutos_salida
        horas_restantes = tiempo_restante // 60
        minutos_restantes = tiempo_restante % 60

        print(f"Quedan {horas_restantes} horas y {minutos_restantes} minutos para ir a casa.")

aviso()