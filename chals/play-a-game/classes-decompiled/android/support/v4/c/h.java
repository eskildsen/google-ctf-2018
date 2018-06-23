// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c;

import java.io.InputStream;
import java.io.Closeable;
import android.net.Uri;
import android.os.CancellationSignal;
import java.nio.ByteBuffer;
import android.content.res.Resources;
import java.io.IOException;
import android.os.Process;
import java.io.File;
import android.content.Context;

public class h
{
    public static File a(final Context context) {
        final String string = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; ++i) {
            final File file = new File(context.getCacheDir(), string + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            }
            catch (IOException ex) {}
        }
        return null;
    }
    
    public static ByteBuffer a(Context a, final Resources resources, final int n) {
        a = (Context)a(a);
        if (a == null) {
            return null;
        }
        try {
            if (!a((File)a, resources, n)) {
                return null;
            }
            return a((File)a);
        }
        finally {
            ((File)a).delete();
        }
    }
    
    public static ByteBuffer a(final Context p0, final CancellationSignal p1, final Uri p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore_0       
        //     5: aload_0        
        //     6: aload_2        
        //     7: ldc             "r"
        //     9: aload_1        
        //    10: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    13: astore_2       
        //    14: new             Ljava/io/FileInputStream;
        //    17: dup            
        //    18: aload_2        
        //    19: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    22: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //    25: astore          5
        //    27: aload           5
        //    29: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //    32: astore_0       
        //    33: aload_0        
        //    34: invokevirtual   java/nio/channels/FileChannel.size:()J
        //    37: lstore_3       
        //    38: aload_0        
        //    39: getstatic       java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
        //    42: lconst_0       
        //    43: lload_3        
        //    44: invokevirtual   java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
        //    47: astore_0       
        //    48: aload           5
        //    50: ifnull          62
        //    53: iconst_0       
        //    54: ifeq            106
        //    57: aload           5
        //    59: invokevirtual   java/io/FileInputStream.close:()V
        //    62: aload_2        
        //    63: ifnull          74
        //    66: iconst_0       
        //    67: ifeq            129
        //    70: aload_2        
        //    71: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    74: aload_0        
        //    75: areturn        
        //    76: astore_0       
        //    77: new             Ljava/lang/NullPointerException;
        //    80: dup            
        //    81: invokespecial   java/lang/NullPointerException.<init>:()V
        //    84: athrow         
        //    85: astore_1       
        //    86: aload_1        
        //    87: athrow         
        //    88: astore_0       
        //    89: aload_2        
        //    90: ifnull          101
        //    93: aload_1        
        //    94: ifnull          183
        //    97: aload_2        
        //    98: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   101: aload_0        
        //   102: athrow         
        //   103: astore_0       
        //   104: aconst_null    
        //   105: areturn        
        //   106: aload           5
        //   108: invokevirtual   java/io/FileInputStream.close:()V
        //   111: goto            62
        //   114: astore_0       
        //   115: aconst_null    
        //   116: astore_1       
        //   117: goto            89
        //   120: astore_0       
        //   121: new             Ljava/lang/NullPointerException;
        //   124: dup            
        //   125: invokespecial   java/lang/NullPointerException.<init>:()V
        //   128: athrow         
        //   129: aload_2        
        //   130: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   133: aload_0        
        //   134: areturn        
        //   135: astore_1       
        //   136: aload_1        
        //   137: athrow         
        //   138: astore_0       
        //   139: aload           5
        //   141: ifnull          153
        //   144: aload_1        
        //   145: ifnull          166
        //   148: aload           5
        //   150: invokevirtual   java/io/FileInputStream.close:()V
        //   153: aload_0        
        //   154: athrow         
        //   155: astore          5
        //   157: aload_1        
        //   158: aload           5
        //   160: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   163: goto            153
        //   166: aload           5
        //   168: invokevirtual   java/io/FileInputStream.close:()V
        //   171: goto            153
        //   174: astore_2       
        //   175: aload_1        
        //   176: aload_2        
        //   177: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   180: goto            101
        //   183: aload_2        
        //   184: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   187: goto            101
        //   190: astore_0       
        //   191: aconst_null    
        //   192: astore_1       
        //   193: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      14     103    106    Ljava/io/IOException;
        //  14     27     85     89     Ljava/lang/Throwable;
        //  14     27     114    120    Any
        //  27     48     135    139    Ljava/lang/Throwable;
        //  27     48     190    196    Any
        //  57     62     76     85     Ljava/lang/Throwable;
        //  57     62     114    120    Any
        //  70     74     120    129    Ljava/lang/Throwable;
        //  70     74     103    106    Ljava/io/IOException;
        //  77     85     85     89     Ljava/lang/Throwable;
        //  77     85     114    120    Any
        //  86     88     88     89     Any
        //  97     101    174    183    Ljava/lang/Throwable;
        //  97     101    103    106    Ljava/io/IOException;
        //  101    103    103    106    Ljava/io/IOException;
        //  106    111    85     89     Ljava/lang/Throwable;
        //  106    111    114    120    Any
        //  121    129    103    106    Ljava/io/IOException;
        //  129    133    103    106    Ljava/io/IOException;
        //  136    138    138    139    Any
        //  148    153    155    166    Ljava/lang/Throwable;
        //  148    153    114    120    Any
        //  153    155    85     89     Ljava/lang/Throwable;
        //  153    155    114    120    Any
        //  157    163    85     89     Ljava/lang/Throwable;
        //  157    163    114    120    Any
        //  166    171    85     89     Ljava/lang/Throwable;
        //  166    171    114    120    Any
        //  175    180    103    106    Ljava/io/IOException;
        //  183    187    103    106    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 109, Size: 109
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:657)
        //     at java.util.ArrayList.get(ArrayList.java:433)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    private static ByteBuffer a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileInputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     8: astore          4
        //    10: aload           4
        //    12: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //    15: astore_0       
        //    16: aload_0        
        //    17: invokevirtual   java/nio/channels/FileChannel.size:()J
        //    20: lstore_1       
        //    21: aload_0        
        //    22: getstatic       java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
        //    25: lconst_0       
        //    26: lload_1        
        //    27: invokevirtual   java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
        //    30: astore_0       
        //    31: aload           4
        //    33: ifnull          45
        //    36: iconst_0       
        //    37: ifeq            56
        //    40: aload           4
        //    42: invokevirtual   java/io/FileInputStream.close:()V
        //    45: aload_0        
        //    46: areturn        
        //    47: astore_0       
        //    48: new             Ljava/lang/NullPointerException;
        //    51: dup            
        //    52: invokespecial   java/lang/NullPointerException.<init>:()V
        //    55: athrow         
        //    56: aload           4
        //    58: invokevirtual   java/io/FileInputStream.close:()V
        //    61: aload_0        
        //    62: areturn        
        //    63: astore_3       
        //    64: aload_3        
        //    65: athrow         
        //    66: astore_0       
        //    67: aload           4
        //    69: ifnull          81
        //    72: aload_3        
        //    73: ifnull          94
        //    76: aload           4
        //    78: invokevirtual   java/io/FileInputStream.close:()V
        //    81: aload_0        
        //    82: athrow         
        //    83: astore          4
        //    85: aload_3        
        //    86: aload           4
        //    88: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //    91: goto            81
        //    94: aload           4
        //    96: invokevirtual   java/io/FileInputStream.close:()V
        //    99: goto            81
        //   102: astore_0       
        //   103: aconst_null    
        //   104: astore_3       
        //   105: goto            67
        //   108: astore_0       
        //   109: aconst_null    
        //   110: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      10     108    111    Ljava/io/IOException;
        //  10     31     63     67     Ljava/lang/Throwable;
        //  10     31     102    108    Any
        //  40     45     47     56     Ljava/lang/Throwable;
        //  40     45     108    111    Ljava/io/IOException;
        //  48     56     108    111    Ljava/io/IOException;
        //  56     61     108    111    Ljava/io/IOException;
        //  64     66     66     67     Any
        //  76     81     83     94     Ljava/lang/Throwable;
        //  76     81     108    111    Ljava/io/IOException;
        //  81     83     108    111    Ljava/io/IOException;
        //  85     91     108    111    Ljava/io/IOException;
        //  94     99     108    111    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
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
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    public static boolean a(final File file, final Resources resources, final int n) {
        Closeable openRawResource = null;
        try {
            return a(file, (InputStream)(openRawResource = resources.openRawResource(n)));
        }
        finally {
            a(openRawResource);
        }
    }
    
    public static boolean a(final File p0, final InputStream p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileOutputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: iconst_0       
        //     6: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //     9: astore_3       
        //    10: aload_3        
        //    11: astore_0       
        //    12: sipush          1024
        //    15: newarray        B
        //    17: astore          4
        //    19: aload_3        
        //    20: astore_0       
        //    21: aload_1        
        //    22: aload           4
        //    24: invokevirtual   java/io/InputStream.read:([B)I
        //    27: istore_2       
        //    28: iload_2        
        //    29: iconst_m1      
        //    30: if_icmpeq       87
        //    33: aload_3        
        //    34: astore_0       
        //    35: aload_3        
        //    36: aload           4
        //    38: iconst_0       
        //    39: iload_2        
        //    40: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //    43: goto            19
        //    46: astore_0       
        //    47: aload_3        
        //    48: astore_1       
        //    49: aload_0        
        //    50: astore_3       
        //    51: aload_1        
        //    52: astore_0       
        //    53: ldc             "TypefaceCompatUtil"
        //    55: new             Ljava/lang/StringBuilder;
        //    58: dup            
        //    59: invokespecial   java/lang/StringBuilder.<init>:()V
        //    62: ldc             "Error copying resource contents to temp file: "
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: aload_3        
        //    68: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //    71: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    74: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    77: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    80: pop            
        //    81: aload_1        
        //    82: invokestatic    android/support/v4/c/h.a:(Ljava/io/Closeable;)V
        //    85: iconst_0       
        //    86: ireturn        
        //    87: aload_3        
        //    88: invokestatic    android/support/v4/c/h.a:(Ljava/io/Closeable;)V
        //    91: iconst_1       
        //    92: ireturn        
        //    93: astore_1       
        //    94: aconst_null    
        //    95: astore_0       
        //    96: aload_0        
        //    97: invokestatic    android/support/v4/c/h.a:(Ljava/io/Closeable;)V
        //   100: aload_1        
        //   101: athrow         
        //   102: astore_1       
        //   103: goto            96
        //   106: astore_3       
        //   107: aconst_null    
        //   108: astore_1       
        //   109: goto            51
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      10     106    112    Ljava/io/IOException;
        //  0      10     93     96     Any
        //  12     19     46     51     Ljava/io/IOException;
        //  12     19     102    106    Any
        //  21     28     46     51     Ljava/io/IOException;
        //  21     28     102    106    Any
        //  35     43     46     51     Ljava/io/IOException;
        //  35     43     102    106    Any
        //  53     81     102    106    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
}
