package ru.taximer.taxiandroid.presenters.base;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class BaseLoadingView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.base.BaseLoadingView> implements ru.taximer.taxiandroid.presenters.base.BaseLoadingView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.base.BaseLoadingView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.base.BaseLoadingView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.base.BaseLoadingView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.base.BaseLoadingView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.base.BaseLoadingView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.base.BaseLoadingView view : mViews) {
			getCurrentState(view).add(showErrorCommand);
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}


	public class ShowLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.base.BaseLoadingView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.base.BaseLoadingView mvpView) {
			mvpView.showLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class HideLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.base.BaseLoadingView> {
		HideLoadingCommand() {
			super("hideLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.base.BaseLoadingView mvpView) {
			mvpView.hideLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowErrorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.base.BaseLoadingView> {
		public final java.lang.String message;

		ShowErrorCommand(@org.jetbrains.annotations.NotNull java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.base.BaseLoadingView mvpView) {
			mvpView.showError(message);
			getCurrentState(mvpView).add(this);
		}
	}
}
