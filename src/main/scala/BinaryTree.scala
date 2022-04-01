package org.kich.practice

import scala.annotation.tailrec

object BinaryTree extends App {

  trait Tree[T] {
    def value: T

    def left: Option[Tree[T]]

    def right: Option[Tree[T]]

    def height: Int
  }

  class BinaryTree[A](nodeValue: A,
                      var leftNode: Option[BinaryTree[A]] = None,
                      var rightNode: Option[BinaryTree[A]] = None) extends Tree[A] {

    override def value: A = this.nodeValue

    override def left: Option[BinaryTree[A]] = this.leftNode

    override def right: Option[BinaryTree[A]] = this.rightNode



    override def height: Int = {
      def treeHeight(root: BinaryTree[A]): Int = {
        if (this.leftNode.isEmpty && root.rightNode.isEmpty) 0
        else {
          val lHeight = root.leftNode.map(treeHeight(_))
          val rHeight = root.rightNode.map(treeHeight(_))
          lHeight.getOrElse(0).max(rHeight.getOrElse(0)) + 1
        }
      }
      treeHeight(this)
    }


    def addLeftNode(nodeValue: A) = {
      this.leftNode = Some(BinaryTree(nodeValue))
    }

    def addRightNode(nodeValue: A) = {
      this.rightNode = Some(BinaryTree(nodeValue))
    }
  }

  object BinaryTree {
    def apply[A](value: A): BinaryTree[A] = {
      new BinaryTree[A](value, None, None)
    }
  }


  val tree5 = new BinaryTree[Int](5, leftNode = Some(new BinaryTree[Int](3, leftNode = Some(BinaryTree[Int](2)))))
  val tree9 = new BinaryTree[Int](9, Some(BinaryTree[Int](7)))

  val tree = new BinaryTree[Int](6, Some(tree5), Some(tree9))

  println(tree5.height)

}
