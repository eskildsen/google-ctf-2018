.class final Landroid/support/v4/a/n;
.super Landroid/support/v4/a/m;

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/a/n$d;,
        Landroid/support/v4/a/n$a;,
        Landroid/support/v4/a/n$b;,
        Landroid/support/v4/a/n$c;,
        Landroid/support/v4/a/n$g;,
        Landroid/support/v4/a/n$f;,
        Landroid/support/v4/a/n$e;
    }
.end annotation


# static fields
.field static final E:Landroid/view/animation/Interpolator;

.field static final F:Landroid/view/animation/Interpolator;

.field static final G:Landroid/view/animation/Interpolator;

.field static final H:Landroid/view/animation/Interpolator;

.field static a:Z

.field static q:Ljava/lang/reflect/Field;


# instance fields
.field A:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/n$g;",
            ">;"
        }
    .end annotation
.end field

.field C:Landroid/support/v4/a/o;

.field D:Ljava/lang/Runnable;

.field private final I:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList",
            "<",
            "Landroid/support/v4/g/i",
            "<",
            "Landroid/support/v4/a/m$a;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/n$f;",
            ">;"
        }
    .end annotation
.end field

.field c:Z

.field d:I

.field final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/h;",
            ">;"
        }
    .end annotation
.end field

.field f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/a/h;",
            ">;"
        }
    .end annotation
.end field

.field g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/h;",
            ">;"
        }
    .end annotation
.end field

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/m$b;",
            ">;"
        }
    .end annotation
.end field

.field l:I

.field m:Landroid/support/v4/a/l;

.field n:Landroid/support/v4/a/j;

.field o:Landroid/support/v4/a/h;

.field p:Landroid/support/v4/a/h;

.field r:Z

.field s:Z

.field t:Z

.field u:Ljava/lang/String;

.field v:Z

.field w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;"
        }
    .end annotation
.end field

.field x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/h;",
            ">;"
        }
    .end annotation
.end field

.field z:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/high16 v2, 0x40200000    # 2.5f

    const/high16 v1, 0x3fc00000    # 1.5f

    const/4 v0, 0x0

    sput-boolean v0, Landroid/support/v4/a/n;->a:Z

    const/4 v0, 0x0

    sput-object v0, Landroid/support/v4/a/n;->q:Ljava/lang/reflect/Field;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/a/n;->E:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/a/n;->F:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v2}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/a/n;->G:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/a/n;->H:Landroid/view/animation/Interpolator;

    return-void
.end method

.method constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/support/v4/a/m;-><init>()V

    iput v1, p0, Landroid/support/v4/a/n;->d:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput v1, p0, Landroid/support/v4/a/n;->l:I

    iput-object v2, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    iput-object v2, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    new-instance v0, Landroid/support/v4/a/n$1;

    invoke-direct {v0, p0}, Landroid/support/v4/a/n$1;-><init>(Landroid/support/v4/a/n;)V

    iput-object v0, p0, Landroid/support/v4/a/n;->D:Ljava/lang/Runnable;

    return-void
.end method

.method private A()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/n$g;

    invoke-virtual {v0}, Landroid/support/v4/a/n$g;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private B()V
    .locals 8

    const/4 v3, 0x0

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-nez v0, :cond_2

    move v6, v3

    :goto_0
    move v7, v3

    :goto_1
    if-ge v7, v6, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/h;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/support/v4/a/h;->R()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Landroid/support/v4/a/h;->T()I

    move-result v2

    invoke-virtual {v1}, Landroid/support/v4/a/h;->R()Landroid/view/View;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/support/v4/a/h;->a(Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/view/animation/Animation;->cancel()V

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    :cond_0
    move-object v0, p0

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    :cond_1
    :goto_2
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    move v6, v0

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Landroid/support/v4/a/h;->S()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/support/v4/a/h;->S()Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    goto :goto_2

    :cond_4
    return-void
.end method

.method private C()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget-object v2, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->delete(I)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;IILandroid/support/v4/g/b;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;II",
            "Landroid/support/v4/g/b",
            "<",
            "Landroid/support/v4/a/h;",
            ">;)I"
        }
    .end annotation

    const/4 v3, 0x0

    add-int/lit8 v0, p4, -0x1

    move v4, v0

    move v2, p4

    :goto_0
    if-lt v4, p3, :cond_4

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v0}, Landroid/support/v4/a/c;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v1, v4, 0x1

    invoke-virtual {v0, p1, v1, p4}, Landroid/support/v4/a/c;->a(Ljava/util/ArrayList;II)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_5

    iget-object v1, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    :cond_0
    new-instance v1, Landroid/support/v4/a/n$g;

    invoke-direct {v1, v0, v5}, Landroid/support/v4/a/n$g;-><init>(Landroid/support/v4/a/c;Z)V

    iget-object v6, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Landroid/support/v4/a/c;->a(Landroid/support/v4/a/h$c;)V

    if-eqz v5, :cond_3

    invoke-virtual {v0}, Landroid/support/v4/a/c;->b()V

    :goto_2
    add-int/lit8 v1, v2, -0x1

    if-eq v4, v1, :cond_1

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_1
    invoke-direct {p0, p5}, Landroid/support/v4/a/n;->b(Landroid/support/v4/g/b;)V

    move v0, v1

    :goto_3
    add-int/lit8 v1, v4, -0x1

    move v4, v1

    move v2, v0

    goto :goto_0

    :cond_2
    move v1, v3

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v3}, Landroid/support/v4/a/c;->a(Z)V

    goto :goto_2

    :cond_4
    return v2

    :cond_5
    move v0, v2

    goto :goto_3
.end method

.method static a(Landroid/content/Context;FF)Landroid/support/v4/a/n$c;
    .locals 4

    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    sget-object v1, Landroid/support/v4/a/n;->F:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const-wide/16 v2, 0xdc

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    new-instance v1, Landroid/support/v4/a/n$c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Landroid/support/v4/a/n$c;-><init>(Landroid/view/animation/Animation;Landroid/support/v4/a/n$1;)V

    return-object v1
.end method

.method static a(Landroid/content/Context;FFFF)Landroid/support/v4/a/n$c;
    .locals 10

    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move v1, p1

    move v2, p2

    move v3, p1

    move v4, p2

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    sget-object v1, Landroid/support/v4/a/n;->E:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const-wide/16 v2, 0xdc

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p3, p4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    sget-object v1, Landroid/support/v4/a/n;->F:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const-wide/16 v2, 0xdc

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    new-instance v0, Landroid/support/v4/a/n$c;

    const/4 v1, 0x0

    invoke-direct {v0, v9, v1}, Landroid/support/v4/a/n$c;-><init>(Landroid/view/animation/Animation;Landroid/support/v4/a/n$1;)V

    return-object v0
.end method

.method private static a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation$AnimationListener;
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    sget-object v0, Landroid/support/v4/a/n;->q:Ljava/lang/reflect/Field;

    if-nez v0, :cond_0

    const-class v0, Landroid/view/animation/Animation;

    const-string v2, "mListener"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Landroid/support/v4/a/n;->q:Ljava/lang/reflect/Field;

    sget-object v0, Landroid/support/v4/a/n;->q:Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    :cond_0
    sget-object v0, Landroid/support/v4/a/n;->q:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/animation/Animation$AnimationListener;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "FragmentManager"

    const-string v3, "No field with the name mListener is found in Animation class"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v2, "FragmentManager"

    const-string v3, "Cannot access Animation\'s mListener field"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    goto :goto_0
.end method

