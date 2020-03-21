package com.example.application;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class notifcations extends AppCompatActivity {
    private Button buttonView;
    private LinearLayout parentLayout;
    private int hint=0;
    FirebaseDatabase database ;
    Button save;
    DatabaseReference myRef ;
    public View tra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifcations);
        buttonView=(Button)findViewById(R.id.buttonView);
        database= FirebaseDatabase.getInstance();
        myRef= database.getReference("notifications");
        save=findViewById(R.id.save);
        parentLayout = (LinearLayout)findViewById(R.id.parentLayout);
        buttonView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                createEditTextView();
                myRef.push().setValue(tra);

            }
        });


    }
    protected void createEditTextView() {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams (
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        params.setMargins(0,10,0,10);
        EditText edittTxt = new EditText(this);
        int maxLength = 100;
        hint++;
        edittTxt.setHint("editText"+hint);
        edittTxt.setLayoutParams(params);
        // edtTxt.setBackgroundColor(Color.WHITE);
        edittTxt.setInputType(InputType.TYPE_CLASS_TEXT);
        edittTxt.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
        edittTxt.setId(hint);
        InputFilter[] fArray = new InputFilter[1];
        fArray[0] = new InputFilter.LengthFilter(maxLength);
        edittTxt.setFilters(fArray);
        parentLayout.addView(edittTxt);
        tra=edittTxt;
    }
}
