# Clase base
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza de manera genérica.")
# Subclase León
class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina majestuosamente.")
# Subclase Pingüino
class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada y camina torpemente.")
# Subclase Canguro
class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta con fuerza.")
# Crear un arreglo de animales
animales = [
    Leon("Simba", 5),
    Pinguino("Pingu", 3),
    Canguro("Kanga", 4)
]

# Hacer que cada animal se desplace
for animal in animales:
    animal.desplazarse()
