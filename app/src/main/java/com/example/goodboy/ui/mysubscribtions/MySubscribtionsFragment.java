package com.example.goodboy.ui.mysubscribtions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.goodboy.R;

public class MySubscribtionsFragment extends Fragment {

    private MySubscribtionsViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(MySubscribtionsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final CalendarView calendarView = root.findViewById(R.id.calendarView);

        calendarView.setMinDate(System.currentTimeMillis());

        return root;
    }
}