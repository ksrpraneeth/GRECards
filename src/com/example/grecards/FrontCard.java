package com.example.grecards;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FrontCard extends Fragment implements OnClickListener {
	LinearLayout frontCard;
	LinearLayout backCard;
	Button revealAnswer;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_front_card, container,
				false);
		frontCard = (LinearLayout) v.findViewById(R.id.shadowFront);
		backCard = (LinearLayout) v.findViewById(R.id.shadowback);
		revealAnswer = (Button) v.findViewById(R.id.revealAnswer);
		TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
		revealAnswer.setOnClickListener(this);
		backCard.setVisibility(View.GONE);
		frontCard.setVisibility(View.VISIBLE);
		return v;
	}

	public static FrontCard newInstance(String text) {

		FrontCard f = new FrontCard();

		return f;
	}

	public void Rotate(View v) {
		ObjectAnimator anim = (ObjectAnimator) AnimatorInflater.loadAnimator(
				getActivity(), R.drawable.flip);
		anim.setTarget(frontCard);
		anim.setDuration(500);
		anim.addListener(new AnimatorListener() {

			@Override
			public void onAnimationStart(Animator animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationRepeat(Animator animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationEnd(Animator animation) {
				// TODO Auto-generated method stub
				frontCard.setVisibility(View.GONE);
				backCard.setVisibility(View.VISIBLE);
			}

			@Override
			public void onAnimationCancel(Animator animation) {
				// TODO Auto-generated method stub

			}
		});
		anim.start();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Rotate(v);
	}
}