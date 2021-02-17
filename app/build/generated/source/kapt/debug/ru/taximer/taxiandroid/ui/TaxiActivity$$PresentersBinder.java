package ru.taximer.taxiandroid.ui;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class TaxiActivity$$PresentersBinder extends PresenterBinder<ru.taximer.taxiandroid.ui.TaxiActivity> {
	public class presenterBinder extends PresenterField<ru.taximer.taxiandroid.ui.TaxiActivity> {
		public presenterBinder() {
			super("presenter", PresenterType.LOCAL, null, ru.taximer.taxiandroid.presenters.TaxoparkPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.TaxiActivity target, MvpPresenter presenter) {
			target.presenter = (ru.taximer.taxiandroid.presenters.TaxoparkPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.TaxiActivity delegated) {
			return delegated.provideTaxoparkPresenter();
		}
	}

	public class presenterTaxiBinder extends PresenterField<ru.taximer.taxiandroid.ui.TaxiActivity> {
		public presenterTaxiBinder() {
			super("presenterTaxi", PresenterType.LOCAL, null, ru.taximer.taxiandroid.presenters.GetTaxiPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.TaxiActivity target, MvpPresenter presenter) {
			target.presenterTaxi = (ru.taximer.taxiandroid.presenters.GetTaxiPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.TaxiActivity delegated) {
			return delegated.provideGetTaxiPresenter();
		}
	}

	public class presenterBestTaxiBinder extends PresenterField<ru.taximer.taxiandroid.ui.TaxiActivity> {
		public presenterBestTaxiBinder() {
			super("presenterBestTaxi", PresenterType.LOCAL, null, ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter.class);
		}

		@Override
		public void bind(ru.taximer.taxiandroid.ui.TaxiActivity target, MvpPresenter presenter) {
			target.presenterBestTaxi = (ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ru.taximer.taxiandroid.ui.TaxiActivity delegated) {
			return delegated.provideGetBestPresenter();
		}
	}

	public List<PresenterField<ru.taximer.taxiandroid.ui.TaxiActivity>> getPresenterFields() {
		List<PresenterField<ru.taximer.taxiandroid.ui.TaxiActivity>> presenters = new ArrayList<>();

		presenters.add(new presenterBinder());
		presenters.add(new presenterTaxiBinder());
		presenters.add(new presenterBestTaxiBinder());

		return presenters;
	}

}
