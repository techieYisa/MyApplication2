package nyc.c4q.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.view1);
        Button button = (Button) findViewById(R.id.button1);
        final EditText editText = (EditText) findViewById(R.id.text1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),textView.getText().toString(), Toast.LENGTH_LONG).show();
                String newInput = editText.getText().toString();
                textView.setText(newInput);


            }
        });

        }
    }
