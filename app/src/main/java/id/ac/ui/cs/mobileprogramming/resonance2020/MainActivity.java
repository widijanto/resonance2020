package id.ac.ui.cs.mobileprogramming.resonance2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import id.ac.ui.cs.mobileprogramming.resonance2020.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button part1_button = (Button) findViewById(R.id.button1);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        part1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "PAST // FUTURE", Toast.LENGTH_LONG).show();
                openPart1();
            }
        });
    }

    public void openPart1() {
        Intent intent = new Intent(this, FullscreenActivity.class);
        startActivity(intent);
    }
}