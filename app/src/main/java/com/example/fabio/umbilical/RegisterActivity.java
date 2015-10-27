package com.example.fabio.umbilical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisterActivity extends AppCompatActivity {

    Button mButtonAdulto;
    Button mButtonCrianca;

    LinearLayout mRegistoInicio;
    LinearLayout mRegistoAdulto;
    LinearLayout mRegistoCrianca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mButtonAdulto = (Button) findViewById(R.id.adulto_button_id);
        mButtonCrianca = (Button) findViewById(R.id.crianca_button_id);

        mRegistoInicio = (LinearLayout) findViewById(R.id.registo_p1);
        mRegistoAdulto = (LinearLayout) findViewById(R.id.registo_adulto);
        mRegistoCrianca = (LinearLayout) findViewById(R.id.registo_crianca);

        mButtonAdulto.setOnClickListener(buttonAdultoClick);
        mButtonCrianca.setOnClickListener(buttonCriancaClick);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        if (mRegistoAdulto.getVisibility() == View.VISIBLE || mRegistoCrianca.getVisibility() == View.VISIBLE) {

            if (mRegistoAdulto.getVisibility() == View.VISIBLE) {
                mRegistoAdulto.setVisibility(View.GONE);
            }

            if(mRegistoCrianca.getVisibility() == View.VISIBLE){
                mRegistoCrianca.setVisibility(View.GONE);
            }
            mRegistoInicio.setVisibility(View.VISIBLE);
        }
    }

    private View.OnClickListener buttonAdultoClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mRegistoInicio.setVisibility(View.GONE);
            mRegistoAdulto.setVisibility(View.VISIBLE);
        }
    };

    private View.OnClickListener buttonCriancaClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mRegistoInicio.setVisibility(View.GONE);
            mRegistoCrianca.setVisibility(View.VISIBLE);
        }
    };


}
