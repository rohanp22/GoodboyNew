package com.example.goodboy.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goodboy.Activities.Adapter.HorizontalProductsAdapter;
import com.example.goodboy.Activities.Adapter.SubscriptionsAdapter;
import com.example.goodboy.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        RecyclerView recyclerView = root.findViewById(R.id.recyclerview_home);
        RecyclerView horizontalRecyclerView = root.findViewById(R.id.horizontalrecyclerview);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(root.getContext(), RecyclerView.HORIZONTAL, false));
        horizontalRecyclerView.setAdapter(new HorizontalProductsAdapter());

        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(new SubscriptionsAdapter());

        return root;
    }
}