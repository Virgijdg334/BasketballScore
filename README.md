🏀 Basketball Score App

Basketball Score es una aplicación Android nativa desarrollada en Java diseñada para gestionar el marcador de un partido de baloncesto de forma sencilla e intuitiva. Este proyecto implementa las mejores prácticas de desarrollo Android, incluyendo el uso de Data Binding, gestión de recursos y navegación entre actividades.

📱 Capturas de Pantalla

Pantalla Principal

Pantalla de Resultados

<img src="image_0d0d95.png" width="300">

<img src="image_0d0d76.png" width="300">

Gestión de puntos en tiempo real

Visualización del ganador y reinicio

🚀 Funcionalidades Principales

1. Gestión de Marcador

Controles independientes para equipo Local y Visitante.

Botones para sumar +1 y +2 puntos (Tiros libres y Canastas).

Botón para restar -1 (Corrección de errores).

Validación lógica: El marcador nunca puede ser negativo.

2. Interfaz de Usuario (UI)

Diseño moderno basado en Material Design.

Uso de CardViews para separar visualmente a los equipos.

Paleta de colores temática (Naranja Basket, Gris Neutro, Negro Elegante).

Diseño responsivo utilizando ConstraintLayout.

3. Navegación y Flujo

Paso de datos: Transferencia de las puntuaciones finales a la pantalla de resultados mediante Intent Extras.

Cálculo de Ganador: La segunda pantalla determina automáticamente si ganó el Local, el Visitante o hubo Empate.

Reinicio Inteligente: El botón "Jugar de nuevo" utiliza FLAG_ACTIVITY_CLEAR_TOP para limpiar la pila de actividades y comenzar una partida nueva desde cero (0-0).

🛠️ Tecnologías y Herramientas

Este proyecto ha sido construido utilizando las siguientes tecnologías:

Lenguaje: Java

Entorno: Android Studio

Arquitectura UI: XML Layouts

Vinculación de Vistas: Data Binding / View Binding (Reemplazando findViewById).

Componentes Clave:

ConstraintLayout

CardView

Intents (Explícitos y Flags)

📂 Estructura del Proyecto

com.example.basket
├── 📄 MainActivity.java      # Lógica de la pantalla de juego (Suma/Resta/Validación)
├── 📄 ScoreActivity.java     # Lógica de resultados y reinicio de partida
├── 📄 Constants.java         # Constantes para las claves de los Intents
└── 📂 res
    ├── 📂 layout             # Diseños XML (activity_main.xml, activity_score.xml)
    └── 📂 values             # Recursos (colors.xml, strings.xml, themes.xml)


✨ Instalación

Clona este repositorio.

Abre el proyecto en Android Studio.

Sincroniza el proyecto con los archivos Gradle.

Ejecuta la aplicación en un emulador o dispositivo físico.

Desarrollado como parte de la Tarea Final del 1º Trimestre.
