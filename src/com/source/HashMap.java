/*
package com.source;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

*/
/**
 * @Author LiuYang
 * @Date 2019/5/17/01715:38
 * @Version 1.0
 **//*

public class HashMap<K,V> extends AbstractMap implements Map<K,V>,Cloneable, Serializable {
    private static final long serialVersionUID =1L;
    static final int DEFAULT_INITIAL_CAPACITY=16;
    static final int MAXIMUM_CAPACITY =1073741824;
    static final float DEFAULT_LOAD_FACTOR = 0.75F;
    static final int TREEIFY_THRESHOLD = 8;
    static final int UNTREEIFY_THRESHOLD = 6;
    static final int MIN_TREEIFY_CAPACITY = 64;
    transient HashMap.Node<K, V>[] table;
    transient Set<Entry<K, V>> entrySet;
    transient int size;
    transient int modCount;
    int threshold;
    //final float loadFactor;


    static final class Node<K,V> implements Map.Entry<K,V>{
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }


        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue=this.value;
            this.value=value;
            return oldValue;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final boolean equals(Object o){
            if (o==this){
                return true;
            }
            if(o instanceof Map.Entry){
                Map.Entry<?,?> e = (Map.Entry<?,?>)o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }

        static final int hash(Object key) {
            int h;
            return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        }
    }
   */
/* @Override
    public Set<Entry<?,?>> entrySet() {
        return null;
    }*//*

}
*/
