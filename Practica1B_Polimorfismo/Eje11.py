#EJERCICIO 11
class Pasajero:
    def __init__(self, nombre, edad, genero):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero  # "M" o "F"

    def __repr__(self):
        return f"{self.nombre} ({self.genero}, {self.edad} años)"


class Crucero:
    def __init__(self, nombre, paisOrigen, paisDestino, nroHabitacion, costoPasaje):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.nroHabitacion = nroHabitacion
        self.costoPasaje = costoPasaje
        self.pasajeros = []

    # b) Sobrecarga de operador ++ (simulada con __add__)
    def __add__(self, pasajero):
        if isinstance(pasajero, Pasajero):
            self.pasajeros.append(pasajero)
            print(f" {pasajero.nombre} se ha embarcado en el crucero {self.nombre}.")
        else:
            raise TypeError("Solo se pueden agregar objetos de tipo Pasajero.")
        return self

    # c) Sobrecarga de operador == para comparar costo total
    def __eq__(self, other):
        if isinstance(other, Crucero):
            total_self = self.costoPasaje * len(self.pasajeros)
            total_other = other.costoPasaje * len(other.pasajeros)
            return total_self == total_other
        return False

    # d) Sobrecarga de operador + para contar mujeres y hombres en ambos cruceros
    def __radd__(self, other):
        # permite usar suma de cruceros: crucero1 + crucero2
        if isinstance(other, Crucero):
            total_pasajeros = other.pasajeros + self.pasajeros
            hombres = sum(1 for p in total_pasajeros if p.genero == "M")
            mujeres = sum(1 for p in total_pasajeros if p.genero == "F")
            print(f" Hombres: {hombres} |  Mujeres: {mujeres}")
        return self

    # e) Sobrecarga de operador - para mostrar cuántos pasajeros hay en ambos
    def __sub__(self, other):
        if isinstance(other, Crucero):
            total = len(self.pasajeros) + len(other.pasajeros)
            print(f" Total de pasajeros en ambos cruceros: {total}")
        return self

    def mostrar(self):
        print(f"\n Crucero: {self.nombre}")
        print(f"Origen: {self.paisOrigen} → Destino: {self.paisDestino}")
        print(f"Número de habitación base: {self.nroHabitacion}")
        print(f"Costo pasaje: {self.costoPasaje} Bs.")
        print(f"Pasajeros ({len(self.pasajeros)}): {self.pasajeros}")


# ------------------ DEMOSTRACIÓN ------------------

# Crear pasajeros
p1 = Pasajero("Juan Vargas", 30, "M")
p2 = Pasajero("Martina Vasques", 27, "F")
p3 = Pasajero("Wilmer Montero", 45, "M")
p4 = Pasajero("Lucía Ramos", 33, "F")
p5 = Pasajero("Carlos Gutiérrez", 29, "M")

# Crear cruceros
c1 = Crucero("Caribe Sol", "Bolivia", "Panamá", 502, 500)
c2 = Crucero("Oasis Azul", "Perú", "México", 603, 1000)

# Agregar pasajeros (operador ++ simulado con +)
c1 = c1 + p1 + p2 + p3
c2 = c2 + p4 + p5

# Mostrar datos
c1.mostrar()
c2.mostrar()

# Comparar costo total de pasajes
print("\n¿Ambos cruceros tienen el mismo costo total de pasajes?", c1 == c2)

# Contar hombres y mujeres entre ambos cruceros
print("\nContando hombres y mujeres entre ambos cruceros:")
c1 + c2

# Contar total de pasajeros entre ambos cruceros
print("\nTotal de pasajeros entre ambos cruceros:")
c1 - c2
