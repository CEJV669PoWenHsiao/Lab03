package cejv669.concordia.com.lab03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btnLogin);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText t1 = findViewById(R.id.txtName);
                EditText t2 = findViewById(R.id.txtPassword);

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                i.putExtra("MyName", t1.getText().toString());


                startActivity(i);
            }
        });

        Button b2 = findViewById(R.id.btnGet1);
        Button b3 = findViewById(R.id.btnGet2);



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i, 1);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i, 2);
                startActivity(i);
            }
        });
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == 1 && resultCode == RESULT_OK)
            {
                TextView tv1 = findViewById(R.id.lblText1);

                String myString = data.getStringExtra("returnText1");

                tv1.setText(myString);
            }

            if (requestCode == 2 && resultCode == RESULT_OK)
            {
                TextView tv2 = findViewById(R.id.lblText2);

                String myString = data.getStringExtra("returnText2");

                tv2.setText(myString);
            }

        }

}
