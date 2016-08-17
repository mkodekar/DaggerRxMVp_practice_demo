package com.e_magicindia.daggerrxpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import com.e_magicindia.daggerrxpractice.adapters.RecyclerViewAdapter;
import com.e_magicindia.daggerrxpractice.application.ExampleApplication;
import com.e_magicindia.daggerrxpractice.base.ExamplePresenter;
import com.e_magicindia.daggerrxpractice.model.Example;
import com.e_magicindia.daggerrxpractice.service.ExampleService;
import com.e_magicindia.daggerrxpractice.service.ExampleViewInterface;
import com.emagicindia.library.SweetAlertDialogBox;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;

/**
 * Created by mkodekar on 8/17/2016.
 */

public class MainActivity extends AppCompatActivity implements ExampleViewInterface {

    @Inject
    ExampleService exampleService;
    private ExamplePresenter examplePresenter;

    RecyclerView recyclerView;

    SweetAlertDialogBox sweetAlertDialogBox;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resolveDependency();
        ((ExampleApplication)getApplicationContext()).getApiComponent().inject(MainActivity.this);
        recyclerViewAdapter =  new RecyclerViewAdapter(getLayoutInflater(), MainActivity.this);
        sweetAlertDialogBox = new SweetAlertDialogBox(MainActivity.this, SweetAlertDialogBox.PROGRESS_TYPE);
        examplePresenter = new ExamplePresenter(MainActivity.this);
        examplePresenter.onCreate();
        setUpView();

    }

    private void resolveDependency() {
        ((ExampleApplication) getApplication())
                .getApiComponent()
                .inject(MainActivity.this);
    }

    public void setUpView()  {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    protected void onResume() {
        super.onResume();
        examplePresenter.onResume();
        examplePresenter.fetchExample();
        sweetAlertDialogBox.setTitleText("Downloading")
                .setContentText("Please wait")
                .show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        examplePresenter.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        examplePresenter.onDestroy();
    }

    @Override
    public void onCompleted() {
        sweetAlertDialogBox.dismiss();
    }

    @Override
    public void onError(String message) {
        sweetAlertDialogBox.dismiss();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onExample(ArrayList<Example> examples) {
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.setExamples(examples);

    }

    @Override
    public Observable<ArrayList<Example>> getExamples() {
        return exampleService.getItems();
    }
}
