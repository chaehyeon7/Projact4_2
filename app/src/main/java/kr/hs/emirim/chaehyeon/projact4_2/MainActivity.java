package kr.hs.emirim.chaehyeon.projact4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    CheckBox checkStart;
    RadioGroup rg;
    ImageView imgv;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkStart = findViewById(R.id.start);
        linear = findViewById(R.id.linear);
        rg = findViewById(R.id.rg);
        imgv = findViewById(R.id.imgv);
        Button btnDone = findViewById(R.id.btn_done);

        checkStart.setOnCheckedChangeListener(checkListener);

    }

    CompoundButton.OnCheckedChangeListener checkListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                linear.setVisibility(View.VISIBLE);
            }else{
                linear.setVisibility(View.INVISIBLE);
            }
        }
    }
}