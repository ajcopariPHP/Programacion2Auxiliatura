#EJERCICIO 3
class Matriz:
    # a) Constructor por defecto → matriz identidad
    def __init__(self, n=None, datos=None):
        if datos is not None:
            # Constructor con datos
            self.n = len(datos)
            if self.n > 10:
                self.n = 10
            self.matriz = [[float(datos[i][j]) for j in range(self.n)] for i in range(self.n)]
        elif n is not None:
            # Constructor con tamaño n → matriz identidad
            if n > 10:
                n = 10
            self.n = n
            self.matriz = [[0.0 for _ in range(n)] for _ in range(n)]
            for i in range(n):
                self.matriz[i][i] = 1.0
        else:
            # Si no se pasa nada, se crea una identidad 3x3 por defecto
            self.n = 3
            self.matriz = [[1.0 if i == j else 0.0 for j in range(3)] for i in range(3)]

    # c) Método para sumar dos matrices
    def sumar(self, m):
        if self.n != m.n:
            raise ValueError("❌ Las matrices deben tener el mismo tamaño")
        resultado = [
            [self.matriz[i][j] + m.matriz[i][j] for j in range(self.n)]
            for i in range(self.n)
        ]
        return Matriz(datos=resultado)

    # c) Método para restar dos matrices
    def restar(self, m):
        if self.n != m.n:
            raise ValueError("Las matrices deben tener el mismo tamaño")
        resultado = [
            [self.matriz[i][j] - m.matriz[i][j] for j in range(self.n)]
            for i in range(self.n)
        ]
        return Matriz(datos=resultado)

    # d) Método para verificar si dos matrices son iguales
    def igual(self, m):
        if self.n != m.n:
            return False
        for i in range(self.n):
            for j in range(self.n):
                if self.matriz[i][j] != m.matriz[i][j]:
                    return False
        return True

    # Mostrar la matriz
    def mostrar(self):
        for fila in self.matriz:
            print("\t".join(f"{v:.2f}" for v in fila))
        print()


# ------------------- DEMOSTRACIÓN -------------------
if __name__ == "__main__":
    # Matriz identidad de 3x3
    m1 = Matriz(3)
    print("Matriz identidad m1:")
    m1.mostrar()

    # Matriz con datos
    datos = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    m2 = Matriz(datos=datos)
    print("Matriz m2:")
    m2.mostrar()

    # Suma de matrices
    print("Suma m1 + m2:")
    suma = m1.sumar(m2)
    suma.mostrar()

    # Resta de matrices
    print("Resta m2 - m1:")
    resta = m2.restar(m1)
    resta.mostrar()

    # Comparar matrices
    print("¿m1 es igual a m2?", m1.igual(m2))
