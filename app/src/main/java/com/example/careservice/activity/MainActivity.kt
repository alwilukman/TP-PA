package com.example.careservice.activity

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.careservice.R
import com.example.careservice.databinding.ActivityMainBinding
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {


        private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

        private val contract = FirebaseAuthUIActivityResultContract()
        private val signInLauncher = registerForActivityResult(contract) {
            this.onSignInResult(it)
        }
    companion object {
        const val CHANNEL_ID = "updater"
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val name = getString(R.string.channel_name)
                val importance = NotificationManager.IMPORTANCE_DEFAULT
                val channel = NotificationChannel(CHANNEL_ID, name, importance)
                channel.description = getString(R.string.channel_desc)
                val manager = getSystemService(Context.NOTIFICATION_SERVICE)
                        as NotificationManager
                manager.createNotificationChannel(channel)
            }

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.login.setOnClickListener {
                mulaiLogin()

            }
        }


        private fun mulaiLogin() {
            val providers = arrayListOf(
                AuthUI.IdpConfig.GoogleBuilder().build()
            )
            val intent = AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setAvailableProviders(providers)
                .build()
            signInLauncher.launch(intent)
        }

        private fun onSignInResult(
            result: FirebaseAuthUIAuthenticationResult
        ) {
            val response = result.idpResponse
            if (result.resultCode == RESULT_OK) {
                val nama = FirebaseAuth.getInstance()
                    .currentUser?.displayName
                Log.i("LOGIN", "$nama berhasil login")
            } else {
                Log.i("LOGIN", "Login gagal: ${response?.error?.message}")
            }
            updateUI()
        }

        private fun updateUI() {
            startActivity(Intent(this, MenuUtama::class.java))
            finish()
        }
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}