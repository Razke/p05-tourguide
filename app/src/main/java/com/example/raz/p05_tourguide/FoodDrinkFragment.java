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
        locations.add(new Location("Rausch Schokoladenhaus", getString(R.string.food_drink_schokoladenhaus_desc), R.drawable.image_food_drink_schokoladenhaus));
        locations.add(new Location("Marjellchen", getString(R.string.food_drink_marjellchen_desc), R.drawable.image_food_drink_marjellchen));
        locations.add(new Location("L'Osteria", getString(R.string.food_drink_losteria_desc), R.drawable.image_food_drink_losteria));
        locations.add(new Location("Jolly", getString(R.string.food_drink_jolly_desc), R.drawable.image_food_drink_jolly));
        locations.add(new Location("Ristorante a Mano", getString(R.string.food_drink_ristoranteamano_desc), R.drawable.image_food_drink_ristoranteamano));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}