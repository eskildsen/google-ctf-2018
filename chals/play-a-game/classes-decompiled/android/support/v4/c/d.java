// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.c;

import android.graphics.Typeface;
import android.support.v4.f.b;
import android.os.CancellationSignal;
import android.content.Context;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.system.Os;
import java.io.File;
import android.os.ParcelFileDescriptor;

class d extends g
{
    private File a(final ParcelFileDescriptor parcelFileDescriptor) {
        try {
            final String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        }
        catch (ErrnoException ex) {
            return null;
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
        //    12: invokevirtual   android/support/v4/c/d.a:([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
        //    15: astore          5
        //    17: aload_1        
        //    18: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    21: astore_3       
        //    22: aload_3        
        //    23: aload           5
        //    25: invokevirtual   android/support/v4/f/b$b.a:()Landroid/net/Uri;
        //    28: ldc             "r"
        //    30: aload_2        
        //    31: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    34: astore_3       
        //    35: aload_0        
        //    36: aload_3        
        //    37: invokespecial   android/support/v4/c/d.a:(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
        //    40: astore_2       
        //    41: aload_2        
        //    42: ifnull          52
        //    45: aload_2        
        //    46: invokevirtual   java/io/File.canRead:()Z
        //    49: ifne            200
        //    52: new             Ljava/io/FileInputStream;
        //    55: dup            
        //    56: aload_3        
        //    57: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    60: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //    63: astore          5
        //    65: aload_0        
        //    66: aload_1        
        //    67: aload           5
        //    69: invokespecial   android/support/v4/c/g.a:(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
        //    72: astore_1       
        //    73: aload           5
        //    75: ifnull          87
        //    78: iconst_0       
        //    79: ifeq            131
        //    82: aload           5
        //    84: invokevirtual   java/io/FileInputStream.close:()V
        //    87: aload_3        
        //    88: ifnull          99
        //    91: iconst_0       
        //    92: ifeq            154
        //    95: aload_3        
        //    96: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    99: aload_1        
        //   100: areturn        
        //   101: astore_1       
        //   102: new             Ljava/lang/NullPointerException;
        //   105: dup            
        //   106: invokespecial   java/lang/NullPointerException.<init>:()V
        //   109: athrow         
        //   110: astore_1       
        //   111: aload_1        
        //   112: athrow         
        //   113: astore_2       
        //   114: aload_3        
        //   115: ifnull          126
        //   118: aload_1        
        //   119: ifnull          244
        //   122: aload_3        
        //   123: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   126: aload_2        
        //   127: athrow         
        //   128: astore_1       
        //   129: aconst_null    
        //   130: areturn        
        //   131: aload           5
        //   133: invokevirtual   java/io/FileInputStream.close:()V
        //   136: goto            87
        //   139: astore_2       
        //   140: aconst_null    
        //   141: astore_1       
        //   142: goto            114
        //   145: astore_1       
        //   146: new             Ljava/lang/NullPointerException;
        //   149: dup            
        //   150: invokespecial   java/lang/NullPointerException.<init>:()V
        //   153: athrow         
        //   154: aload_3        
        //   155: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   158: goto            99
        //   161: astore_2       
        //   162: aload_2        
        //   163: athrow         
        //   164: astore_1       
        //   165: aload           5
        //   167: ifnull          179
        //   170: aload_2        
        //   171: ifnull          192
        //   174: aload           5
        //   176: invokevirtual   java/io/FileInputStream.close:()V
        //   179: aload_1        
        //   180: athrow         
        //   181: astore          5
        //   183: aload_2        
        //   184: aload           5
        //   186: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   189: goto            179
        //   192: aload           5
        //   194: invokevirtual   java/io/FileInputStream.close:()V
        //   197: goto            179
        //   200: aload_2        
        //   201: invokestatic    android/graphics/Typeface.createFromFile:(Ljava/io/File;)Landroid/graphics/Typeface;
        //   204: astore_1       
        //   205: aload_3        
        //   206: ifnull          217
        //   209: iconst_0       
        //   210: ifeq            228
        //   213: aload_3        
        //   214: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   217: aload_1        
        //   218: areturn        
        //   219: astore_1       
        //   220: new             Ljava/lang/NullPointerException;
        //   223: dup            
        //   224: invokespecial   java/lang/NullPointerException.<init>:()V
        //   227: athrow         
        //   228: aload_3        
        //   229: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   232: goto            217
        //   235: astore_3       
        //   236: aload_1        
        //   237: aload_3        
        //   238: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   241: goto            126
        //   244: aload_3        
        //   245: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   248: goto            126
        //   251: astore_1       
        //   252: aconst_null    
        //   253: astore_2       
        //   254: goto            165
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  22     35     128    131    Ljava/io/IOException;
        //  35     41     110    114    Ljava/lang/Throwable;
        //  35     41     139    145    Any
        //  45     52     110    114    Ljava/lang/Throwable;
        //  45     52     139    145    Any
        //  52     65     110    114    Ljava/lang/Throwable;
        //  52     65     139    145    Any
        //  65     73     161    165    Ljava/lang/Throwable;
        //  65     73     251    257    Any
        //  82     87     101    110    Ljava/lang/Throwable;
        //  82     87     139    145    Any
        //  95     99     145    154    Ljava/lang/Throwable;
        //  95     99     128    131    Ljava/io/IOException;
        //  102    110    110    114    Ljava/lang/Throwable;
        //  102    110    139    145    Any
        //  111    113    113    114    Any
        //  122    126    235    244    Ljava/lang/Throwable;
        //  122    126    128    131    Ljava/io/IOException;
        //  126    128    128    131    Ljava/io/IOException;
        //  131    136    110    114    Ljava/lang/Throwable;
        //  131    136    139    145    Any
        //  146    154    128    131    Ljava/io/IOException;
        //  154    158    128    131    Ljava/io/IOException;
        //  162    164    164    165    Any
        //  174    179    181    192    Ljava/lang/Throwable;
        //  174    179    139    145    Any
        //  179    181    110    114    Ljava/lang/Throwable;
        //  179    181    139    145    Any
        //  183    189    110    114    Ljava/lang/Throwable;
        //  183    189    139    145    Any
        //  192    197    110    114    Ljava/lang/Throwable;
        //  192    197    139    145    Any
        //  200    205    110    114    Ljava/lang/Throwable;
        //  200    205    139    145    Any
        //  213    217    219    228    Ljava/lang/Throwable;
        //  213    217    128    131    Ljava/io/IOException;
        //  220    228    128    131    Ljava/io/IOException;
        //  228    232    128    131    Ljava/io/IOException;
        //  236    241    128    131    Ljava/io/IOException;
        //  244    248    128    131    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
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
}
