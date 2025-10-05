class Mascota:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = 50  # energía inicial

    def alimentar(self):
        self.energia += 20
        if self.energia > 100:
            self.energia = 100
        print(f"{self.nombre} ({self.tipo}) fue alimentado. Energía: {self.energia}")

    def jugar(self):
        self.energia -= 15
        if self.energia < 0:
            self.energia = 0
        print(f"{self.nombre} ({self.tipo}) jugó. Energía: {self.energia}")

    def mostrar_datos(self):
        print(f"Mascota: {self.nombre} | Tipo: {self.tipo} | Energía: {self.energia}")

# Ejemplo de uso
m1 = Mascota("Toby", "Perro")
m2 = Mascota("Lia", "Gato")

m1.mostrar_datos()
m2.mostrar_datos()

m1.alimentar()
m2.alimentar()

m1.jugar()
m2.jugar()

m1.alimentar()
m2.jugar()