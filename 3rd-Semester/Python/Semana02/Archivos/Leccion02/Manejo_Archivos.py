# Declaramos una variable

try:
    archivo = open('prueba.txt', 'w')  # Si este archivo no existe lo crea. Si existe el metodo open lo busca.
    # La w es de write.
    archivo.write('Programamos con diferentes tipos de archivos,ahora en .txt \n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally:  # Siempre se ejecuta
    archivo.close()  # Con esto se debe cerrar el archivo
