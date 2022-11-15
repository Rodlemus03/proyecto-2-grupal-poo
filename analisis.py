import time
import enfermedades
import manejoDf
class principal:
    def __init__(self):
        self.analisis()
    def barra(self,segmento,total,longitud):
        porcentaje=segmento/total
        completado=int(porcentaje*longitud)
        restante=longitud-completado
        barra=f"[{'#'*completado}{'-'*restante}{porcentaje:.2%}]"
        return barra

    def analisis(self):
        for i in range(40+1):
            time.sleep(0.05)
            print(self.barra(i,40,40),end="\r")
        enfer=enfermedades.enfermedades()
        enfer.analisis()
        manejo=manejoDf.manejoDf()
        manejo.estadistica()
principal()
