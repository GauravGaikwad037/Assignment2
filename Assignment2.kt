activity_main.xml 
<?xml version="1.0" encoding="utf-8"?> <androidx.constraintlayout.widget.ConstraintLayout     xmlns:android="http://schemas.android.com/apk/res/android"     xmlns:app="http://schemas.android.com/apk/res-auto"     xmlns:tools="http://schemas.android.com/tools"     android:layout_width="match_parent"     android:layout_height="match_parent"> 
    <LinearLayout 
        xmlns:android="http://schemas.android.com/apk/res/android"         android:layout_width="match_parent"         android:layout_height="match_parent"         android:orientation="vertical"         android:padding="16dp" 
        android:background="#F5F5F5"> 
 
        <TextView             android:id="@+id/textView"             android:layout_marginTop="30dp"             android:layout_width="match_parent"             android:layout_height="wrap_content"             android:background="#E3F2FD"             android:text="Hello! I am a TextView."             android:textSize="20sp"             android:textColor="#424242"             android:padding="16dp"             android:gravity="center"             android:layout_gravity="center" 
            android:layout_marginBottom="24dp"/> 
 
        <Button             android:id="@+id/button1"             android:layout_gravity="center"             android:layout_width="348dp"             android:layout_height="70dp"             android:layout_marginBottom="12dp"             android:backgroundTint="#64B5F6"             android:text="Change Text"             android:textColor="#FFFFFF" 
            android:textSize="20sp" /> 
 
        <Button             android:id="@+id/button2"             android:layout_gravity="center"             android:layout_width="348dp"             android:layout_height="70dp"             android:backgroundTint="#4CAF50"             android:text="Change Height"             android:textColor="#FFFFFF"             android:textSize="20sp" 
            android:layout_marginBottom="12dp" /> 
 
        <Button 
            android:id="@+id/button3"             android:layout_gravity="center"             android:layout_width="348dp"             android:layout_height="70dp"             android:backgroundTint="#FF9800"             android:text="Center Text"             android:textColor="#FFFFFF"             android:textSize="20sp" 
            android:layout_marginBottom="12dp" /> 
 
        <Button             android:id="@+id/button4"             android:layout_gravity="center"             android:layout_width="348dp"             android:layout_height="70dp"             android:backgroundTint="#9C27B0"             android:text="Button 4"             android:textColor="#FFFFFF"             android:textSize="20sp" 
            android:layout_marginBottom="12dp" /> 
 
        <Button             android:id="@+id/button5"             android:layout_gravity="center"             android:layout_width="348dp"             android:layout_height="70dp"             android:backgroundTint="#F44336"             android:text="Button 5"             android:textColor="#FFFFFF"             android:textSize="20sp" 
            android:layout_marginBottom="12dp" /> 
 
    </LinearLayout> 
</androidx.constraintlayout.widget.ConstraintLayout> 
 
● MainActivity.kt 
 
package com.example.assignment_2 
 
import android.os.Bundle import android.view.Gravity import android.widget.Button import android.widget.RelativeLayout import android.widget.TextView import androidx.activity.ComponentActivity import androidx.activity.compose.setContent import androidx.activity.enableEdgeToEdge import androidx.compose.foundation.layout.fillMaxSize import androidx.compose.foundation.layout.padding import androidx.compose.material3.Scaffold import androidx.compose.material3.Text import androidx.compose.runtime.Composable import androidx.compose.ui.Modifier import androidx.compose.ui.tooling.preview.Preview import com.example.assignment_2.ui.theme.Assignment_2Theme 
 
class MainActivity : ComponentActivity() {     override fun onCreate(savedInstanceState: Bundle?) {         super.onCreate(savedInstanceState)         setContentView(R.layout.activity_main)         val textView: TextView =             findViewById(R.id.textView)         val button1: Button =             findViewById(R.id.button1)         val button2: Button = findViewById(R.id.button2)         val button3: Button = findViewById(R.id.button3) 
 
        button1.setOnClickListener { 
            textView.text = "Text has been changed!" 
        } 
 
        button2.setOnClickListener {             textView.layoutParams.height =300 
                textView.requestLayout() 
        } 
 
        button3.setOnClickListener {             textView.gravity = Gravity.CENTER 
        } 
        } 
} 
