package com.example.basketballscore; // Tu paquete

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.basketballscore.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    private ActivityScoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getDataAndShowWinner();

        // Configuramos el botón de volver y reiniciar
        setupRestartButton();
    }

    private void setupRestartButton() {
        binding.btnRestart.setOnClickListener(v -> {
            // 1. Creamos un Intent para ir a MainActivity
            Intent intent = new Intent(this, MainActivity.class);

            // 2. ¡ESTA ES LA CLAVE!
            // Estas "banderas" (flags) limpian la memoria.
            // Borran la partida vieja y crean una MainActivity nueva desde cero (0-0).
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

            // 3. Iniciamos la actividad
            startActivity(intent);

            // 4. Cerramos esta pantalla de resultados por si acaso
            finish();
        });
    }

    private void getDataAndShowWinner() {
        // ... (Tu código de mostrar ganador que ya tenías sigue igual) ...
        int localScore = getIntent().getIntExtra("EXTRA_LOCAL_SCORE", 0);
        int visitorScore = getIntent().getIntExtra("EXTRA_VISITOR_SCORE", 0);

        binding.tvFinalScore.setText(getString(R.string.result_format, localScore, visitorScore));

        if (localScore > visitorScore) {
            binding.tvWinnerMessage.setText(R.string.winner_local);
        } else if (visitorScore > localScore) {
            binding.tvWinnerMessage.setText(R.string.winner_visitor);
        } else {
            binding.tvWinnerMessage.setText(R.string.tie_message);
        }
    }
}