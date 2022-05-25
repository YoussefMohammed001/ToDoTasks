package com.example.todotasks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.todotasks.databinding.AddTaskBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AddTask extends BottomSheetDialogFragment {
    public static final String TAG = "AddTask";
    AddTaskBinding binding;


public  static AddTask newInstance(){
    return new AddTask();
}

@Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    binding = DataBindingUtil.inflate(inflater,R.layout.add_task,container,false);
    return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

  binding.buttonAddNewTask.setOnClickListener(view1 -> saveTask());
    }

    private void saveTask() {

    final String title = binding.editTextAddNewTask.getText().toString();
    if (title.isEmpty()){
        Toast.makeText(getContext(), "enter Your Task", Toast.LENGTH_SHORT).show();
        return;
    }

        final String description = binding.editTextAddNewTaskDesc.getText().toString();
        if (description.isEmpty()){
            Toast.makeText(getContext(), "enter Description For Your Task", Toast.LENGTH_SHORT).show();
            return;
        }




    }
}