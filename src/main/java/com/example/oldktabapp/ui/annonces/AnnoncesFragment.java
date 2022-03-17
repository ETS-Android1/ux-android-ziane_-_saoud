package com.example.oldktabapp.ui.annonces;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.oldktabapp.databinding.FragmentAnnoncesBinding;

public class AnnoncesFragment extends Fragment {

    private FragmentAnnoncesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AnnoncesViewModel homeViewModel =
                new ViewModelProvider(this).get(AnnoncesViewModel.class);

        binding = FragmentAnnoncesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAnnonces;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}