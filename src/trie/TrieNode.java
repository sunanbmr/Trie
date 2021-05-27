/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

import java.util.HashMap;

/**
 *
 * @author sbommena
 */
public class TrieNode {
    
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;

    public TrieNode() {
    }

    public TrieNode(char c) {
        this.c = c;
    }
}
