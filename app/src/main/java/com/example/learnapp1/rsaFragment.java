package com.example.learnapp1;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.DrawableRes;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.learnapp1.databinding.FragmentRsaBinding;

public class rsaFragment extends Fragment {

    private RsaViewModel mViewModel;

    public static rsaFragment newInstance() {
        return new rsaFragment();
    }
    private FragmentRsaBinding binding;
    private Button nextButton;
    private Button previousButton;

    private Log log;

    private int numberOfClick;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentRsaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        nextButton = binding.nextButton;
        previousButton = binding.previousButton;
        numberOfClick=1;

        nextButton.setVisibility(View.VISIBLE);
        previousButton.setVisibility(View.INVISIBLE);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOfClick++;
                log.d(TAG,"numberOfClick:" + numberOfClick );
                if(numberOfClick==1) {
                    nextButton.setVisibility(View.VISIBLE);
                    previousButton.setVisibility(View.INVISIBLE);
                    binding.rsaHeaderText.setText(R.string.rsa_header_1);
                    binding.rsaBodyText.setText(R.string.rsa1);
                    binding.displayPic.setImageResource(R.drawable.rsa1);

                }else if (numberOfClick==2){
                    nextButton.setVisibility(View.VISIBLE);
                    previousButton.setVisibility(View.VISIBLE);
                    binding.rsaHeaderText.setText(R.string.rsa_header_2);
                    binding.rsaBodyText.setText(R.string.rsa2);
                    binding.displayPic.setImageResource(R.drawable.rsa1);

                }else {
                    nextButton.setVisibility(View.INVISIBLE);
                    previousButton.setVisibility(View.VISIBLE);
                }

            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOfClick--;
                log.d(TAG,"numberOfClick:" + numberOfClick );
                if(numberOfClick==1) {
                    nextButton.setVisibility(View.VISIBLE);
                    previousButton.setVisibility(View.INVISIBLE);
                    binding.rsaHeaderText.setText(R.string.rsa_header_1);
                    binding.rsaBodyText.setText(R.string.rsa1);
                    binding.displayPic.setImageResource(R.drawable.rsa1);

                }else if (numberOfClick==2){
                    nextButton.setVisibility(View.VISIBLE);
                    previousButton.setVisibility(View.VISIBLE);
                    binding.rsaHeaderText.setText(R.string.rsa_header_2);
                    binding.rsaBodyText.setText(R.string.rsa2);
                    binding.displayPic.setImageResource(R.drawable.rsa1);

                }else {
                    nextButton.setVisibility(View.INVISIBLE);
                    previousButton.setVisibility(View.VISIBLE);
                }
            }
        });



//        return inflater.inflate(R.layout.fragment_rsa, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RsaViewModel.class);
        // TODO: Use the ViewModel
    }

}