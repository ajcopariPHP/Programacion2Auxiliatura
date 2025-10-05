#EJERCICIO 15
class Ordenador:
    def __init__(self, codigo, numero, ram, procesador, estado):
        self.codigo = codigo
        self.numero = numero
        self.ram = ram
        self.procesador = procesador
        self.estado = estado  # "activo" o "inactivo"

    def mostrar(self):
        print(f"Código: {self.codigo}, Nº: {self.numero}, RAM: {self.ram} GB, "
              f"CPU: {self.procesador}, Estado: {self.estado}")
class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    def agregar_ordenador(self, ordenador):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(ordenador)
        else:
            print(f"️ El laboratorio {self.nombre} está lleno.")
    # Método sobrecargado "informacion"
    def informacion(self, tipo=None):
        print(f"\n Información del laboratorio {self.nombre}")
        print("-" * 50)
        if tipo is None:
            for o in self.ordenadores:
                o.mostrar()
        elif tipo.lower() in ["activo", "inactivo"]:
            print(f" Ordenadores en estado '{tipo}':")
            for o in self.ordenadores:
                if o.estado.lower() == tipo.lower():
                    o.mostrar()
        elif tipo.lower() == "ram>8":
            print(" Ordenadores con más de 8 GB de RAM:")
            for o in self.ordenadores:
                if o.ram > 8:
                    o.mostrar()
        else:
            print(" Tipo no reconocido. Usa: 'activo', 'inactivo' o 'ram>8'.")

    def mostrar_seriales(self):
        print(f" Códigos seriales de {self.nombre}:")
        for o in self.ordenadores:
            print(o.codigo)

    # Función para trasladar ordenadores a otro laboratorio
    def trasladar(self, destino, cantidad):
        print(f"\n Trasladando {cantidad} ordenadores de {self.nombre} → {destino.nombre}")
        trasladados = 0
        while self.ordenadores and trasladados < cantidad:
            ordenador = self.ordenadores.pop(0)
            destino.agregar_ordenador(ordenador)
            trasladados += 1
        print(f"Se trasladaron {trasladados} ordenadores correctamente.")


# ---------------- DEMOSTRACIÓN ----------------
# a) Crear ordenadores
o1 = Ordenador("PC001", 1, 4, "Intel i3", "activo")
o2 = Ordenador("PC002", 2, 8, "Intel i5", "activo")
o3 = Ordenador("PC003", 3, 16, "Ryzen 5", "inactivo")
o4 = Ordenador("PC004", 4, 12, "Ryzen 7", "activo")
o5 = Ordenador("PC005", 5, 6, "Intel i3", "inactivo")
o6 = Ordenador("PC006", 6, 32, "Intel i9", "activo")

# b) Crear laboratorios
lasin1 = Laboratorio("Lasin 1", 4)
lasin2 = Laboratorio("Lasin 2", 4)

# Asignar ordenadores
lasin1.agregar_ordenador(o1)
lasin1.agregar_ordenador(o2)
lasin1.agregar_ordenador(o3)
lasin1.agregar_ordenador(o4)

lasin2.agregar_ordenador(o5)
lasin2.agregar_ordenador(o6)

# Mostrar información por estado y por RAM
lasin1.informacion("activo")
lasin1.informacion("ram>8")
# c) Trasladar 2 ordenadores del Lasin 1 al Lasin 2
print("\n Estado antes del traslado:")
lasin1.mostrar_seriales()
lasin2.mostrar_seriales()

lasin1.trasladar(lasin2, 2)

print("\n Estado después del traslado:")
lasin1.mostrar_seriales()
lasin2.mostrar_seriales()
