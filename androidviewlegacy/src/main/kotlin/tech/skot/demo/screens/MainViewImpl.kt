package tech.skot.demo.screens

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.MainBinding
import tech.skot.demo.androidviewlegacy.databinding.TabBinding
import tech.skot.demo.components.*
import tech.skot.view.legacy.*

class MainViewProxy(
    override val tabs:List<TabViewProxy>,
    override val stack:StackViewProxy):ScreenViewProxy<MainBinding>(), MainView {


    override fun inflate(layoutInflater: LayoutInflater) = MainBinding.inflate(layoutInflater)



    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: MainBinding
    ):MainViewImpl {

        //Tabs
        tabs.forEach {
            val tabBinding = TabBinding.inflate(layoutInflater)
            tabBinding.root.layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT,1f)
            binding.tabs.addView(tabBinding.root)
            it.bindTo(activity, fragment, layoutInflater, tabBinding)
        }

        stack.bindTo(activity, fragment, layoutInflater, binding.stack.id)

        return MainViewImpl(activity, fragment, binding)
    }


}


class MainViewImpl(activity: SKActivity, fragment: SKFragment?, binding: MainBinding):ScreenViewImpl<MainBinding>(activity, fragment, binding) {
}