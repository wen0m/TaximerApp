package ru.taximer.taxiandroid.ui;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class SplashActivity$$PresentersBinder extends PresenterBinder<ru.taximer.taxiandroid.ui.SplashActivity> {
	public class presenterBinder extends PresenterField<ru.taximer.taxiandroid.ui.SplashActivity> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, ru.taximer.taxiandroid.presenters.SplashPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.SplashActivity target, MvpPresenter presenter) {
			target.presenter = (ru.taximer.taxiandroid.presenters.SplashPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.SplashActivity delegated) {
			return delegated.provideSplashPresenter();
		}
	}

	public List<PresenterField<ru.taximer.taxiandroid.ui.SplashActivity>> getPresenterFields() {
		List<PresenterField<ru.taximer.taxiandroid.ui.SplashActivity>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
