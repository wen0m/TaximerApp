package ru.taximer.taxiandroid.ui;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class SettingsActivity$$PresentersBinder extends PresenterBinder<ru.taximer.taxiandroid.ui.SettingsActivity> {
	public class presenterBinder extends PresenterField<ru.taximer.taxiandroid.ui.SettingsActivity> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, ru.taximer.taxiandroid.presenters.SettingsPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.SettingsActivity target, MvpPresenter presenter) {
			target.presenter = (ru.taximer.taxiandroid.presenters.SettingsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.SettingsActivity delegated) {
			return delegated.provideSettingsPresenter();
		}
	}

	public List<PresenterField<ru.taximer.taxiandroid.ui.SettingsActivity>> getPresenterFields() {
		List<PresenterField<ru.taximer.taxiandroid.ui.SettingsActivity>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());

		return presenters;
	}

}
