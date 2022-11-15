import pandas as pd
class manejoDf:
    def __init__(self):
        self.archivo=pd.read_csv("registro.csv")
    def estadistica(self):
        print(self.archivo.describe())
