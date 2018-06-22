// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c;

import java.io.InputStream;
import android.support.v4.f.b;
import android.os.CancellationSignal;
import java.io.File;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.content.Context;
import android.support.v4.b.a.a;

class g implements c.a
{
    private android.support.v4.b.a.a.c a(final android.support.v4.b.a.a.b b, final int n) {
        return a(b.a(), n, (a<android.support.v4.b.a.a.c>)new a<android.support.v4.b.a.a.c>() {
            public int a(final android.support.v4.b.a.a.c c) {
                return c.b();
            }
            
            public boolean b(final android.support.v4.b.a.a.c c) {
                return c.c();
            }
        });
    }
    
    private static <T> T a(final T[] array, int i, final a<T> a) {
        int n;
        if ((i & 0x1) == 0x0) {
            n = 400;
        }
        else {
            n = 700;
        }
        final boolean b = (i & 0x2) != 0x0;
        T t = null;
        int n2 = Integer.MAX_VALUE;
        int length;
        T t2;
        int abs;
        int n3;
        int n4;
        for (length = array.length, i = 0; i < length; ++i) {
            t2 = array[i];
            abs = Math.abs(a.b(t2) - n);
            if (a.a(t2) == b) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            n4 = n3 + abs * 2;
            if (t == null || n2 > n4) {
                n2 = n4;
                t = t2;
            }
        }
        return t;
    }
    
    @Override
    public Typeface a(Context a, final Resources resources, final int n, final String s, final int n2) {
        a = (Context)h.a(a);
        if (a == null) {
            return null;
        }
        try {
            if (!h.a((File)a, resources, n)) {
                return null;
            }
            return Typeface.createFromFile(((File)a).getPath());
        }
        catch (RuntimeException ex) {
            return null;
        }
        finally {
            ((File)a).delete();
        }
    }
    
    @Override
    public Typeface a(final Context p0, final CancellationSignal p1, final b.b[] p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_3        
        //     1: arraylength    
        //     2: iconst_1       
        //     3: if_icmpge       8
        //     6: aconst_null    
        //     7: areturn        
        //     8: aload_0        
        //     9: aload_3        
        //    10: iload           4
        //    12: invokevirtual   android/support/v4/c/g.a:([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
        //    15: astore_2       
        //    16: aload_1        
        //    17: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    20: aload_2        
        //    21: invokevirtual   android/support/v4/f/b$b.a:()Landroid/net/Uri;
        //    24: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    27: astore_2       
        //    28: aload_0        
        //    29: aload_1        
        //    30: aload_2        
        //    31: invokevirtual   android/support/v4/c/g.a:(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
        //    34: astore_1       
        //    35: aload_2        
        //    36: invokestatic    android/support/v4/c/h.a:(Ljava/io/Closeable;)V
        //    39: aload_1        
        //    40: areturn        
        //    41: astore_1       
        //    42: aconst_null    
        //    43: astore_2       
        //    44: aload_2        
        //    45: invokestatic    android/support/v4/c/h.a:(Ljava/io/Closeable;)V
        //    48: aconst_null    
        //    49: areturn        
        //    50: astore_1       
        //    51: aconst_null    
        //    52: astore_2       
        //    53: aload_2        
        //    54: invokestatic    android/support/v4/c/h.a:(Ljava/io/Closeable;)V
        //    57: aload_1        
        //    58: athrow         
        //    59: astore_1       
        //    60: goto            53
        //    63: astore_1       
        //    64: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     28     41     44     Ljava/io/IOException;
        //  16     28     50     53     Any
        //  28     35     63     67     Ljava/io/IOException;
        //  28     35     59     63     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:138)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public Typeface a(final Context context, final android.support.v4.b.a.a.b b, final Resources resources, final int n) {
        final android.support.v4.b.a.a.c a = this.a(b, n);
        if (a == null) {
            return null;
        }
        return c.a(context, resources, a.d(), a.a(), n);
    }
    
    protected Typeface a(Context a, final InputStream inputStream) {
        a = (Context)h.a(a);
        if (a == null) {
            return null;
        }
        try {
            if (!h.a((File)a, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(((File)a).getPath());
        }
        catch (RuntimeException ex) {
            return null;
        }
        finally {
            ((File)a).delete();
        }
    }
    
    protected b.b a(final b.b[] array, final int n) {
        return a(array, n, (a<b.b>)new a<b.b>() {
            public int a(final b.b b) {
                return b.c();
            }
            
            public boolean b(final b.b b) {
                return b.d();
            }
        });
    }
    
    private interface a<T>
    {
        boolean a(final T p0);
        
        int b(final T p0);
    }
}
