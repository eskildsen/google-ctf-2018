// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.h;

import android.view.LayoutInflater$Factory;
import android.view.LayoutInflater$Factory2;
import android.view.LayoutInflater;
import android.os.Build$VERSION;
import java.lang.reflect.Field;

public final class e
{
    static final b a;
    private static Field b;
    private static boolean c;
    
    static {
        if (Build$VERSION.SDK_INT >= 21) {
            a = (b)new a();
            return;
        }
        a = new b();
    }
    
    static void a(final LayoutInflater p0, final LayoutInflater$Factory2 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/h/e.c:Z
        //     3: ifne            27
        //     6: ldc             Landroid/view/LayoutInflater;.class
        //     8: ldc             "mFactory2"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: putstatic       android/support/v4/h/e.b:Ljava/lang/reflect/Field;
        //    16: getstatic       android/support/v4/h/e.b:Ljava/lang/reflect/Field;
        //    19: iconst_1       
        //    20: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    23: iconst_1       
        //    24: putstatic       android/support/v4/h/e.c:Z
        //    27: getstatic       android/support/v4/h/e.b:Ljava/lang/reflect/Field;
        //    30: ifnull          41
        //    33: getstatic       android/support/v4/h/e.b:Ljava/lang/reflect/Field;
        //    36: aload_0        
        //    37: aload_1        
        //    38: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    41: return         
        //    42: astore_2       
        //    43: ldc             "LayoutInflaterCompatHC"
        //    45: new             Ljava/lang/StringBuilder;
        //    48: dup            
        //    49: invokespecial   java/lang/StringBuilder.<init>:()V
        //    52: ldc             "forceSetFactory2 Could not find field 'mFactory2' on class "
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: ldc             Landroid/view/LayoutInflater;.class
        //    59: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: ldc             "; inflation may have unexpected results."
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    73: aload_2        
        //    74: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    77: pop            
        //    78: goto            23
        //    81: astore_1       
        //    82: ldc             "LayoutInflaterCompatHC"
        //    84: new             Ljava/lang/StringBuilder;
        //    87: dup            
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: ldc             "forceSetFactory2 could not set the Factory2 on LayoutInflater "
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: aload_0        
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   100: ldc             "; inflation may have unexpected results."
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   108: aload_1        
        //   109: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   112: pop            
        //   113: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      23     42     81     Ljava/lang/NoSuchFieldException;
        //  33     41     81     114    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    public static void b(final LayoutInflater layoutInflater, final LayoutInflater$Factory2 layoutInflater$Factory2) {
        e.a.a(layoutInflater, layoutInflater$Factory2);
    }
    
    static class a extends b
    {
        @Override
        public void a(final LayoutInflater layoutInflater, final LayoutInflater$Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }
    
    static class b
    {
        public void a(final LayoutInflater layoutInflater, final LayoutInflater$Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            final LayoutInflater$Factory factory3 = layoutInflater.getFactory();
            if (factory3 instanceof LayoutInflater$Factory2) {
                e.a(layoutInflater, (LayoutInflater$Factory2)factory3);
                return;
            }
            e.a(layoutInflater, factory2);
        }
    }
}
