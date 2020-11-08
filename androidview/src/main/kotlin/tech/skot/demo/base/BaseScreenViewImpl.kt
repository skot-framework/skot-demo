// //### First generated by SKot but then you can (have to) edit, the main constructor only will modifyed by generator if needed
package tech.skot.demo.base

import androidx.viewbinding.ViewBinding
import tech.skot.demo.android.BaseActivity
import tech.skot.demo.android.BaseFragment
import tech.skot.demo.androidview.R
import kotlin.reflect.KClass

abstract class BaseScreenViewImpl<A : BaseActivity, F : BaseFragment, B : ViewBinding> :
    BaseScreenViewImplGen<A, F, B>()
 {
    override fun getActivityClass(): KClass<out BaseActivity> = BaseActivity::class

    override fun createFragment() = BaseFragment()

    override fun getBottomSheetStyle() = R.style.BottomSheetDialog

}