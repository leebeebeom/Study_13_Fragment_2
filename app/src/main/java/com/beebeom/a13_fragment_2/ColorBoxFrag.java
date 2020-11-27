package com.beebeom.a13_fragment_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ColorBoxFrag extends Fragment {
    int mColor = 0;
    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = LayoutInflater.from(getActivity()).inflate(R.layout.colorbox_frag, container, false);

        //이것도 없으면 실행 안됨.
        mView.setBackgroundColor(mColor);
        return mView;
    }

    public void setColor(int color) {
        mColor = color;
        //눌 체크 없으면 NPE 뜨고 실행 안됨.
        //왜 그런지는 모르겠음;
        //뇌피셜로는
        //눌체크 없이 mView 를 참조하려고 하면 아직 onCreateView 가 생성되지 않은 시점이라서 안되고,
        //눌체크를 하는 시점에 onCreateView 가 호출되어서 그런게 아닐까 싶음
        if (mView != null) {
            mView.setBackgroundColor(mColor);
        }
    }
}
