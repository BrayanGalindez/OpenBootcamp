
def escribir_archivo():
    nombre_archivo = "archivo.txt"

    with open(nombre_archivo, "w") as archivo:
        archivo.write("Hola, este es un archivo de texto creado desde Python.\n")

def leer_archivo():
    nombre_archivo = "archivo.txt"
    with open(nombre_archivo, "r") as archivo:
        contenido = archivo.read()
        print("Contenido del archivo: ")
        print(contenido)

escribir_archivo()
leer_archivo()