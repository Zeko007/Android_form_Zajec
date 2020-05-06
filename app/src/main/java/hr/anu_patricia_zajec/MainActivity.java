package hr.anu_patricia_zajec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String PORUKA = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn= findViewById(R.id.btn_save);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText EtIme = findViewById(R.id.eT_ime);
                EditText EtPrezime = findViewById(R.id.eT_prezime);
                EditText EtAdresa = findViewById(R.id.eT_adresa);
                EditText EtOIB = findViewById(R.id.eT_Oib);
                EditText EtTelefon = findViewById(R.id.eT_tel);
                Spinner Grad = findViewById(R.id.spinner);
                TextView TvImeOut = findViewById(R.id.Tv_Ime_out);
                TextView TvPrezimeOut = findViewById(R.id.Tv_Prezime_out);
                TextView TvAdresaOut = findViewById(R.id.Tv_Adresa_out);
                TextView TvOIBOut = findViewById(R.id.Tv_OIB_out);
                TextView TVSpolOut = findViewById(R.id.Tv_Spol_out);
                TextView TvGradOut = findViewById(R.id.Tv_Grad_out);
                TextView TvTelefonOut = findViewById(R.id.Tv_Telefon_out);

                String newLine = "\r\n";

                String txt = TvImeOut.getText().toString() +
                        EtIme.getText().toString()+newLine +
                        TvPrezimeOut.getText().toString() +
                        EtPrezime.getText().toString()+newLine +
                        TvAdresaOut.getText().toString() +
                        EtAdresa.getText().toString()+newLine +
                        TvOIBOut.getText().toString() +
                        EtOIB.getText().toString()+newLine +
                        TVSpolOut.getText().toString() +
                        getSelectedRadioButtonText()+newLine +
                        TvGradOut.getText().toString() +
                        Grad.getSelectedItem().toString()+newLine +
                        TvTelefonOut.getText().toString() +
                        EtTelefon.getText()+newLine;


                Toast.makeText(MainActivity.this,txt,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra(PORUKA, txt);
                startActivity(intent);
            }
        });
    }




    private String getSelectedRadioButtonText() {
        RadioGroup rgSpol = findViewById(R.id.rg_spol);
        RadioButton selectedRadioButton = findViewById(rgSpol.getCheckedRadioButtonId());
        return selectedRadioButton.getText().toString();


    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"Hvala na korištenju aplikacije!",Toast.LENGTH_SHORT).show();
    }
}
