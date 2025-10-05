#EJERCICIO 5
class Celular:
    def __init__(self, nroTel="00000000", dueño="Desconocido", espacio=64.0, ram=4, nroApp=10):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio  # en GB
        self.ram = ram          # en GB
        self.nroApp = nroApp    # número de apps

    # Mostrar los datos del celular
    def mostrar_datos(self):
        print(f" Celular de {self.dueño}")
        print(f"Número: {self.nroTel}")
        print(f"Espacio disponible: {self.espacio} GB")
        print(f"RAM: {self.ram} GB")
        print(f"Número de apps: {self.nroApp}")
        print("-" * 40)
    # Sobrecarga del operador ++ → sumar 10 apps
    def __add__(self, other):
        if isinstance(other, int):
            nuevo = Celular(self.nroTel, self.dueño, self.espacio, self.ram, self.nroApp + 10)
            return nuevo
        raise TypeError("Solo se puede usar + con un entero")

    # Sobrecarga del operador -- → restar 5 GB de espacio
    def __sub__(self, other):
        if isinstance(other, int):
            nuevo_espacio = self.espacio - 5 if self.espacio >= 5 else 0
            nuevo = Celular(self.nroTel, self.dueño, nuevo_espacio, self.ram, self.nroApp)
            return nuevo
        raise TypeError("Solo se puede usar - con un entero")
        
#  Programa principal
if __name__ == "__main__":
    celular1 = Celular("77712345", "Juan Pérez", 64.0, 8, 20)

    print(" Datos iniciales:")
    celular1.mostrar_datos()
    # ++ → aumentar apps
    print("Aplicando operador ++ (aumentar 10 apps)...")
    celular1 = celular1 + 1  # simula ++
    celular1.mostrar_datos()
    # -- → disminuir espacio
    print("Aplicando operador -- (disminuir 5 GB de espacio)...")
    celular1 = celular1 - 1  # simula --
    celular1.mostrar_datos()
