package pers.example.xiayong.rxjavasamples.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pers.example.xiayong.rxjavasamples.R;

/**
 * 以实例说明各种常见操作符的含义,列举常见的使用场景
 */
public class OperatorsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item2, container, false);

        return view;
    }
}
