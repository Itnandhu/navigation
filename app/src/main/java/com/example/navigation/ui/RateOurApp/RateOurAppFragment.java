package com.example.navigation.ui.RateOurApp;

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
import com.example.navigation.databinding.FragmentRateOurAppBinding;
import com.example.navigation.ui.Share.ShareViewModel;

public class RateOurAppFragment extends Fragment {

    private RateOurAppViewModel rateOurAppViewModel;
    private FragmentRateOurAppBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rateOurAppViewModel =
                new ViewModelProvider(this).get(RateOurAppViewModel.class);

        binding = FragmentRateOurAppBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvHello;
        rateOurAppViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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
