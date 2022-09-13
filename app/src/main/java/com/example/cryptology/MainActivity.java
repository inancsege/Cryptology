package com.example.cryptology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new Timber.DebugTree());
        String value = "Password/Token to be encrypted";

        String encryptedValue = EncryptionUtils.encrypt(this, value);
        Timber.d(" Encrypted Value :%s", encryptedValue);

        String decryptedValue = EncryptionUtils.decrypt(this, encryptedValue);
        Timber.d(" Decrypted Value :%s", decryptedValue);
    }
}