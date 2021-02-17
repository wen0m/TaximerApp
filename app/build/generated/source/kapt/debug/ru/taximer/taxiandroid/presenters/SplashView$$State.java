package ru.taximer.taxiandroid.presenters;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class SplashView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.SplashView> implements ru.taximer.taxiandroid.presenters.SplashView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.SplashView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.SplashView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.SplashView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void goToMainScreen() {
		GoToMainScreenCommand goToMainScreenCommand = new GoToMainScreenCommand();
		mViewCommands.beforeApply(goToMainScreenCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SplashView view : mViews) {
			getCurrentState(view).add(goToMainScreenCommand);
			view.goToMainScreen();
		}

		mViewCommands.afterApply(goToMainScreenCommand);
	}

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SplashView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.SplashView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.SplashView view : mViews) {
			getCurrentState(view).add(showErrorCommand);
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}


	public class GoToMainScreenCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SplashView> {
		GoToMainScreenCommand() {
			super("goToMainScreen", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SplashView mvpView) {
			mvpView.goToMainScreen();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SplashView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SplashView mvpView) {
			mvpView.showLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class HideLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SplashView> {
		HideLoadingCommand() {
			super("hideLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SplashView mvpView) {
			mvpView.hideLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowErrorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SplashView> {
		public final java.lang.String message;

		ShowErrorCommand(@org.jetbrains.annotations.NotNull java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SplashView mvpView) {
			mvpView.showError(message);
			getCurrentState(mvpView).add(this);
		}
	}
}
