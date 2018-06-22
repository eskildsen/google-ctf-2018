// 
// Decompiled by Procyon v0.5.30
// 

package android.support.multidex;

import java.io.FileFilter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.io.IOException;
import java.util.ArrayList;
import android.util.Log;
import java.util.List;
import android.os.Build$VERSION;
import android.content.SharedPreferences;
import android.content.Context;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.Closeable;

final class b implements Closeable
{
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;
    
    b(final File p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: ldc             "MultiDex"
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: ldc             "MultiDexExtractor("
        //    15: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    18: aload_1        
        //    19: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: ldc             ", "
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload_2        
        //    31: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: ldc             ")"
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    45: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    48: pop            
        //    49: aload_0        
        //    50: aload_1        
        //    51: putfield        android/support/multidex/b.a:Ljava/io/File;
        //    54: aload_0        
        //    55: aload_2        
        //    56: putfield        android/support/multidex/b.c:Ljava/io/File;
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokestatic    android/support/multidex/b.b:(Ljava/io/File;)J
        //    64: putfield        android/support/multidex/b.b:J
        //    67: new             Ljava/io/File;
        //    70: dup            
        //    71: aload_2        
        //    72: ldc             "MultiDex.lock"
        //    74: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    77: astore_1       
        //    78: aload_0        
        //    79: new             Ljava/io/RandomAccessFile;
        //    82: dup            
        //    83: aload_1        
        //    84: ldc             "rw"
        //    86: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    89: putfield        android/support/multidex/b.d:Ljava/io/RandomAccessFile;
        //    92: aload_0        
        //    93: aload_0        
        //    94: getfield        android/support/multidex/b.d:Ljava/io/RandomAccessFile;
        //    97: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //   100: putfield        android/support/multidex/b.e:Ljava/nio/channels/FileChannel;
        //   103: ldc             "MultiDex"
        //   105: new             Ljava/lang/StringBuilder;
        //   108: dup            
        //   109: invokespecial   java/lang/StringBuilder.<init>:()V
        //   112: ldc             "Blocking on lock "
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: aload_1        
        //   118: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   130: pop            
        //   131: aload_0        
        //   132: aload_0        
        //   133: getfield        android/support/multidex/b.e:Ljava/nio/channels/FileChannel;
        //   136: invokevirtual   java/nio/channels/FileChannel.lock:()Ljava/nio/channels/FileLock;
        //   139: putfield        android/support/multidex/b.f:Ljava/nio/channels/FileLock;
        //   142: ldc             "MultiDex"
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: aload_1        
        //   152: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: ldc             " locked"
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   166: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   169: pop            
        //   170: return         
        //   171: aload_0        
        //   172: getfield        android/support/multidex/b.e:Ljava/nio/channels/FileChannel;
        //   175: invokestatic    android/support/multidex/b.a:(Ljava/io/Closeable;)V
        //   178: aload_1        
        //   179: athrow         
        //   180: astore_1       
        //   181: aload_0        
        //   182: getfield        android/support/multidex/b.d:Ljava/io/RandomAccessFile;
        //   185: invokestatic    android/support/multidex/b.a:(Ljava/io/Closeable;)V
        //   188: aload_1        
        //   189: athrow         
        //   190: astore_1       
        //   191: goto            181
        //   194: astore_1       
        //   195: goto            181
        //   198: astore_1       
        //   199: goto            171
        //   202: astore_1       
        //   203: goto            171
        //   206: astore_1       
        //   207: goto            171
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  92     103    180    181    Ljava/io/IOException;
        //  92     103    190    194    Ljava/lang/RuntimeException;
        //  92     103    194    198    Ljava/lang/Error;
        //  103    142    202    206    Ljava/io/IOException;
        //  103    142    206    210    Ljava/lang/RuntimeException;
        //  103    142    198    202    Ljava/lang/Error;
        //  142    170    180    181    Ljava/io/IOException;
        //  142    170    190    194    Ljava/lang/RuntimeException;
        //  142    170    194    198    Ljava/lang/Error;
        //  171    180    180    181    Ljava/io/IOException;
        //  171    180    190    194    Ljava/lang/RuntimeException;
        //  171    180    194    198    Ljava/lang/Error;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0171:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    private static long a(final File file) {
        long lastModified;
        final long n = lastModified = file.lastModified();
        if (n == -1L) {
            lastModified = n - 1L;
        }
        return lastModified;
    }
    
