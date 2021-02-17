package ru.taximer.taxiandroid.presenters;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class AutocompleteView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.AutocompleteView> implements ru.taximer.taxiandroid.presenters.AutocompleteView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.AutocompleteView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.AutocompleteView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.AutocompleteView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void showPredictions(@org.jetbrains.annotations.NotNull java.lang.String word, @org.jetbrains.annotations.NotNull com.google.android.gms.maps.model.LatLng point) {
		ShowPredictionsCommand showPredictionsCommand = new ShowPredictionsCommand(word, point);
		mViewCommands.beforeApply(showPredictionsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.AutocompleteView view : mViews) {
			getCurrentState(view).add(showPredictionsCommand);
			view.showPredictions(word, point);
		}

		mViewCommands.afterApply(showPredictionsCommand);
	}

	@Override
	public  void showHistory(@org.jetbrains.annotations.NotNull java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> history) {
		ShowHistoryCommand showHistoryCommand = new ShowHistoryCommand(history);
		mViewCommands.beforeApply(showHistoryCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.AutocompleteView view : mViews) {
			getCurrentState(view).add(showHistoryCommand);
			view.showHistory(history);
		}

		mViewCommands.afterApply(showHistoryCommand);
	}

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.AutocompleteView view : mViews) {
			getCurrentState(view).add(showLoadingCommand);
			view.showLoading();
		}

		mViewCommands.afterApply(showLoadingCommand);
	}

	@Override
	public  void hideLoading() {
		HideLoadingCommand hideLoadingCommand = new HideLoadingCommand();
		mViewCommands.beforeApply(hideLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.AutocompleteView view : mViews) {
			getCurrentState(view).add(hideLoadingCommand);
			view.hideLoading();
		}

		mViewCommands.afterApply(hideLoadingCommand);
	}

	@Override
	public  void showError(@org.jetbrains.annotations.NotNull java.lang.String message) {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand(message);
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.AutocompleteView view : mViews) {
			getCurrentState(view).add(showErrorCommand);
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}


	public class ShowPredictionsCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.AutocompleteView> {
		public final java.lang.String word;
		public final com.google.android.gms.maps.model.LatLng point;

		ShowPredictionsCommand(@org.jetbrains.annotations.NotNull java.lang.String word, @org.jetbrains.annotations.NotNull com.google.android.gms.maps.model.LatLng point) {
			super("showPredictions", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.word = word;
			this.point = point;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.AutocompleteView mvpView) {
			mvpView.showPredictions(word, point);
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowHistoryCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.AutocompleteView> {
		public final java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> history;

		ShowHistoryCommand(@org.jetbrains.annotations.NotNull java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> history) {
			super("showHistory", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.history = history;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.AutocompleteView mvpView) {
			mvpView.showHistory(history);
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.AutocompleteView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.AutocompleteView mvpView) {
			mvpView.showLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class HideLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.AutocompleteView> {
		HideLoadingCommand() {
			super("hideLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.AutocompleteView mvpView) {
			mvpView.hideLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowErrorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.AutocompleteView> {
		public final java.lang.String message;

		ShowErrorCommand(@org.jetbrains.annotations.NotNull java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.AutocompleteView mvpView) {
			mvpView.showError(message);
			getCurrentState(mvpView).add(this);
		}
	}
}
