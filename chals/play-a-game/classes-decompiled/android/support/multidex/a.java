// 
// Decompiled by Procyon v0.5.30
// 

package android.support.multidex;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.zip.ZipFile;
import java.lang.reflect.Constructor;
import dalvik.system.DexFile;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.io.IOException;
import android.content.Context;
import java.util.HashSet;
import java.io.File;
import java.util.Set;

public final class a
{
    private static final Set<File> a;
    private static final boolean b;
    
    static {
        a = new HashSet<File>();
        b = a(System.getProperty("java.vm.version"));
    }
    
    private static File a(Context context, File file, final String s) {
        file = new File(file, "code_cache");
        while (true) {
            try {
                a(file);
                context = (Context)file;
                context = (Context)new File((File)context, s);
                a((File)context);
                return (File)context;
            }
            catch (IOException ex) {
                context = (Context)new File(context.getFilesDir(), "code_cache");
                a((File)context);
                continue;
            }
            break;
        }
    }
    
    public static void a(final Context context) {
        Log.i("MultiDex", "Installing application");
        if (android.support.multidex.a.b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        if (Build$VERSION.SDK_INT < 4) {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build$VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
        }
        ApplicationInfo b;
        try {
            b = b(context);
            if (b == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
        }
        catch (Exception ex) {
            Log.e("MultiDex", "MultiDex installation failure", (Throwable)ex);
            throw new RuntimeException("MultiDex installation failed (" + ex.getMessage() + ").");
        }
        a(context, new File(b.sourceDir), new File(b.dataDir), "secondary-dexes", "", true);
        Log.i("MultiDex", "install done");
    }
    
    private static void a(final Context p0, final File p1, final File p2, final String p3, final String p4, final boolean p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/multidex/a.a:Ljava/util/Set;
        //     3: astore          6
        //     5: aload           6
        //     7: monitorenter   
        //     8: getstatic       android/support/multidex/a.a:Ljava/util/Set;
        //    11: aload_1        
        //    12: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    17: ifeq            24
        //    20: aload           6
        //    22: monitorexit    
        //    23: return         
        //    24: getstatic       android/support/multidex/a.a:Ljava/util/Set;
        //    27: aload_1        
        //    28: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    33: pop            
        //    34: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    37: bipush          20
        //    39: if_icmple       107
        //    42: ldc             "MultiDex"
        //    44: new             Ljava/lang/StringBuilder;
        //    47: dup            
        //    48: invokespecial   java/lang/StringBuilder.<init>:()V
        //    51: ldc             "MultiDex is not guaranteed to work in SDK version "
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    56: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    59: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    62: ldc             ": SDK version higher than "
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: bipush          20
        //    69: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    72: ldc             " should be backed by "
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: ldc             "runtime with built-in multidex capabilty but it's not the "
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: ldc             "case here: java.vm.version=\""
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: ldc             "java.vm.version"
        //    89: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: ldc             "\""
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   100: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   103: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   106: pop            
        //   107: aload_0        
        //   108: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //   111: astore          7
        //   113: aload           7
        //   115: ifnonnull       150
        //   118: ldc             "MultiDex"
        //   120: ldc             "Context class loader is null. Must be running in test mode. Skip patching."
        //   122: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   125: pop            
        //   126: aload           6
        //   128: monitorexit    
        //   129: return         
        //   130: astore_0       
        //   131: aload           6
        //   133: monitorexit    
        //   134: aload_0        
        //   135: athrow         
        //   136: astore_0       
        //   137: ldc             "MultiDex"
        //   139: ldc             "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
        //   141: aload_0        
        //   142: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   145: pop            
        //   146: aload           6
        //   148: monitorexit    
        //   149: return         
        //   150: aload_0        
        //   151: invokestatic    android/support/multidex/a.c:(Landroid/content/Context;)V
        //   154: aload_0        
        //   155: aload_2        
        //   156: aload_3        
        //   157: invokestatic    android/support/multidex/a.a:(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
        //   160: astore_2       
        //   161: new             Landroid/support/multidex/b;
        //   164: dup            
        //   165: aload_1        
        //   166: aload_2        
        //   167: invokespecial   android/support/multidex/b.<init>:(Ljava/io/File;Ljava/io/File;)V
        //   170: astore_3       
        //   171: aconst_null    
        //   172: astore_1       
        //   173: aload_3        
        //   174: aload_0        
        //   175: aload           4
        //   177: iconst_0       
        //   178: invokevirtual   android/support/multidex/b.a:(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;
        //   181: astore          8
        //   183: aload           7
        //   185: aload_2        
        //   186: aload           8
        //   188: invokestatic    android/support/multidex/a.a:(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
        //   191: aload_3        
        //   192: invokevirtual   android/support/multidex/b.close:()V
        //   195: aload_1        
        //   196: astore_0       
        //   197: aload_0        
        //   198: ifnull          262
        //   201: aload_0        
        //   202: athrow         
        //   203: astore          8
        //   205: ldc             "MultiDex"
        //   207: ldc             "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
        //   209: aload           8
        //   211: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   214: pop            
        //   215: goto            154
        //   218: astore          8
        //   220: iload           5
        //   222: ifne            235
        //   225: aload           8
        //   227: athrow         
        //   228: astore_0       
        //   229: aload_3        
        //   230: invokevirtual   android/support/multidex/b.close:()V
        //   233: aload_0        
        //   234: athrow         
        //   235: ldc             "MultiDex"
        //   237: ldc             "Failed to install extracted secondary dex files, retrying with forced extraction"
        //   239: aload           8
        //   241: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   244: pop            
        //   245: aload           7
        //   247: aload_2        
        //   248: aload_3        
        //   249: aload_0        
        //   250: aload           4
        //   252: iconst_1       
        //   253: invokevirtual   android/support/multidex/b.a:(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;
        //   256: invokestatic    android/support/multidex/a.a:(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
        //   259: goto            191
        //   262: aload           6
        //   264: monitorexit    
        //   265: return         
        //   266: astore_0       
        //   267: goto            197
        //   270: astore_1       
        //   271: goto            233
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  8      23     130    136    Any
        //  24     107    130    136    Any
        //  107    113    136    150    Ljava/lang/RuntimeException;
        //  107    113    130    136    Any
        //  118    129    130    136    Any
        //  131    134    130    136    Any
        //  137    149    130    136    Any
        //  150    154    203    218    Ljava/lang/Throwable;
        //  150    154    130    136    Any
        //  154    171    130    136    Any
        //  173    183    228    235    Any
        //  183    191    218    262    Ljava/io/IOException;
        //  183    191    228    235    Any
        //  191    195    266    270    Ljava/io/IOException;
        //  191    195    130    136    Any
        //  201    203    130    136    Any
        //  205    215    130    136    Any
        //  225    228    228    235    Any
        //  229    233    270    274    Ljava/io/IOException;
        //  229    233    130    136    Any
        //  233    235    130    136    Any
        //  235    259    228    235    Any
        //  262    265    130    136    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:657)
        //     at java.util.ArrayList.get(ArrayList.java:433)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    private static void a(final File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            final File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            }
            else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
    
    private static void a(final ClassLoader classLoader, final File file, final List<? extends File> list) {
        if (!list.isEmpty()) {
            if (Build$VERSION.SDK_INT >= 19) {
                android.support.multidex.a.b.a(classLoader, list, file);
            }
            else {
                if (Build$VERSION.SDK_INT >= 14) {
                    android.support.multidex.a.a.a(classLoader, list);
                    return;
                }
                c.a(classLoader, list);
            }
        }
    }
    
    static boolean a(String s) {
        boolean b2;
        final boolean b = b2 = false;
        while (true) {
            if (s == null) {
                break Label_0076;
            }
            final Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(s);
            b2 = b;
            if (!matcher.matches()) {
                break Label_0076;
            }
            try {
                final int int1 = Integer.parseInt(matcher.group(1));
                final int int2 = Integer.parseInt(matcher.group(2));
                if (int1 <= 2) {
                    b2 = b;
                    if (int1 != 2) {
                        break Label_0076;
                    }
                    b2 = b;
                    if (int2 < 1) {
                        break Label_0076;
                    }
                }
                b2 = true;
                final StringBuilder append = new StringBuilder().append("VM with version ").append(s);
                if (b2) {
                    s = " has multidex support";
                }
                else {
                    s = " does not have multidex support";
                }
                Log.i("MultiDex", append.append(s).toString());
                return b2;
            }
            catch (NumberFormatException ex) {
                b2 = b;
                continue;
            }
            break;
        }
    }
    
    private static ApplicationInfo b(final Context context) {
        try {
            return context.getApplicationInfo();
        }
        catch (RuntimeException ex) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", (Throwable)ex);
            return null;
        }
    }
    
    private static Field b(final Object o, final String s) {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            try {
                final Field declaredField = clazz.getDeclaredField(s);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            }
            catch (NoSuchFieldException ex) {
                clazz = clazz.getSuperclass();
                continue;
            }
            break;
        }
        throw new NoSuchFieldException("Field " + s + " not found in " + o.getClass());
    }
    
    private static Method b(final Object o, final String s, final Class<?>... array) {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            try {
                final Method declaredMethod = clazz.getDeclaredMethod(s, array);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            }
            catch (NoSuchMethodException ex) {
                clazz = clazz.getSuperclass();
                continue;
            }
            break;
        }
        throw new NoSuchMethodException("Method " + s + " with parameters " + Arrays.asList(array) + " not found in " + o.getClass());
    }
    
