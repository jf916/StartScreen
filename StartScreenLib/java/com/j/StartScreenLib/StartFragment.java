package com.j.StartScreenLib;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.j.game.R;

public class StartFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        view.findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "insert code here", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setComponent(new ComponentName("com.j.game", "com.j.game.GameActivity"));
                startActivity(intent);
            }
        });
        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "insert code here", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(Intent.ACTION_MAIN);
                //intent.setComponent(new ComponentName("com.j.game", "com.j.game.TutorialActivity"));
                //startActivity(intent);
            }
        });
        view.findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "insert code here", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(Intent.ACTION_MAIN);
                //intent.setComponent(new ComponentName("com.j.game", "com.j.game.UserActivity"));
                //startActivity(intent);
            }
        });
        view.findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "insert code here", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(Intent.ACTION_MAIN);
                //intent.setComponent(new ComponentName("com.j.game", "com.j.game.ResumeActivity"));
                //startActivity(intent);
            }
        });
        view.findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "insert settings activity code here", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(Intent.ACTION_MAIN);
                //intent.setComponent(new ComponentName("com.j.game", "com.j.game.SettingsActivity"));
                //startActivity(intent);
            }
        });

        return view;
    }
}