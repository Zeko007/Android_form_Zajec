package hr.anu_patricia_zajec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

private TextView textView;


@Override

    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    textView = findViewById(R.id.textView);

    Intent data = getIntent();
    String txt = data.getStringExtra(MainActivity.PORUKA);
    textView.setText(txt);

    Button btn = findViewById(R.id.btn_exit);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
}

}
