package org.kich.practice

object YoppWorks extends App {

  case class CatalogItem(name:String)
  case class Price(price:Int)
  case class Quantity(quantity: Int)
  case class CartItem(item: CatalogItem, quantity: Quantity)
  case class BundleTotalPriceDiscount(item:Seq[CartItem], totalPrice:Price)

}
