package com.example.grecards;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass. Activities that
 * contain this fragment must implement the
 * {@link BackCard.OnFragmentInteractionListener} interface to handle
 * interaction events. Use the {@link BackCard#newInstance} factory method to
 * create an instance of this fragment.
 * 
 */
public class BackCard extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_back_card, container, false);
	}

	public static FrontCard newInstance(String text) {

		FrontCard f = new FrontCard();
		
		return f;
	}
}
