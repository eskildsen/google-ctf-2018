// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c;

import android.support.v4.b.a.a;
import android.support.v4.f.b;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.nio.ByteBuffer;
import android.graphics.fonts.FontVariationAxis;
import android.content.res.AssetManager;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class f extends d
{
    private static final Class a;
    private static final Constructor b;
    private static final Method c;
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    
    static {
        Method f2 = null;
        try {
            final Class<?> forName = Class.forName("android.graphics.FontFamily");
            final Constructor<?> constructor = forName.getConstructor((Class<?>[])new Class[0]);
            final Method method = forName.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            final Method method2 = forName.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            final Method method3 = forName.getMethod("freeze", (Class<?>[])new Class[0]);
            Method method4 = forName.getMethod("abortCreation", (Class<?>[])new Class[0]);
            final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(forName, 1).getClass(), Integer.TYPE, Integer.TYPE);
            declaredMethod.setAccessible(true);
            f2 = method3;
            final Method d2 = method2;
            final Method e2 = f2;
            f2 = method4;
            method4 = declaredMethod;
            b = constructor;
            a = forName;
            c = method;
            d = d2;
            e = e2;
            f = f2;
            g = method4;
        }
        catch (ClassNotFoundException ex) {}
        catch (NoSuchMethodException method4) {
            goto Label_0232;
        }
    }
    
    private static Typeface a(Object ex) {
        try {
            final Object instance = Array.newInstance(android.support.v4.c.f.a, 1);
            Array.set(instance, 0, ex);
            ex = (InvocationTargetException)android.support.v4.c.f.g.invoke(null, instance, -1, -1);
            return (Typeface)ex;
        }
        catch (IllegalAccessException ex2) {}
        catch (InvocationTargetException ex) {
            goto Label_0050;
        }
    }
    
    private static boolean a() {
        if (android.support.v4.c.f.c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return android.support.v4.c.f.c != null;
    }
    
    private static boolean a(final Context ex, final Object o, final String s, final int n, final int n2, final int n3) {
        try {
            return (boolean)android.support.v4.c.f.c.invoke(o, ((Context)ex).getAssets(), s, 0, false, n, n2, n3, null);
        }
        catch (IllegalAccessException ex2) {}
        catch (InvocationTargetException ex) {
            goto Label_0078;
        }
    }
    
    private static boolean a(final Object ex, final ByteBuffer byteBuffer, final int n, final int n2, final int n3) {
        try {
            return (boolean)android.support.v4.c.f.d.invoke(ex, byteBuffer, n, null, n2, n3);
        }
        catch (IllegalAccessException ex2) {}
        catch (InvocationTargetException ex) {
            goto Label_0053;
        }
    }
    
    private static Object b() {
        try {
            return android.support.v4.c.f.b.newInstance(new Object[0]);
        }
        catch (InstantiationException ex) {}
        catch (IllegalAccessException instance) {
            goto Label_0014;
        }
        catch (InvocationTargetException instance) {
            goto Label_0014;
        }
    }
    
    private static boolean b(final Object ex) {
        try {
            return (boolean)android.support.v4.c.f.e.invoke(ex, new Object[0]);
        }
        catch (IllegalAccessException ex2) {}
        catch (InvocationTargetException ex) {
            goto Label_0021;
        }
    }
    
    private static boolean c(final Object ex) {
        try {
            return (boolean)android.support.v4.c.f.f.invoke(ex, new Object[0]);
        }
        catch (IllegalAccessException ex2) {}
        catch (InvocationTargetException ex) {
            goto Label_0021;
        }
    }
    
    @Override
    public Typeface a(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!a()) {
            return super.a(context, resources, n, s, n2);
        }
        final Object b = b();
        if (!a(context, b, s, 0, -1, -1)) {
            c(b);
            return null;
        }
        if (!b(b)) {
            return null;
        }
        return a(b);
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
        //     3: if_icmpge       10
        //     6: aconst_null    
        //     7: astore_1       
        //     8: aload_1        
        //     9: areturn        
        //    10: invokestatic    android/support/v4/c/f.a:()Z
        //    13: ifne            143
        //    16: aload_0        
        //    17: aload_3        
        //    18: iload           4
        //    20: invokevirtual   android/support/v4/c/f.a:([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
        //    23: astore          9
        //    25: aload_1        
        //    26: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    29: astore_1       
        //    30: aload_1        
        //    31: aload           9
        //    33: invokevirtual   android/support/v4/f/b$b.a:()Landroid/net/Uri;
        //    36: ldc             "r"
        //    38: aload_2        
        //    39: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    42: astore_3       
        //    43: aconst_null    
        //    44: astore_2       
        //    45: new             Landroid/graphics/Typeface$Builder;
        //    48: dup            
        //    49: aload_3        
        //    50: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    53: invokespecial   android/graphics/Typeface$Builder.<init>:(Ljava/io/FileDescriptor;)V
        //    56: aload           9
        //    58: invokevirtual   android/support/v4/f/b$b.c:()I
        //    61: invokevirtual   android/graphics/Typeface$Builder.setWeight:(I)Landroid/graphics/Typeface$Builder;
        //    64: aload           9
        //    66: invokevirtual   android/support/v4/f/b$b.d:()Z
        //    69: invokevirtual   android/graphics/Typeface$Builder.setItalic:(Z)Landroid/graphics/Typeface$Builder;
        //    72: invokevirtual   android/graphics/Typeface$Builder.build:()Landroid/graphics/Typeface;
        //    75: astore_1       
        //    76: aload_1        
        //    77: astore_2       
        //    78: aload_2        
        //    79: astore_1       
        //    80: aload_3        
        //    81: ifnull          8
        //    84: iconst_0       
        //    85: ifeq            103
        //    88: aload_3        
        //    89: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    92: aload_2        
        //    93: areturn        
        //    94: astore_1       
        //    95: new             Ljava/lang/NullPointerException;
        //    98: dup            
        //    99: invokespecial   java/lang/NullPointerException.<init>:()V
        //   102: athrow         
        //   103: aload_3        
        //   104: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   107: aload_2        
        //   108: areturn        
        //   109: astore_2       
        //   110: aload_2        
        //   111: athrow         
        //   112: astore_1       
        //   113: aload_3        
        //   114: ifnull          125
        //   117: aload_2        
        //   118: ifnull          136
        //   121: aload_3        
        //   122: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   125: aload_1        
        //   126: athrow         
        //   127: astore_3       
        //   128: aload_2        
        //   129: aload_3        
        //   130: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   133: goto            125
        //   136: aload_3        
        //   137: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   140: goto            125
        //   143: aload_1        
        //   144: aload_3        
        //   145: aload_2        
        //   146: invokestatic    android/support/v4/f/b.a:(Landroid/content/Context;[Landroid/support/v4/f/b$b;Landroid/os/CancellationSignal;)Ljava/util/Map;
        //   149: astore          9
        //   151: invokestatic    android/support/v4/c/f.b:()Ljava/lang/Object;
        //   154: astore_2       
        //   155: iconst_0       
        //   156: istore          4
        //   158: aload_3        
        //   159: arraylength    
        //   160: istore          6
        //   162: iconst_0       
        //   163: istore          5
        //   165: iload           5
        //   167: iload           6
        //   169: if_icmpge       265
        //   172: aload_3        
        //   173: iload           5
        //   175: aaload         
        //   176: astore          10
        //   178: aload           9
        //   180: aload           10
        //   182: invokevirtual   android/support/v4/f/b$b.a:()Landroid/net/Uri;
        //   185: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   190: checkcast       Ljava/nio/ByteBuffer;
        //   193: astore_1       
        //   194: aload_1        
        //   195: ifnonnull       207
        //   198: iload           5
        //   200: iconst_1       
        //   201: iadd           
        //   202: istore          5
        //   204: goto            165
        //   207: aload           10
        //   209: invokevirtual   android/support/v4/f/b$b.b:()I
        //   212: istore          8
        //   214: aload           10
        //   216: invokevirtual   android/support/v4/f/b$b.c:()I
        //   219: istore          7
        //   221: aload           10
        //   223: invokevirtual   android/support/v4/f/b$b.d:()Z
        //   226: ifeq            253
        //   229: iconst_1       
        //   230: istore          4
        //   232: aload_2        
        //   233: aload_1        
        //   234: iload           8
        //   236: iload           7
        //   238: iload           4
        //   240: invokestatic    android/support/v4/c/f.a:(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
        //   243: ifne            259
        //   246: aload_2        
        //   247: invokestatic    android/support/v4/c/f.c:(Ljava/lang/Object;)Z
        //   250: pop            
        //   251: aconst_null    
        //   252: areturn        
        //   253: iconst_0       
        //   254: istore          4
        //   256: goto            232
        //   259: iconst_1       
        //   260: istore          4
        //   262: goto            198
        //   265: iload           4
        //   267: ifne            277
        //   270: aload_2        
        //   271: invokestatic    android/support/v4/c/f.c:(Ljava/lang/Object;)Z
        //   274: pop            
        //   275: aconst_null    
        //   276: areturn        
        //   277: aload_2        
        //   278: invokestatic    android/support/v4/c/f.b:(Ljava/lang/Object;)Z
        //   281: ifne            286
        //   284: aconst_null    
        //   285: areturn        
        //   286: aload_2        
        //   287: invokestatic    android/support/v4/c/f.a:(Ljava/lang/Object;)Landroid/graphics/Typeface;
        //   290: areturn        
        //   291: astore_1       
        //   292: goto            113
        //   295: astore_1       
        //   296: aconst_null    
        //   297: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  30     43     295    298    Ljava/io/IOException;
        //  45     76     109    113    Ljava/lang/Throwable;
        //  45     76     291    295    Any
        //  88     92     94     103    Ljava/lang/Throwable;
        //  88     92     295    298    Ljava/io/IOException;
        //  95     103    295    298    Ljava/io/IOException;
        //  103    107    295    298    Ljava/io/IOException;
        //  110    112    112    113    Any
        //  121    125    127    136    Ljava/lang/Throwable;
        //  121    125    295    298    Ljava/io/IOException;
        //  125    127    295    298    Ljava/io/IOException;
        //  128    133    295    298    Ljava/io/IOException;
        //  136    140    295    298    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0136:
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
    public Typeface a(final Context context, final android.support.v4.b.a.a.b b, final Resources resources, int i) {
        if (!a()) {
            return super.a(context, b, resources, i);
        }
        final Object b2 = b();
        final android.support.v4.b.a.a.c[] a = b.a();
        int length;
        android.support.v4.b.a.a.c c;
        String a2;
        int b3;
        int n;
        for (length = a.length, i = 0; i < length; ++i) {
            c = a[i];
            a2 = c.a();
            b3 = c.b();
            if (c.c()) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (!a(context, b2, a2, 0, b3, n)) {
                c(b2);
                return null;
            }
        }
        if (!b(b2)) {
            return null;
        }
        return a(b2);
    }
}
