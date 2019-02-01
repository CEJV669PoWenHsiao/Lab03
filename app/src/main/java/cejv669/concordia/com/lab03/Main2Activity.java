package cejv669.concordia.com.lab03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b1 = findViewById(R.id.btnSubmit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText t1 = findViewById(R.id.txtMessageReturn);

                String textToReturn = t1.getText().toString();

                Intent data = new Intent();
                data.putExtra("returnText1", textToReturn);
                data.putExtra("returnText2", textToReturn);
                // Activity finished ok, return the data
                setResult(RESULT_OK, data);

                Main2Activity.this.finish();
            }
        });
    }
}
