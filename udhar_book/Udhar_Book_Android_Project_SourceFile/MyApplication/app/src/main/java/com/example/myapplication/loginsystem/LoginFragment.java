package com.example.myapplication.loginsystem;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.databinding.FragmentLoginBinding;
import com.example.myapplication.formdashboard;

public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    private FragmentLoginBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_login, container, false);
        binding = FragmentLoginBinding.inflate(inflater,container,false);

        binding.signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Working", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), formdashboard.class));
            }
        });

        return  binding.getRoot();
    }
}