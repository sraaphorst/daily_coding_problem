// TestDay112.scala
//
// By Sebastian Raaphorst, 2019.

package dcp.day112

import org.scalatest.FunSuite

class TestDay112 extends FunSuite {
  test("Day112: BinaryTree LCA") {
    // Create the tree.
    val nodes = (0 to 9).map(new BinaryTree[Int](_))
    nodes(0).setLeft(nodes(1))
    nodes(0).setRight(nodes(2))
    nodes(1).setLeft(nodes(3))
    nodes(3).setRight(nodes(6))
    nodes(2).setLeft(nodes(4))
    nodes(2).setRight(nodes(5))
    nodes(4).setLeft(nodes(7))
    nodes(4).setRight(nodes(8))
    nodes(5).setRight(nodes(9))

    // Now create a map of pairs of nodes to the LCA.
    val lcas = Map[(Int, Int), Int](
      (0, 0) -> 0,
      (0, 1) -> 0,
      (0, 2) -> 0,
      (0, 3) -> 0,
      (0, 4) -> 0,
      (0, 5) -> 0,
      (0, 6) -> 0,
      (0, 7) -> 0,
      (0, 8) -> 0,
      (0, 9) -> 0,

      (1, 0) -> 0,
      (1, 1) -> 1,
      (1, 2) -> 0,
      (1, 3) -> 1,
      (1, 4) -> 0,
      (1, 5) -> 0,
      (1, 6) -> 1,
      (1, 7) -> 0,
      (1, 8) -> 0,
      (1, 9) -> 0,

      (2, 0) -> 0,
      (2, 1) -> 0,
      (2, 2) -> 2,
      (2, 3) -> 0,
      (2, 4) -> 2,
      (2, 5) -> 2,
      (2, 6) -> 0,
      (2, 7) -> 2,
      (2, 8) -> 2,
      (2, 9) -> 2,

      (3, 0) -> 0,
      (3, 1) -> 1,
      (3, 2) -> 0,
      (3, 3) -> 3,
      (3, 4) -> 0,
      (3, 5) -> 0,
      (3, 6) -> 3,
      (3, 7) -> 0,
      (3, 8) -> 0,
      (3, 9) -> 0,

      (4, 0) -> 0,
      (4, 1) -> 0,
      (4, 2) -> 2,
      (4, 3) -> 0,
      (4, 4) -> 4,
      (4, 5) -> 2,
      (4, 6) -> 0,
      (4, 7) -> 4,
      (4, 8) -> 4,
      (4, 9) -> 2,

      (5, 0) -> 0,
      (5, 1) -> 0,
      (5, 2) -> 2,
      (5, 3) -> 0,
      (5, 4) -> 2,
      (5, 5) -> 5,
      (5, 6) -> 0,
      (5, 7) -> 2,
      (5, 8) -> 2,
      (5, 9) -> 5,

      (6, 0) -> 0,
      (6, 1) -> 1,
      (6, 2) -> 0,
      (6, 3) -> 3,
      (6, 4) -> 0,
      (6, 5) -> 0,
      (6, 6) -> 6,
      (6, 7) -> 0,
      (6, 8) -> 0,
      (6, 9) -> 0,

      (7, 0) -> 0,
      (7, 1) -> 0,
      (7, 2) -> 2,
      (7, 3) -> 0,
      (7, 4) -> 4,
      (7, 5) -> 2,
      (7, 6) -> 0,
      (7, 7) -> 7,
      (7, 8) -> 4,
      (7, 9) -> 2,

      (8, 0) -> 0,
      (8, 1) -> 0,
      (8, 2) -> 2,
      (8, 3) -> 0,
      (8, 4) -> 4,
      (8, 5) -> 2,
      (8, 6) -> 0,
      (8, 7) -> 4,
      (8, 8) -> 8,
      (8, 9) -> 2,

      (9, 0) -> 0,
      (9, 1) -> 0,
      (9, 2) -> 2,
      (9, 3) -> 0,
      (9, 4) -> 2,
      (9, 5) -> 5,
      (9, 6) -> 0,
      (9, 7) -> 2,
      (9, 8) -> 2,
      (9, 9) -> 9
    )

    for (((k1, k2), v) <- lcas) {
      assert(BinaryTree.leastCommonAncestor(nodes(k1), nodes(k2)) == nodes(v))
    }
  }
}