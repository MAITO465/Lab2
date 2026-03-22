package com.example.maitocalc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText champSurface, champPieces;
    private CheckBox estEquipePiscine;
    private TextView zoneResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurerComposants();
    }

    private void configurerComposants() {
        champSurface = findViewById(R.id.et_metrage_surface);
        champPieces = findViewById(R.id.et_quantite_pieces);
        estEquipePiscine = findViewById(R.id.cb_option_piscine);
        zoneResultat = findViewById(R.id.tv_affichage_total);

        Button boutonCalcul = findViewById(R.id.btn_generer_calcul);

        boutonCalcul.setOnClickListener(view -> executerEstimation());
    }

    private void executerEstimation() {
        try {

            String strSurface = champSurface.getText().toString();
            String strPieces = champPieces.getText().toString();

            if (strSurface.isEmpty() || strPieces.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }

            double valeurSurface = Double.parseDouble(strSurface);
            int nbrPieces = Integer.parseInt(strPieces);
            boolean aPiscine = estEquipePiscine.isChecked();


            double montantFinal = calculerImpot(valeurSurface, nbrPieces, aPiscine);


            zoneResultat.setText(String.format("Montant estimé : %.2f DH", montantFinal));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Erreur de saisie numérique", Toast.LENGTH_LONG).show();
        }
    }

    private double calculerImpot(double s, int p, boolean piscine) {
        double tarifM2 = 2.0;
        double taxeParPiece = 50.0;
        double forfaitPiscine = 100.0;

        double base = s * tarifM2;
        double extras = (p * taxeParPiece) + (piscine ? forfaitPiscine : 0);

        return base + extras;
    }
}