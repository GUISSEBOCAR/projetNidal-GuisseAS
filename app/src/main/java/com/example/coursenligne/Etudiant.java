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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.example.coursenligne.myRequest.MyRequest;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Map;


public class Etudiant extends AppCompatActivity {

    private Button buttonIEtu;

    private TextInputLayout  etu_nom, etu_prenom, etu_email,etu_password, etu_password1, etu_pseudo;
    private RequestQueue queue;

    private MyRequest request;
    private ProgressBar pb_loader;



   /* EditText mNom, mPrenom, mPassword, mEmail;
    Button validerinscription;
    TextView mLoginBtn;
    ProgressBar progressBar;
    FirebaseAuth fAuth;*/

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.etudiant);
        }

    public  void espaceetudiant(View view) {
        startActivity(new Intent(this, EspaceEtudiant.class));

    }






           /* buttonIEtu =(Button) findViewById(R.id.buttonIEtu);
            pb_loader =(ProgressBar) findViewById(R.id.pb_loader);
            etu_nom = (TextInputLayout) findViewById(R.id.etu_nom);
            etu_prenom = (TextInputLayout) findViewById(R.id.etu_prenom);
            etu_pseudo =(TextInputLayout) findViewById(R.id.etu_pseudo);
            etu_email =(TextInputLayout) findViewById(R.id.etu_email);
            etu_password=(TextInputLayout) findViewById(R.id.etu_password);
            etu_password1=(TextInputLayout) findViewById(R.id.etu_password1);

            queue = VolleySingleton.getInstance(this).getRequestQueue();
            request = new MyRequest(this, queue);

            buttonIEtu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pb_loader.setVisibility(View.VISIBLE);
                    String nom = etu_nom.getEditText().getText().toString().trim();
                    String prenom = etu_prenom.getEditText().getText().toString().trim();
                    String email = etu_email.getEditText().getText().toString().trim();
                    final String password= etu_password.getEditText().getText().toString().trim();
                    String password1 = etu_password1.getEditText().getText().toString().trim();
                    String pseudo = etu_pseudo.getEditText().getText().toString().trim();
                    if(pseudo.length()>0 && email.length()>0 && password.length()>0 &&password1.length()>0) {
                        request.inscription(nom, email, password, password1, pseudo,  new MyRequest.RegisterCallBack() {
                            @Override
                            public void onSuccess(String message) {
                                pb_loader.setVisibility(View.GONE);
                                Intent intent = new Intent(getApplicationContext(),Connexion.class);
                                intent.putExtra("REGISTER", message);
                                startActivity(intent);
                                finish();
                            }
                            @Override
                            public void inputErrors(Map<String, String> errors) {
                                pb_loader.setVisibility(View.GONE);
                                if(errors.get("pseudo") != null){
                                    etu_pseudo.setError(errors.get("pseudo"));
                                }else{
                                    etu_pseudo.setErrorEnabled(false);
                                }
                                if(errors.get("email") != null){
                                    etu_email.setError(errors.get("email"));
                                }else{
                                    etu_email.setErrorEnabled(false);
                                }
                                if(errors.get("password") != null){
                                    etu_password.setError(errors.get("password"));
                                }else{
                                    etu_password.setErrorEnabled(false);
                                }

                                if(errors.get("nom") != null){
                                    etu_nom.setError(errors.get("nom"));
                                }else{
                                    etu_nom.setErrorEnabled(false);
                                }
                                if(errors.get("prenom") != null){
                                    etu_prenom.setError(errors.get("prenom"));
                                }else{
                                    etu_prenom.setErrorEnabled(false);
                                }
                            }
                            @Override
                            public void onError(String message) {
                                pb_loader.setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
                            }
                        });
                    }else{
                        Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    }
                }
            });*/

    }











           /* mEmail = findViewById(R.id.emailetu);
            mNom = findViewById(R.id.nometu);
            mPrenom = findViewById(R.id.prenometu);
            mPassword = findViewById(R.id.passwordetu);
            validerinscription= findViewById(R.id.buttonvIEtu);
            fAuth = FirebaseAuth.getInstance();


            if(fAuth.getCurrentUser() != null){
                startActivity(new Intent(getApplicationContext(),EspaceEtudiant.class));
                finish();

            }


            validerinscription.setOnClickListener(new View.OnClickListener() {
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

                   // progressBar.setVisibility();

                    // enrigistrer l'utilisateur dans FireBase

                    fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText( Etudiant.this,"Utilisateur enrigistré avec succé", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(),EspaceEtudiant.class));

                            }else{
                                Toast.makeText(Etudiant.this, "Erreur lors de la création!" +task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                            }

                        }
                    });
                }
            });
*/


   /* public  void espaceetudiant(View view){
        startActivity(new Intent(this, EspaceEtudiant.class));
    }


}*/
