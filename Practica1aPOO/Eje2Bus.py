class Bus:
    def __init__(self, capacidad, costo_pasaje):
        self.capacidad = capacidad
        self.costo_pasaje = costo_pasaje
        self.pasajeros = 0

    def subir_pasajeros(self, cantidad):
        if cantidad <= 0:
            print("La cantidad debe ser mayor a 0.")
            return

        if self.pasajeros + cantidad <= self.capacidad:
            self.pasajeros += cantidad
            print(f"Subieron {cantidad} pasajeros.")
        else:
            espacio = self.capacidad - self.pasajeros
            self.pasajeros = self.capacidad
            print(f"Solo subieron {espacio} pasajeros, el bus ya está lleno.")

    def cobrar_pasaje(self):
        total = self.pasajeros * self.costo_pasaje
        print(f"Se cobraron Bs. {total:.2f} en pasajes.")
        return total

    def asientos_disponibles(self):
        return self.capacidad - self.pasajeros


# Ejemplo de uso
bus = Bus(30, 1.50)
bus.subir_pasajeros(10)
bus.subir_pasajeros(25)
bus.cobrar_pasaje()
print("Asientos disponibles:", bus.asientos_disponibles())