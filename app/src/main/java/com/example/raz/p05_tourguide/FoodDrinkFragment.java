package com.example.raz.p05_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodDrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.food_drink_title_signorelli), getString(R.string.food_drink_signorelli_descr), R.drawable.ic_fooddrink));
        locations.add(new Location(getString(R.string.food_drink_title_ilpiccolomondo), getString(R.string.food_drink_ilpiccolomondo_descr), R.drawable.ic_fooddrink));
        locations.add(new Location(getString(R.string.food_drink_title_trinity), getString(R.string.food_drink_trinity_descr), R.drawable.ic_fooddrink));
        locations.add(new Location(getString(R.string.food_drink_title_breadmeat), getString(R.string.food_drink_breadmeat_descr), R.drawable.ic_fooddrink));
        locations.add(new Location(getString(R.string.food_drink_title_africfood), getString(R.string.food_drink_africfood_descr), R.drawable.ic_fooddrink));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}