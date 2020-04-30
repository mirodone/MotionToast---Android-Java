package ro.mirodone.motiontoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import www.sanju.motiontoast.MotionToast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButton, errButton, warningButton, infoButton, deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = findViewById(R.id.button);
        errButton = findViewById(R.id.buttonErr);
        warningButton =findViewById(R.id.buttonWarn);
        infoButton = findViewById(R.id.buttonInfo);
        deleteButton = findViewById(R.id.buttonDelete);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MotionToast.Companion.createToast(MainActivity.this," me the MONEY !!",
                        MotionToast.Companion.getTOAST_SUCCESS(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getSHORT_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        errButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MotionToast.Companion.createColorToast(MainActivity.this," there are no MONEY !!",
                        MotionToast.Companion.getTOAST_ERROR(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getSHORT_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        warningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MotionToast.Companion.createColorToast(MainActivity.this," need more MONEY !!",
                        MotionToast.Companion.getTOAST_WARNING(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getSHORT_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });


        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MotionToast.Companion.createToast(MainActivity.this," here are the MONEY !!",
                        MotionToast.Companion.getTOAST_INFO(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getSHORT_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });


        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MotionToast.Companion.createColorToast(MainActivity.this," gone all MONEY !!",
                        MotionToast.Companion.getTOAST_DELETE(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getSHORT_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
    }
}
