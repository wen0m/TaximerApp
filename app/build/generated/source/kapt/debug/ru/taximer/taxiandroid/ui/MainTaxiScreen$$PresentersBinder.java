package ru.taximer.taxiandroid.ui;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MainTaxiScreen$$PresentersBinder extends PresenterBinder<ru.taximer.taxiandroid.ui.MainTaxiScreen> {
	public class presenterBinder extends PresenterField<ru.taximer.taxiandroid.ui.MainTaxiScreen> {
		public presenterBinder() {
			super("presenter", PresenterType.GLOBAL, null, ru.taximer.taxiandroid.presenters.MainTaxiPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.MainTaxiScreen target, MvpPresenter presenter) {
			target.presenter = (ru.taximer.taxiandroid.presenters.MainTaxiPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.MainTaxiScreen delegated) {
			return delegated.provideMainTaxiPresenter();
		}
	}

	public class userSettingsPresenterBinder extends PresenterField<ru.taximer.taxiandroid.ui.MainTaxiScreen> {
		public userSettingsPresenterBinder() {
			super("userSettingsPresenter", PresenterType.LOCAL, null, ru.taximer.taxiandroid.presenters.UserSettingsPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.MainTaxiScreen target, MvpPresenter presenter) {
			target.userSettingsPresenter = (ru.taximer.taxiandroid.presenters.UserSettingsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.MainTaxiScreen delegated) {
			return delegated.provideUserSettingsPresenter();
		}
	}

	public List<PresenterField<ru.taximer.taxiandroid.ui.MainTaxiScreen>> getPresenterFields() {
		List<PresenterField<ru.taximer.taxiandroid.ui.MainTaxiScreen>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());
		presenters.add(new userSettingsPresenterBinder());

		return presenters;
	}

}
