#EJERCICIO 13
class Mp4:
    def __init__(self, marca, capacidadGb):
        self.marca = marca
        self.capacidadGb = capacidadGb * 1024  # convertir GB a MB
        self.nroCanciones = 0
        self.canciones = []  # cada canción será un dict con nombre, artista, peso (KB)
        self.nroVideos = 0
        self.videos = []  # cada video será un dict con nombre, artista, peso (MB)

    # Mostrar información general
    def mostrar(self):
        print(f"\n🎧 MP4 {self.marca}")
        print(f"Capacidad total: {self.capacidadGb / 1024:.2f} GB")
        print(f"Canciones: {len(self.canciones)} | Videos: {len(self.videos)}")
        print(f"Espacio usado: {self.espacio_usado():.2f} MB")
        print(f"Espacio disponible: {self.capacidad_disponible():.2f} MB")

    # Calcular espacio usado
    def espacio_usado(self):
        canciones_mb = sum(c['peso'] / 1024 for c in self.canciones)
        videos_mb = sum(v['peso'] for v in self.videos)
        return canciones_mb + videos_mb

    # Calcular capacidad disponible
    def capacidad_disponible(self):
        return self.capacidadGb - self.espacio_usado()

    # a) Método para borrar canción
    def borrarCancion(self, **kwargs):
        criterios = kwargs
        inicial = len(self.canciones)
        self.canciones = [
            c for c in self.canciones
            if not all(c.get(k) == v for k, v in criterios.items())
        ]
        final = len(self.canciones)
        if inicial != final:
            print(f"🗑️ Canción eliminada según criterios {criterios}.")
        else:
            print("️ No se encontró una canción con esos datos.")

    # b) Sobrecargar operador + para añadir canción
    def __add__(self, cancion):
        if isinstance(cancion, dict):
            if any(c['nombre'] == cancion['nombre'] for c in self.canciones):
                print(f"️ La canción '{cancion['nombre']}' ya existe.")
            else:
                peso_mb = cancion['peso'] / 1024
                if peso_mb <= self.capacidad_disponible():
                    self.canciones.append(cancion)
                    self.nroCanciones += 1
                    print(f" Canción '{cancion['nombre']}' añadida correctamente.")
                else:
                    print(" No hay suficiente espacio para añadir la canción.")
        return self

    # c) Sobrecargar operador - para añadir video
    def __sub__(self, video):
        if isinstance(video, dict):
            if any(v['nombre'] == video['nombre'] for v in self.videos):
                print(f" El video '{video['nombre']}' ya existe.")
            else:
                if video['peso'] <= self.capacidad_disponible():
                    self.videos.append(video)
                    self.nroVideos += 1
                    print(f"🎬 Video '{video['nombre']}' añadido correctamente.")
                else:
                    print("No hay suficiente espacio para añadir el video.")
        return self


# ---------------- DEMOSTRACIÓN ----------------
mp4 = Mp4("Sony WalkSound", 1)  # 1 GB

# Canciones iniciales
cancion1 = {"nombre": "Back To Black", "artista": "Amy Winehouse", "peso": 100}
cancion2 = {"nombre": "Lost On You", "artista": "LP", "peso": 150}

# Videos iniciales
video1 = {"nombre": "Heathens", "artista": "twenty one pilots", "peso": 50}
video2 = {"nombre": "Harmonica Andromeda", "artista": "KSHMR", "peso": 70}
video3 = {"nombre": "Without Me", "artista": "Halsey", "peso": 30}

# Agregar canciones
mp4 = mp4 + cancion1 + cancion2

# Agregar videos
mp4 = mp4 - video1 - video2 - video3

# Mostrar datos actuales
mp4.mostrar()

# Borrar canción por nombre
mp4.borrarCancion(nombre="Lost On You")

# Mostrar después de borrar
mp4.mostrar()
