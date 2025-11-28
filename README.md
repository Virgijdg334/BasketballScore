# ☁️🏀 **BASKETBALL SCORE APP** ⭐  
*La herramienta definitiva para gestionar tus partidos con estilo.* ✨  

Basketball Score es una aplicación Android nativa desarrollada en **Java**, diseñada para llevar el control total de un partido de baloncesto. Este proyecto no solo cuenta puntos, ¡sino que demuestra el poder del desarrollo móvil moderno! 🚀  

---

## 📸 **GALERÍA DE CAPTURAS** 🌟

### ✨ Pantalla Principal  
### 🏆 Pantalla de Resultados  

<img width="283" height="626" alt="Captura de pantalla 2025-11-28 130843" src="https://github.com/user-attachments/assets/4227dc58-453c-4d4b-b017-d7f34ecbd0fe" />
<img width="292" height="627" alt="Captura de pantalla 2025-11-28 130957" src="https://github.com/user-attachments/assets/ce7216e3-8a78-48ba-a512-e467131d36d0" />



Control total con diseño limpio ☁️  
¡Celebra la victoria! 🎉  

---

## 🚀 **FUNCIONALIDADES ESTELARES**

### 1. 🏀 **Gestión de Marcador Pro**
- **Controles Independientes:** Paneles separados para Local y Visitante.  
- **Acciones Rápidas:** Botones para sumar +1 y +2 puntos.  
- **Corrección de Errores:** Botón de restar -1 (¡porque todos nos equivocamos! 😅).  
- **🛡️ Escudo Anti-Negativos:** Lógica inteligente que impide marcadores bajo cero.

---

### 2. 🎨 **Diseño de Interfaz (UI)**
- **Material Design:** CardView sobre un fondo suave ☁️  
- **Colores Vibrantes:**  
  - Naranja Basket `#FF5722`  
  - Gris Neutro para equilibrio  
- **Tipografía:** Grande, clara y audaz.

---

### 3. 🔄 **Flujo de Juego**
- **Árbitro Automático:** La app decide el ganador o empate al instante. 🤖  
- **Reinicio Mágico:** El botón **"Jugar de nuevo"** deja el marcador limpio (0–0) para la revancha.

---

## 💻 **IMPLEMENTACIÓN TÉCNICA** 🛠️

### ⚡ 1. Data Binding  
Activado en *build.gradle* para un código más limpio y directo.

```gradle
// build.gradle (Module: app)
buildFeatures {
    dataBinding = true
}
