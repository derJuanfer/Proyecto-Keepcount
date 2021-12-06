package com.proyectoutp.keepcount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {

    private EditText emailUser,passwordUser;
    private String email,password;
    private Button finishRegisterBtn;
    FirebaseAuth authUser;
    DatabaseReference dataBaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailUser=(EditText)findViewById(R.id.boxEmailUser);
        passwordUser=(EditText)findViewById(R.id.boxPasswordUser);
        finishRegisterBtn=(Button)findViewById(R.id.buttonRegisterFinish);
        authUser=FirebaseAuth.getInstance();
        dataBaseUser= FirebaseDatabase.getInstance().getReference();

        finishRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=emailUser.getText().toString();
                password=passwordUser.getText().toString();
                if(!email.isEmpty()&&!password.isEmpty()){
                    if(password.length()>=6){
                        registerUser();
                    }else{
                        Toast.makeText(Login.this, "la contraseña debe tener 6 o más caracteres", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(Login.this, "Falta rellenar campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void goToMiCuentaActivity(View view) {
        Intent intentMiCuentaActivity = new Intent(this, MiCuentaActivity.class);
        startActivity(intentMiCuentaActivity);
    }
    private void registerUser(){
        authUser.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Map<String, Object> itemRegister=new HashMap<>();
                    itemRegister.put("email",email);
                    itemRegister.put("password",password);
                    String idUser=authUser.getCurrentUser().getUid();
                    dataBaseUser.child("Users").child(idUser).setValue(itemRegister).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if(task2.isSuccessful()){
                                startActivity(new Intent(Login.this,MainActivity.class));
                                finish();
                            }else{
                                Toast.makeText(Login.this, "Registro fallido", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }else{
                    Toast.makeText(Login.this, "Registro fallido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}