    private static SharedPreferences a(final Context context) {
        int n;
        if (Build$VERSION.SDK_INT < 11) {
            n = 0;
        }
        else {
            n = 4;
        }
        return context.getSharedPreferences("multidex.version", n);
    }
    
    private List<a> a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: aload_0        
        //     8: getfield        android/support/multidex/b.a:Ljava/io/File;
        //    11: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    14: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    17: ldc             ".classes"
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    25: astore          8
        //    27: aload_0        
        //    28: invokespecial   android/support/multidex/b.b:()V
        //    31: new             Ljava/util/ArrayList;
        //    34: dup            
        //    35: invokespecial   java/util/ArrayList.<init>:()V
        //    38: astore          6
        //    40: new             Ljava/util/zip/ZipFile;
        //    43: dup            
        //    44: aload_0        
        //    45: getfield        android/support/multidex/b.a:Ljava/io/File;
        //    48: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/io/File;)V
        //    51: astore          7
        //    53: aload           7
        //    55: new             Ljava/lang/StringBuilder;
        //    58: dup            
        //    59: invokespecial   java/lang/StringBuilder.<init>:()V
        //    62: ldc             "classes"
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: iconst_2       
        //    68: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    71: ldc             ".dex"
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: invokevirtual   java/util/zip/ZipFile.getEntry:(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
        //    82: astore          4
        //    84: iconst_2       
        //    85: istore_3       
        //    86: aload           4
        //    88: ifnull          475
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: aload           8
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: iload_3        
        //   104: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   107: ldc             ".zip"
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   115: astore          5
        //   117: new             Landroid/support/multidex/b$a;
        //   120: dup            
        //   121: aload_0        
        //   122: getfield        android/support/multidex/b.c:Ljava/io/File;
        //   125: aload           5
        //   127: invokespecial   android/support/multidex/b$a.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   130: astore          9
        //   132: aload           6
        //   134: aload           9
        //   136: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   141: pop            
        //   142: ldc             "MultiDex"
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: ldc             "Extraction is needed for file "
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: aload           9
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   167: pop            
        //   168: iconst_0       
        //   169: istore_1       
        //   170: iconst_0       
        //   171: istore_2       
        //   172: iload_2        
        //   173: iconst_3       
        //   174: if_icmpge       378
        //   177: iload_1        
        //   178: ifne            378
        //   181: iload_2        
        //   182: iconst_1       
        //   183: iadd           
        //   184: istore_2       
        //   185: aload           7
        //   187: aload           4
        //   189: aload           9
        //   191: aload           8
        //   193: invokestatic    android/support/multidex/b.a:(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Ljava/lang/String;)V
        //   196: aload           9
        //   198: aload           9
        //   200: invokestatic    android/support/multidex/b.b:(Ljava/io/File;)J
        //   203: putfield        android/support/multidex/b$a.a:J
        //   206: iconst_1       
        //   207: istore_1       
        //   208: new             Ljava/lang/StringBuilder;
        //   211: dup            
        //   212: invokespecial   java/lang/StringBuilder.<init>:()V
        //   215: ldc             "Extraction "
        //   217: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   220: astore          10
        //   222: iload_1        
        //   223: ifeq            516
        //   226: ldc             "succeeded"
        //   228: astore          5
        //   230: ldc             "MultiDex"
        //   232: aload           10
        //   234: aload           5
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: ldc             " '"
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: aload           9
        //   246: invokevirtual   android/support/multidex/b$a.getAbsolutePath:()Ljava/lang/String;
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: ldc             "': length "
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: aload           9
        //   259: invokevirtual   android/support/multidex/b$a.length:()J
        //   262: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   265: ldc             " - crc: "
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: aload           9
        //   272: getfield        android/support/multidex/b$a.a:J
        //   275: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   278: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   281: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   284: pop            
        //   285: iload_1        
        //   286: ifne            513
        //   289: aload           9
        //   291: invokevirtual   android/support/multidex/b$a.delete:()Z
        //   294: pop            
        //   295: aload           9
        //   297: invokevirtual   android/support/multidex/b$a.exists:()Z
        //   300: ifeq            513
        //   303: ldc             "MultiDex"
        //   305: new             Ljava/lang/StringBuilder;
        //   308: dup            
        //   309: invokespecial   java/lang/StringBuilder.<init>:()V
        //   312: ldc             "Failed to delete corrupted secondary dex '"
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: aload           9
        //   319: invokevirtual   android/support/multidex/b$a.getPath:()Ljava/lang/String;
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   325: ldc             "'"
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   330: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   333: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   336: pop            
        //   337: goto            172
        //   340: astore          5
        //   342: ldc             "MultiDex"
        //   344: new             Ljava/lang/StringBuilder;
        //   347: dup            
        //   348: invokespecial   java/lang/StringBuilder.<init>:()V
        //   351: ldc             "Failed to read crc from "
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: aload           9
        //   358: invokevirtual   android/support/multidex/b$a.getAbsolutePath:()Ljava/lang/String;
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   364: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   367: aload           5
        //   369: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   372: pop            
        //   373: iconst_0       
        //   374: istore_1       
        //   375: goto            208
        //   378: iload_1        
        //   379: ifne            437
        //   382: new             Ljava/io/IOException;
        //   385: dup            
        //   386: new             Ljava/lang/StringBuilder;
        //   389: dup            
        //   390: invokespecial   java/lang/StringBuilder.<init>:()V
        //   393: ldc             "Could not create zip file "
        //   395: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   398: aload           9
        //   400: invokevirtual   android/support/multidex/b$a.getAbsolutePath:()Ljava/lang/String;
        //   403: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   406: ldc             " for secondary dex ("
        //   408: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   411: iload_3        
        //   412: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   415: ldc             ")"
        //   417: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   420: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   423: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   426: athrow         
        //   427: astore          4
        //   429: aload           7
        //   431: invokevirtual   java/util/zip/ZipFile.close:()V
        //   434: aload           4
        //   436: athrow         
        //   437: iload_3        
        //   438: iconst_1       
        //   439: iadd           
        //   440: istore_3       
        //   441: aload           7
        //   443: new             Ljava/lang/StringBuilder;
        //   446: dup            
        //   447: invokespecial   java/lang/StringBuilder.<init>:()V
        //   450: ldc             "classes"
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: iload_3        
        //   456: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   459: ldc             ".dex"
        //   461: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   464: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   467: invokevirtual   java/util/zip/ZipFile.getEntry:(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
        //   470: astore          4
        //   472: goto            86
        //   475: aload           7
        //   477: invokevirtual   java/util/zip/ZipFile.close:()V
        //   480: aload           6
        //   482: areturn        
        //   483: astore          4
        //   485: ldc             "MultiDex"
        //   487: ldc             "Failed to close resource"
        //   489: aload           4
        //   491: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   494: pop            
        //   495: aload           6
        //   497: areturn        
        //   498: astore          5
        //   500: ldc             "MultiDex"
        //   502: ldc             "Failed to close resource"
        //   504: aload           5
        //   506: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   509: pop            
        //   510: goto            434
        //   513: goto            172
        //   516: ldc             "failed"
        //   518: astore          5
        //   520: goto            230
        //    Signature:
        //  ()Ljava/util/List<Landroid/support/multidex/b$a;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  53     84     427    437    Any
        //  91     168    427    437    Any
        //  185    196    427    437    Any
        //  196    206    340    378    Ljava/io/IOException;
        //  196    206    427    437    Any
        //  208    222    427    437    Any
        //  230    285    427    437    Any
        //  289    337    427    437    Any
        //  342    373    427    437    Any
        //  382    427    427    437    Any
        //  429    434    498    513    Ljava/io/IOException;
        //  441    472    427    437    Any
        //  475    480    483    498    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0434:
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
    
    private List<a> a(final Context context, final String s) {
        Log.i("MultiDex", "loading existing secondary dex files");
        final String string = this.a.getName() + ".classes";
        final SharedPreferences a = a(context);
        final int int1 = a.getInt(s + "dex.number", 1);
        final ArrayList list = new ArrayList<a>(int1 - 1);
        for (int i = 2; i <= int1; ++i) {
            final a a2 = new a(this.c, string + i + ".zip");
            if (!a2.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + a2.getPath() + "'");
            }
            a2.a = b(a2);
            final long long1 = a.getLong(s + "dex.crc." + i, -1L);
            final long long2 = a.getLong(s + "dex.time." + i, -1L);
            final long lastModified = a2.lastModified();
            if (long2 != lastModified || long1 != a2.a) {
                throw new IOException("Invalid extracted dex: " + a2 + " (key \"" + s + "\"), expected modification time: " + long2 + ", modification time: " + lastModified + ", expected crc: " + long1 + ", file crc: " + a2.a);
            }
            list.add(a2);
        }
        return (List<a>)list;
    }
    
