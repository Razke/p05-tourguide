package com.example.raz.p05_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.shopping_title_grafton), getString(R.string.shopping_grafton_descr), R.drawable.ic_shopping));
        locations.add(new Location(getString(R.string.shopping_title_arcade), getString(R.string.shopping_arcade_descr), R.drawable.ic_shopping));
        locations.add(new Location(getString(R.string.shopping_title_lionyard), getString(R.string.shopping_lionyard_descr), R.drawable.ic_shopping));
        locations.add(new Location(getString(R.string.shopping_title_bookshop), getString(R.string.shopping_bookshop_descr), R.drawable.ic_shopping));
        locations.add(new Location(getString(R.string.shopping_title_tattooing), getString(R.string.shopping_tattooing_descr), R.drawable.ic_shopping));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}