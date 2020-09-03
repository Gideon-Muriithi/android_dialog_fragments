package com.example.myfragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import java.util.Objects;

public class MoodDialogFragment extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);
        Objects.requireNonNull(getDialog()).setTitle("Simple Dialog");

        Button submitButton = rootView.findViewById(R.id.submitButton);
        Button cancelButton = rootView.findViewById(R.id.cancelButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup surveyRadioGroup = rootView.findViewById(R.id.moodRadioGroup);
                int selectedId = surveyRadioGroup.getCheckedRadioButtonId();
                final RadioButton selectedRadioButton = rootView.findViewById(selectedId);

//              Toast.makeText(MoodDialogFragment.this, selectedRadioButton.getText().toString(), Toast.LENGTH_LONG).show();
                Log.d("testing", selectedRadioButton.getText().toString());
                dismiss();

            }
        });

        return rootView;

    }

}
