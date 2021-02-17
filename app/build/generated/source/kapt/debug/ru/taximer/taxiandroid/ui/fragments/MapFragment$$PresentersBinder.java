package ru.taximer.taxiandroid.ui.fragments;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MapFragment$$PresentersBinder extends PresenterBinder<ru.taximer.taxiandroid.ui.fragments.MapFragment> {
	public class presenterBinder extends PresenterField<ru.taximer.taxiandroid.ui.fragments.MapFragment> {
		public presenterBinder() {
			super("presenter", PresenterType.GLOBAL, null, ru.taximer.taxiandroid.presenters.MainTaxiPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.fragments.MapFragment target, MvpPresenter presenter) {
			target.presenter = (ru.taximer.taxiandroid.presenters.MainTaxiPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.fragments.MapFragment delegated) {
			return delegated.provideMainTaxiPresenter();
		}
	}

	public List<PresenterField<ru.taximer.taxiandroid.ui.fragments.MapFragment>> getPresenterFields() {
		List<PresenterField<ru.taximer.taxiandroid.ui.fragments.MapFragment>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
