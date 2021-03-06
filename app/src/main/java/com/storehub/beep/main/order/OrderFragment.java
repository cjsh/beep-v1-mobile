package com.storehub.beep.main.order;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.storehub.beep.R;
import com.storehub.beep.databinding.OrderFragmentBinding;
import com.storehub.beep.util.StatusBarUtil;
import com.storehub.beepcore.base.BaseNoModelFragment;

public class OrderFragment extends BaseNoModelFragment<OrderFragmentBinding> {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initState();
    }

    @Override
    protected int onCreate() {
        return R.layout.order_fragment;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    /**
     * 动态的设置状态栏  实现沉浸式状态栏
     */
    private void initState() {
        dataBinding.mBarLl.setVisibility(View.VISIBLE);
        //获取到状态栏的高度
        int statusHeight = StatusBarUtil.getStatusBarHeight(getActivity());
        //动态的设置隐藏布局的高度
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) dataBinding.mBarLl.getLayoutParams();
        params.height = statusHeight;
        dataBinding.mBarLl.setLayoutParams(params);
    }
}
