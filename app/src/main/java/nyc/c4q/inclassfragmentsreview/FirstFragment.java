package nyc.c4q.inclassfragmentsreview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    View rootView;
    EditText editText;
    Button button;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_first, container, false);
        editText = (EditText) rootView.findViewById(R.id.first_fragment_editText);
        button = (Button) rootView.findViewById(R.id.first_fragment_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Bundle bundle = new Bundle();
                bundle.putString("getEditText", editText.getText().toString());
                secondFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_fragment_container_framelayout, secondFragment);
                fragmentTransaction.addToBackStack("next");
                fragmentTransaction.commit();

            }
        });
        return rootView;
    }

}
