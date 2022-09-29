package com.example.navigation.ui.MyAccount;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigation.R;
import com.example.navigation.databinding.FragmentMyAccountBinding;


public class MyAccountFragment extends Fragment {

    private MyAccountViewModel myAccountViewModel;
    private FragmentMyAccountBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myAccountViewModel =
                new ViewModelProvider(this).get(MyAccountViewModel.class);

        binding = FragmentMyAccountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvHello;
        myAccountViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}