package com.example.navigation.ui.NeedHelp;

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

import com.example.navigation.databinding.FragmentNeedHelpBinding;
import com.example.navigation.ui.Notification.NotificationViewModel;

public class NeedHelpFragment extends Fragment {

    private NeedHelpViewModel needHelpViewModel;
    private FragmentNeedHelpBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        needHelpViewModel =
                new ViewModelProvider(this).get(NeedHelpViewModel.class);

        binding = FragmentNeedHelpBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvHello;
        needHelpViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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