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
    override val stack:StackViewProxy):ScreenViewProxy<MainViewImpl>(), MainView {


    override fun inflateAndLinkChildren(
        layoutInflater: LayoutInflater,
        activity: SKActivity,
        fragment: SKFragment?
    ): MainViewImpl {
        return MainViewImpl(activity, fragment, MainBinding.inflate(layoutInflater)).apply {
            inflateTabs(layoutInflater, tabs).forEach { (tabProxy, tabBinding) ->
                tabProxy.linkTo(TabViewImpl(activity, fragment, tabBinding),fragment?.viewLifecycleOwner ?: activity)
            }
            stack.linkTo(StackViewImpl(activity, fragment, binding.stack.id),fragment?.viewLifecycleOwner ?: activity)
        }
    }

    override fun linkTo(impl: MainViewImpl, lifeCycleOwner: LifecycleOwner) {

    }


}


class MainViewImpl(activity: SKActivity, fragment: SKFragment?, binding: MainBinding):ScreenViewImpl<MainBinding>(activity, fragment, binding) {
        fun inflateTabs(layoutInflater: LayoutInflater, tabs:List<TabViewProxy>):List<Pair<TabViewProxy, TabBinding>>{
            binding.tabs.removeAllViews()
            return tabs.map {
                val bind = TabBinding.inflate(layoutInflater)
                bind.root.apply {
                    layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT,1f)
                }
                binding.tabs.addView(bind.root)
                Pair(it, bind)
            }
        }
}