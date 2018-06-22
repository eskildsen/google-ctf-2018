// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.f;

import java.util.concurrent.Callable;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.HandlerThread;

public class c
{
    private final Object a;
    private HandlerThread b;
    private Handler c;
    private int d;
    private Handler$Callback e;
    private final int f;
    private final int g;
    private final String h;
    
    public c(final String h, final int g, final int f) {
        this.a = new Object();
        this.e = (Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(final Message message) {
                switch (message.what) {
                    default: {
                        return true;
                    }
                    case 1: {
                        android.support.v4.f.c.this.b((Runnable)message.obj);
                        return true;
                    }
                    case 0: {
                        android.support.v4.f.c.this.a();
                        return true;
                    }
                }
            }
        };
        this.h = h;
        this.g = g;
        this.f = f;
        this.d = 0;
    }
    
    private void a() {
        synchronized (this.a) {
            if (this.c.hasMessages(1)) {
                return;
            }
            this.b.quit();
            this.b = null;
            this.c = null;
        }
    }
    
    private void a(final Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                (this.b = new HandlerThread(this.h, this.g)).start();
                this.c = new Handler(this.b.getLooper(), this.e);
                ++this.d;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, (Object)runnable));
        }
    }
    
    private void b(final Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            this.c.sendMessageDelayed(this.c.obtainMessage(0), (long)this.f);
        }
    }
    
    public <T> T a(final Callable<T> p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/util/concurrent/locks/ReentrantLock;
        //     3: dup            
        //     4: invokespecial   java/util/concurrent/locks/ReentrantLock.<init>:()V
        //     7: astore          7
        //     9: aload           7
        //    11: invokevirtual   java/util/concurrent/locks/ReentrantLock.newCondition:()Ljava/util/concurrent/locks/Condition;
        //    14: astore          8
        //    16: new             Ljava/util/concurrent/atomic/AtomicReference;
        //    19: dup            
        //    20: invokespecial   java/util/concurrent/atomic/AtomicReference.<init>:()V
        //    23: astore          9
        //    25: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    28: dup            
        //    29: iconst_1       
        //    30: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    33: astore          10
        //    35: aload_0        
        //    36: new             Landroid/support/v4/f/c$3;
        //    39: dup            
        //    40: aload_0        
        //    41: aload           9
        //    43: aload_1        
        //    44: aload           7
        //    46: aload           10
        //    48: aload           8
        //    50: invokespecial   android/support/v4/f/c$3.<init>:(Landroid/support/v4/f/c;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/Callable;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/locks/Condition;)V
        //    53: invokespecial   android/support/v4/f/c.a:(Ljava/lang/Runnable;)V
        //    56: aload           7
        //    58: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    61: aload           10
        //    63: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    66: ifne            82
        //    69: aload           9
        //    71: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    74: astore_1       
        //    75: aload           7
        //    77: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    80: aload_1        
        //    81: areturn        
        //    82: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //    85: iload_2        
        //    86: i2l            
        //    87: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //    90: lstore_3       
        //    91: aload           8
        //    93: lload_3        
        //    94: invokeinterface java/util/concurrent/locks/Condition.awaitNanos:(J)J
        //    99: lstore          5
        //   101: aload           10
        //   103: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   106: ifne            122
        //   109: aload           9
        //   111: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   114: astore_1       
        //   115: aload           7
        //   117: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   120: aload_1        
        //   121: areturn        
        //   122: lload           5
        //   124: lstore_3       
        //   125: lload           5
        //   127: lconst_0       
        //   128: lcmp           
        //   129: ifgt            91
        //   132: new             Ljava/lang/InterruptedException;
        //   135: dup            
        //   136: ldc             "timeout"
        //   138: invokespecial   java/lang/InterruptedException.<init>:(Ljava/lang/String;)V
        //   141: athrow         
        //   142: astore_1       
        //   143: aload           7
        //   145: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   148: aload_1        
        //   149: athrow         
        //   150: astore_1       
        //   151: lload_3        
        //   152: lstore          5
        //   154: goto            101
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TT;>;I)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  61     75     142    150    Any
        //  82     91     142    150    Any
        //  91     101    150    157    Ljava/lang/InterruptedException;
        //  91     101    142    150    Any
        //  101    115    142    150    Any
        //  132    142    142    150    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0091:
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
    
    public <T> void a(final Callable<T> callable, final a<T> a) {
        this.a(new Runnable() {
            final /* synthetic */ Handler b = new Handler();
            
            @Override
            public void run() {
                while (true) {
                    try {
                        final Object call = callable.call();
                        this.b.post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                a.a(call);
                            }
                        });
                    }
                    catch (Exception ex) {
                        final Object call = null;
                        continue;
                    }
                    break;
                }
            }
        });
    }
    
    public interface a<T>
    {
        void a(final T p0);
    }
}
