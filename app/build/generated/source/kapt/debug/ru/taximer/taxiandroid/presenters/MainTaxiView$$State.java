package ru.taximer.taxiandroid.presenters;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class MainTaxiView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.MainTaxiView> implements ru.taximer.taxiandroid.presenters.MainTaxiView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.MainTaxiView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.MainTaxiView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void setStart(@org.jetbrains.annotations.Nullable ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
		SetStartCommand setStartCommand = new SetStartCommand(location);
		mViewCommands.beforeApply(setStartCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(setStartCommand);
			view.setStart(location);
		}

		mViewCommands.afterApply(setStartCommand);
	}

	@Override
	public  void setEnd(@org.jetbrains.annotations.Nullable ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
		SetEndCommand setEndCommand = new SetEndCommand(location);
		mViewCommands.beforeApply(setEndCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(setEndCommand);
			view.setEnd(location);
		}

		mViewCommands.afterApply(setEndCommand);
	}

	@Override
	public  void setEditState( boolean isStartEdit,  boolean isBothLocationContaints, @org.jetbrains.annotations.Nullable com.google.android.gms.maps.model.LatLng position) {
		SetEditStateCommand setEditStateCommand = new SetEditStateCommand(isStartEdit, isBothLocationContaints, position);
		mViewCommands.beforeApply(setEditStateCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(setEditStateCommand);
			view.setEditState(isStartEdit, isBothLocationContaints, position);
		}

		mViewCommands.afterApply(setEditStateCommand);
	}

	@Override
	public  void startSearch(@org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.PlaceLocationModel end) {
		StartSearchCommand startSearchCommand = new StartSearchCommand(start, end);
		mViewCommands.beforeApply(startSearchCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(startSearchCommand);
			view.startSearch(start, end);
		}

		mViewCommands.afterApply(startSearchCommand);
	}

	@Override
	public  void setBeginState(@org.jetbrains.annotations.Nullable ru.taximer.taxiandroid.network.models.PlaceLocationModel pos) {
		SetBeginStateCommand setBeginStateCommand = new SetBeginStateCommand(pos);
		mViewCommands.beforeApply(setBeginStateCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(setBeginStateCommand);
			view.setBeginState(pos);
		}

		mViewCommands.afterApply(setBeginStateCommand);
	}

	@Override
	public  void setManualSelectionState( boolean isStart, @org.jetbrains.annotations.Nullable com.google.android.gms.maps.model.LatLng position) {
		SetManualSelectionStateCommand setManualSelectionStateCommand = new SetManualSelectionStateCommand(isStart, position);
		mViewCommands.beforeApply(setManualSelectionStateCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(setManualSelectionStateCommand);
			view.setManualSelectionState(isStart, position);
		}

		mViewCommands.afterApply(setManualSelectionStateCommand);
	}

	@Override
	public  void setReadyState() {
		SetReadyStateCommand setReadyStateCommand = new SetReadyStateCommand();
		mViewCommands.beforeApply(setReadyStateCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(setReadyStateCommand);
			view.setReadyState();
		}

		mViewCommands.afterApply(setReadyStateCommand);
	}

	@Override
	public  void setManual() {
		SetManualCommand setManualCommand = new SetManualCommand();
		mViewCommands.beforeApply(setManualCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.MainTaxiView view : mViews) {
			getCurrentState(view).add(setManualCommand);
			view.setManual();
		}

		mViewCommands.afterApply(setManualCommand);
	}


	public class SetStartCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		public final ru.taximer.taxiandroid.network.models.PlaceLocationModel location;

		SetStartCommand(@org.jetbrains.annotations.Nullable ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
			super("setStart", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.location = location;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.setStart(location);
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetEndCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		public final ru.taximer.taxiandroid.network.models.PlaceLocationModel location;

		SetEndCommand(@org.jetbrains.annotations.Nullable ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
			super("setEnd", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.location = location;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.setEnd(location);
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetEditStateCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		public final boolean isStartEdit;
		public final boolean isBothLocationContaints;
		public final com.google.android.gms.maps.model.LatLng position;

		SetEditStateCommand( boolean isStartEdit,  boolean isBothLocationContaints, @org.jetbrains.annotations.Nullable com.google.android.gms.maps.model.LatLng position) {
			super("setEditState", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.isStartEdit = isStartEdit;
			this.isBothLocationContaints = isBothLocationContaints;
			this.position = position;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.setEditState(isStartEdit, isBothLocationContaints, position);
			getCurrentState(mvpView).add(this);
		}
	}

	public class StartSearchCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		public final ru.taximer.taxiandroid.network.models.PlaceLocationModel start;
		public final ru.taximer.taxiandroid.network.models.PlaceLocationModel end;

		StartSearchCommand(@org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.PlaceLocationModel end) {
			super("startSearch", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.start = start;
			this.end = end;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.startSearch(start, end);
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetBeginStateCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		public final ru.taximer.taxiandroid.network.models.PlaceLocationModel pos;

		SetBeginStateCommand(@org.jetbrains.annotations.Nullable ru.taximer.taxiandroid.network.models.PlaceLocationModel pos) {
			super("setBeginState", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.pos = pos;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.setBeginState(pos);
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetManualSelectionStateCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		public final boolean isStart;
		public final com.google.android.gms.maps.model.LatLng position;

		SetManualSelectionStateCommand( boolean isStart, @org.jetbrains.annotations.Nullable com.google.android.gms.maps.model.LatLng position) {
			super("setManualSelectionState", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.isStart = isStart;
			this.position = position;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.setManualSelectionState(isStart, position);
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetReadyStateCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		SetReadyStateCommand() {
			super("setReadyState", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.setReadyState();
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetManualCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.MainTaxiView> {
		SetManualCommand() {
			super("setManual", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.MainTaxiView mvpView) {
			mvpView.setManual();
			getCurrentState(mvpView).add(this);
		}
	}
}
