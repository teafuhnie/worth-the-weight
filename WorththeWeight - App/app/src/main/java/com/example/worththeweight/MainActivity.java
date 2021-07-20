package com.example.worththeweight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.example.worththeweight.ui.exercises.ExercisesFragment;
import com.example.worththeweight.ui.exercises.ExercisesViewModel;
import com.example.worththeweight.ui.food.FoodFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    public CardView c1, c2, c3, c4, c5;


    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c1=(CardView) findViewById(R.id.bmi);
        c2=(CardView) findViewById(R.id.convert);
        c3=(CardView) findViewById(R.id.exercises);
        c4=(CardView) findViewById(R.id.food);
        c5=(CardView) findViewById(R.id.plan);

        c1.setOnClickListener(this::onClick);
        c2.setOnClickListener(this::onClick);
        c3.setOnClickListener(this::onClick);
        c4.setOnClickListener(this::onClick);
        c5.setOnClickListener(this::onClick);



    }

    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.bmi:
                i=new Intent(this,bmi.class); startActivity(i); break;

            case R.id.convert:
                i=new Intent(this,convert.class); startActivity(i); break;

            case R.id.exercises:
                i=new Intent(this,exercises.class); startActivity(i); break;

            case R.id.food:
                i=new Intent(this,food.class); startActivity(i); break;

            case R.id.plan:
                i=new Intent(this,plan.class); startActivity(i); break;

    }
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_exercises, R.id.nav_food, R.id.nav_plan)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


}