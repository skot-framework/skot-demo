package tech.skot.demoios.screens.burger.burger_screen

import androidx.fragment.app.Fragment
import coil.load
import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKComponentView
import tech.skot.demoios.view.databinding.CatalogItemBinding
import tech.skot.view.extensions.setOnClick

class CatalogItemView(
  override val proxy: CatalogItemViewProxy,
  activity: SKActivity,
  fragment: Fragment?,
  binding: CatalogItemBinding
) : SKComponentView<CatalogItemBinding>(proxy, activity, fragment, binding), CatalogItemRAI {
  override fun onImageUrl(imageUrl: String) {
    binding.ivImage.load(imageUrl)
  }

  override fun onLabel(label: String) {
    binding.tvLabel.text = label
  }

  override fun onOnClickAdd(onClickAdd: Function0<Unit>) {
    binding.btnAdd.setOnClick(onClickAdd)
  }

  override fun onPrice(price: String) {
    binding.tvPrice.text = price
  }
}
