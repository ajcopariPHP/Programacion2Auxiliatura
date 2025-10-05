# Clases base
class Politico:
    def __init__(self, profesion, anios_exp):
        self.profesion = profesion
        self.anios_exp = anios_exp

class Partido:
    def __init__(self, nombre_p, rol):
        self.nombre_p = nombre_p
        self.rol = rol

# Clase Presidente que hereda de Politico y Partido
class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion, anios_exp, nombre_p, rol):
        self.nombre = nombre
        self.apellido = apellido
        Politico.__init__(self, profesion, anios_exp)
        Partido.__init__(self, nombre_p, rol)

    def nombre_completo(self):
        return f"{self.nombre} {self.apellido}"

# a) Instanciación de dos formas diferentes
# Forma 1: directamente con el constructor
p1 = Presidente("Juan", "Perez", "Abogado", 15, "Partido A", "Presidente")
# Forma 2: otra instancia
p2 = Presidente("Maria", "Lopez", "Economista", 10, "Partido B", "Presidente")

# b) Crear un vector (lista) de presidentes
presidentes = [
    p1,
    p2,
    Presidente("Carlos", "Garcia", "Ingeniero", 12, "Partido C", "Presidente")
]

# c) Buscar un presidente por nombre y mostrar info
nombre_buscado = "Maria"
for p in presidentes:
    if p.nombre == nombre_buscado:
        print("Presidente:", p.nombre_completo())
        print("Profesión:", p.profesion)
        print("Partido:", p.nombre_p)