    private static void a(final Context context, final String s, final long n, final long n2, final List<a> list) {
        final SharedPreferences$Editor edit = a(context).edit();
        edit.putLong(s + "timestamp", n);
        edit.putLong(s + "crc", n2);
        edit.putInt(s + "dex.number", list.size() + 1);
        final Iterator<a> iterator = list.iterator();
        int n3 = 2;
        while (iterator.hasNext()) {
            final a a = iterator.next();
            edit.putLong(s + "dex.crc." + n3, a.a);
            edit.putLong(s + "dex.time." + n3, a.lastModified());
            ++n3;
        }
        edit.commit();
    }
    
    private static void a(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (IOException ex) {
            Log.w("MultiDex", "Failed to close resource", (Throwable)ex);
        }
    }
    
    private static void a(final ZipFile p0, final ZipEntry p1, final File p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //     5: astore_0       
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: ldc_w           "tmp-"
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: aload_3        
        //    20: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    23: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    26: ldc             ".zip"
        //    28: aload_2        
        //    29: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    32: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
        //    35: astore_3       
        //    36: ldc             "MultiDex"
        //    38: new             Ljava/lang/StringBuilder;
        //    41: dup            
        //    42: invokespecial   java/lang/StringBuilder.<init>:()V
        //    45: ldc_w           "Extracting "
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: aload_3        
        //    52: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    61: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    64: pop            
        //    65: new             Ljava/util/zip/ZipOutputStream;
        //    68: dup            
        //    69: new             Ljava/io/BufferedOutputStream;
        //    72: dup            
        //    73: new             Ljava/io/FileOutputStream;
        //    76: dup            
        //    77: aload_3        
        //    78: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    81: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    84: invokespecial   java/util/zip/ZipOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    87: astore          5
        //    89: new             Ljava/util/zip/ZipEntry;
        //    92: dup            
        //    93: ldc_w           "classes.dex"
        //    96: invokespecial   java/util/zip/ZipEntry.<init>:(Ljava/lang/String;)V
        //    99: astore          6
        //   101: aload           6
        //   103: aload_1        
        //   104: invokevirtual   java/util/zip/ZipEntry.getTime:()J
        //   107: invokevirtual   java/util/zip/ZipEntry.setTime:(J)V
        //   110: aload           5
        //   112: aload           6
        //   114: invokevirtual   java/util/zip/ZipOutputStream.putNextEntry:(Ljava/util/zip/ZipEntry;)V
        //   117: sipush          16384
        //   120: newarray        B
        //   122: astore_1       
        //   123: aload_0        
        //   124: aload_1        
        //   125: invokevirtual   java/io/InputStream.read:([B)I
        //   128: istore          4
        //   130: iload           4
        //   132: iconst_m1      
        //   133: if_icmpeq       155
        //   136: aload           5
        //   138: aload_1        
        //   139: iconst_0       
        //   140: iload           4
        //   142: invokevirtual   java/util/zip/ZipOutputStream.write:([BII)V
        //   145: aload_0        
        //   146: aload_1        
        //   147: invokevirtual   java/io/InputStream.read:([B)I
        //   150: istore          4
        //   152: goto            130
        //   155: aload           5
        //   157: invokevirtual   java/util/zip/ZipOutputStream.closeEntry:()V
        //   160: aload           5
        //   162: invokevirtual   java/util/zip/ZipOutputStream.close:()V
        //   165: aload_3        
        //   166: invokevirtual   java/io/File.setReadOnly:()Z
        //   169: ifne            242
        //   172: new             Ljava/io/IOException;
        //   175: dup            
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: ldc_w           "Failed to mark readonly \""
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: aload_3        
        //   190: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: ldc_w           "\" (tmp of \""
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: aload_2        
        //   203: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   206: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   209: ldc_w           "\")"
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   218: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   221: athrow         
        //   222: astore_1       
        //   223: aload_0        
        //   224: invokestatic    android/support/multidex/b.a:(Ljava/io/Closeable;)V
        //   227: aload_3        
        //   228: invokevirtual   java/io/File.delete:()Z
        //   231: pop            
        //   232: aload_1        
        //   233: athrow         
        //   234: astore_1       
        //   235: aload           5
        //   237: invokevirtual   java/util/zip/ZipOutputStream.close:()V
        //   240: aload_1        
        //   241: athrow         
        //   242: ldc             "MultiDex"
        //   244: new             Ljava/lang/StringBuilder;
        //   247: dup            
        //   248: invokespecial   java/lang/StringBuilder.<init>:()V
        //   251: ldc_w           "Renaming to "
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: aload_2        
        //   258: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   267: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   270: pop            
        //   271: aload_3        
        //   272: aload_2        
        //   273: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   276: ifne            329
        //   279: new             Ljava/io/IOException;
        //   282: dup            
        //   283: new             Ljava/lang/StringBuilder;
        //   286: dup            
        //   287: invokespecial   java/lang/StringBuilder.<init>:()V
        //   290: ldc_w           "Failed to rename \""
        //   293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   296: aload_3        
        //   297: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: ldc_w           "\" to \""
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: aload_2        
        //   310: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: ldc_w           "\""
        //   319: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   322: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   325: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   328: athrow         
        //   329: aload_0        
        //   330: invokestatic    android/support/multidex/b.a:(Ljava/io/Closeable;)V
        //   333: aload_3        
        //   334: invokevirtual   java/io/File.delete:()Z
        //   337: pop            
        //   338: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  65     89     222    234    Any
        //  89     130    234    242    Any
        //  136    152    234    242    Any
        //  155    160    234    242    Any
        //  160    222    222    234    Any
        //  235    242    222    234    Any
        //  242    329    222    234    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0130:
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
    
    private static boolean a(final Context context, final File file, final long n, final String s) {
        final SharedPreferences a = a(context);
        return a.getLong(s + "timestamp", -1L) != a(file) || a.getLong(s + "crc", -1L) != n;
    }
    
    private static long b(final File file) {
        long a;
        final long n = a = c.a(file);
        if (n == -1L) {
            a = n - 1L;
        }
        return a;
    }
    
    private void b() {
        final File[] listFiles = this.c.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.c.getPath() + ").");
        }
        else {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                final File file = listFiles[i];
                Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
                if (!file.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file.getPath());
                }
                else {
                    Log.i("MultiDex", "Deleted old file " + file.getPath());
                }
            }
        }
    }
    
    List<? extends File> a(Context a, final String s, final boolean b) {
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.a.getPath() + ", " + b + ", " + s + ")");
        if (!this.f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        while (true) {
            Label_0189: {
                if (b || a((Context)a, this.a, this.b, s)) {
                    break Label_0189;
                }
                try {
                    a = this.a((Context)a, s);
                    Log.i("MultiDex", "load found " + ((List)a).size() + " secondary dex files");
                    return (List<? extends File>)a;
                }
                catch (IOException ex) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", (Throwable)ex);
                    final List<a> a2 = this.a();
                    a((Context)a, s, a(this.a), this.b, a2);
                    a = a2;
                    continue;
                }
            }
            if (b) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            }
            else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            final List<a> a3 = this.a();
            a((Context)a, s, a(this.a), this.b, a3);
            a = a3;
            continue;
        }
    }
    
    @Override
    public void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }
    
    private static class a extends File
    {
        public long a;
        
        public a(final File file, final String s) {
            super(file, s);
            this.a = -1L;
        }
    }
}
