# Day 264 \[Hard\]

This problem was asked by LinkedIn.

Given a set of characters `C` and an integer `k`, a de Bruijn sequence is a cyclic sequence in which every possible `k`-length string of characters in `C` occurs exactly once.

For example, suppose `C = {0, 1}` and `k = 3`. Then our sequence should contain the substrings `{'000', '001', '010', '011', '100', '101', '110', '111'}`, and one possible solution would be `00010111`.

Create an algorithm that finds a de Bruijn sequence.

Link: [Testing code](../../../../test/kotlin/dcp/day264/day264.kt)