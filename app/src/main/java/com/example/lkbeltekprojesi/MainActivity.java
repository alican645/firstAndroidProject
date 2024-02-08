package com.example.lkbeltekprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText1,editText2;
    String userName1="AliCanAydin";
    String password1="AliCanAydin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buton1);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName2=editText1.getText().toString();
                String password2=editText2.getText().toString();
                if(userName1.equals(userName2) && password1.equals(password2)){
                    Toast.makeText(MainActivity.this, "Giriş Başarılı Bir Şekilde Gerçekleştirildi", Toast.LENGTH_SHORT).show();
                    button.setBackgroundColor(getColor(R.color.green));
                    editText1.setBackgroundColor(getColor(R.color.green));
                    editText2.setBackgroundColor(getColor(R.color.green));
                }else{
                    Toast.makeText(MainActivity.this, "Kullanıcı Adı ve Şifreyi Kontrol Ediniz", Toast.LENGTH_SHORT).show();
                    button.setBackgroundColor(getColor(R.color.red));
                    editText1.setBackgroundColor(getColor(R.color.red));
                    editText2.setBackgroundColor(getColor(R.color.red));


                }
            }
        });
    }
}