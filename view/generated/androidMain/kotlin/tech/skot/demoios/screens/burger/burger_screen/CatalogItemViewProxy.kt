package tech.skot.demoios.screens.burger.burger_screen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKComponentViewProxy
import tech.skot.demoios.view.R
import tech.skot.demoios.view.databinding.CatalogItemBinding
import kotlin.Boolean
import kotlin.Function0
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CatalogItemViewProxy(
    override val imageUrl: String,
    override val label: String,
    override val onClickAdd: Function0<Unit>,
    override val price: String
) : SKComponentViewProxy<CatalogItemBinding>(), CatalogItemVC {
    override val layoutId: Int = R.layout.catalog_item

    override fun saveState() {
    }

    override fun bindingOf(view: View): CatalogItemBinding = CatalogItemBinding.bind(view)

    override fun inflate(
        layoutInflater: LayoutInflater,
        parent: ViewGroup?,
        attachToParent: Boolean
    ): CatalogItemBinding = CatalogItemBinding.inflate(layoutInflater, parent, attachToParent)
    override fun bindTo(
        activity: SKActivity,
        fragment: Fragment?,
        binding: CatalogItemBinding,
        collectingObservers: Boolean
    ): CatalogItemView = CatalogItemView(this, activity, fragment, binding).apply {
        collectObservers = collectingObservers
        onImageUrl(imageUrl)
        onLabel(label)
        onOnClickAdd(onClickAdd)
        onPrice(price)
    }
}

interface CatalogItemRAI {
    fun onImageUrl(imageUrl: String)

    fun onLabel(label: String)

    fun onOnClickAdd(onClickAdd: Function0<Unit>)

    fun onPrice(price: String)
}
