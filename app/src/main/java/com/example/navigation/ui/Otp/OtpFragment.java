package com.example.navigation.ui.Otp;

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
import com.example.navigation.databinding.FragmentOtpBinding;
import com.example.navigation.databinding.FragmentShopByCategoryBinding;
import com.example.navigation.ui.ShopByCategory.ShopByCategoryViewModel;

public class OtpFragment extends Fragment {

    private OtpViewModel otpViewModel;
    private FragmentOtpBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        otpViewModel =
                new ViewModelProvider(this).get(OtpViewModel.class);

        binding = FragmentOtpBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvEnterOtp;
        otpViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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