    private static void b(final Object o, final String s, final Object[] array) {
        final Field b = b(o, s);
        final Object[] array2 = (Object[])b.get(o);
        final Object[] array3 = (Object[])Array.newInstance(array2.getClass().getComponentType(), array2.length + array.length);
        System.arraycopy(array2, 0, array3, 0, array2.length);
        System.arraycopy(array, 0, array3, array2.length, array.length);
        b.set(o, array3);
    }
    
    private static void c(final Context context) {
        final File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            final File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
            }
            else {
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    final File file2 = listFiles[i];
                    Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                    if (!file2.delete()) {
                        Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                    }
                    else {
                        Log.i("MultiDex", "Deleted old file " + file2.getPath());
                    }
                }
                if (!file.delete()) {
                    Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                    return;
                }
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            }
        }
    }
    
    private static final class a
    {
        private static final int a;
        private final a b;
        
        static {
            a = ".zip".length();
        }
        
        private a() {
            final Class<?> forName = Class.forName("dalvik.system.DexPathList$Element");
            try {
                final a b = new b(forName);
                this.b = b;
            }
            catch (NoSuchMethodException ex) {
                try {
                    final a b = new c(forName);
                }
                catch (NoSuchMethodException ex2) {
                    final a b = new d(forName);
                }
            }
        }
        
        private static String a(final File file) {
            final File parentFile = file.getParentFile();
            final String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - android.support.multidex.a.a.a) + ".dex").getPath();
        }
        
        static void a(ClassLoader value, List<? extends File> a) {
            value = (ClassLoader)b(value, "pathList").get(value);
            a = new a().a((List<? extends File>)a);
            try {
                b(value, "dexElements", a);
            }
            catch (NoSuchFieldException ex) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", (Throwable)ex);
                b(value, "pathElements", a);
            }
        }
        
        private Object[] a(final List<? extends File> list) {
            final Object[] array = new Object[list.size()];
            for (int i = 0; i < array.length; ++i) {
                final File file = (File)list.get(i);
                array[i] = this.b.a(file, DexFile.loadDex(file.getPath(), a(file), 0));
            }
            return array;
        }
        
        private interface a
        {
            Object a(final File p0, final DexFile p1);
        }
        
        private static class b implements a
        {
            private final Constructor<?> a;
            
            b(final Class<?> clazz) {
                (this.a = clazz.getConstructor(File.class, ZipFile.class, DexFile.class)).setAccessible(true);
            }
            
            @Override
            public Object a(final File file, final DexFile dexFile) {
                return this.a.newInstance(file, new ZipFile(file), dexFile);
            }
        }
        
        private static class c implements a
        {
            private final Constructor<?> a;
            
            c(final Class<?> clazz) {
                (this.a = clazz.getConstructor(File.class, File.class, DexFile.class)).setAccessible(true);
            }
            
            @Override
            public Object a(final File file, final DexFile dexFile) {
                return this.a.newInstance(file, file, dexFile);
            }
        }
        
        private static class d implements a
        {
            private final Constructor<?> a;
            
            d(final Class<?> clazz) {
                (this.a = clazz.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class)).setAccessible(true);
            }
            
            @Override
            public Object a(final File file, final DexFile dexFile) {
                return this.a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }
    }
    
    private static final class b
    {
        static void a(final ClassLoader classLoader, final List<? extends File> list, final File file) {
            final Object value = b(classLoader, "pathList").get(classLoader);
            final ArrayList<IOException> list2 = new ArrayList<IOException>();
            b(value, "dexElements", a(value, new ArrayList<File>(list), file, list2));
            if (list2.size() > 0) {
                final Iterator<IOException> iterator = list2.iterator();
                while (iterator.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (Throwable)iterator.next());
                }
                final Field a = b(value, "dexElementsSuppressedExceptions");
                final IOException[] array = (IOException[])a.get(value);
                IOException[] array2;
                if (array == null) {
                    array2 = list2.toArray(new IOException[list2.size()]);
                }
                else {
                    array2 = new IOException[list2.size() + array.length];
                    list2.toArray(array2);
                    System.arraycopy(array, 0, array2, list2.size(), array.length);
                }
                a.set(value, array2);
                final IOException ex = new IOException("I/O exception during makeDexElement");
                ex.initCause(list2.get(0));
                throw ex;
            }
        }
        
        private static Object[] a(final Object o, final ArrayList<File> list, final File file, final ArrayList<IOException> list2) {
            return (Object[])b(o, "makeDexElements", (Class<?>[])new Class[] { ArrayList.class, File.class, ArrayList.class }).invoke(o, list, file, list2);
        }
    }
    
    private static final class c
    {
        static void a(final ClassLoader classLoader, final List<? extends File> list) {
            final int size = list.size();
            final Field a = b(classLoader, "path");
            final StringBuilder sb = new StringBuilder((String)a.get(classLoader));
            final String[] array = new String[size];
            final File[] array2 = new File[size];
            final ZipFile[] array3 = new ZipFile[size];
            final DexFile[] array4 = new DexFile[size];
            final ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                final File file = (File)listIterator.next();
                final String absolutePath = file.getAbsolutePath();
                sb.append(':').append(absolutePath);
                final int previousIndex = listIterator.previousIndex();
                array[previousIndex] = absolutePath;
                array2[previousIndex] = file;
                array3[previousIndex] = new ZipFile(file);
                array4[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            a.set(classLoader, sb.toString());
            b(classLoader, "mPaths", array);
            b(classLoader, "mFiles", array2);
            b(classLoader, "mZips", array3);
            b(classLoader, "mDexs", array4);
        }
    }
}
