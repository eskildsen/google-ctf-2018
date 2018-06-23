// 
// Decompiled by Procyon v0.5.30
// 

package android.arch.a.a;

import java.util.HashMap;

public class a<K, V> extends b<K, V>
{
    private HashMap<K, c<K, V>> a;
    
    public a() {
        this.a = new HashMap<K, c<K, V>>();
    }
    
    public boolean a(final K k) {
        return this.a.containsKey(k);
    }
}
