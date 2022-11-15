import csv
class enfermedades:
    def __init__(self):
        self.archivo=self.abrir()
    def abrir(self):
        archivo=open("registro.csv",'r')
        l=[]
        for i in csv.reader(archivo):
            l.append(i)
        return l
    def analisis(self):
        listaEnfermedades=[]
        listaMedicina=[]
        for i in self.archivo:
            listaEnfermedades.append(i[1])
            listaMedicina.append(i[2])
        #Listas unicas
        lista2=list(set(listaEnfermedades))
        lista3=list(set(listaMedicina))
        #diccionario
        d2={}        
        d3={}        
        #
        for i in lista2:
            d2[i]=listaEnfermedades.count(i)
        for i in lista3:
            d3[i]=listaMedicina.count(i)
        #ENFERMEDADES
        enfermedades=list(d2.keys())
        cantidadEnfermedades=list(d2.values())
        print("Enfermedad mas comun: "+str(enfermedades[cantidadEnfermedades.index(max(cantidadEnfermedades))]))
        #MEDICINAS
        medicina=list(d3.keys())
        cantidadMedicina=list(d3.values())
        print("Medicina mas comun: "+str(medicina[cantidadMedicina.index(max(cantidadEnfermedades))]))
        
        


    

