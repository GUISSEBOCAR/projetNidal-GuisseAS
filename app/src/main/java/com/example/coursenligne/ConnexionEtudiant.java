package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.example.coursenligne.myRequest.MyRequest;
import com.google.android.material.textfield.TextInputLayout;


public class ConnexionEtudiant extends AppCompatActivity {

    private Button buttonConnexionEtu;
    private TextInputLayout mp_connexion, email_connexion;
    private RequestQueue queue;
    private MyRequest request;
    private ProgressBar pb_loader;
    private Handler handler;
    private SessionManager sessionManager;




   /* EditText mEmail, mPassword;
    Button mLoginBtn;
    TextView mCreateBtn;
    FirebaseAuth fAuth;*/

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexionetudiant);

       /* Intent intent = getIntent();
        if (intent.hasExtra("REGISTER")){
            Toast.makeText(this, intent.getStringExtra("REGISTER"), Toast.LENGTH_SHORT).show();
        }

        mp_connexion= (TextInputLayout) findViewById(R.id.mp_connexion);
        buttonConnexionEtu = (Button) findViewById(R.id.buttonConnexionEtu);
        email_connexion= (TextInputLayout) findViewById(R.id.email_connexion);
        pb_loader = (ProgressBar) findViewById(R.id.pb_loader);



        queue = VolleySingleton.getInstance(this).getRequestQueue();
        request = new MyRequest(this, queue);

        handler=new Handler();
        sessionManager = new SessionManager(this);
        buttonConnexionEtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb_loader.setVisibility(View.VISIBLE);
                final String email = email_connexion.getEditText().getText().toString().trim();
                final String password = mp_connexion.getEditText().getText().toString().trim();
                pb_loader.setVisibility(View.VISIBLE);
                if (email.length() > 0 && password.length() > 0) {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            request.connexion(email, password, new MyRequest.LoginCallBack() {
                                @Override
                                public void onSuccess(String id, String nom) {
                                    pb_loader.setVisibility(View.GONE);
                                    sessionManager.insertUser(id,email);
                                    Intent intent = new Intent(getApplicationContext(), EspaceEtudiant.class);
                                    startActivity(intent);
                                    finish();
                                }
                                @Override
                                public void onError(String message) {
                                    pb_loader.setVisibility(View.GONE);
                                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    },1000);
                } else {
                    Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                }
            }
        });*/




       /* mEmail= findViewById(R.id.emailetu);
        mPassword = findViewById(R.id.passwordetu);
        fAuth=FirebaseAuth.getInstance();
        mLoginBtn= findViewById(R.id.buttonConnexionEtu);


        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    mEmail.setError("Votre Email est necéssaire");
                    return;

                }

                if (TextUtils.isEmpty(password)){
                    mPassword.setError("Mot de passe necéssaire");
                    return;
                }

                if (password.length() <= 6){
                    mPassword.setError("le mot de passe doit avoir au moins 6six caractéres");
                    return;
                }

                //authentification de l'utilisateur

                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText( ConnexionEtudiant.this,"Vous êtes bien connecté", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),EspaceEtudiant.class));
                        }else {
                            Toast.makeText(ConnexionEtudiant.this, "Erreur lors de la connexion verifier le mail ou le mot de passe !" +task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });

            }
        });
*/


    }
    public  void espaceetudiant(View view){
        startActivity(new Intent(this, EspaceEtudiant.class));
    }
}