.method private a(Landroid/support/v4/a/c;ZZZ)V
    .locals 7

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p2, :cond_4

    invoke-virtual {p1, p4}, Landroid/support/v4/a/c;->a(Z)V

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_0

    move-object v0, p0

    move v5, v4

    invoke-static/range {v0 .. v5}, Landroid/support/v4/a/s;->a(Landroid/support/v4/a/n;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    :cond_0
    if-eqz p4, :cond_1

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    invoke-virtual {p0, v0, v4}, Landroid/support/v4/a/n;->a(IZ)V

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    move v1, v3

    :goto_1
    if-ge v1, v2, :cond_6

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_3

    iget-object v4, v0, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v4, :cond_3

    iget-boolean v4, v0, Landroid/support/v4/a/h;->P:Z

    if-eqz v4, :cond_3

    iget v4, v0, Landroid/support/v4/a/h;->x:I

    invoke-virtual {p1, v4}, Landroid/support/v4/a/c;->b(I)Z

    move-result v4

    if-eqz v4, :cond_3

    iget v4, v0, Landroid/support/v4/a/h;->R:F

    cmpl-float v4, v4, v6

    if-lez v4, :cond_2

    iget-object v4, v0, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget v5, v0, Landroid/support/v4/a/h;->R:F

    invoke-virtual {v4, v5}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    if-eqz p4, :cond_5

    iput v6, v0, Landroid/support/v4/a/h;->R:F

    :cond_3
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Landroid/support/v4/a/c;->b()V

    goto :goto_0

    :cond_5
    const/high16 v4, -0x40800000    # -1.0f

    iput v4, v0, Landroid/support/v4/a/h;->R:F

    iput-boolean v3, v0, Landroid/support/v4/a/h;->P:Z

    goto :goto_2

    :cond_6
    return-void
.end method

.method private a(Landroid/support/v4/a/h;Landroid/support/v4/a/n$c;I)V
    .locals 4

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/support/v4/a/h;->b(I)V

    iget-object v1, p2, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    if-eqz v1, :cond_0

    iget-object v1, p2, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    iget-object v2, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/support/v4/a/h;->a(Landroid/view/View;)V

    invoke-static {v1}, Landroid/support/v4/a/n;->a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation$AnimationListener;

    move-result-object v2

    new-instance v3, Landroid/support/v4/a/n$2;

    invoke-direct {v3, p0, v2, p1}, Landroid/support/v4/a/n$2;-><init>(Landroid/support/v4/a/n;Landroid/view/animation/Animation$AnimationListener;Landroid/support/v4/a/h;)V

    invoke-virtual {v1, v3}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-static {v0, p2}, Landroid/support/v4/a/n;->b(Landroid/view/View;Landroid/support/v4/a/n$c;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p2, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    iget-object v2, p2, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    invoke-virtual {p1, v2}, Landroid/support/v4/a/h;->a(Landroid/animation/Animator;)V

    iget-object v2, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    :cond_1
    new-instance v3, Landroid/support/v4/a/n$3;

    invoke-direct {v3, p0, v2, v0, p1}, Landroid/support/v4/a/n$3;-><init>(Landroid/support/v4/a/n;Landroid/view/ViewGroup;Landroid/view/View;Landroid/support/v4/a/h;)V

    invoke-virtual {v1, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-static {v0, p2}, Landroid/support/v4/a/n;->b(Landroid/view/View;Landroid/support/v4/a/n$c;)V

    invoke-virtual {v1}, Landroid/animation/Animator;->start()V

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v4/a/n;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/a/n;->y()V

    return-void
.end method

.method static synthetic a(Landroid/support/v4/a/n;Landroid/support/v4/a/c;ZZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/c;ZZZ)V

    return-void
.end method

.method private static a(Landroid/support/v4/a/o;)V
    .locals 3

    if-nez p0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/support/v4/a/o;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/support/v4/a/h;->C:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/support/v4/a/o;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/o;

    invoke-static {v0}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/o;)V

    goto :goto_1
.end method

.method private a(Landroid/support/v4/g/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/g/b",
            "<",
            "Landroid/support/v4/a/h;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/support/v4/g/b;->size()I

    move-result v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/support/v4/g/b;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    iget-boolean v3, v0, Landroid/support/v4/a/h;->k:Z

    if-nez v3, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/a/h;->i()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v4

    iput v4, v0, Landroid/support/v4/a/h;->R:F

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Ljava/lang/RuntimeException;)V
    .locals 5

    const-string v0, "FragmentManager"

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FragmentManager"

    const-string v1, "Activity state:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/support/v4/g/e;

    const-string v1, "FragmentManager"

    invoke-direct {v0, v1}, Landroid/support/v4/g/e;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    const-string v2, "  "

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/support/v4/a/l;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    throw p1

    :catch_0
    move-exception v0

    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v0, "  "

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {p0, v0, v2, v1, v3}, Landroid/support/v4/a/n;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v6, -0x1

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    move v0, v2

    :goto_0
    move v3, v2

    move v4, v0

    :goto_1
    if-ge v3, v4, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/n$g;

    if-eqz p1, :cond_1

    invoke-static {v0}, Landroid/support/v4/a/n$g;->a(Landroid/support/v4/a/n$g;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Landroid/support/v4/a/n$g;->b(Landroid/support/v4/a/n$g;)Landroid/support/v4/a/c;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v6, :cond_1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/a/n$g;->e()V

    move v0, v3

    move v1, v4

    :goto_2
    add-int/lit8 v3, v0, 0x1

    move v4, v1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/support/v4/a/n$g;->c()Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p1, :cond_4

    invoke-static {v0}, Landroid/support/v4/a/n$g;->b(Landroid/support/v4/a/n$g;)Landroid/support/v4/a/c;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v1, p1, v2, v5}, Landroid/support/v4/a/c;->a(Ljava/util/ArrayList;II)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    iget-object v1, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v4, v4, -0x1

    if-eqz p1, :cond_3

    invoke-static {v0}, Landroid/support/v4/a/n$g;->a(Landroid/support/v4/a/n$g;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Landroid/support/v4/a/n$g;->b(Landroid/support/v4/a/n$g;)Landroid/support/v4/a/c;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v6, :cond_3

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/support/v4/a/n$g;->e()V

    move v0, v3

    move v1, v4

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Landroid/support/v4/a/n$g;->d()V

    :cond_4
    move v0, v3

    move v1, v4

    goto :goto_2

    :cond_5
    return-void
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    const/4 v6, 0x1

    const/4 v5, 0x0

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    iget-boolean v8, v0, Landroid/support/v4/a/c;->u:Z

    iget-object v0, p0, Landroid/support/v4/a/n;->y:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->y:Ljava/util/ArrayList;

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->y:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroid/support/v4/a/n;->v()Landroid/support/v4/a/h;

    move-result-object v1

    move v2, p3

    move-object v3, v1

    move v7, v5

    :goto_1
    if-ge v2, p4, :cond_4

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroid/support/v4/a/n;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v3}, Landroid/support/v4/a/c;->a(Ljava/util/ArrayList;Landroid/support/v4/a/h;)Landroid/support/v4/a/h;

    move-result-object v1

    :goto_2
    if-nez v7, :cond_0

    iget-boolean v0, v0, Landroid/support/v4/a/c;->j:Z

    if-eqz v0, :cond_3

    :cond_0
    move v0, v6

    :goto_3
    add-int/lit8 v2, v2, 0x1

    move-object v3, v1

    move v7, v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroid/support/v4/a/n;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v3}, Landroid/support/v4/a/c;->b(Ljava/util/ArrayList;Landroid/support/v4/a/h;)Landroid/support/v4/a/h;

    move-result-object v1

    goto :goto_2

    :cond_3
    move v0, v5

    goto :goto_3

    :cond_4
    iget-object v0, p0, Landroid/support/v4/a/n;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    if-nez v8, :cond_5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-static/range {v0 .. v5}, Landroid/support/v4/a/s;->a(Landroid/support/v4/a/n;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    :cond_5
    invoke-static {p1, p2, p3, p4}, Landroid/support/v4/a/n;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    if-eqz v8, :cond_a

    new-instance v5, Landroid/support/v4/g/b;

    invoke-direct {v5}, Landroid/support/v4/g/b;-><init>()V

    invoke-direct {p0, v5}, Landroid/support/v4/a/n;->b(Landroid/support/v4/g/b;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;IILandroid/support/v4/g/b;)I

    move-result v4

    invoke-direct {p0, v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/g/b;)V

    :goto_4
    if-eq v4, p3, :cond_6

    if-eqz v8, :cond_6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v5, v6

    invoke-static/range {v0 .. v5}, Landroid/support/v4/a/s;->a(Landroid/support/v4/a/n;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    invoke-virtual {p0, v0, v6}, Landroid/support/v4/a/n;->a(IZ)V

    :cond_6
    :goto_5
    if-ge p3, p4, :cond_8

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, v0, Landroid/support/v4/a/c;->n:I

    if-ltz v1, :cond_7

    iget v1, v0, Landroid/support/v4/a/c;->n:I

    invoke-virtual {p0, v1}, Landroid/support/v4/a/n;->c(I)V

    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v4/a/c;->n:I

    :cond_7
    invoke-virtual {v0}, Landroid/support/v4/a/c;->a()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_5

    :cond_8
    if-eqz v7, :cond_9

    invoke-virtual {p0}, Landroid/support/v4/a/n;->g()V

    :cond_9
    return-void

    :cond_a
    move v4, p4

    goto :goto_4
.end method

.method static a(Landroid/animation/Animator;)Z
    .locals 6

    const/4 v3, 0x1

    const/4 v1, 0x0

    if-nez p0, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    instance-of v0, p0, Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_3

    check-cast p0, Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getValues()[Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    move v0, v1

    :goto_1
    array-length v4, v2

    if-ge v0, v4, :cond_0

    const-string v4, "alpha"

    aget-object v5, v2, v0

    invoke-virtual {v5}, Landroid/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    instance-of v0, p0, Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/animation/AnimatorSet;

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;

    move-result-object v4

    move v2, v1

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator;

    invoke-static {v0}, Landroid/support/v4/a/n;->a(Landroid/animation/Animator;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v3

    goto :goto_0

    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2
.end method

.method static a(Landroid/support/v4/a/n$c;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    instance-of v0, v0, Landroid/view/animation/AlphaAnimation;

    if-eqz v0, :cond_1

    move v1, v2

    :cond_0
    :goto_0
    return v1

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    instance-of v0, v0, Landroid/view/animation/AnimationSet;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    check-cast v0, Landroid/view/animation/AnimationSet;

    invoke-virtual {v0}, Landroid/view/animation/AnimationSet;->getAnimations()Ljava/util/List;

    move-result-object v3

    move v0, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Landroid/view/animation/AlphaAnimation;

    if-eqz v4, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    invoke-static {v0}, Landroid/support/v4/a/n;->a(Landroid/animation/Animator;)Z

    move-result v1

    goto :goto_0
.end method

.method static a(Landroid/view/View;Landroid/support/v4/a/n$c;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getLayerType()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p0}, Landroid/support/v4/h/p;->h(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/n$c;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;II)Z
    .locals 7

    const/4 v6, 0x1

    invoke-virtual {p0}, Landroid/support/v4/a/n;->e()Z

    invoke-direct {p0, v6}, Landroid/support/v4/a/n;->c(Z)V

    iget-object v0, p0, Landroid/support/v4/a/n;->p:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    if-gez p2, :cond_0

    if-nez p1, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->p:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->h()Landroid/support/v4/a/m;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/a/m;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v6

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Landroid/support/v4/a/n;->w:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/a/n;->x:Ljava/util/ArrayList;

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean v6, p0, Landroid/support/v4/a/n;->c:Z

    :try_start_0
    iget-object v1, p0, Landroid/support/v4/a/n;->w:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/a/n;->x:Ljava/util/ArrayList;

    invoke-direct {p0, v1, v2}, Landroid/support/v4/a/n;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Landroid/support/v4/a/n;->z()V

    :cond_1
    invoke-virtual {p0}, Landroid/support/v4/a/n;->f()V

    invoke-direct {p0}, Landroid/support/v4/a/n;->C()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Landroid/support/v4/a/n;->z()V

    throw v0
.end method

.method public static b(IZ)I
    .locals 1

    const/4 v0, -0x1

    sparse-switch p0, :sswitch_data_0

    :goto_0
    return v0

    :sswitch_0
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    if-eqz p1, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_2
    if-eqz p1, :cond_2

    const/4 v0, 0x5

    goto :goto_0

    :cond_2
    const/4 v0, 0x6

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Landroid/support/v4/g/b;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/g/b",
            "<",
            "Landroid/support/v4/a/h;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x0

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    :cond_0
    return-void

    :cond_1
    iget v0, p0, Landroid/support/v4/a/n;->l:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v6, v5

    :goto_0
    if-ge v6, v7, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/h;

    iget v0, v1, Landroid/support/v4/a/h;->b:I

    if-ge v0, v2, :cond_2

    invoke-virtual {v1}, Landroid/support/v4/a/h;->M()I

    move-result v3

    invoke-virtual {v1}, Landroid/support/v4/a/h;->N()I

    move-result v4

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    iget-object v0, v1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-boolean v0, v1, Landroid/support/v4/a/h;->z:Z

    if-nez v0, :cond_2

    iget-boolean v0, v1, Landroid/support/v4/a/h;->P:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/support/v4/g/b;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0
.end method

.method private static b(Landroid/view/View;Landroid/support/v4/a/n$c;)V
    .locals 3

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p0, p1}, Landroid/support/v4/a/n;->a(Landroid/view/View;Landroid/support/v4/a/n$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    if-eqz v0, :cond_2

    iget-object v0, p1, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    new-instance v1, Landroid/support/v4/a/n$d;

    invoke-direct {v1, p0}, Landroid/support/v4/a/n$d;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_0

    :cond_2
    iget-object v0, p1, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    invoke-static {v0}, Landroid/support/v4/a/n;->a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation$AnimationListener;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object v1, p1, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    new-instance v2, Landroid/support/v4/a/n$a;

    invoke-direct {v2, p0, v0}, Landroid/support/v4/a/n$a;-><init>(Landroid/view/View;Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0
.end method

.method private b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eq v0, v1, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Internal error with the back stack records"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-direct {p0, p1, p2}, Landroid/support/v4/a/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v2

    :goto_1
    if-ge v2, v3, :cond_6

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    iget-boolean v0, v0, Landroid/support/v4/a/c;->u:Z

    if-nez v0, :cond_7

    if-eq v1, v2, :cond_4

    invoke-direct {p0, p1, p2, v1, v2}, Landroid/support/v4/a/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_4
    add-int/lit8 v1, v2, 0x1

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_2
    if-ge v1, v3, :cond_5

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    iget-boolean v0, v0, Landroid/support/v4/a/c;->u:Z

    if-nez v0, :cond_5

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    move v0, v1

    invoke-direct {p0, p1, p2, v2, v0}, Landroid/support/v4/a/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v0, -0x1

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_3
    add-int/lit8 v2, v0, 0x1

    goto :goto_1

    :cond_6
    if-eq v1, v3, :cond_0

    invoke-direct {p0, p1, p2, v1, v3}, Landroid/support/v4/a/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    goto :goto_0

    :cond_7
    move v0, v2

    goto :goto_3
.end method

.method private static b(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    const/4 v2, 0x1

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/a/c;->a(I)V

    add-int/lit8 v1, p3, -0x1

    if-ne p2, v1, :cond_0

    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/support/v4/a/c;->a(Z)V

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Landroid/support/v4/a/c;->a(I)V

    invoke-virtual {v0}, Landroid/support/v4/a/c;->b()V

    goto :goto_2

    :cond_2
    return-void
.end method

.method private c(Z)V
    .locals 3

    const/4 v2, 0x0

    iget-boolean v0, p0, Landroid/support/v4/a/n;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "FragmentManager is already executing transactions"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v1}, Landroid/support/v4/a/l;->h()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must be called from main thread of fragment host"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-nez p1, :cond_2

    invoke-direct {p0}, Landroid/support/v4/a/n;->x()V

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->w:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->w:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->x:Ljava/util/ArrayList;

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/n;->c:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v0, v1}, Landroid/support/v4/a/n;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p0, Landroid/support/v4/a/n;->c:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v2, p0, Landroid/support/v4/a/n;->c:Z

    throw v0
.end method

.method private c(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    monitor-exit p0

    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v0

    move v1, v0

    :goto_1
    if-ge v2, v3, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/n$f;

    invoke-interface {v0, p1, p2}, Landroid/support/v4/a/n$f;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v0

    or-int/2addr v1, v0

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->h()Landroid/os/Handler;

    move-result-object v0

    iget-object v2, p0, Landroid/support/v4/a/n;->D:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit p0

    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static d(I)I
    .locals 1

    const/4 v0, 0x0

    sparse-switch p0, :sswitch_data_0

    :goto_0
    return v0

    :sswitch_0
    const/16 v0, 0x2002

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x1001

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x1003

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch
.end method

.method private e(I)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Landroid/support/v4/a/n;->c:Z

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/a/n;->a(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Landroid/support/v4/a/n;->c:Z

    invoke-virtual {p0}, Landroid/support/v4/a/n;->e()Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Landroid/support/v4/a/n;->c:Z

    throw v0
.end method

.method private p(Landroid/support/v4/a/h;)Landroid/support/v4/a/h;
    .locals 5

    const/4 v1, 0x0

    iget-object v3, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v3, :cond_0

    if-nez v0, :cond_2

    :cond_0
    move-object v0, v1

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_1
    if-ltz v2, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    iget-object v4, v0, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    if-ne v4, v3, :cond_3

    iget-object v4, v0, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-nez v4, :cond_1

    :cond_3
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method private x()V
    .locals 3

    iget-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->u:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can not perform this action inside of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/a/n;->u:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private y()V
    .locals 4

    const/4 v1, 0x0

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v4/a/n;->B:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    move v2, v0

    :goto_0
    iget-object v3, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v0, :cond_3

    :goto_1
    if-nez v2, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->h()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/a/n;->D:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->h()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/a/n;->D:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    move v2, v1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private z()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/n;->c:Z

    iget-object v0, p0, Landroid/support/v4/a/n;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroid/support/v4/a/n;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/a/h;
    .locals 5

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v0, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-nez v0, :cond_0

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fragment no longer exists for key "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": index "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Landroid/support/v4/a/h;
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_1

    iget-object v2, v0, Landroid/support/v4/a/h;->y:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_1
    return-object v0

    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_3

    iget-object v2, v0, Landroid/support/v4/a/h;->y:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method a(Landroid/support/v4/a/h;IZI)Landroid/support/v4/a/n$c;
    .locals 10

    const v9, 0x3f79999a    # 0.975f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {p1}, Landroid/support/v4/a/h;->M()I

    move-result v3

    invoke-virtual {p1, p2, p3, v3}, Landroid/support/v4/a/h;->a(IZI)Landroid/view/animation/Animation;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v0, Landroid/support/v4/a/n$c;

    invoke-direct {v0, v2, v1}, Landroid/support/v4/a/n$c;-><init>(Landroid/view/animation/Animation;Landroid/support/v4/a/n$1;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1, p2, p3, v3}, Landroid/support/v4/a/h;->b(IZI)Landroid/animation/Animator;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v0, Landroid/support/v4/a/n$c;

    invoke-direct {v0, v2, v1}, Landroid/support/v4/a/n$c;-><init>(Landroid/animation/Animator;Landroid/support/v4/a/n$1;)V

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "anim"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v2, 0x0

    if-eqz v4, :cond_9

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v5

    if-eqz v5, :cond_2

    new-instance v0, Landroid/support/v4/a/n$c;

    const/4 v6, 0x0

    invoke-direct {v0, v5, v6}, Landroid/support/v4/a/n$c;-><init>(Landroid/view/animation/Animation;Landroid/support/v4/a/n$1;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :cond_2
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_4

    :try_start_1
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v0, Landroid/support/v4/a/n$c;

    const/4 v5, 0x0

    invoke-direct {v0, v2, v5}, Landroid/support/v4/a/n$c;-><init>(Landroid/animation/Animator;Landroid/support/v4/a/n$1;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    if-eqz v4, :cond_3

    throw v0

    :catch_2
    move-exception v0

    move v0, v2

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v0, Landroid/support/v4/a/n$c;

    invoke-direct {v0, v2, v1}, Landroid/support/v4/a/n$c;-><init>(Landroid/view/animation/Animation;Landroid/support/v4/a/n$1;)V

    goto :goto_0

    :cond_4
    if-nez p2, :cond_5

    move-object v0, v1

    goto :goto_0

    :cond_5
    invoke-static {p2, p3}, Landroid/support/v4/a/n;->b(IZ)I

    move-result v0

    if-gez v0, :cond_6

    move-object v0, v1

    goto :goto_0

    :cond_6
    packed-switch v0, :pswitch_data_0

    if-nez p4, :cond_7

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->e()I

    move-result p4

    :cond_7
    if-nez p4, :cond_8

    move-object v0, v1

    goto/16 :goto_0

    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f900000    # 1.125f

    invoke-static {v0, v1, v7, v8, v7}, Landroid/support/v4/a/n;->a(Landroid/content/Context;FFFF)Landroid/support/v4/a/n$c;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_1
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v7, v9, v7, v8}, Landroid/support/v4/a/n;->a(Landroid/content/Context;FFFF)Landroid/support/v4/a/n$c;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_2
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v9, v7, v8, v7}, Landroid/support/v4/a/n;->a(Landroid/content/Context;FFFF)Landroid/support/v4/a/n$c;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3f89999a    # 1.075f

    invoke-static {v0, v7, v1, v7, v8}, Landroid/support/v4/a/n;->a(Landroid/content/Context;FFFF)Landroid/support/v4/a/n$c;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_4
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v8, v7}, Landroid/support/v4/a/n;->a(Landroid/content/Context;FF)Landroid/support/v4/a/n$c;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_5
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v7, v8}, Landroid/support/v4/a/n;->a(Landroid/content/Context;FF)Landroid/support/v4/a/n$c;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    move-object v0, v1

    goto/16 :goto_0

    :cond_9
    move v0, v2

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public a(ILandroid/support/v4/a/c;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Setting back stack index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    monitor-exit p0

    return-void

    :cond_2
    :goto_1
    if-ge v0, p1, :cond_5

    iget-object v1, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    :cond_3
    sget-boolean v1, Landroid/support/v4/a/n;->a:Z

    if-eqz v1, :cond_4

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding available back stack index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v1, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_6

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding back stack index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method a(IZ)V
    .locals 6

    const/4 v3, 0x0

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No activity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p2, :cond_2

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    if-ne p1, v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    iput p1, p0, Landroid/support/v4/a/n;->l:I

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v2, v3

    move v1, v3

    :goto_1
    if-ge v2, v4, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    invoke-virtual {p0, v0}, Landroid/support/v4/a/n;->e(Landroid/support/v4/a/h;)V

    iget-object v5, v0, Landroid/support/v4/a/h;->L:Landroid/support/v4/a/v;

    if-eqz v5, :cond_8

    iget-object v0, v0, Landroid/support/v4/a/h;->L:Landroid/support/v4/a/v;

    invoke-virtual {v0}, Landroid/support/v4/a/v;->a()Z

    move-result v0

    or-int/2addr v0, v1

    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v4

    move v2, v3

    :goto_3
    if-ge v2, v4, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_7

    iget-boolean v5, v0, Landroid/support/v4/a/h;->l:Z

    if-nez v5, :cond_4

    iget-boolean v5, v0, Landroid/support/v4/a/h;->A:Z

    if-eqz v5, :cond_7

    :cond_4
    iget-boolean v5, v0, Landroid/support/v4/a/h;->P:Z

    if-nez v5, :cond_7

    invoke-virtual {p0, v0}, Landroid/support/v4/a/n;->e(Landroid/support/v4/a/h;)V

    iget-object v5, v0, Landroid/support/v4/a/h;->L:Landroid/support/v4/a/v;

    if-eqz v5, :cond_7

    iget-object v0, v0, Landroid/support/v4/a/h;->L:Landroid/support/v4/a/v;

    invoke-virtual {v0}, Landroid/support/v4/a/v;->a()Z

    move-result v0

    or-int/2addr v0, v1

    :goto_4
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_3

    :cond_5
    if-nez v1, :cond_6

    invoke-virtual {p0}, Landroid/support/v4/a/n;->d()V

    :cond_6
    iget-boolean v0, p0, Landroid/support/v4/a/n;->r:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->c()V

    iput-boolean v3, p0, Landroid/support/v4/a/n;->r:Z

    goto :goto_0

    :cond_7
    move v0, v1

    goto :goto_4

    :cond_8
    move v0, v1

    goto :goto_2
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->a(Landroid/content/res/Configuration;)V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/a/h;)V
    .locals 3

    iget v0, p3, Landroid/support/v4/a/h;->e:I

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not currently in the FragmentManager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_0
    iget v0, p3, Landroid/support/v4/a/h;->e:I

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method a(Landroid/os/Parcelable;Landroid/support/v4/a/o;)V
    .locals 11

    const/4 v5, 0x0

    const/4 v2, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    check-cast p1, Landroid/support/v4/a/p;

    iget-object v0, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_18

    invoke-virtual {p2}, Landroid/support/v4/a/o;->a()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p2}, Landroid/support/v4/a/o;->b()Ljava/util/List;

    move-result-object v4

    if-eqz v7, :cond_3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    move v1, v0

    :goto_1
    move v6, v2

    :goto_2
    if-ge v6, v1, :cond_7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    sget-boolean v3, Landroid/support/v4/a/n;->a:Z

    if-eqz v3, :cond_2

    const-string v3, "FragmentManager"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "restoreAllState: re-attaching retained "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    move v3, v2

    :goto_3
    iget-object v8, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    array-length v8, v8

    if-ge v3, v8, :cond_4

    iget-object v8, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    aget-object v8, v8, v3

    iget v8, v8, Landroid/support/v4/a/q;->b:I

    iget v9, v0, Landroid/support/v4/a/h;->e:I

    if-eq v8, v9, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    move v1, v2

    goto :goto_1

    :cond_4
    iget-object v8, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    array-length v8, v8

    if-ne v3, v8, :cond_5

    new-instance v8, Ljava/lang/IllegalStateException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Could not find active fragment with index "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget v10, v0, Landroid/support/v4/a/h;->e:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v8}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_5
    iget-object v8, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    aget-object v3, v8, v3

    iput-object v0, v3, Landroid/support/v4/a/q;->l:Landroid/support/v4/a/h;

    iput-object v5, v0, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    iput v2, v0, Landroid/support/v4/a/h;->q:I

    iput-boolean v2, v0, Landroid/support/v4/a/h;->n:Z

    iput-boolean v2, v0, Landroid/support/v4/a/h;->k:Z

    iput-object v5, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    iget-object v8, v3, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    if-eqz v8, :cond_6

    iget-object v8, v3, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    iget-object v9, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v9}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v8, v3, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    const-string v9, "android:view_state"

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v8

    iput-object v8, v0, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    iget-object v3, v3, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    iput-object v3, v0, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    :cond_6
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto/16 :goto_2

    :cond_7
    move-object v1, v4

    :goto_4
    new-instance v0, Landroid/util/SparseArray;

    iget-object v3, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    array-length v3, v3

    invoke-direct {v0, v3}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    move v3, v2

    :goto_5
    iget-object v0, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    array-length v0, v0

    if-ge v3, v0, :cond_a

    iget-object v0, p1, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    aget-object v4, v0, v3

    if-eqz v4, :cond_9

    if-eqz v1, :cond_17

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_17

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/o;

    :goto_6
    iget-object v6, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    iget-object v7, p0, Landroid/support/v4/a/n;->n:Landroid/support/v4/a/j;

    iget-object v8, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v4, v6, v7, v8, v0}, Landroid/support/v4/a/q;->a(Landroid/support/v4/a/l;Landroid/support/v4/a/j;Landroid/support/v4/a/h;Landroid/support/v4/a/o;)Landroid/support/v4/a/h;

    move-result-object v0

    sget-boolean v6, Landroid/support/v4/a/n;->a:Z

    if-eqz v6, :cond_8

    const-string v6, "FragmentManager"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "restoreAllState: active #"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    iget-object v6, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget v7, v0, Landroid/support/v4/a/h;->e:I

    invoke-virtual {v6, v7, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-object v5, v4, Landroid/support/v4/a/q;->l:Landroid/support/v4/a/h;

    :cond_9
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_5

    :cond_a
    if-eqz p2, :cond_d

    invoke-virtual {p2}, Landroid/support/v4/a/o;->a()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    move v3, v0

    :goto_7
    move v4, v2

    :goto_8
    if-ge v4, v3, :cond_d

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    iget v1, v0, Landroid/support/v4/a/h;->i:I

    if-ltz v1, :cond_b

    iget-object v1, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget v7, v0, Landroid/support/v4/a/h;->i:I

    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/h;

    iput-object v1, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    iget-object v1, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    if-nez v1, :cond_b

    const-string v1, "FragmentManager"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Re-attaching retained fragment "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " target no longer exists: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget v0, v0, Landroid/support/v4/a/h;->i:I

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_8

    :cond_c
    move v3, v2

    goto :goto_7

    :cond_d
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p1, Landroid/support/v4/a/p;->b:[I

    if-eqz v0, :cond_11

    move v1, v2

    :goto_9
    iget-object v0, p1, Landroid/support/v4/a/p;->b:[I

    array-length v0, v0

    if-ge v1, v0, :cond_11

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget-object v3, p1, Landroid/support/v4/a/p;->b:[I

    aget v3, v3, v1

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-nez v0, :cond_e

    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "No instantiated fragment for index #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v6, p1, Landroid/support/v4/a/p;->b:[I

    aget v6, v6, v1

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v3}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_e
    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/support/v4/a/h;->k:Z

    sget-boolean v3, Landroid/support/v4/a/n;->a:Z

    if-eqz v3, :cond_f

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restoreAllState: added #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ": "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    iget-object v3, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already added!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    iget-object v3, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v3

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_9

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_11
    iget-object v0, p1, Landroid/support/v4/a/p;->c:[Landroid/support/v4/a/d;

    if-eqz v0, :cond_14

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/support/v4/a/p;->c:[Landroid/support/v4/a/d;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    move v0, v2

    :goto_a
    iget-object v1, p1, Landroid/support/v4/a/p;->c:[Landroid/support/v4/a/d;

    array-length v1, v1

    if-ge v0, v1, :cond_15

    iget-object v1, p1, Landroid/support/v4/a/p;->c:[Landroid/support/v4/a/d;

    aget-object v1, v1, v0

    invoke-virtual {v1, p0}, Landroid/support/v4/a/d;->a(Landroid/support/v4/a/n;)Landroid/support/v4/a/c;

    move-result-object v1

    sget-boolean v3, Landroid/support/v4/a/n;->a:Z

    if-eqz v3, :cond_12

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "restoreAllState: back stack #"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " (index "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v1, Landroid/support/v4/a/c;->n:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Landroid/support/v4/g/e;

    const-string v4, "FragmentManager"

    invoke-direct {v3, v4}, Landroid/support/v4/g/e;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/io/PrintWriter;

    invoke-direct {v4, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v3, "  "

    invoke-virtual {v1, v3, v4, v2}, Landroid/support/v4/a/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v4}, Ljava/io/PrintWriter;->close()V

    :cond_12
    iget-object v3, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v3, v1, Landroid/support/v4/a/c;->n:I

    if-ltz v3, :cond_13

    iget v3, v1, Landroid/support/v4/a/c;->n:I

    invoke-virtual {p0, v3, v1}, Landroid/support/v4/a/n;->a(ILandroid/support/v4/a/c;)V

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_14
    iput-object v5, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    :cond_15
    iget v0, p1, Landroid/support/v4/a/p;->d:I

    if-ltz v0, :cond_16

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget v1, p1, Landroid/support/v4/a/p;->d:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    iput-object v0, p0, Landroid/support/v4/a/n;->p:Landroid/support/v4/a/h;

    :cond_16
    iget v0, p1, Landroid/support/v4/a/p;->e:I

    iput v0, p0, Landroid/support/v4/a/n;->d:I

    goto/16 :goto_0

    :cond_17
    move-object v0, v5

    goto/16 :goto_6

    :cond_18
    move-object v1, v5

    goto/16 :goto_4
.end method

.method a(Landroid/support/v4/a/c;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Landroid/support/v4/a/h;)V
    .locals 6

    const/4 v3, 0x0

    iget-boolean v0, p1, Landroid/support/v4/a/h;->J:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/a/n;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/n;->v:Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-boolean v3, p1, Landroid/support/v4/a/h;->J:Z

    iget v2, p0, Landroid/support/v4/a/n;->l:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    goto :goto_0
.end method

.method a(Landroid/support/v4/a/h;IIIZ)V
    .locals 10

    const/4 v9, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    iget-boolean v0, p1, Landroid/support/v4/a/h;->k:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Landroid/support/v4/a/h;->A:Z

    if-eqz v0, :cond_1

    :cond_0
    if-le p2, v5, :cond_1

    move p2, v5

    :cond_1
    iget-boolean v0, p1, Landroid/support/v4/a/h;->l:Z

    if-eqz v0, :cond_2

    iget v0, p1, Landroid/support/v4/a/h;->b:I

    if-le p2, v0, :cond_2

    iget v0, p1, Landroid/support/v4/a/h;->b:I

    if-nez v0, :cond_5

    invoke-virtual {p1}, Landroid/support/v4/a/h;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    move p2, v5

    :cond_2
    :goto_0
    iget-boolean v0, p1, Landroid/support/v4/a/h;->J:Z

    if-eqz v0, :cond_3

    iget v0, p1, Landroid/support/v4/a/h;->b:I

    if-ge v0, v9, :cond_3

    if-le p2, v6, :cond_3

    move p2, v6

    :cond_3
    iget v0, p1, Landroid/support/v4/a/h;->b:I

    if-gt v0, p2, :cond_22

    iget-boolean v0, p1, Landroid/support/v4/a/h;->m:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p1, Landroid/support/v4/a/h;->n:Z

    if-nez v0, :cond_6

    :cond_4
    :goto_1
    return-void

    :cond_5
    iget p2, p1, Landroid/support/v4/a/h;->b:I

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Landroid/support/v4/a/h;->R()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Landroid/support/v4/a/h;->S()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_8

    :cond_7
    invoke-virtual {p1, v7}, Landroid/support/v4/a/h;->a(Landroid/view/View;)V

    invoke-virtual {p1, v7}, Landroid/support/v4/a/h;->a(Landroid/animation/Animator;)V

    invoke-virtual {p1}, Landroid/support/v4/a/h;->T()I

    move-result v2

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    :cond_8
    iget v0, p1, Landroid/support/v4/a/h;->b:I

    packed-switch v0, :pswitch_data_0

    :cond_9
    :goto_2
    iget v0, p1, Landroid/support/v4/a/h;->b:I

    if-eq v0, p2, :cond_4

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveToState: Fragment state for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not updated inline; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "expected state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/support/v4/a/h;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput p2, p1, Landroid/support/v4/a/h;->b:I

    goto :goto_1

    :pswitch_0
    if-lez p2, :cond_11

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_a

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    if-eqz v0, :cond_c

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    iget-object v1, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v1}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/a/n;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/a/h;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    iget-object v0, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    if-eqz v0, :cond_b

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p1, Landroid/support/v4/a/h;->j:I

    :cond_b
    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    const-string v1, "android:user_visible_hint"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p1, Landroid/support/v4/a/h;->K:Z

    iget-boolean v0, p1, Landroid/support/v4/a/h;->K:Z

    if-nez v0, :cond_c

    iput-boolean v5, p1, Landroid/support/v4/a/h;->J:Z

    if-le p2, v6, :cond_c

    move p2, v6

    :cond_c
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    iput-object v0, p1, Landroid/support/v4/a/h;->s:Landroid/support/v4/a/l;

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    iput-object v0, p1, Landroid/support/v4/a/h;->v:Landroid/support/v4/a/h;

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_d

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    iget-object v0, v0, Landroid/support/v4/a/h;->t:Landroid/support/v4/a/n;

    :goto_3
    iput-object v0, p1, Landroid/support/v4/a/h;->r:Landroid/support/v4/a/n;

    iget-object v0, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    if-eqz v0, :cond_f

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget-object v1, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    iget v1, v1, Landroid/support/v4/a/h;->e:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    if-eq v0, v1, :cond_e

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " declared target fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " that does not belong to this FragmentManager!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->i()Landroid/support/v4/a/n;

    move-result-object v0

    goto :goto_3

    :cond_e
    iget-object v0, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    iget v0, v0, Landroid/support/v4/a/h;->b:I

    if-ge v0, v5, :cond_f

    iget-object v1, p1, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    move-object v0, p0

    move v2, v5

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    :cond_f
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, p1, v0, v3}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/content/Context;Z)V

    iput-boolean v3, p1, Landroid/support/v4/a/h;->F:Z

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->a(Landroid/content/Context;)V

    iget-boolean v0, p1, Landroid/support/v4/a/h;->F:Z

    if-nez v0, :cond_10

    new-instance v0, Landroid/support/v4/a/z;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/a/z;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    iget-object v0, p1, Landroid/support/v4/a/h;->v:Landroid/support/v4/a/h;

    if-nez v0, :cond_1e

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/l;->b(Landroid/support/v4/a/h;)V

    :goto_4
    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, p1, v0, v3}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;Landroid/content/Context;Z)V

    iget-boolean v0, p1, Landroid/support/v4/a/h;->T:Z

    if-nez v0, :cond_1f

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p0, p1, v0, v3}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->k(Landroid/os/Bundle;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p0, p1, v0, v3}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    :goto_5
    iput-boolean v3, p1, Landroid/support/v4/a/h;->C:Z

    :cond_11
    :pswitch_1
    invoke-virtual {p0, p1}, Landroid/support/v4/a/n;->c(Landroid/support/v4/a/h;)V

    if-le p2, v5, :cond_19

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_12

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto ACTIVITY_CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_12
    iget-boolean v0, p1, Landroid/support/v4/a/h;->m:Z

    if-nez v0, :cond_17

    iget v0, p1, Landroid/support/v4/a/h;->x:I

    if-eqz v0, :cond_36

    iget v0, p1, Landroid/support/v4/a/h;->x:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_13

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot create fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for a container view with no id"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_13
    iget-object v0, p0, Landroid/support/v4/a/n;->n:Landroid/support/v4/a/j;

    iget v1, p1, Landroid/support/v4/a/h;->x:I

    invoke-virtual {v0, v1}, Landroid/support/v4/a/j;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-nez v0, :cond_14

    iget-boolean v1, p1, Landroid/support/v4/a/h;->o:Z

    if-nez v1, :cond_14

    :try_start_0
    invoke-virtual {p1}, Landroid/support/v4/a/h;->e()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p1, Landroid/support/v4/a/h;->x:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :goto_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "No view found for id 0x"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v8, p1, Landroid/support/v4/a/h;->x:I

    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, " ("

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ") for fragment "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_14
    :goto_7
    iput-object v0, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    iget-object v1, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v1}, Landroid/support/v4/a/h;->d(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v2, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v1, v0, v2}, Landroid/support/v4/a/h;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v1, :cond_21

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iput-object v1, p1, Landroid/support/v4/a/h;->I:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    if-eqz v0, :cond_15

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_15
    iget-boolean v0, p1, Landroid/support/v4/a/h;->z:Z

    if-eqz v0, :cond_16

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_16
    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/a/h;->a(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p0, p1, v0, v1, v3}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/view/View;Landroid/os/Bundle;Z)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    if-eqz v0, :cond_20

    :goto_8
    iput-boolean v5, p1, Landroid/support/v4/a/h;->P:Z

    :cond_17
    :goto_9
    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->l(Landroid/os/Bundle;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p0, p1, v0, v3}, Landroid/support/v4/a/n;->c(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_18

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->a(Landroid/os/Bundle;)V

    :cond_18
    iput-object v7, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    :cond_19
    :pswitch_2
    const/4 v0, 0x2

    if-le p2, v0, :cond_1a

    iput v6, p1, Landroid/support/v4/a/h;->b:I

    :cond_1a
    :pswitch_3
    if-le p2, v6, :cond_1c

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_1b

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto STARTED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1b
    invoke-virtual {p1}, Landroid/support/v4/a/h;->C()V

    invoke-virtual {p0, p1, v3}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;Z)V

    :cond_1c
    :pswitch_4
    if-le p2, v9, :cond_9

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_1d

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto RESUMED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1d
    invoke-virtual {p1}, Landroid/support/v4/a/h;->D()V

    invoke-virtual {p0, p1, v3}, Landroid/support/v4/a/n;->c(Landroid/support/v4/a/h;Z)V

    iput-object v7, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    iput-object v7, p1, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    goto/16 :goto_2

    :cond_1e
    iget-object v0, p1, Landroid/support/v4/a/h;->v:Landroid/support/v4/a/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->a(Landroid/support/v4/a/h;)V

    goto/16 :goto_4

    :cond_1f
    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->g(Landroid/os/Bundle;)V

    iput v5, p1, Landroid/support/v4/a/h;->b:I

    goto/16 :goto_5

    :catch_0
    move-exception v1

    const-string v1, "unknown"

    goto/16 :goto_6

    :cond_20
    move v5, v3

    goto :goto_8

    :cond_21
    iput-object v7, p1, Landroid/support/v4/a/h;->I:Landroid/view/View;

    goto/16 :goto_9

    :cond_22
    iget v0, p1, Landroid/support/v4/a/h;->b:I

    if-le v0, p2, :cond_9

    iget v0, p1, Landroid/support/v4/a/h;->b:I

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_2

    :cond_23
    :goto_a
    :pswitch_5
    if-ge p2, v5, :cond_9

    iget-boolean v0, p0, Landroid/support/v4/a/n;->t:Z

    if-eqz v0, :cond_24

    invoke-virtual {p1}, Landroid/support/v4/a/h;->R()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_30

    invoke-virtual {p1}, Landroid/support/v4/a/h;->R()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v7}, Landroid/support/v4/a/h;->a(Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    :cond_24
    :goto_b
    invoke-virtual {p1}, Landroid/support/v4/a/h;->R()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_25

    invoke-virtual {p1}, Landroid/support/v4/a/h;->S()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_31

    :cond_25
    invoke-virtual {p1, p2}, Landroid/support/v4/a/h;->b(I)V

    move p2, v5

    goto/16 :goto_2

    :pswitch_6
    const/4 v0, 0x5

    if-ge p2, v0, :cond_27

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_26

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom RESUMED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_26
    invoke-virtual {p1}, Landroid/support/v4/a/h;->G()V

    invoke-virtual {p0, p1, v3}, Landroid/support/v4/a/n;->d(Landroid/support/v4/a/h;Z)V

    :cond_27
    :pswitch_7
    if-ge p2, v9, :cond_29

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_28

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom STARTED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_28
    invoke-virtual {p1}, Landroid/support/v4/a/h;->H()V

    invoke-virtual {p0, p1, v3}, Landroid/support/v4/a/n;->e(Landroid/support/v4/a/h;Z)V

    :cond_29
    :pswitch_8
    if-ge p2, v6, :cond_2b

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_2a

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom STOPPED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2a
    invoke-virtual {p1}, Landroid/support/v4/a/h;->I()V

    :cond_2b
    :pswitch_9
    const/4 v0, 0x2

    if-ge p2, v0, :cond_23

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_2c

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2c
    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_2d

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/l;->a(Landroid/support/v4/a/h;)Z

    move-result v0

    if-eqz v0, :cond_2d

    iget-object v0, p1, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    if-nez v0, :cond_2d

    invoke-virtual {p0, p1}, Landroid/support/v4/a/n;->m(Landroid/support/v4/a/h;)V

    :cond_2d
    invoke-virtual {p1}, Landroid/support/v4/a/h;->J()V

    invoke-virtual {p0, p1, v3}, Landroid/support/v4/a/n;->f(Landroid/support/v4/a/h;Z)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_2f

    iget-object v0, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2f

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    if-lez v0, :cond_35

    iget-boolean v0, p0, Landroid/support/v4/a/n;->t:Z

    if-nez v0, :cond_35

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_35

    iget v0, p1, Landroid/support/v4/a/h;->R:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_35

    invoke-virtual {p0, p1, p3, v3, p4}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IZI)Landroid/support/v4/a/n$c;

    move-result-object v0

    :goto_c
    const/4 v1, 0x0

    iput v1, p1, Landroid/support/v4/a/h;->R:F

    if-eqz v0, :cond_2e

    invoke-direct {p0, p1, v0, p2}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/support/v4/a/n$c;I)V

    :cond_2e
    iget-object v0, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2f
    iput-object v7, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    iput-object v7, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iput-object v7, p1, Landroid/support/v4/a/h;->I:Landroid/view/View;

    iput-boolean v3, p1, Landroid/support/v4/a/h;->n:Z

    goto/16 :goto_a

    :cond_30
    invoke-virtual {p1}, Landroid/support/v4/a/h;->S()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {p1}, Landroid/support/v4/a/h;->S()Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {p1, v7}, Landroid/support/v4/a/h;->a(Landroid/animation/Animator;)V

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    goto/16 :goto_b

    :cond_31
    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_32

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_32
    iget-boolean v0, p1, Landroid/support/v4/a/h;->C:Z

    if-nez v0, :cond_33

    invoke-virtual {p1}, Landroid/support/v4/a/h;->K()V

    invoke-virtual {p0, p1, v3}, Landroid/support/v4/a/n;->g(Landroid/support/v4/a/h;Z)V

    :goto_d
    invoke-virtual {p1}, Landroid/support/v4/a/h;->L()V

    invoke-virtual {p0, p1, v3}, Landroid/support/v4/a/n;->h(Landroid/support/v4/a/h;Z)V

    if-nez p5, :cond_9

    iget-boolean v0, p1, Landroid/support/v4/a/h;->C:Z

    if-nez v0, :cond_34

    invoke-virtual {p0, p1}, Landroid/support/v4/a/n;->g(Landroid/support/v4/a/h;)V

    goto/16 :goto_2

    :cond_33
    iput v3, p1, Landroid/support/v4/a/h;->b:I

    goto :goto_d

    :cond_34
    iput-object v7, p1, Landroid/support/v4/a/h;->s:Landroid/support/v4/a/l;

    iput-object v7, p1, Landroid/support/v4/a/h;->v:Landroid/support/v4/a/h;

    iput-object v7, p1, Landroid/support/v4/a/h;->r:Landroid/support/v4/a/n;

    goto/16 :goto_2

    :cond_35
    move-object v0, v7

    goto :goto_c

    :cond_36
    move-object v0, v7

    goto/16 :goto_7

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method a(Landroid/support/v4/a/h;Landroid/content/Context;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/content/Context;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p3, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/a/m$a;->a(Landroid/support/v4/a/m;Landroid/support/v4/a/h;Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method a(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p3, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/a/m$a;->a(Landroid/support/v4/a/m;Landroid/support/v4/a/h;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method a(Landroid/support/v4/a/h;Landroid/view/View;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/view/View;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p4, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroid/support/v4/a/m$a;->a(Landroid/support/v4/a/m;Landroid/support/v4/a/h;Landroid/view/View;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public a(Landroid/support/v4/a/h;Z)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "add: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v4/a/n;->f(Landroid/support/v4/a/h;)V

    iget-boolean v0, p1, Landroid/support/v4/a/h;->A:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment already added: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v4, p1, Landroid/support/v4/a/h;->k:Z

    iput-boolean v3, p1, Landroid/support/v4/a/h;->l:Z

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-nez v0, :cond_2

    iput-boolean v3, p1, Landroid/support/v4/a/h;->Q:Z

    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/a/h;->D:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/a/h;->E:Z

    if-eqz v0, :cond_3

    iput-boolean v4, p0, Landroid/support/v4/a/n;->r:Z

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p0, p1}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;)V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Landroid/support/v4/a/l;Landroid/support/v4/a/j;Landroid/support/v4/a/h;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already attached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    iput-object p2, p0, Landroid/support/v4/a/n;->n:Landroid/support/v4/a/j;

    iput-object p3, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "    "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Active Fragments in "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    invoke-virtual {v0, v3, p2, p3, p4}, Landroid/support/v4/a/h;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Added Fragments:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    :goto_1
    if-ge v2, v4, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/a/h;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/n;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Fragments Created Menus:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    :goto_2
    if-ge v2, v4, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/n;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/a/h;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    :goto_3
    if-ge v2, v4, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/a/c;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v0, v3, p2, p3, p4}, Landroid/support/v4/a/c;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    :cond_4
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack Indices:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    :goto_4
    if-ge v2, v3, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  #"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v4, ": "

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_5
    iget-object v0, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAvailBackStackIndices: "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_5
    if-ge v1, v2, :cond_7

    iget-object v0, p0, Landroid/support/v4/a/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/n$f;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "FragmentManager misc state:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->n:Landroid/support/v4/a/j;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_8

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mParent="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mCurState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mStateSaved="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDestroyed="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/n;->t:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean v0, p0, Landroid/support/v4/a/n;->r:Z

    if-eqz v0, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNeedMenuInvalidate="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/n;->r:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    :cond_9
    iget-object v0, p0, Landroid/support/v4/a/n;->u:Ljava/lang/String;

    if-eqz v0, :cond_a

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNoTransactionsBecause="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->u:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_a
    return-void
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->d(Z)V

    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a()Z
    .locals 3

    invoke-direct {p0}, Landroid/support/v4/a/n;->x()V

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Landroid/support/v4/a/n;->a(Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method a(I)Z
    .locals 1

    iget v0, p0, Landroid/support/v4/a/n;->l:I

    if-lt v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/view/Menu;)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    move v2, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->c(Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return v2
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 6

    const/4 v4, 0x0

    const/4 v1, 0x0

    move v3, v4

    move v2, v4

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/a/h;->b(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    move v0, v2

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    :goto_1
    iget-object v0, p0, Landroid/support/v4/a/n;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/n;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    invoke-virtual {v0}, Landroid/support/v4/a/h;->r()V

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    iput-object v1, p0, Landroid/support/v4/a/n;->h:Ljava/util/ArrayList;

    return v2
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 3

    const/4 v2, 0x0

    move v1, v2

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->c(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_0
    return v2

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method a(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "II)Z"
        }
    .end annotation

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_0
    if-nez p3, :cond_3

    if-gez p4, :cond_3

    and-int/lit8 v0, p5, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    move v0, v3

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    if-nez p3, :cond_4

    if-ltz p4, :cond_c

    :cond_4
    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    :goto_1
    if-ltz v1, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    if-eqz p3, :cond_6

    invoke-virtual {v0}, Landroid/support/v4/a/c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_5
    if-gez v1, :cond_8

    move v0, v2

    goto :goto_0

    :cond_6
    if-ltz p4, :cond_7

    iget v0, v0, Landroid/support/v4/a/c;->n:I

    if-eq p4, v0, :cond_5

    :cond_7
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_8
    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_b

    add-int/lit8 v1, v1, -0x1

    :goto_2
    if-ltz v1, :cond_b

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    if-eqz p3, :cond_9

    invoke-virtual {v0}, Landroid/support/v4/a/c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    if-ltz p4, :cond_b

    iget v0, v0, Landroid/support/v4/a/c;->n:I

    if-ne p4, v0, :cond_b

    :cond_a
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_b
    move v0, v1

    :cond_c
    iget-object v1, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_d

    move v0, v2

    goto/16 :goto_0

    :cond_d
    iget-object v1, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_3
    if-le v1, v0, :cond_2

    iget-object v2, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_3
.end method

.method public b(I)Landroid/support/v4/a/h;
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_1

    iget v2, v0, Landroid/support/v4/a/h;->w:I

    if-ne v2, p1, :cond_1

    :cond_0
    :goto_1
    return-object v0

    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_3

    iget v2, v0, Landroid/support/v4/a/h;->w:I

    if-eq v2, p1, :cond_0

    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public b(Ljava/lang/String;)Landroid/support/v4/a/h;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->a(Ljava/lang/String;)Landroid/support/v4/a/h;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_1
    return-object v0

    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/support/v4/a/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method b(Landroid/support/v4/a/h;)V
    .locals 6

    const/4 v3, 0x0

    iget v2, p0, Landroid/support/v4/a/n;->l:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    return-void
.end method

.method b(Landroid/support/v4/a/h;Landroid/content/Context;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;Landroid/content/Context;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p3, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/a/m$a;->b(Landroid/support/v4/a/m;Landroid/support/v4/a/h;Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method b(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p3, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/a/m$a;->b(Landroid/support/v4/a/m;Landroid/support/v4/a/h;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method b(Landroid/support/v4/a/h;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p2, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/m$a;->a(Landroid/support/v4/a/m;Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public b(Landroid/view/Menu;)V
    .locals 2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->d(Landroid/view/Menu;)V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->e(Z)V

    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 3

    const/4 v2, 0x0

    move v1, v2

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->d(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_0
    return v2

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public c(I)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->i:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    :cond_0
    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Freeing back stack index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->j:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method c(Landroid/support/v4/a/h;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    iget-boolean v0, p1, Landroid/support/v4/a/h;->m:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Landroid/support/v4/a/h;->p:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->d(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v3, v1}, Landroid/support/v4/a/h;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iput-object v0, p1, Landroid/support/v4/a/h;->I:Landroid/view/View;

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-boolean v0, p1, Landroid/support/v4/a/h;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/a/h;->a(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Landroid/view/View;Landroid/os/Bundle;Z)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iput-object v3, p1, Landroid/support/v4/a/h;->I:Landroid/view/View;

    goto :goto_0
.end method

.method c(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/a/n;->c(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p3, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/a/m$a;->c(Landroid/support/v4/a/m;Landroid/support/v4/a/h;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method c(Landroid/support/v4/a/h;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/n;->c(Landroid/support/v4/a/h;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p2, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/m$a;->b(Landroid/support/v4/a/m;Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    return v0
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;)V

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method d(Landroid/support/v4/a/h;)V
    .locals 7

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v4/a/h;->N()I

    move-result v3

    iget-boolean v0, p1, Landroid/support/v4/a/h;->z:Z

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {p1}, Landroid/support/v4/a/h;->O()I

    move-result v4

    invoke-virtual {p0, p1, v3, v0, v4}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IZI)Landroid/support/v4/a/n$c;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v3, v0, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    if-eqz v3, :cond_5

    iget-object v3, v0, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    iget-object v4, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-boolean v3, p1, Landroid/support/v4/a/h;->z:Z

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Landroid/support/v4/a/h;->V()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1, v2}, Landroid/support/v4/a/h;->f(Z)V

    :goto_1
    iget-object v3, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-static {v3, v0}, Landroid/support/v4/a/n;->b(Landroid/view/View;Landroid/support/v4/a/n$c;)V

    iget-object v0, v0, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_0
    :goto_2
    iget-boolean v0, p1, Landroid/support/v4/a/h;->k:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Landroid/support/v4/a/h;->D:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Landroid/support/v4/a/h;->E:Z

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Landroid/support/v4/a/n;->r:Z

    :cond_1
    iput-boolean v2, p1, Landroid/support/v4/a/h;->Q:Z

    iget-boolean v0, p1, Landroid/support/v4/a/h;->z:Z

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->a(Z)V

    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    iget-object v3, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    iget-object v4, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    iget-object v5, v0, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    new-instance v6, Landroid/support/v4/a/n$4;

    invoke-direct {v6, p0, v3, v4, p1}, Landroid/support/v4/a/n$4;-><init>(Landroid/support/v4/a/n;Landroid/view/ViewGroup;Landroid/view/View;Landroid/support/v4/a/h;)V

    invoke-virtual {v5, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_1

    :cond_4
    iget-object v3, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_5
    if-eqz v0, :cond_6

    iget-object v3, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-static {v3, v0}, Landroid/support/v4/a/n;->b(Landroid/view/View;Landroid/support/v4/a/n$c;)V

    iget-object v3, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v4, v0, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    invoke-virtual {v3, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, v0, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->start()V

    :cond_6
    iget-boolean v0, p1, Landroid/support/v4/a/h;->z:Z

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroid/support/v4/a/h;->V()Z

    move-result v0

    if-nez v0, :cond_7

    const/16 v0, 0x8

    :goto_3
    iget-object v3, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Landroid/support/v4/a/h;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/support/v4/a/h;->f(Z)V

    goto :goto_2

    :cond_7
    move v0, v2

    goto :goto_3
.end method

.method d(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/a/n;->d(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p3, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/a/m$a;->d(Landroid/support/v4/a/m;Landroid/support/v4/a/h;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method d(Landroid/support/v4/a/h;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/n;->d(Landroid/support/v4/a/h;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p2, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/m$a;->c(Landroid/support/v4/a/m;Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method e(Landroid/support/v4/a/h;)V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v2, p0, Landroid/support/v4/a/n;->l:I

    iget-boolean v0, p1, Landroid/support/v4/a/h;->l:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/support/v4/a/h;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/support/v4/a/h;->N()I

    move-result v3

    invoke-virtual {p1}, Landroid/support/v4/a/h;->O()I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_5

    invoke-direct {p0, p1}, Landroid/support/v4/a/n;->p(Landroid/support/v4/a/h;)Landroid/support/v4/a/h;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    iget-object v2, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    if-ge v2, v0, :cond_3

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v2, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_3
    iget-boolean v0, p1, Landroid/support/v4/a/h;->P:Z

    if-eqz v0, :cond_5

    iget-object v0, p1, Landroid/support/v4/a/h;->G:Landroid/view/ViewGroup;

    if-eqz v0, :cond_5

    iget v0, p1, Landroid/support/v4/a/h;->R:F

    cmpl-float v0, v0, v6

    if-lez v0, :cond_4

    iget-object v0, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget v1, p1, Landroid/support/v4/a/h;->R:F

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_4
    iput v6, p1, Landroid/support/v4/a/h;->R:F

    iput-boolean v5, p1, Landroid/support/v4/a/h;->P:Z

    invoke-virtual {p1}, Landroid/support/v4/a/h;->N()I

    move-result v0

    invoke-virtual {p1}, Landroid/support/v4/a/h;->O()I

    move-result v1

    invoke-virtual {p0, p1, v0, v7, v1}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IZI)Landroid/support/v4/a/n$c;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-static {v1, v0}, Landroid/support/v4/a/n;->b(Landroid/view/View;Landroid/support/v4/a/n$c;)V

    iget-object v1, v0, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    if-eqz v1, :cond_7

    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    iget-object v0, v0, Landroid/support/v4/a/n$c;->a:Landroid/view/animation/Animation;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_5
    :goto_2
    iget-boolean v0, p1, Landroid/support/v4/a/h;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v4/a/n;->d(Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_6
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_1

    :cond_7
    iget-object v1, v0, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    iget-object v2, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-object v0, v0, Landroid/support/v4/a/n$c;->b:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    goto :goto_2
.end method

.method e(Landroid/support/v4/a/h;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/n;->e(Landroid/support/v4/a/h;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p2, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/m$a;->d(Landroid/support/v4/a/m;Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public e()Z
    .locals 4

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Landroid/support/v4/a/n;->c(Z)V

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Landroid/support/v4/a/n;->w:Ljava/util/ArrayList;

    iget-object v3, p0, Landroid/support/v4/a/n;->x:Ljava/util/ArrayList;

    invoke-direct {p0, v2, v3}, Landroid/support/v4/a/n;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-boolean v1, p0, Landroid/support/v4/a/n;->c:Z

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->w:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/a/n;->x:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v2}, Landroid/support/v4/a/n;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Landroid/support/v4/a/n;->z()V

    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Landroid/support/v4/a/n;->z()V

    throw v0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/a/n;->f()V

    invoke-direct {p0}, Landroid/support/v4/a/n;->C()V

    return v0
.end method

.method f()V
    .locals 5

    const/4 v2, 0x0

    iget-boolean v0, p0, Landroid/support/v4/a/n;->v:Z

    if-eqz v0, :cond_2

    move v1, v2

    move v3, v2

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v4, v0, Landroid/support/v4/a/h;->L:Landroid/support/v4/a/v;

    if-eqz v4, :cond_0

    iget-object v0, v0, Landroid/support/v4/a/h;->L:Landroid/support/v4/a/v;

    invoke-virtual {v0}, Landroid/support/v4/a/v;->a()Z

    move-result v0

    or-int/2addr v3, v0

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    if-nez v3, :cond_2

    iput-boolean v2, p0, Landroid/support/v4/a/n;->v:Z

    invoke-virtual {p0}, Landroid/support/v4/a/n;->d()V

    :cond_2
    return-void
.end method

.method f(Landroid/support/v4/a/h;)V
    .locals 3

    iget v0, p1, Landroid/support/v4/a/h;->e:I

    if-ltz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Landroid/support/v4/a/n;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroid/support/v4/a/n;->d:I

    iget-object v1, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/a/h;->a(ILandroid/support/v4/a/h;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-nez v0, :cond_2

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget v1, p1, Landroid/support/v4/a/h;->e:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Allocated fragment index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method f(Landroid/support/v4/a/h;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/n;->f(Landroid/support/v4/a/h;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p2, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/m$a;->e(Landroid/support/v4/a/m;Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method g()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/m$b;

    invoke-interface {v0}, Landroid/support/v4/a/m$b;->a()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method g(Landroid/support/v4/a/h;)V
    .locals 3

    iget v0, p1, Landroid/support/v4/a/h;->e:I

    if-gez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Freeing fragment index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget v1, p1, Landroid/support/v4/a/h;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    iget-object v1, p1, Landroid/support/v4/a/h;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/l;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/support/v4/a/h;->p()V

    goto :goto_0
.end method

.method g(Landroid/support/v4/a/h;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/n;->g(Landroid/support/v4/a/h;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p2, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/m$a;->f(Landroid/support/v4/a/m;Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method h()Landroid/support/v4/a/o;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/n;->C:Landroid/support/v4/a/o;

    invoke-static {v0}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/o;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->C:Landroid/support/v4/a/o;

    return-object v0
.end method

.method public h(Landroid/support/v4/a/h;)V
    .locals 5

    const/4 v2, 0x0

    const/4 v1, 0x1

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "remove: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " nesting="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p1, Landroid/support/v4/a/h;->q:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/a/h;->b()Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v1

    :goto_0
    iget-boolean v3, p1, Landroid/support/v4/a/h;->A:Z

    if-eqz v3, :cond_1

    if-eqz v0, :cond_3

    :cond_1
    iget-object v3, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, p1, Landroid/support/v4/a/h;->D:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Landroid/support/v4/a/h;->E:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Landroid/support/v4/a/n;->r:Z

    :cond_2
    iput-boolean v2, p1, Landroid/support/v4/a/h;->k:Z

    iput-boolean v1, p1, Landroid/support/v4/a/h;->l:Z

    :cond_3
    return-void

    :cond_4
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method h(Landroid/support/v4/a/h;Z)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-virtual {v0}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    instance-of v1, v0, Landroid/support/v4/a/n;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/support/v4/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/a/n;->h(Landroid/support/v4/a/h;Z)V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/g/i;

    if-eqz p2, :cond_2

    iget-object v1, v0, Landroid/support/v4/g/i;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroid/support/v4/g/i;->a:Ljava/lang/Object;

    check-cast v0, Landroid/support/v4/a/m$a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/m$a;->g(Landroid/support/v4/a/m;Landroid/support/v4/a/h;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method i()V
    .locals 9

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_6

    move v3, v4

    move-object v1, v5

    move-object v2, v5

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v3, v0, :cond_7

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_9

    iget-boolean v6, v0, Landroid/support/v4/a/h;->B:Z

    if-eqz v6, :cond_1

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    if-eqz v6, :cond_2

    iget-object v6, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    iget v6, v6, Landroid/support/v4/a/h;->e:I

    :goto_1
    iput v6, v0, Landroid/support/v4/a/h;->i:I

    sget-boolean v6, Landroid/support/v4/a/n;->a:Z

    if-eqz v6, :cond_1

    const-string v6, "FragmentManager"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "retainNonConfig: keeping retained "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v6, v0, Landroid/support/v4/a/h;->t:Landroid/support/v4/a/n;

    if-eqz v6, :cond_3

    iget-object v6, v0, Landroid/support/v4/a/h;->t:Landroid/support/v4/a/n;

    invoke-virtual {v6}, Landroid/support/v4/a/n;->i()V

    iget-object v0, v0, Landroid/support/v4/a/h;->t:Landroid/support/v4/a/n;

    iget-object v0, v0, Landroid/support/v4/a/n;->C:Landroid/support/v4/a/o;

    move-object v6, v0

    :goto_2
    if-nez v1, :cond_4

    if-eqz v6, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v0, v4

    :goto_3
    if-ge v0, v3, :cond_4

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_2
    const/4 v6, -0x1

    goto :goto_1

    :cond_3
    iget-object v0, v0, Landroid/support/v4/a/h;->u:Landroid/support/v4/a/o;

    move-object v6, v0

    goto :goto_2

    :cond_4
    move-object v0, v1

    if-eqz v0, :cond_5

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    move-object v1, v2

    :goto_4
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move-object v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_6
    move-object v1, v5

    move-object v2, v5

    :cond_7
    if-nez v2, :cond_8

    if-nez v1, :cond_8

    iput-object v5, p0, Landroid/support/v4/a/n;->C:Landroid/support/v4/a/o;

    :goto_5
    return-void

    :cond_8
    new-instance v0, Landroid/support/v4/a/o;

    invoke-direct {v0, v2, v1}, Landroid/support/v4/a/o;-><init>(Ljava/util/List;Ljava/util/List;)V

    iput-object v0, p0, Landroid/support/v4/a/n;->C:Landroid/support/v4/a/o;

    goto :goto_5

    :cond_9
    move-object v0, v1

    move-object v1, v2

    goto :goto_4
.end method

.method public i(Landroid/support/v4/a/h;)V
    .locals 4

    const/4 v0, 0x1

    sget-boolean v1, Landroid/support/v4/a/n;->a:Z

    if-eqz v1, :cond_0

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hide: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v1, p1, Landroid/support/v4/a/h;->z:Z

    if-nez v1, :cond_1

    iput-boolean v0, p1, Landroid/support/v4/a/h;->z:Z

    iget-boolean v1, p1, Landroid/support/v4/a/h;->Q:Z

    if-nez v1, :cond_2

    :goto_0
    iput-boolean v0, p1, Landroid/support/v4/a/h;->Q:Z

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method j()Landroid/os/Parcelable;
    .locals 11

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-direct {p0}, Landroid/support/v4/a/n;->A()V

    invoke-direct {p0}, Landroid/support/v4/a/n;->B()V

    invoke-virtual {p0}, Landroid/support/v4/a/n;->e()Z

    iput-boolean v1, p0, Landroid/support/v4/a/n;->s:Z

    iput-object v3, p0, Landroid/support/v4/a/n;->C:Landroid/support/v4/a/o;

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    :goto_0
    return-object v3

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v6

    new-array v7, v6, [Landroid/support/v4/a/q;

    move v5, v4

    move v2, v4

    :goto_1
    if-ge v5, v6, :cond_8

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_11

    iget v2, v0, Landroid/support/v4/a/h;->e:I

    if-gez v2, :cond_2

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Failure saving state: active "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " has cleared index: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget v9, v0, Landroid/support/v4/a/h;->e:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v2, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_2
    new-instance v2, Landroid/support/v4/a/q;

    invoke-direct {v2, v0}, Landroid/support/v4/a/q;-><init>(Landroid/support/v4/a/h;)V

    aput-object v2, v7, v5

    iget v8, v0, Landroid/support/v4/a/h;->b:I

    if-lez v8, :cond_7

    iget-object v8, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    if-nez v8, :cond_7

    invoke-virtual {p0, v0}, Landroid/support/v4/a/n;->n(Landroid/support/v4/a/h;)Landroid/os/Bundle;

    move-result-object v8

    iput-object v8, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    iget-object v8, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    if-eqz v8, :cond_5

    iget-object v8, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    iget v8, v8, Landroid/support/v4/a/h;->e:I

    if-gez v8, :cond_3

    new-instance v8, Ljava/lang/IllegalStateException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Failure saving state: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " has target not in fragment manager: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget-object v10, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v8}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_3
    iget-object v8, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    if-nez v8, :cond_4

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    iput-object v8, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    :cond_4
    iget-object v8, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    const-string v9, "android:target_state"

    iget-object v10, v0, Landroid/support/v4/a/h;->h:Landroid/support/v4/a/h;

    invoke-virtual {p0, v8, v9, v10}, Landroid/support/v4/a/n;->a(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/a/h;)V

    iget v8, v0, Landroid/support/v4/a/h;->j:I

    if-eqz v8, :cond_5

    iget-object v8, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    const-string v9, "android:target_req_state"

    iget v10, v0, Landroid/support/v4/a/h;->j:I

    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    :goto_2
    sget-boolean v8, Landroid/support/v4/a/n;->a:Z

    if-eqz v8, :cond_6

    const-string v8, "FragmentManager"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Saved state of "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ": "

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    move v0, v1

    :goto_3
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v2, v0

    goto/16 :goto_1

    :cond_7
    iget-object v8, v0, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    iput-object v8, v2, Landroid/support/v4/a/q;->k:Landroid/os/Bundle;

    goto :goto_2

    :cond_8
    if-nez v2, :cond_9

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    const-string v1, "saveAllState: no fragments!"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_c

    new-array v1, v5, [I

    move v2, v4

    :goto_4
    if-ge v2, v5, :cond_d

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    iget v0, v0, Landroid/support/v4/a/h;->e:I

    aput v0, v1, v2

    aget v0, v1, v2

    if-gez v0, :cond_a

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failure saving state: active "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v8, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " has cleared index: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    aget v8, v1, v2

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->a(Ljava/lang/RuntimeException;)V

    :cond_a
    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_b

    const-string v0, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "saveAllState: adding fragment #"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, ": "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v8, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_c
    move-object v1, v3

    :cond_d
    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_f

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_f

    new-array v3, v5, [Landroid/support/v4/a/d;

    move v2, v4

    :goto_5
    if-ge v2, v5, :cond_f

    new-instance v4, Landroid/support/v4/a/d;

    iget-object v0, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    invoke-direct {v4, v0}, Landroid/support/v4/a/d;-><init>(Landroid/support/v4/a/c;)V

    aput-object v4, v3, v2

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_e

    const-string v0, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "saveAllState: adding back stack #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ": "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v6, p0, Landroid/support/v4/a/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    :cond_f
    new-instance v0, Landroid/support/v4/a/p;

    invoke-direct {v0}, Landroid/support/v4/a/p;-><init>()V

    iput-object v7, v0, Landroid/support/v4/a/p;->a:[Landroid/support/v4/a/q;

    iput-object v1, v0, Landroid/support/v4/a/p;->b:[I

    iput-object v3, v0, Landroid/support/v4/a/p;->c:[Landroid/support/v4/a/d;

    iget-object v1, p0, Landroid/support/v4/a/n;->p:Landroid/support/v4/a/h;

    if-eqz v1, :cond_10

    iget-object v1, p0, Landroid/support/v4/a/n;->p:Landroid/support/v4/a/h;

    iget v1, v1, Landroid/support/v4/a/h;->e:I

    iput v1, v0, Landroid/support/v4/a/p;->d:I

    :cond_10
    iget v1, p0, Landroid/support/v4/a/n;->d:I

    iput v1, v0, Landroid/support/v4/a/p;->e:I

    invoke-virtual {p0}, Landroid/support/v4/a/n;->i()V

    move-object v3, v0

    goto/16 :goto_0

    :cond_11
    move v0, v2

    goto/16 :goto_3
.end method

.method public j(Landroid/support/v4/a/h;)V
    .locals 4

    const/4 v0, 0x0

    sget-boolean v1, Landroid/support/v4/a/n;->a:Z

    if-eqz v1, :cond_0

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v1, p1, Landroid/support/v4/a/h;->z:Z

    if-eqz v1, :cond_2

    iput-boolean v0, p1, Landroid/support/v4/a/h;->z:Z

    iget-boolean v1, p1, Landroid/support/v4/a/h;->Q:Z

    if-nez v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    iput-boolean v0, p1, Landroid/support/v4/a/h;->Q:Z

    :cond_2
    return-void
.end method

.method public k()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    iput-object v1, p0, Landroid/support/v4/a/n;->C:Landroid/support/v4/a/o;

    iput-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    iget-object v1, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/a/h;->E()V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public k(Landroid/support/v4/a/h;)V
    .locals 4

    const/4 v3, 0x1

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "detach: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/a/h;->A:Z

    if-nez v0, :cond_3

    iput-boolean v3, p1, Landroid/support/v4/a/h;->A:Z

    iget-boolean v0, p1, Landroid/support/v4/a/h;->k:Z

    if-eqz v0, :cond_3

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remove from detach: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v1, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, p1, Landroid/support/v4/a/h;->D:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Landroid/support/v4/a/h;->E:Z

    if-eqz v0, :cond_2

    iput-boolean v3, p0, Landroid/support/v4/a/n;->r:Z

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p1, Landroid/support/v4/a/h;->k:Z

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method public l(Landroid/support/v4/a/h;)V
    .locals 4

    const/4 v3, 0x1

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "attach: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/a/h;->A:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroid/support/v4/a/h;->A:Z

    iget-boolean v0, p1, Landroid/support/v4/a/h;->k:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment already added: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_2

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "add from attach: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v1, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v3, p1, Landroid/support/v4/a/h;->k:Z

    iget-boolean v0, p1, Landroid/support/v4/a/h;->D:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/a/h;->E:Z

    if-eqz v0, :cond_3

    iput-boolean v3, p0, Landroid/support/v4/a/n;->r:Z

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public m()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method m(Landroid/support/v4/a/h;)V
    .locals 2

    iget-object v0, p1, Landroid/support/v4/a/h;->I:Landroid/view/View;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    if-nez v0, :cond_2

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    :goto_1
    iget-object v0, p1, Landroid/support/v4/a/h;->I:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    iput-object v0, p1, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/n;->A:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    goto :goto_1
.end method

.method n(Landroid/support/v4/a/h;)Landroid/os/Bundle;
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/a/h;->m(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v2}, Landroid/support/v4/a/n;->d(Landroid/support/v4/a/h;Landroid/os/Bundle;Z)V

    iget-object v0, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    iput-object v1, p0, Landroid/support/v4/a/n;->z:Landroid/os/Bundle;

    :goto_0
    iget-object v1, p1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/support/v4/a/n;->m(Landroid/support/v4/a/h;)V

    :cond_1
    iget-object v1, p1, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    if-eqz v1, :cond_3

    if-nez v0, :cond_2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_2
    const-string v1, "android:view_state"

    iget-object v2, p1, Landroid/support/v4/a/h;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_3
    iget-boolean v1, p1, Landroid/support/v4/a/h;->K:Z

    if-nez v1, :cond_5

    if-nez v0, :cond_4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_4
    const-string v1, "android:user_visible_hint"

    iget-boolean v2, p1, Landroid/support/v4/a/h;->K:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_5
    return-object v0

    :cond_6
    move-object v0, v1

    goto :goto_0
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method public o(Landroid/support/v4/a/h;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->f:Landroid/util/SparseArray;

    iget v1, p1, Landroid/support/v4/a/h;->e:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object v0, p1, Landroid/support/v4/a/h;->s:Landroid/support/v4/a/l;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/support/v4/a/h;->f()Landroid/support/v4/a/m;

    move-result-object v0

    if-eq v0, p0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p1, p0, Landroid/support/v4/a/n;->p:Landroid/support/v4/a/h;

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v5, -0x1

    const/4 v2, 0x1

    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v4

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "class"

    invoke-interface {p4, v4, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Landroid/support/v4/a/n$e;->a:[I

    invoke-virtual {p3, p4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    if-nez v0, :cond_10

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    :goto_1
    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Landroid/support/v4/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, v4

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    :goto_2
    if-ne v1, v5, :cond_3

    if-ne v7, v5, :cond_3

    if-nez v8, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v1, v3

    goto :goto_2

    :cond_3
    if-eq v7, v5, :cond_7

    invoke-virtual {p0, v7}, Landroid/support/v4/a/n;->b(I)Landroid/support/v4/a/h;

    move-result-object v0

    :goto_3
    if-nez v0, :cond_4

    if-eqz v8, :cond_4

    invoke-virtual {p0, v8}, Landroid/support/v4/a/n;->a(Ljava/lang/String;)Landroid/support/v4/a/h;

    move-result-object v0

    :cond_4
    if-nez v0, :cond_5

    if-eq v1, v5, :cond_5

    invoke-virtual {p0, v1}, Landroid/support/v4/a/n;->b(I)Landroid/support/v4/a/h;

    move-result-object v0

    :cond_5
    sget-boolean v5, Landroid/support/v4/a/n;->a:Z

    if-eqz v5, :cond_6

    const-string v5, "FragmentManager"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "onCreateView: id=0x"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " fname="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " existing="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v5, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    if-nez v0, :cond_9

    iget-object v0, p0, Landroid/support/v4/a/n;->n:Landroid/support/v4/a/j;

    invoke-virtual {v0, p3, v6, v4}, Landroid/support/v4/a/j;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/a/h;

    move-result-object v4

    iput-boolean v2, v4, Landroid/support/v4/a/h;->m:Z

    if-eqz v7, :cond_8

    move v0, v7

    :goto_4
    iput v0, v4, Landroid/support/v4/a/h;->w:I

    iput v1, v4, Landroid/support/v4/a/h;->x:I

    iput-object v8, v4, Landroid/support/v4/a/h;->y:Ljava/lang/String;

    iput-boolean v2, v4, Landroid/support/v4/a/h;->n:Z

    iput-object p0, v4, Landroid/support/v4/a/h;->r:Landroid/support/v4/a/n;

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    iput-object v0, v4, Landroid/support/v4/a/h;->s:Landroid/support/v4/a/l;

    iget-object v0, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v0}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v0

    iget-object v1, v4, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {v4, v0, p4, v1}, Landroid/support/v4/a/h;->a(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    invoke-virtual {p0, v4, v2}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Z)V

    move-object v1, v4

    :goto_5
    iget v0, p0, Landroid/support/v4/a/n;->l:I

    if-ge v0, v2, :cond_c

    iget-boolean v0, v1, Landroid/support/v4/a/h;->m:Z

    if-eqz v0, :cond_c

    move-object v0, p0

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;IIIZ)V

    :goto_6
    iget-object v0, v1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-nez v0, :cond_d

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not create a view."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move-object v0, v4

    goto/16 :goto_3

    :cond_8
    move v0, v1

    goto :goto_4

    :cond_9
    iget-boolean v4, v0, Landroid/support/v4/a/h;->n:Z

    if-eqz v4, :cond_a

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": Duplicate id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", tag "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", or parent id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with another fragment for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    iput-boolean v2, v0, Landroid/support/v4/a/h;->n:Z

    iget-object v1, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    iput-object v1, v0, Landroid/support/v4/a/h;->s:Landroid/support/v4/a/l;

    iget-boolean v1, v0, Landroid/support/v4/a/h;->C:Z

    if-nez v1, :cond_b

    iget-object v1, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-virtual {v1}, Landroid/support/v4/a/l;->g()Landroid/content/Context;

    move-result-object v1

    iget-object v4, v0, Landroid/support/v4/a/h;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p4, v4}, Landroid/support/v4/a/h;->a(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_b
    move-object v1, v0

    goto/16 :goto_5

    :cond_c
    invoke-virtual {p0, v1}, Landroid/support/v4/a/n;->b(Landroid/support/v4/a/h;)V

    goto/16 :goto_6

    :cond_d
    if-eqz v7, :cond_e

    iget-object v0, v1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setId(I)V

    :cond_e
    iget-object v0, v1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_f

    iget-object v0, v1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_f
    iget-object v0, v1, Landroid/support/v4/a/h;->H:Landroid/view/View;

    goto/16 :goto_0

    :cond_10
    move-object v6, v0

    goto/16 :goto_1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Landroid/support/v4/a/n;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/n;->s:Z

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    return-void
.end method

.method public t()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/n;->t:Z

    invoke-virtual {p0}, Landroid/support/v4/a/n;->e()Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v4/a/n;->e(I)V

    iput-object v1, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    iput-object v1, p0, Landroid/support/v4/a/n;->n:Landroid/support/v4/a/j;

    iput-object v1, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/a/n;->o:Landroid/support/v4/a/h;

    invoke-static {v1, v0}, Landroid/support/v4/g/d;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Landroid/support/v4/a/n;->m:Landroid/support/v4/a/l;

    invoke-static {v1, v0}, Landroid/support/v4/g/d;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    goto :goto_0
.end method

.method public u()V
    .locals 2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/a/h;->F()V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public v()Landroid/support/v4/a/h;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/n;->p:Landroid/support/v4/a/h;

    return-object v0
.end method

.method w()Landroid/view/LayoutInflater$Factory2;
    .locals 0

    return-object p0
.end method
