// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.f;

import android.util.Base64;
import android.support.v4.g.j;
import java.util.List;

public final class a
{
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;
    
    public a(final String s, final String s2, final String s3, final List<List<byte[]>> list) {
        this.a = j.a(s);
        this.b = j.a(s2);
        this.c = j.a(s3);
        this.d = j.a(list);
        this.e = 0;
        this.f = this.a + "-" + this.b + "-" + this.c;
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.c;
    }
    
    public List<List<byte[]>> d() {
        return this.d;
    }
    
    public int e() {
        return this.e;
    }
    
    public String f() {
        return this.f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List<byte[]> list = this.d.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
