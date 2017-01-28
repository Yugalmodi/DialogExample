package com.techpalle.dialogexample;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyCustomDialogFragment extends DialogFragment {


    public MyCustomDialogFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d =null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("Gmail");
        View v = getActivity().getLayoutInflater().inflate(R.layout.cutom_dialog, null);
        final EditText et1 = (EditText) v.findViewById(R.id.edit_text_id);
        final EditText et2 = (EditText) v.findViewById(R.id.edit_text_pwd);
        CheckBox cb = (CheckBox) v.findViewById(R.id.check_box);
        builder.setView(v);
        builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "User Name : "+et1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Logout", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "User Password : "+et2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        d = builder.create();
        return d;
    }
}
