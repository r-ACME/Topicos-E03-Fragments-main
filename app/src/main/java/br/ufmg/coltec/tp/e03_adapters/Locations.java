package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Locations#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Locations extends Fragment {

    public Locations(){
        super(R.layout.fragment_locations);

    }

    public void updatePlace(Place place){

        TextView txtNome = this.getView().findViewById(R.id.txt_place_name);
        txtNome.setText(place.getName());

        TextView txtDescription = this.getView().findViewById(R.id.txt_place_description);
        txtDescription.setText(place.getDescription());

        TextView txtDistance = this.getView().findViewById(R.id.txt_place_distance);
        txtDistance.setText(place.getDistance().toString());

        ImageView imgPhoto = this.getView().findViewById(R.id.img_place_photo);
        imgPhoto.setImageResource(place.getPhotoId());

        RatingBar rbGrade = this.getView().findViewById(R.id.rb_place_grade);
        rbGrade.setRating(place.getRate());
    }




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Locations.
     */
    // TODO: Rename and change types and number of parameters
    public static Locations newInstance(String param1, String param2) {
        Locations fragment = new Locations();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_locations, container, false);
    }
}