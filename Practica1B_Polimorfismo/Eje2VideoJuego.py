#EJERCICIO 2
class VideoJuego:
    # Constructor con sobrecarga simulada mediante valores por defecto
    def __init__(self, nombre="Desconocido", plataforma="N/A", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores
    # Sobrecarga de métodos agregarJugadores()
    #  Agregar un solo jugador
    def agregarJugadores(self):
        self.cantidadJugadores += 1
        print(f"Se agregó un jugador. Total: {self.cantidadJugadores}")
    #  Agregar varios jugadores mediante parámetro
    def agregarJugadoresCantidad(self, cantidad):
        self.cantidadJugadores += cantidad
        print(f"Se agregaron {cantidad} jugadores. Total: {self.cantidadJugadores}")
    #  Agregar jugadores desde teclado
    def agregarJugadoresTeclado(self):
        try:
            cantidad = int(input("Ingrese cantidad de jugadores a agregar: "))
            self.cantidadJugadores += cantidad
            print(f"Se agregaron {cantidad} jugadores. Total: {self.cantidadJugadores}")
        except ValueError:
            print(" Entrada no válida. Debe ingresar un número entero.")

    def __str__(self):
        return f" Videojuego: {self.nombre} | Plataforma: {self.plataforma} | Jugadores: {self.cantidadJugadores}"

# ------------------- DEMOSTRACIÓN -------------------
if __name__ == "__main__":
    # Instanciación de 3 formas diferentes
    juego1 = VideoJuego()  # Constructor vacío
    juego2 = VideoJuego("Minecraft", "PC")  # Constructor con 2 argumentos
    juego3 = VideoJuego("FIFA 25", "PlayStation", 2)  # Constructor completo

    # Mostrar objetos
    print(juego1)
    print(juego2)
    print(juego3)

    # Probar sobrecarga de métodos
    juego2.agregarJugadores()           # +1 jugador
    juego2.agregarJugadoresCantidad(3)  # +3 jugadores
    # juego2.agregarJugadoresTeclado()  # desde teclado (opcional)

    print(juego2)
