/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sbommena
 */
public class Trie {

    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        Map<Character,TrieNode> children = root.children;       
        for(int i=0;i<word.length();i++){
            Character c = word.charAt(i);
            TrieNode t;
            if(children.containsKey(c)){
                t = children.get(c);                
            }
            else{
                t = new TrieNode(c);
                children.put(c, t);
            }
            children = t.children;
            
            if(i == word.length() - 1)
                t.isLeaf = true;
        }      
    }   
    
    public boolean search(String word) {
        TrieNode current = root;
        Map<Character,TrieNode> children = root.children;
        for(int i=0; i<word.length(); i++){
            Character c = word.charAt(i);
            TrieNode t;
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }
            else{
                return false;
            }
            
            if(i == word.length() - 1 && t.isLeaf)
            {
                
            }    
        }
        return false;
    }
    
}
