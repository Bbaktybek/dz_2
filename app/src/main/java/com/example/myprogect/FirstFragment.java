package com.example.myprogect;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    private TextView textView;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnRecet;
    private Integer counter;

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_minus_one:
                    counter--;
                    textView.setText(Integer.toString(counter));
                    break;

                case R.id.btn_plus_one:
                    counter++;
                    textView.setText(Integer.toString(counter));
                    break;

                case R.id.btn_recet:
                    initCounter();
                    break;

            }
        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
        initCounter();
    }

    private void initCounter() {
        counter = 0;
        textView.setText(Integer.toString(counter));
    }

    private void initListener() {
        btnMinus.setOnClickListener(onClickListener);
        btnPlus.setOnClickListener(onClickListener);
        btnRecet.setOnClickListener(onClickListener);

    }

    private void initView() {
        textView = requireActivity().findViewById(R.id.tv_zero);
        btnMinus = requireActivity().findViewById(R.id.btn_minus_one);
        btnPlus = requireActivity().findViewById(R.id.btn_plus_one);
        btnRecet = requireActivity().findViewById(R.id.btn_recet);
    }
}