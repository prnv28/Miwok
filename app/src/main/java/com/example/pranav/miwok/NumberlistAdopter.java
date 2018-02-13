package com.example.pranav.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pranav on 2/13/2018.
 */

class NumberlistAdopter extends ArrayAdapter<Numberlist> {

   // private static final String LOG_TAG = NumberlistAdopter.class.getSimpleName();

    /**
     * This is our own custom constructor
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     * @param context        The current context. Used to inflate the layout file.
     * @param numberlists A List of AndroidFlavor objects to display in a list
     */
    public NumberlistAdopter(Activity context, ArrayList<Numberlist> numberlists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, numberlists);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.root_layout, parent, false);
        }

        // Get the object located at this position in the list
        Numberlist currentword = getItem(position);

        // Find the TextView in the root_layout.xml layout with the ID miwok
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok);
        // Get the Miwok word from the current Numberlist object and
        // set this text on the name TextView
        nameTextView.setText(currentword.getMiwok());

        // Find the TextView in the root_layout.xml layout with the ID english
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english);
        // Get the english word from the current Numberlist object and
        // set this text on the number TextView
        numberTextView.setText(currentword.getEnglish());

        // Find the ImageView in the root_layout.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.item_icon);
        // Get the image resource ID from the current Numberlist object and
        // set the image to iconView
        iconView.setImageResource(currentword.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
