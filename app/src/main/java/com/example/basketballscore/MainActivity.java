package com.example.basketballscore; // Asegúrate de que esto coincide con tu paquete

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// Importante: Importamos la clase de binding generada automáticamente
import com.example.basketballscore.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Declaramos la variable para el Data Binding
    private ActivityMainBinding binding;

    // Variables para guardar la puntuación
    private int localScore = 0;
    private int visitorScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. Inicializamos Data Binding (Sustituye al setContentView antiguo)
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 2. Configuramos los botones
        setupButtons();

        // 3. Mostramos el marcador inicial (0-0)
        updateScoreBoard();
    }

    private void resetScores() {
        localScore = 0;
        visitorScore = 0;
        updateScoreBoard(); // Esto refresca la pantalla para que aparezcan los ceros
    }

    private void setupButtons() {
        // --- EQUIPO LOCAL ---
        // Usamos lambdas (v -> ...) para que el código sea más limpio
        binding.btnLocalPlus1.setOnClickListener(v -> addPointsLocal(1));
        binding.btnLocalPlus2.setOnClickListener(v -> addPointsLocal(2));
        binding.btnLocalMinus.setOnClickListener(v -> subtractPointsLocal());

        // --- EQUIPO VISITANTE ---
        binding.btnVisitorPlus1.setOnClickListener(v -> addPointsVisitor(1));
        binding.btnVisitorPlus2.setOnClickListener(v -> addPointsVisitor(2));
        binding.btnVisitorMinus.setOnClickListener(v -> subtractPointsVisitor());

        // --- BOTONES EXTRA ---
        // Como no pusimos botón de reset en el XML anterior, lo dejamos comentado o
        // si añadiste uno con id btnReset, descomenta la siguiente línea:
        // binding.btnReset.setOnClickListener(v -> resetScores());

        binding.btnReset.setOnClickListener(v -> resetScores());

        binding.btnNext.setOnClickListener(v -> goToResultActivity());

        binding.btnNext.setOnClickListener(v -> goToResultActivity());
    }

    // --- LÓGICA DE PUNTUACIÓN ---

    private void addPointsLocal(int points) {
        localScore += points;
        updateScoreBoard();
    }

    private void subtractPointsLocal() {
        if (localScore > 0) { // Validación: No bajar de 0 [cite: 45]
            localScore--;
            updateScoreBoard();
        }
    }

    private void addPointsVisitor(int points) {
        visitorScore += points;
        updateScoreBoard();
    }

    private void subtractPointsVisitor() {
        if (visitorScore > 0) { // Validación: No bajar de 0
            visitorScore--;
            updateScoreBoard();
        }
    }

    private void updateScoreBoard() {
        // Actualizamos los textos directamente accediendo a los TextView por su ID
        binding.tvLocalScore.setText(String.valueOf(localScore));
        binding.tvVisitorScore.setText(String.valueOf(visitorScore));
    }

    // --- NAVEGACIÓN ---

    private void goToResultActivity() {
        // Creamos el Intent para ir a la segunda pantalla
        Intent intent = new Intent(this, com.example.basketballscore.ScoreActivity.class);

        // Pasamos los datos. OJO: Si no has creado la clase Constants,
        // usa textos normales por ahora para que no te de error:
        intent.putExtra("EXTRA_LOCAL_SCORE", localScore);
        intent.putExtra("EXTRA_VISITOR_SCORE", visitorScore);

        startActivity(intent);
    }
}