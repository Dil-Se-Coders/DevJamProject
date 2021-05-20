package com.dilsecoders.intellect_addict;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dilsecoders.intellect_addict.module.UserDetails;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class SignInActivity extends AppCompatActivity {
    EditText emailId, password;
    Button btnSignIn;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    Button signupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        emailId = findViewById(R.id.editTextEmailAddress1);
        password = findViewById(R.id.password);
        btnSignIn = findViewById(R.id.btnSignIn);
        signupbtn = findViewById(R.id.signupbtn);

        firebaseDatabase = FirebaseDatabase.getInstance();
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = firebaseAuth.getCurrentUser();
                if (mFirebaseUser != null) {
                    moveToHomeActivity(mFirebaseUser);
                } else {
                    Toast.makeText(SignInActivity.this, "Please Login!", Toast.LENGTH_SHORT).show();
                }
            }
        };
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailId.getText().toString();
                String pwd = password.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(SignInActivity.this, "Please Enter Email!", Toast.LENGTH_SHORT).show();
                } else if (pwd.isEmpty()) {
                    Toast.makeText(SignInActivity.this, "Please Enter Email!", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(SignInActivity.this, "Fields Are Empty!", Toast.LENGTH_SHORT).show();
                } else if (!(email.isEmpty() && pwd.isEmpty())) {
                    firebaseAuth.signInWithEmailAndPassword(email, pwd)
                            .addOnCompleteListener(SignInActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (!task.isSuccessful()) {
                                        Toast.makeText(SignInActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                                    } else {
                                        moveToHomeActivity(task.getResult().getUser());
                                    }
                                }
                            });
                } else {
                    Toast.makeText(SignInActivity.this, "Try Again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(i2);
            }
        });

    }
//
    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(mAuthStateListener);
    }

    private void moveToHomeActivity(FirebaseUser mFirebaseUser) {
        firebaseDatabase.getReference().child(mFirebaseUser.getUid()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserDetails userDetails = snapshot.getValue(UserDetails.class);
                String fName = userDetails.getName();
                Intent i0 = new Intent(getApplicationContext(), MainActivity2.class);
                Toast.makeText(SignInActivity.this, "Logged In Successfully!", Toast.LENGTH_SHORT).show();
//             i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//              i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                i0.putExtra("name", fName);
                startActivity(i0);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}

